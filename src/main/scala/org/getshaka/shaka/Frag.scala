package org.getshaka.shaka

import org.scalajs.dom.Element

opaque type Frag = (Element, Binding[?]) => Any

object Frag:
  inline def apply(inline fn: (Element, Binding[?]) ?=> Any): Frag = (e, b) => fn(using e, b)

  private[shaka] inline def render(inline f: Frag)(using e: Element, b: Binding[?]): Unit =
    f(e, b)
