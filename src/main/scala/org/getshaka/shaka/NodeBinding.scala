package org.getshaka.shaka

import org.scalajs.dom.{HTMLElement, Element, Node, document, HTMLDivElement}

import scala.collection.mutable.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import org.getshaka.shaka.NodeBinding.ShakaBinding

/** Binding subclass specialized for Nodes
  * @param state
  *   State this Binding is bound to
  * @param parentElement
  *   Element to append to
  * @param builder
  *   Function to create the DOM
  * @tparam V
  *   bound value type
  */
class NodeBinding[V](
    state: State[V],
    parentElement: Element,
    builder: NodeBindingBuilder[V]
) extends Binding[V]:

  private var container: HTMLElement = null
  private val children = js.Array[Binding[?]]()

  override def addChildBinding(b: Binding[?]): Unit =
    children += b

  override def onChange(newValue: V): Unit =
    // destroy all child bindings
    for b <- children do b.destroy()
    children.clear()

    if container == null then
      container = document
        .createElement(ShakaBinding.TagName)
        .asInstanceOf[HTMLElement]
      container.style.display = "contents"
      builder(using container, this)(newValue)
      parentElement.appendChild(container)
    else
      container.innerHTML = ""
      builder(using container, this)(newValue)

  override def destroy(): Unit =
    state.removeBinding(this)
    for b <- children do b.destroy()

object NodeBinding:

  private class ShakaBinding extends HTMLElementWithShadow
  private object ShakaBinding:
    val TagName = "shaka-binding"
    val OpenShadowOptions = js.Dynamic.literal(mode = "open")
    js.Dynamic.global.customElements
      .define(TagName, js.constructorOf[ShakaBinding])

  // todo add attachShadow(..) to scalajs-dom
  @js.native
  @JSGlobal("HTMLElement")
  private class HTMLElementWithShadow extends js.Object:
    def attachShadow(options: js.Any): HTMLElement = js.native
    def isConnected: Boolean = js.native
    def appendChild(child: js.Any): Unit = js.native
