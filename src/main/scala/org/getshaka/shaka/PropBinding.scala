package org.getshaka.shaka

import scala.collection.mutable.ArrayBuffer
import scala.scalajs.js

/**
 * Light-weight Binding subclass for binding CSS
 * and JS properties.
 * @param state dependent State
 * @param builder Function binding the props
 * @tparam V the state value type
 */
class PropBinding[V](
  state: State[V],
  builder: PropBindingBuilder[V]
) extends Binding[V]:
  
  private val children = js.Array[Binding[?]]()

  override def addChildBinding(b: Binding[?]): Unit =
    children += b

  override def onChange(newValue: V): Unit =
    for b <- children do b.destroy()
    children.clear()
    
    builder(newValue).asInstanceOf[PropsBuilder](using this)

  override def destroy(): Unit =
    state.removeBinding(this)
    for b <- children do b.destroy()
