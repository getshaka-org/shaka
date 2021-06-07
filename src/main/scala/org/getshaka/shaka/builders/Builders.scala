package org.getshaka.shaka.builders

import scala.collection.Seq
import scala.scalajs.js

import org.getshaka.shaka.{Element, Node, Binding, ComponentBuilder, Frag, Props, PropsBuilder}
import org.getshaka.nativeconverter.NativeConverter

/*
Frag & Props construction and rendering
 */
inline def frag(fn: ComponentBuilder): Frag = Frag(fn)

extension (f: Frag)
  inline def render(using parentElement: Element, parentBinding: Binding[?]): Unit =
    f.asInstanceOf[ComponentBuilder](using parentElement, parentBinding)

inline def props(pb: PropsBuilder): Props = Props(pb)

extension (p: Props)
  inline def render(using parentBinding: Binding[?]): Unit =
    p.asInstanceOf[PropsBuilder](using parentBinding)

/*
Builders to construct html Nodes & Elements
 */

/**
 * Function that appends to a given parent Element and returns Unit
 */
type ElementBuilder = Element ?=> Unit

inline def tag(tagName: String)(init: ElementBuilder)(using parent: Element): Unit =
  val e: Element = js.Dynamic.global.document.createElement(tagName).asInstanceOf[Element]
  init(using e)
  parent.appendChild(e)

/*
All the HTML tags defined in https://developer.mozilla.org/en-US/docs/Web/HTML/Element
 */
