package org.getshaka.shaka

/**
 * Consumes a given parent Element and parent Binding
 * to construct DOM.
 */
type ComponentBuilder = (Element, Binding[?]) ?=> Unit

//trait ComponentBuilder:
//  def apply(using pe: Element, pb: Binding[?]): Unit

/**
 * A Shaka Component provides a template for some part of an application,
 * as well as the means to render said template to the DOM.
 */
trait Component:

  /**
   * Returns the component's template. Since a template should always
   * be a pure function of Component state, it is recommended to
   * override this method as a val.
   */
  def template: ComponentBuilder

  /**
   * Renders this Component's template. render should only be overriden
   * when implementing new Component types. For example, {@link WebComponent}
   * overrides render to wrap super.render in a Custom Element, allowing 
   * you to use shadow-dom and lifecycle callbacks.
   */
  def render(using parentElement: Element, parentBinding: Binding[?]): Unit =
    template(using parentElement, parentBinding)
