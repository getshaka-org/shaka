package org.getshaka.shaka

import org.getshaka.shaka.builders.CssProp

import scala.collection.mutable.HashSet
import scala.scalajs.js

/**
 * A State that can be used to bind Nodes and their properties. You can
 * get the current value with myState.value, and update with
 * myState.value = newValue. These two methods are protected, so that
 * state update logic is encapsulated within the object itself. This provides
 * the same benefit as Redux's action - reducer - store trifecta,
 * but dramatically simpler and not requiring copying the whole state value
 * on every small change (although if you believe in encapsulation and
 * program in a purely functional style, you will still do this..
 * but it will be your choice!).
 * <br>
 * @param initialValue The State's initial value, discarded if
 *                     the StorageManager can fetch a value.
 * @param storageManager How the State should be persisted, such
 *                       as in LocalStorage. By default,
 *                       the State has no storage.
 * @tparam V the value.
 */
abstract class State[V](initialValue: => V, storageManager: StorageManager[V] = NoStorage[V]()):
  private var _value = storageManager.fetch.getOrElse(initialValue)
  // using the javascript Set since it has nice properties..
  // ordered & safe to delete while iterating
  private val bindings = js.Set.empty[Binding[V]]

  /**
   * Returns this State's value
   */
  protected def value: V = _value

  /**
   * Sets this State's new value. All depdendent Bindings are recomputed.
   */
  protected def value_=(newValue: V): Unit =
    _value = newValue
    storageManager.store(newValue)
    for b <- bindings do b.onChange(newValue)

  /**
   * Function from V => Unit, given a parent Element and parent Binding[?]
   */
  type NodeBindingBuilder = (Element, Binding[?]) ?=> (V => Unit)

  /**
   * Construct a Binding for DOM Nodes
   */
  def bind(builder: NodeBindingBuilder)(using pe: Element, pb: Binding[?]): Unit =
    val b = NodeBinding[V](this, pe, builder)
    pb.addChildBinding(b)
    bindings += b
    b.onChange(_value)

  /**
   * Function from V => Unit, given a parent Binding[?]
   */
  type PropBindingBuilder = Binding[?] ?=> V => Unit

  /**
   * Construct a lighter-weight Binding for CSS/JS Props.
   */
  def bindProps(builder: PropBindingBuilder)(using pb: Binding[?]): Unit =
    val b = PropBinding[V](this, builder)
    pb.addChildBinding(b)
    bindings += b
    b.onChange(_value)

  /**
   * Removes a Binding from this State.
   */
  def removeBinding(b: Binding[V]): Unit =
    bindings -= b
