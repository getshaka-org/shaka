package org.getshaka.shaka

/*
Hopefully can make really inline someday, or better yet,
become a trait: https://github.com/lampepfl/dotty-feature-requests/issues/193
 */

/**
 * Consumes a given parent Element and parent Binding
 * to construct DOM.
 */
opaque type Frag = ComponentBuilder
object Frag:
  @inline def apply(cb: ComponentBuilder): Frag = cb