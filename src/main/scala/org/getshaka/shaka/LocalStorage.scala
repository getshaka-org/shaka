package org.getshaka.shaka

import scala.scalajs.js
import org.getshaka.nativeconverter.NativeConverter

import scala.collection.mutable.HashSet

/**
 * Persists to LocalStorage
 * <br>
 * You should not use this StorageManager for types that may be Null or Unit,
 * since localStorage returns only null if the value is undefined.
 * Instead, use an Option type, or create your own StorageManager that uses a
 * marker character when encountering null, like the ancient Linear A character "༗"
 * @see https://developer.mozilla.org/en-US/docs/Tools/Storage_Inspector/Local_Storage_Session_Storage
 */
class LocalStorage[V: NativeConverter](key: String) extends StorageManager[V]:
  if !LocalStorage.Keys.add(key) then
    throw IllegalArgumentException(s"key $key already used, choose another")

  override def fetch: Option[V] =
    val cachedString = js.Dynamic.global.localStorage.getItem(key).asInstanceOf[String|Null]
    if cachedString == null then None
    else Some(NativeConverter[V].fromNative(js.JSON.parse(cachedString)))

  override def store(value: V): Unit =
    js.Dynamic.global.localStorage.setItem(key, js.JSON.stringify(value.toNative))

object LocalStorage:
  private val Keys = HashSet.empty[String]