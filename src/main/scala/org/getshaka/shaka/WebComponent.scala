package org.getshaka.shaka

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

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
   * Any scoped styles are applied to this and this WebComponent only.
   * When scopedStyle is not null, an open Shadow DOM is appended to this
   * WebComponent. That means ids, class names, and selectors can be
   * used without fear of conflicts.
   * 
   * @see https://developer.mozilla.org/en-US/docs/Web/Web_Components/Using_shadow_DOM
   */
  def scopedStyle: String|Null = null
  
  override def render(using parentElement: Element, parentBinding: Binding[?]): Unit =
    val shakaWc: ShakaWc =
      js.Dynamic.global.document.createElement(ShakaWc.TagName).asInstanceOf[ShakaWc]
    shakaWc.component = this

    val wcElement = shakaWc.asInstanceOf[Element]
    
    val style: String|Null = scopedStyle
    // either the custom element itself, or shadowRoot if using scopedStyle.
    val pe: Element =
      if style != null then
        val shadowRoot = shakaWc.attachShadow(ShakaWc.OpenShadowOptions)
        if !style.isEmpty then
          val styleTag = js.Dynamic.global.document.createElement("style")
          styleTag.textContent = style
          shadowRoot.appendChild(styleTag)
        shadowRoot.asInstanceOf[Element]
      else
        wcElement
      
    parentElement.appendChild(wcElement)
    
    super.render(using pe, parentBinding)
  
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
private class HTMLElement extends js.Object:
  def attachShadow(options: js.Any): HTMLElement = js.native
  def isConnected: Boolean = js.native
  def appendChild(child: js.Any): Unit = js.native

  
  
