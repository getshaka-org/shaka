package org.getshaka.shaka

import scala.scalajs.js
import org.scalajs.dom.document

def render(
  comp: Component,
  element: Element = document.body.asInstanceOf[Element]
): Unit =
  comp.render(using element, RootBinding())

def renderBuilder(
  componentBuilder: ComponentBuilder,
  element: Element = document.body.asInstanceOf[Element]
): Unit =
  componentBuilder(using element, RootBinding())
