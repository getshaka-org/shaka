package org.getshaka.shaka

/**
 * Base trait for Bindings. Since Bindings are
 * hierarchical, they must manage registered child bindings.
 */
trait Binding[V]:
  /**
   * Register a child Binding with this Binding
   */
  def addChildBinding(b: Binding[?]): Unit

  /**
   * Typically, triggers a DOM update, and the
   * destruction of child Bindings.
   */
  def onChange(newValue: V): Unit

  /**
   * Destorys this Binding and its children.
   * Typically should remove this Binding from
   * any State references to allow garbage collection.
   */
  def destroy(): Unit
