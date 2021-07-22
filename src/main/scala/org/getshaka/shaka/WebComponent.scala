package org.getshaka.shaka

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import org.scalajs.dom.document
import ShadowDom.*

/**
 * A {@link Component} wrapped in a Custom Element. Custom Elements
 * have useful lifecycle callbacks and can attach shadow-dom.
 * 
 * @see https://developer.mozilla.org/en-US/docs/Web/Web_Components
 */
trait WebComponent extends Component:

  /**
   * Triggered whenever this WebComponent is appended into a
   * document-connected element. WebComponent ensures
   * connectedCallback is never triggered when the element is
   * not connected (a non-obvious behavior of regular 
   * custom elements).
   * 
   * @see https://developer.mozilla.org/en-US/docs/Web/Web_Components/Using_custom_elements#using_the_lifecycle_callbacks
   */
  def connectedCallback(): Unit = ()

  /**
   * Invoked each time the custom element is disconnected from the document's DOM.
   * 
   * @see https://developer.mozilla.org/en-US/docs/Web/Web_Components/Using_custom_elements#using_the_lifecycle_callbacks
   */
  def disconnectedCallback(): Unit = ()

  /**
   * Whether this WebComponent should use ShadowDom
   * and/or scoped styles. Defaults to Disabled.
   * <br>
   * Shadow Dom means that means ids, class names, and selectors can be
   * used without fear of conflicts.
   * @see https://developer.mozilla.org/en-US/docs/Web/Web_Components/Using_shadow_DOM
   */
  def shadowDom: ShadowDom = ShadowDom.Disabled

  override def render(using parentElement: Element, parentBinding: Binding[?]): Unit =
    val wc = document.createElement(ShakaWc.TagName).as[ShakaWc]
    wc.component = this

    val elementToRender: Element = shadowDom match
      case Disabled => wc
      case Enabled => wc.attachShadow(ShakaWc.OpenShadowOptions).as[Element]
      case WithStyle(scopedStyle) =>
        val shadow = wc.attachShadow(ShakaWc.OpenShadowOptions).as[Element]
        val style = document.createElement("style")
        style.textContent = scopedStyle
        shadow.appendChild(style)
        shadow

    parentElement.appendChild(wc)
    super.render(using elementToRender, parentBinding)
  
private class ShakaWc extends HTMLElement:
  var component: WebComponent = null

  def connectedCallback(): Unit =
    if isConnected then component.connectedCallback()

  def disconnectedCallback(): Unit =
    component.disconnectedCallback()

private object ShakaWc:
  val TagName: String = "shaka-wc"
  val OpenShadowOptions: js.Dynamic = js.Dynamic.literal(mode = "open")
  js.Dynamic.global.customElements.define(TagName, js.constructorOf[ShakaWc])


@js.native
@JSGlobal
private class HTMLElement extends Element:
  def attachShadow(options: js.Any): HTMLElement = js.native
  def isConnected: Boolean = js.native

  
  
