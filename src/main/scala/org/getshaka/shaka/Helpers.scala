package org.getshaka.shaka

import scala.scalajs.js

def render(
  comp: Component,
  element: Element = js.Dynamic.global.document.body.asInstanceOf[Element]
): Unit =
  comp.render(using element, RootBinding())

def renderFrag(
  frag: Frag,
  element: Element = js.Dynamic.global.document.body.asInstanceOf[Element]
): Unit =
  frag.asInstanceOf[ComponentBuilder](using element, RootBinding())