inline def base(init: ElementBuilder)(using Element): Unit = tag("base")(init)
inline def head(init: ElementBuilder)(using Element): Unit = tag("head")(init)
inline def link(init: ElementBuilder)(using Element): Unit = tag("link")(init)
inline def meta(init: ElementBuilder)(using Element): Unit = tag("meta")(init)
inline def style(init: ElementBuilder)(using Element): Unit = tag("style")(init)
inline def title(init: ElementBuilder)(using Element): Unit = tag("title")(init)
inline def body(init: ElementBuilder)(using Element): Unit = tag("body")(init)
inline def address(init: ElementBuilder)(using Element): Unit = tag("address")(init)
inline def article(init: ElementBuilder)(using Element): Unit = tag("article")(init)
inline def aside(init: ElementBuilder)(using Element): Unit = tag("aside")(init)
inline def footer(init: ElementBuilder)(using Element): Unit = tag("footer")(init)
inline def header(init: ElementBuilder)(using Element): Unit = tag("header")(init)
inline def h1(init: ElementBuilder)(using Element): Unit = tag("h1")(init)
inline def h2(init: ElementBuilder)(using Element): Unit = tag("h2")(init)
inline def h3(init: ElementBuilder)(using Element): Unit = tag("h3")(init)
inline def h4(init: ElementBuilder)(using Element): Unit = tag("h4")(init)
inline def h5(init: ElementBuilder)(using Element): Unit = tag("h5")(init)
inline def h6(init: ElementBuilder)(using Element): Unit = tag("h6")(init)
inline def main(init: ElementBuilder)(using Element): Unit = tag("main")(init)
inline def nav(init: ElementBuilder)(using Element): Unit = tag("nav")(init)
inline def section(init: ElementBuilder)(using Element): Unit = tag("section")(init)
inline def blockquote(init: ElementBuilder)(using Element): Unit = tag("blockquote")(init)
inline def div(init: ElementBuilder)(using Element): Unit = tag("div")(init)
inline def figcaption(init: ElementBuilder)(using Element): Unit = tag("figcaption")(init)
inline def figure(init: ElementBuilder)(using Element): Unit = tag("figure")(init)
inline def hr(init: ElementBuilder)(using Element): Unit = tag("hr")(init)
inline def li(init: ElementBuilder)(using Element): Unit = tag("li")(init)
inline def ol(init: ElementBuilder)(using Element): Unit = tag("ol")(init)
inline def p(init: ElementBuilder)(using Element): Unit = tag("p")(init)
inline def pre(init: ElementBuilder)(using Element): Unit = tag("pre")(init)
inline def ul(init: ElementBuilder)(using Element): Unit = tag("ul")(init)
inline def a(init: ElementBuilder)(using Element): Unit = tag("a")(init)
inline def b(init: ElementBuilder)(using Element): Unit = tag("b")(init)
inline def br(init: ElementBuilder)(using Element): Unit = tag("br")(init)
inline def cite(init: ElementBuilder)(using Element): Unit = tag("cite")(init)
inline def code(init: ElementBuilder)(using Element): Unit = tag("code")(init)
inline def data(init: ElementBuilder)(using Element): Unit = tag("data")(init)
inline def em(init: ElementBuilder)(using Element): Unit = tag("em")(init)
inline def i(init: ElementBuilder)(using Element): Unit = tag("i")(init)
inline def mark(init: ElementBuilder)(using Element): Unit = tag("mark")(init)
inline def s(init: ElementBuilder)(using Element): Unit = tag("s")(init)
inline def small(init: ElementBuilder)(using Element): Unit = tag("small")(init)
inline def span(init: ElementBuilder)(using Element): Unit = tag("span")(init)
inline def strong(init: ElementBuilder)(using Element): Unit = tag("strong")(init)
inline def sub(init: ElementBuilder)(using Element): Unit = tag("sub")(init)
inline def sup(init: ElementBuilder)(using Element): Unit = tag("sup")(init)
inline def time(init: ElementBuilder)(using Element): Unit = tag("time")(init)
inline def audio(init: ElementBuilder)(using Element): Unit = tag("audio")(init)
inline def img(init: ElementBuilder)(using Element): Unit = tag("img")(init)
inline def video(init: ElementBuilder)(using Element): Unit = tag("video")(init)
inline def embed(init: ElementBuilder)(using Element): Unit = tag("embed")(init)
inline def iframe(init: ElementBuilder)(using Element): Unit = tag("iframe")(init)
inline def `object`(init: ElementBuilder)(using Element): Unit = tag("object")(init)
inline def param(init: ElementBuilder)(using Element): Unit = tag("param")(init)
inline def picture(init: ElementBuilder)(using Element): Unit = tag("picture")(init)
inline def source(init: ElementBuilder)(using Element): Unit = tag("source")(init)
inline def noscript(init: ElementBuilder)(using Element): Unit = tag("noscript")(init)
inline def caption(init: ElementBuilder)(using Element): Unit = tag("caption")(init)
inline def col(init: ElementBuilder)(using Element): Unit = tag("col")(init)
inline def colgroup(init: ElementBuilder)(using Element): Unit = tag("colgroup")(init)
inline def table(init: ElementBuilder)(using Element): Unit = tag("table")(init)
inline def tbody(init: ElementBuilder)(using Element): Unit = tag("tbody")(init)
inline def td(init: ElementBuilder)(using Element): Unit = tag("td")(init)
inline def tfoot(init: ElementBuilder)(using Element): Unit = tag("tfoot")(init)
inline def th(init: ElementBuilder)(using Element): Unit = tag("th")(init)
inline def thead(init: ElementBuilder)(using Element): Unit = tag("thead")(init)
inline def tr(init: ElementBuilder)(using Element): Unit = tag("tr")(init)
inline def button(init: ElementBuilder)(using Element): Unit = tag("button")(init)
inline def fieldset(init: ElementBuilder)(using Element): Unit = tag("fieldset")(init)
inline def form(init: ElementBuilder)(using Element): Unit = tag("form")(init)
inline def input(init: ElementBuilder)(using Element): Unit = tag("input")(init)
inline def label(init: ElementBuilder)(using Element): Unit = tag("label")(init)
inline def legend(init: ElementBuilder)(using Element): Unit = tag("legend")(init)
inline def meter(init: ElementBuilder)(using Element): Unit = tag("meter")(init)
inline def option(init: ElementBuilder)(using Element): Unit = tag("option")(init)
inline def progress(init: ElementBuilder)(using Element): Unit = tag("progress")(init)
inline def select(init: ElementBuilder)(using Element): Unit = tag("select")(init)
inline def textarea(init: ElementBuilder)(using Element): Unit = tag("textarea")(init)
inline def details(init: ElementBuilder)(using Element): Unit = tag("details")(init)
inline def dialog(init: ElementBuilder)(using Element): Unit = tag("dialog")(init)
inline def menu(init: ElementBuilder)(using Element): Unit = tag("menu")(init)
inline def slot(init: ElementBuilder)(using Element): Unit = tag("slot")(init)
inline def template(init: ElementBuilder)(using Element): Unit = tag("template")(init)

