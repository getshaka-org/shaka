package org.getshaka.shaka

/**
 * A no-op StorageManager
 */
class NoStorage[V] extends StorageManager[V]:
  override def fetch: Option[V] = None
  override def store(value: V): Unit = ()


    
