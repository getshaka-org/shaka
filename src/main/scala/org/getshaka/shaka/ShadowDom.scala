package org.getshaka.shaka

enum ShadowDom:
  case Disabled
  case Enabled
  case WithStyle(val scopedStyle: String)