/*
Common Css Properties (from https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference)
 */

/**
 * Defines a Css property
 * @param propName Name of the property
 * @param style Css styling
 * @param pe Element to apply styling to.
 */
inline def cssProp(propName: String)(style: String)(using pe: Element): Unit =
  pe.asInstanceOf[js.Dynamic].style.updateDynamic(propName)(style)

inline def background(style: String)(using Element): Unit = cssProp("background")(style)
inline def backgroundAttachment(style: String)(using Element): Unit = cssProp("backgroundAttachment")(style)
inline def backgroundColor(style: String)(using Element): Unit = cssProp("backgroundColor")(style)
inline def backgroundImage(style: String)(using Element): Unit = cssProp("backgroundImage")(style)
inline def backgroundPosition(style: String)(using Element): Unit = cssProp("backgroundPosition")(style)
inline def backgroundRepeat(style: String)(using Element): Unit = cssProp("backgroundRepeat")(style)
inline def border(style: String)(using Element): Unit = cssProp("border")(style)
inline def borderBottom(style: String)(using Element): Unit = cssProp("borderBottom")(style)
inline def borderBottomColor(style: String)(using Element): Unit = cssProp("borderBottomColor")(style)
inline def borderBottomStyle(style: String)(using Element): Unit = cssProp("borderBottomStyle")(style)
inline def borderBottomWidth(style: String)(using Element): Unit = cssProp("borderBottomWidth")(style)
inline def borderColor(style: String)(using Element): Unit = cssProp("borderColor")(style)
inline def borderLeft(style: String)(using Element): Unit = cssProp("borderLeft")(style)
inline def borderLeftColor(style: String)(using Element): Unit = cssProp("borderLeftColor")(style)
inline def borderLeftStyle(style: String)(using Element): Unit = cssProp("borderLeftStyle")(style)
inline def borderLeftWidth(style: String)(using Element): Unit = cssProp("borderLeftWidth")(style)
inline def borderRight(style: String)(using Element): Unit = cssProp("borderRight")(style)
inline def borderRightColor(style: String)(using Element): Unit = cssProp("borderRightColor")(style)
inline def borderRightStyle(style: String)(using Element): Unit = cssProp("borderRightStyle")(style)
inline def borderRightWidth(style: String)(using Element): Unit = cssProp("borderRightWidth")(style)
inline def borderStyle(style: String)(using Element): Unit = cssProp("borderStyle")(style)
inline def borderTop(style: String)(using Element): Unit = cssProp("borderTop")(style)
inline def borderTopColor(style: String)(using Element): Unit = cssProp("borderTopColor")(style)
inline def borderTopStyle(style: String)(using Element): Unit = cssProp("borderTopStyle")(style)
inline def borderTopWidth(style: String)(using Element): Unit = cssProp("borderTopWidth")(style)
inline def borderWidth(style: String)(using Element): Unit = cssProp("borderWidth")(style)
inline def clear(style: String)(using Element): Unit = cssProp("clear")(style)
inline def clip(style: String)(using Element): Unit = cssProp("clip")(style)
inline def color(style: String)(using Element): Unit = cssProp("color")(style)
inline def cursor(style: String)(using Element): Unit = cssProp("cursor")(style)
inline def display(style: String)(using Element): Unit = cssProp("display")(style)
inline def filter(style: String)(using Element): Unit = cssProp("filter")(style)
inline def cssFloat(style: String)(using Element): Unit = cssProp("cssFloat")(style)
inline def font(style: String)(using Element): Unit = cssProp("font")(style)
inline def fontFamily(style: String)(using Element): Unit = cssProp("fontFamily")(style)
inline def fontSize(style: String)(using Element): Unit = cssProp("fontSize")(style)
inline def fontVariant(style: String)(using Element): Unit = cssProp("fontVariant")(style)
inline def fontWeight(style: String)(using Element): Unit = cssProp("fontWeight")(style)
inline def height(style: String)(using Element): Unit = cssProp("height")(style)
inline def left(style: String)(using Element): Unit = cssProp("left")(style)
inline def letterSpacing(style: String)(using Element): Unit = cssProp("letterSpacing")(style)
inline def lineHeight(style: String)(using Element): Unit = cssProp("lineHeight")(style)
inline def listStyle(style: String)(using Element): Unit = cssProp("listStyle")(style)
inline def listStyleImage(style: String)(using Element): Unit = cssProp("listStyleImage")(style)
inline def listStylePosition(style: String)(using Element): Unit = cssProp("listStylePosition")(style)
inline def listStyleType(style: String)(using Element): Unit = cssProp("listStyleType")(style)
inline def margin(style: String)(using Element): Unit = cssProp("margin")(style)
inline def marginBottom(style: String)(using Element): Unit = cssProp("marginBottom")(style)
inline def marginLeft(style: String)(using Element): Unit = cssProp("marginLeft")(style)
inline def marginRight(style: String)(using Element): Unit = cssProp("marginRight")(style)
inline def marginTop(style: String)(using Element): Unit = cssProp("marginTop")(style)
inline def overflow(style: String)(using Element): Unit = cssProp("overflow")(style)
inline def padding(style: String)(using Element): Unit = cssProp("padding")(style)
inline def paddingBottom(style: String)(using Element): Unit = cssProp("paddingBottom")(style)
inline def paddingLeft(style: String)(using Element): Unit = cssProp("paddingLeft")(style)
inline def paddingRight(style: String)(using Element): Unit = cssProp("paddingRight")(style)
inline def paddingTop(style: String)(using Element): Unit = cssProp("paddingTop")(style)
inline def pageBreakAfter(style: String)(using Element): Unit = cssProp("pageBreakAfter")(style)
inline def pageBreakBefore(style: String)(using Element): Unit = cssProp("pageBreakBefore")(style)
inline def position(style: String)(using Element): Unit = cssProp("position")(style)
inline def textAlign(style: String)(using Element): Unit = cssProp("textAlign")(style)
inline def textDecoration(style: String)(using Element): Unit = cssProp("textDecoration")(style)
inline def textIndent(style: String)(using Element): Unit = cssProp("textIndent")(style)
inline def textTransform(style: String)(using Element): Unit = cssProp("textTransform")(style)
inline def top(style: String)(using Element): Unit = cssProp("top")(style)
inline def verticalAlign(style: String)(using Element): Unit = cssProp("verticalAlign")(style)
inline def visibility(style: String)(using Element): Unit = cssProp("visibility")(style)
inline def width(style: String)(using Element): Unit = cssProp("width")(style)
inline def zIndex(style: String)(using Element): Unit = cssProp("zIndex")(style)
/*
Flexbox Css Props
 */
