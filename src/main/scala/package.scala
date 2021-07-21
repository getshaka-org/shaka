package org.getshaka.shaka

import org.scalajs.dom.raw
import org.scalajs.dom.html.{Element => _Element}

type Element = _Element

extension [T <: raw.Node](el: T)
  def as[U]: U = el.asInstanceOf[U]