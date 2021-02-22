package org.getshaka.shaka

import scala.scalajs.js

def render(
  comp: Component,
  element: Element = js.Dynamic.global.document.body.asInstanceOf[Element]
): Unit =
  comp.render(using element, RootBinding())

def renderBuilder(
  componentBuilder: ComponentBuilder,
  element: Element = js.Dynamic.global.document.body.asInstanceOf[Element]
): Unit =
  componentBuilder(using element, RootBinding())