inline def alignContent(style: String)(using Element): Unit = cssProp("alignContent")(style)
inline def alignItems(style: String)(using Element): Unit = cssProp("alignItems")(style)
inline def alignSelf(style: String)(using Element): Unit = cssProp("alignSelf")(style)
inline def flex(style: String)(using Element): Unit = cssProp("flex")(style)
inline def flexBasis(style: String)(using Element): Unit = cssProp("flexBasis")(style)
inline def flexDirection(style: String)(using Element): Unit = cssProp("flexDirection")(style)
inline def flexFlow(style: String)(using Element): Unit = cssProp("flexFlow")(style)
inline def flexGrow(style: String)(using Element): Unit = cssProp("flexGrow")(style)
inline def flexShrink(style: String)(using Element): Unit = cssProp("flexShrink")(style)
inline def flexWrap(style: String)(using Element): Unit = cssProp("flexWrap")(style)
inline def justifyContent(style: String)(using Element): Unit = cssProp("justifyContent")(style)
inline def order(style: String)(using Element): Unit = cssProp("order")(style)
/*
Css Grid Properties
 */
inline def gridTemplateColums(style: String)(using Element): Unit = cssProp("gridTemplateColums")(style)
inline def gridTemplateRows(style: String)(using Element): Unit = cssProp("gridTemplateRows")(style)
inline def gridTemplate(style: String)(using Element): Unit = cssProp("gridTemplate")(style)
inline def gridAutoColumns(style: String)(using Element): Unit = cssProp("gridAutoColumns")(style)
inline def gridAutoRows(style: String)(using Element): Unit = cssProp("gridAutoRows")(style)
inline def gridAutoFlow(style: String)(using Element): Unit = cssProp("gridAutoFlow")(style)
inline def grid(style: String)(using Element): Unit = cssProp("grid")(style)
inline def gridRowStart(style: String)(using Element): Unit = cssProp("gridRowStart")(style)
inline def gridColumnStart(style: String)(using Element): Unit = cssProp("gridColumnStart")(style)
inline def gridRowEnd(style: String)(using Element): Unit = cssProp("gridRowEnd")(style)
inline def gridRow(style: String)(using Element): Unit = cssProp("gridRow")(style)
inline def gridColumn(style: String)(using Element): Unit = cssProp("gridColumn")(style)
inline def gridArea(style: String)(using Element): Unit = cssProp("gridArea")(style)
inline def rowGap(style: String)(using Element): Unit = cssProp("rowGap")(style)
inline def columnGap(style: String)(using Element): Unit = cssProp("columnGap")(style)
inline def gap(style: String)(using Element): Unit = cssProp("gap")(style)
/*
Additional useful css props
 */
