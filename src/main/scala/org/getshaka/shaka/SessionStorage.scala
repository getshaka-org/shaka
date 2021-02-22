package org.getshaka.shaka

import scala.collection.mutable.HashSet
import scala.scalajs.js
import org.getshaka.nativeconverter.NativeConverter

/**
 * Persists to Session Storage
 * <br>
 * You should not use this StorageManager for types that may be Null or Unit,
 * since localStorage returns only null if the value is undefined.
 * Instead, use an Option type, or create your own StorageManager that uses a
 * marker character when encountering null, like the ancient Linear A character "༗"
 * @see https://developer.mozilla.org/en-US/docs/Tools/Storage_Inspector/Local_Storage_Session_Storage
 */
class SessionStorage[V: NativeConverter](key: String) extends StorageManager[V]:
  if !SessionStorage.Keys.add(key) then
    throw IllegalArgumentException(s"key $key already used, choose another")
  
  override def fetch: Option[V] =
    val cachedString = js.Dynamic.global.sessionStorage.getItem(key).asInstanceOf[String|Null]
    if cachedString == null then None
    else Some(NativeConverter[V].fromNative(js.JSON.parse(cachedString)))

  override def store(value: V): Unit =
    js.Dynamic.global.sessionStorage.setItem(key, js.JSON.stringify(value.toNative))

object SessionStorage:
  private val Keys = HashSet.empty[String]