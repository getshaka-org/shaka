package org.getshaka.shaka

import scala.scalajs.js

/**
 * A light-weight facade for HTMLElement
 */
@js.native
trait Element extends Node:
  var innerHTML: String = js.native