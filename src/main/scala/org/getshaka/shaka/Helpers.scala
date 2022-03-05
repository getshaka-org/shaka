package org.getshaka.shaka

import scala.scalajs.js
import org.scalajs.dom.{document, Element}

def render(comp: Component, element: Element): Unit =
  comp.render(using element, RootBinding())

def render(frag: Frag, element: Element): Unit =
  Frag.render(frag)(using element, RootBinding())

extension (f: Frag)
  def render(using Element, Binding[?]): Unit = Frag.render(f)