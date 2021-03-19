package org.getshaka.shaka

import scala.collection.mutable.ArrayBuffer
import scala.scalajs.js

/**
 * Binding subclass specialized for Nodes
 * @param state State this Binding is bound to
 * @param parentElement Element to append to
 * @param builder Function to create the DOM
 * @tparam V bound value type
 */
class NodeBinding[V](
  state: State[V],
  parentElement: Element,
  builder: NodeBindingBuilder[V]
) extends Binding[V]:
  import NodeBinding.*

  private val children = ArrayBuffer.empty[Binding[?]]
  private var firstRenderedNode: Node|Null = null
  private var renderedNodes: Int = 0

  override def addChildBinding(b: Binding[?]): Unit =
    children += b

  override def onChange(newValue: V): Unit =
    // destroy all child bindings
    for b <- children do b.destroy()
    children.clear()

    val frag = newFragment
    builder(using frag, this)(newValue)
    
    if firstRenderedNode == null then
      val len = frag.childNodes.length
      if len > 0 then
        firstRenderedNode = frag.childNodes.item(0)
        parentElement.appendChild(frag)
        renderedNodes = len
      else
        val marker = newComment()
        firstRenderedNode = marker
        parentElement.appendChild(marker)
        renderedNodes = 1
    else
      // replace the firstRenderedElement with a marker element, and remove all siblings
      for i <- 1 until renderedNodes do
        parentElement.removeChild(firstRenderedNode.nn.nextSibling)
      val marker = newComment()
      parentElement.replaceChild(marker, firstRenderedNode.nn)
        
      val len = frag.childNodes.length
      if len > 0 then
        firstRenderedNode = frag.childNodes.item(0)
        parentElement.insertBefore(frag, marker)
        parentElement.removeChild(marker)  
        renderedNodes = len
      else
        firstRenderedNode = marker
        renderedNodes = 1

  end onChange

  override def destroy(): Unit =
    state.removeBinding(this)
    for b <- children do b.destroy()

object NodeBinding:
  def newFragment: Element = js.Dynamic.global.document.createDocumentFragment().asInstanceOf[Element]

  def newComment(): Node =
    js.Dynamic.global.document.createComment("").asInstanceOf[Node]