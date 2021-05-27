package org.getshaka.shaka

/**
 * Open state that must be encapsulated.
 * @param initialValue The State's initial value, discarded if the StorageManager can fetch
 *                     a value.
 * @tparam V the value.
 */
class OpenState[V](initialValue: V) extends State(initialValue):
  override def value: V = super.value
  override def setValue(newValue: V): Unit = super.setValue(newValue)
  override def setValue(oldToNew: V => V): Unit = super.setValue(oldToNew)

/**
 * Open state that must be encapsulated. Similar in spirit to
 * React's useState Hook.
 */
def useState[V](initialValue: V): OpenState[V] = OpenState(initialValue)