inline def minHeight(style: String)(using Element): Unit = cssProp("minHeight")(style)
inline def maxHeight(style: String)(using Element): Unit = cssProp("maxHeight")(style)
inline def minWidth(style: String)(using Element): Unit = cssProp("minWidth")(style)
inline def maxWidth(style: String)(using Element): Unit = cssProp("maxWidth")(style)

/**
 * Define a Javascript property
 * @param propName name of the prop
 * @param value prop value
 * @param parent given Element to apply this property to
 * @param nc given NativeConverter for `value`
 * @tparam V value's type
 */
inline def prop[V](propName: String)(value: V)(using parent: Element, nc: NativeConverter[V]): Unit =
  parent.asInstanceOf[js.Dynamic].updateDynamic(propName)(nc.toNative(value))
  
/*
Global Attributes on HTMLElement, from https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes
 */
inline def accesskey[V: NativeConverter](value: V)(using Element): Unit = prop("accesskey")(value)
inline def autocapitalize[V: NativeConverter](value: V)(using Element): Unit = prop("autocapitalize")(value)
inline def className[V: NativeConverter](value: V)(using Element): Unit = prop("className")(value)
inline def cls[V: NativeConverter](value: V)(using Element): Unit = prop("className")(value)
inline def contenteditable[V: NativeConverter](value: V)(using Element): Unit = prop("contenteditable")(value)
inline def contextmenu[V: NativeConverter](value: V)(using Element): Unit = prop("contextmenu")(value)
inline def draggable[V: NativeConverter](value: V)(using Element): Unit = prop("draggable")(value)
inline def enterkeyhint[V: NativeConverter](value: V)(using Element): Unit = prop("enterkeyhint")(value)
inline def hidden[V: NativeConverter](value: V)(using Element): Unit = prop("hidden")(value)
inline def id[V: NativeConverter](value: V)(using Element): Unit = prop("id")(value)
inline def inputmode[V: NativeConverter](value: V)(using Element): Unit = prop("inputmode")(value)
inline def lang[V: NativeConverter](value: V)(using Element): Unit = prop("lang")(value)
inline def slot[V: NativeConverter](value: V)(using Element): Unit = prop("slot")(value)
inline def spellcheck[V: NativeConverter](value: V)(using Element): Unit = prop("spellcheck")(value)
inline def style[V: NativeConverter](value: V)(using Element): Unit = prop("style")(value)
inline def tabindex[V: NativeConverter](value: V)(using Element): Unit = prop("tabindex")(value)
inline def title[V: NativeConverter](value: V)(using Element): Unit = prop("title")(value)
/*
Context-sensitive attributes: https://www.w3schools.com/tags/ref_attributes.asp
 */
