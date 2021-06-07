package org.getshaka.shaka

opaque type Props = PropsBuilder
object Props:
  @inline def apply(pb: PropsBuilder): Props = pb
