package org.getshaka.shaka

import org.scalajs.dom.Element

/**
 * A Shaka Component provides a template for some part of an application,
 * as well as the means to render said template to the DOM.
 */
trait Component:

  /**
   * Defines the component's template.
   */
  def template: Frag

  /**
   * Renders this Component's template. render should only be overriden
   * when implementing new Component types. For example, {@link WebComponent}
   * overrides render to wrap super.render in a Custom Element, allowing 
   * you to use shadow-dom and lifecycle callbacks.
   */
  def render(using parentElement: Element, parentBinding: Binding[?]): Unit =
    Frag.render(template)