inline def accept[V: NativeConverter](value: V)(using Element): Unit = prop("accept")(value)
inline def action[V: NativeConverter](value: V)(using Element): Unit = prop("action")(value)
inline def alt[V: NativeConverter](value: V)(using Element): Unit = prop("alt")(value)
inline def autocomplete[V: NativeConverter](value: V)(using Element): Unit = prop("autocomplete")(value)
inline def autofocus[V: NativeConverter](value: V)(using Element): Unit = prop("autofocus")(value)
inline def autoplay[V: NativeConverter](value: V)(using Element): Unit = prop("autoplay")(value)
inline def checked[V: NativeConverter](value: V)(using Element): Unit = prop("checked")(value)
inline def cols[V: NativeConverter](value: V)(using Element): Unit = prop("cols")(value)
inline def colspan[V: NativeConverter](value: V)(using Element): Unit = prop("colspan")(value)
inline def content[V: NativeConverter](value: V)(using Element): Unit = prop("content")(value)
inline def controls[V: NativeConverter](value: V)(using Element): Unit = prop("controls")(value)
inline def datetime[V: NativeConverter](value: V)(using Element): Unit = prop("datetime")(value)
inline def disabled[V: NativeConverter](value: V)(using Element): Unit = prop("disabled")(value)
inline def download[V: NativeConverter](value: V)(using Element): Unit = prop("download")(value)
inline def `for`[V: NativeConverter](value: V)(using Element): Unit = prop("for")(value)
inline def formaction[V: NativeConverter](value: V)(using Element): Unit = prop("formaction")(value)
inline def href[V: NativeConverter](value: V)(using Element): Unit = prop("href")(value)
inline def loop[V: NativeConverter](value: V)(using Element): Unit = prop("loop")(value)
inline def max[V: NativeConverter](value: V)(using Element): Unit = prop("max")(value)
inline def maxlength[V: NativeConverter](value: V)(using Element): Unit = prop("maxlength")(value)
inline def media[V: NativeConverter](value: V)(using Element): Unit = prop("media")(value)
inline def method[V: NativeConverter](value: V)(using Element): Unit = prop("method")(value)
inline def min[V: NativeConverter](value: V)(using Element): Unit = prop("min")(value)
inline def multiple[V: NativeConverter](value: V)(using Element): Unit = prop("multiple")(value)
inline def muted[V: NativeConverter](value: V)(using Element): Unit = prop("muted")(value)
inline def name[V: NativeConverter](value: V)(using Element): Unit = prop("name")(value)
inline def novalidate[V: NativeConverter](value: V)(using Element): Unit = prop("novalidate")(value)
inline def placeholder[V: NativeConverter](value: V)(using Element): Unit = prop("placeholder")(value)
inline def poster[V: NativeConverter](value: V)(using Element): Unit = prop("poster")(value)
inline def preload[V: NativeConverter](value: V)(using Element): Unit = prop("preload")(value)
inline def readonly[V: NativeConverter](value: V)(using Element): Unit = prop("readonly")(value)
inline def rel[V: NativeConverter](value: V)(using Element): Unit = prop("rel")(value)
inline def required[V: NativeConverter](value: V)(using Element): Unit = prop("required")(value)
inline def reversed[V: NativeConverter](value: V)(using Element): Unit = prop("reversed")(value)
inline def selected[V: NativeConverter](value: V)(using Element): Unit = prop("selected")(value)
inline def src[V: NativeConverter](value: V)(using Element): Unit = prop("src")(value)
inline def srcset[V: NativeConverter](value: V)(using Element): Unit = prop("srcset")(value)
inline def target[V: NativeConverter](value: V)(using Element): Unit = prop("target")(value)
inline def `type`[V: NativeConverter](value: V)(using Element): Unit = prop("type")(value)
inline def value[V: NativeConverter](value: V)(using Element): Unit = prop("value")(value)
inline def wrap[V: NativeConverter](value: V)(using Element): Unit = prop("wrap")(value)


