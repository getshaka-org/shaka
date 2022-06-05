package org.getshaka.shaka

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal
import ShadowDom.*
import org.scalajs.dom.{document, Element}
import WebComponent.*

/** A {@link Component} wrapped in a Custom Element. Custom Elements have useful
  * lifecycle callbacks and can attach shadow-dom.
  *
  * @see
  *   https://developer.mozilla.org/en-US/docs/Web/Web_Components
  */
trait WebComponent extends Component:

  /** Triggered whenever this WebComponent is appended into a document-connected
    * element. WebComponent ensures connectedCallback is never triggered when
    * the element is not connected (a non-obvious behavior of regular custom
    * elements).
    *
    * @see
    *   https://developer.mozilla.org/en-US/docs/Web/Web_Components/Using_custom_elements#using_the_lifecycle_callbacks
    */
  def connectedCallback(): Unit = ()

  /** Invoked each time the custom element is disconnected from the document's
    * DOM.
    *
    * @see
    *   https://developer.mozilla.org/en-US/docs/Web/Web_Components/Using_custom_elements#using_the_lifecycle_callbacks
    */
  def disconnectedCallback(): Unit = ()

  /** Whether this WebComponent should use ShadowDom and/or scoped styles.
    * Defaults to Disabled.
    *
    * Shadow Dom means that means ids, class names, and selectors can be used
    * without fear of conflicts.
    * @see
    *   https://developer.mozilla.org/en-US/docs/Web/Web_Components/Using_shadow_DOM
    */
  def shadowDom: ShadowDom = ShadowDom.Disabled

  override def render(using
      parentElement: Element,
      parentBinding: Binding[?]
  ): Unit =
    val shakaWc: ShakaWc =
      document.createElement(ShakaWc.TagName).asInstanceOf[ShakaWc]
    shakaWc.component = this

    val wcElement = shakaWc.asInstanceOf[Element]

    val elementToRender: Element = shadowDom match
      case Disabled => wcElement
      case Enabled =>
        val shadowRoot = shakaWc.attachShadow(ShakaWc.OpenShadowOptions)
        shadowRoot.asInstanceOf[Element]
      case WithStyle(scopedStyle) =>
        val shadowRoot = shakaWc.attachShadow(ShakaWc.OpenShadowOptions)
        val styleTag = js.Dynamic.global.document.createElement("style")
        styleTag.textContent = scopedStyle
        shadowRoot.appendChild(styleTag)
        shadowRoot.asInstanceOf[Element]

    parentElement.appendChild(wcElement)

    super.render(using elementToRender, parentBinding)

object WebComponent:
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

  // todo add attachShadow(..) to scalajs-dom
  @js.native
  @JSGlobal("HTMLElement")
  private class HTMLElement extends js.Object:
    def attachShadow(options: js.Any): HTMLElement = js.native
    def isConnected: Boolean = js.native
    def appendChild(child: js.Any): Unit = js.native
