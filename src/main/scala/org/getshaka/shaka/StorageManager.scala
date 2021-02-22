package org.getshaka.shaka

import scala.scalajs.js

/**
 * Used for fetching and storing States
 * @tparam V the value type
 */
trait StorageManager[V]:
  def fetch: Option[V]
  def store(value: V): Unit