inline def onabort[V: NativeConverter](value: V)(using Element): Unit = prop("onabort")(value)
inline def onblur[V: NativeConverter](value: V)(using Element): Unit = prop("onblur")(value)
inline def onchange[V: NativeConverter](value: V)(using Element): Unit = prop("onchange")(value)
inline def onclick[V: NativeConverter](value: V)(using Element): Unit = prop("onclick")(value)
inline def oncontextmenu[V: NativeConverter](value: V)(using Element): Unit = prop("oncontextmenu")(value)
inline def oncopy[V: NativeConverter](value: V)(using Element): Unit = prop("oncopy")(value)
inline def oncut[V: NativeConverter](value: V)(using Element): Unit = prop("oncut")(value)
inline def ondblclick[V: NativeConverter](value: V)(using Element): Unit = prop("ondblclick")(value)
inline def ondrag[V: NativeConverter](value: V)(using Element): Unit = prop("ondrag")(value)
inline def ondragend[V: NativeConverter](value: V)(using Element): Unit = prop("ondragend")(value)
inline def ondragenter[V: NativeConverter](value: V)(using Element): Unit = prop("ondragenter")(value)
inline def ondragleave[V: NativeConverter](value: V)(using Element): Unit = prop("ondragleave")(value)
inline def ondragover[V: NativeConverter](value: V)(using Element): Unit = prop("ondragover")(value)
inline def ondragstart[V: NativeConverter](value: V)(using Element): Unit = prop("ondragstart")(value)
inline def ondrop[V: NativeConverter](value: V)(using Element): Unit = prop("ondrop")(value)
inline def onended[V: NativeConverter](value: V)(using Element): Unit = prop("onended")(value)
inline def onerror[V: NativeConverter](value: V)(using Element): Unit = prop("onerror")(value)
inline def onfocus[V: NativeConverter](value: V)(using Element): Unit = prop("onfocus")(value)
inline def oninput[V: NativeConverter](value: V)(using Element): Unit = prop("oninput")(value)
inline def oninvalid[V: NativeConverter](value: V)(using Element): Unit = prop("oninvalid")(value)
inline def onkeydown[V: NativeConverter](value: V)(using Element): Unit = prop("onkeydown")(value)
inline def onkeypress[V: NativeConverter](value: V)(using Element): Unit = prop("onkeypress")(value)
inline def onkeyup[V: NativeConverter](value: V)(using Element): Unit = prop("onkeyup")(value)
inline def onload[V: NativeConverter](value: V)(using Element): Unit = prop("onload")(value)
inline def onmousedown[V: NativeConverter](value: V)(using Element): Unit = prop("onmousedown")(value)
inline def onmousemove[V: NativeConverter](value: V)(using Element): Unit = prop("onmousemove")(value)
inline def onmouseover[V: NativeConverter](value: V)(using Element): Unit = prop("onmouseover")(value)
inline def onmouseup[V: NativeConverter](value: V)(using Element): Unit = prop("onmouseup")(value)
inline def onmousewheel[V: NativeConverter](value: V)(using Element): Unit = prop("onmousewheel")(value)
inline def onoffline[V: NativeConverter](value: V)(using Element): Unit = prop("onoffline")(value)
inline def ononline[V: NativeConverter](value: V)(using Element): Unit = prop("ononline")(value)
inline def onpaste[V: NativeConverter](value: V)(using Element): Unit = prop("onpaste")(value)
inline def onplay[V: NativeConverter](value: V)(using Element): Unit = prop("onplay")(value)
inline def onplaying[V: NativeConverter](value: V)(using Element): Unit = prop("onplaying")(value)
inline def onpopstate[V: NativeConverter](value: V)(using Element): Unit = prop("onpopstate")(value)
inline def onreset[V: NativeConverter](value: V)(using Element): Unit = prop("onreset")(value)
inline def onresize[V: NativeConverter](value: V)(using Element): Unit = prop("onresize")(value)
inline def onscroll[V: NativeConverter](value: V)(using Element): Unit = prop("onscroll")(value)
inline def onsearch[V: NativeConverter](value: V)(using Element): Unit = prop("onsearch")(value)
inline def onselect[V: NativeConverter](value: V)(using Element): Unit = prop("onselect")(value)
inline def onsubmit[V: NativeConverter](value: V)(using Element): Unit = prop("onsubmit")(value)
inline def onwheel[V: NativeConverter](value: V)(using Element): Unit = prop("onwheel")(value)

