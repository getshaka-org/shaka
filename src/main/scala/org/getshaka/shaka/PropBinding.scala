package org.getshaka.shaka

import scala.collection.mutable.ArrayBuffer

/**
 * Light-weight Binding subclass for binding CSS
 * and JS properties.
 * @param state dependent State
 * @param builder Function binding the props
 * @tparam V the state value type
 */
class PropBinding[V](
  state: State[V],
  builder: state.PropBindingBuilder
) extends Binding[V]:
  
  private val children = ArrayBuffer.empty[Binding[?]]

  override def addChildBinding(b: Binding[?]): Unit =
    children += b

  override def onChange(newValue: V): Unit =
    for b <- children do b.destroy()
    children.clear()
    
    builder(using this)(newValue)

  override def destroy(): Unit =
    state.removeBinding(this)
    for b <- children do b.destroy()
