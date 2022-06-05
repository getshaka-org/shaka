package org.getshaka.shaka

import scala.collection.mutable.HashSet
import scala.scalajs.js
import org.getshaka.nativeconverter.NativeConverter
import org.scalajs.dom.window

/** Persists to Session Storage <br> You should not use this StorageManager for
  * types that may be Null or Unit, since localStorage returns only null if the
  * value is undefined. Instead, use an Option type, or create your own
  * StorageManager that uses a marker character when encountering null, like the
  * ancient Linear A character "༗"
  * @see
  *   https://developer.mozilla.org/en-US/docs/Tools/Storage_Inspector/Local_Storage_Session_Storage
  */
class SessionStorage[V: NativeConverter](key: String) extends StorageManager[V]:
  require(
    !SessionStorage.Keys.contains(key),
    s"key $key already used, choose another"
  )
  SessionStorage.Keys.add(key)

  override def fetch: Option[V] =
    val cachedString = Option(window.sessionStorage.getItem(key))
    cachedString.map(NativeConverter[V].fromJson)

  override def store(value: V): Unit =
    window.sessionStorage.setItem(key, value.toJson)

object SessionStorage:
  private val Keys = js.Set.empty[String]