import scala.quoted.*

extension (inline sc: StringContext)(using inline pe: Element, inline pb: Binding[?])
  /**
   * t = TextNode Interpolator
   * <br>
   * An easy way to interpolate text and elements
   */
  inline def t(inline args: ComponentBuilder*): Unit = ${ tImpl('pe, 'pb, 'sc, 'args) }

private def tImpl(
  pe: Expr[Element],
  pb: Expr[Binding[?]],
  sc: Expr[StringContext],
  args: Expr[Seq[ComponentBuilder]]
)(using Quotes): Expr[Unit] =
  val argsExprs = args match
  case Varargs(ae) => ae.asInstanceOf[Seq[Expr[ComponentBuilder]]]
  
  sc match
  case '{ StringContext(${Varargs(strings)}: _*) } =>
    strings match
    case sHead +: sTail =>
      '{ $sHead.t(using $pe); ${tArgImpl(pe, pb, sTail, argsExprs)} }

private def tArgImpl(
  pe: Expr[Element],
  pb: Expr[Binding[?]],
  strings: Seq[Expr[String]],
  args: Seq[Expr[ComponentBuilder]]
)(using Quotes): Expr[Unit] =
  (strings, args) match
  case (Seq(), Seq()) => '{ () }
  case (s +: sTail, a +: aTail) =>
    '{
      val res = $a(using $pe, $pb)
      if res != () then res.toString.t(using $pe)
      $s.t(using $pe)
      ${tArgImpl(pe, pb, sTail, aTail)}
    }

extension (s: String)(using pe: Element)
  /**
   * Creates a TextNode
   */
  inline def t: Unit =
    pe.appendChild(js.Dynamic.global.document.createTextNode(s).asInstanceOf[Node])

/**
 * Please don't use this.. unless you must
 */
inline def dangerouslySetInnerHtml(html: String)(using parent: Element): Unit =
  parent.innerHTML = html

