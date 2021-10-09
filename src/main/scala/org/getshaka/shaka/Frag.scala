package org.getshaka.shaka

import org.scalajs.dom.Element

opaque type Frag = (Element, Binding[?]) ?=> Unit

object Frag:
  inline def apply(inline fn: (Element, Binding[?]) ?=> Unit): Frag = fn

  private[shaka] inline def render(inline f: Frag)(using e: Element, b: Binding[?]): Unit =
    f(using e, b)

  private[shaka] def unwrap(f: Frag): ((Element, Binding[?]) ?=> Any) = f
