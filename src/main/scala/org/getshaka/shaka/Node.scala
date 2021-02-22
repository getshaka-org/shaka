package org.getshaka.shaka

import scala.scalajs.js

/**
 * A light-weight facade for Node
 */
@js.native
trait Node extends js.Object:
  def appendChild(child: Node): Node = js.native

  def replaceChild(newChild: Node, oldChild: Node): Unit = js.native
  
  def removeChild(child: Node): Unit = js.native

  val childNodes: NodeList = js.native

  val nextSibling: Node = js.native
  
  val lastChild: Node = js.native
  
  val isConnected: Boolean = js.native

  def insertBefore(newNode: Node, referenceNode: Node): Unit = js.native

  def cloneNode(deep: Boolean): Node = js.native

/**
 * A light-weight facade for NodeList
 * @see https://developer.mozilla.org/en-US/docs/Web/API/NodeList
 */
@js.native
trait NodeList extends js.Object:
  val length: Int = js.native
  def item(index: Int): Node = js.native
