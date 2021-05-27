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
  require(!LocalStorage.Keys.contains(key), s"key $key already used, choose another")
  LocalStorage.Keys.add(key)

  override def fetch: Option[V] =
    val cachedString = js.Dynamic.global.localStorage.getItem(key).asInstanceOf[String]
    Option(cachedString).map(NativeConverter[V].fromJson)

  override def store(value: V): Unit =
    js.Dynamic.global.localStorage.setItem(key, value.toJson)

object LocalStorage:
  private val Keys = js.Set.empty[String]