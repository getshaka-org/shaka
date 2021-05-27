package org.getshaka.shaka

/**
 * Binding at the root of the heirarchy. Operations do nothing.
 */
class RootBinding extends Binding[Unit]:
  
  override def addChildBinding(b: Binding[?]): Unit = ()

  override def onChange(newValue: Unit): Unit = ()

  override def destroy(): Unit = ()
