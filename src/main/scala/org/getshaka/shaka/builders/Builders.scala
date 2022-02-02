package org.getshaka.shaka.builders

import scala.collection.Seq
import scala.scalajs.js
import org.getshaka.shaka.*
import org.getshaka.nativeconverter.NativeConverter
import org.scalajs.dom.*

/*
Builders to construct html Nodes & Elements
 */

inline def tag[T](tagName: String)(init: T ?=> Unit)(using parent: Element): Unit =
  val e: Element = document.createElement(tagName)
  init(using e.asInstanceOf[T])
  parent.appendChild(e)

/*
All the HTML tags defined in https://developer.mozilla.org/en-US/docs/Web/HTML/Element
 */
inline def base(init: HTMLBaseElement ?=> Unit)(using Element): Unit = tag("base")(init)
inline def head(init: HTMLHeadElement ?=> Unit)(using Element): Unit = tag("head")(init)
inline def link(init: HTMLLinkElement ?=> Unit)(using Element): Unit = tag("link")(init)
inline def meta(init: HTMLMetaElement ?=> Unit)(using Element): Unit = tag("meta")(init)
inline def style(init: HTMLStyleElement ?=> Unit)(using Element): Unit = tag("style")(init)
inline def title(init: HTMLTitleElement ?=> Unit)(using Element): Unit = tag("title")(init)
inline def body(init: HTMLBodyElement ?=> Unit)(using Element): Unit = tag("body")(init)
inline def address(init: HTMLElement ?=> Unit)(using Element): Unit = tag("address")(init)
inline def article(init: HTMLElement ?=> Unit)(using Element): Unit = tag("article")(init)
inline def aside(init: HTMLElement ?=> Unit)(using Element): Unit = tag("aside")(init)
inline def footer(init: HTMLElement ?=> Unit)(using Element): Unit = tag("footer")(init)
inline def header(init: HTMLElement ?=> Unit)(using Element): Unit = tag("header")(init)
inline def h1(init: HTMLHeadingElement ?=> Unit)(using Element): Unit = tag("h1")(init)
inline def h2(init: HTMLHeadingElement ?=> Unit)(using Element): Unit = tag("h2")(init)
inline def h3(init: HTMLHeadingElement ?=> Unit)(using Element): Unit = tag("h3")(init)
inline def h4(init: HTMLHeadingElement ?=> Unit)(using Element): Unit = tag("h4")(init)
inline def h5(init: HTMLHeadingElement ?=> Unit)(using Element): Unit = tag("h5")(init)
inline def h6(init: HTMLHeadingElement ?=> Unit)(using Element): Unit = tag("h6")(init)
inline def main(init: HTMLElement ?=> Unit)(using Element): Unit = tag("main")(init)
inline def nav(init: HTMLElement ?=> Unit)(using Element): Unit = tag("nav")(init)
inline def section(init: HTMLElement ?=> Unit)(using Element): Unit = tag("section")(init)
inline def blockquote(init: HTMLQuoteElement ?=> Unit)(using Element): Unit = tag("blockquote")(init)
inline def div(init: HTMLDivElement ?=> Unit)(using Element): Unit = tag("div")(init)
inline def figcaption(init: HTMLElement ?=> Unit)(using Element): Unit = tag("figcaption")(init)
inline def figure(init: HTMLElement ?=> Unit)(using Element): Unit = tag("figure")(init)
inline def hr(init: HTMLHRElement ?=> Unit)(using Element): Unit = tag("hr")(init)
inline def li(init: HTMLLIElement ?=> Unit)(using Element): Unit = tag("li")(init)
inline def ol(init: HTMLOListElement ?=> Unit)(using Element): Unit = tag("ol")(init)
inline def p(init: HTMLParagraphElement ?=> Unit)(using Element): Unit = tag("p")(init)
inline def pre(init: HTMLPreElement ?=> Unit)(using Element): Unit = tag("pre")(init)
inline def ul(init: HTMLUListElement ?=> Unit)(using Element): Unit = tag("ul")(init)
inline def a(init: HTMLAnchorElement ?=> Unit)(using Element): Unit = tag("a")(init)
inline def b(init: HTMLElement ?=> Unit)(using Element): Unit = tag("b")(init)
inline def br(init: HTMLBRElement ?=> Unit)(using Element): Unit = tag("br")(init)
inline def cite(init: HTMLElement ?=> Unit)(using Element): Unit = tag("cite")(init)
inline def code(init: HTMLElement ?=> Unit)(using Element): Unit = tag("code")(init)
inline def data(init: HTMLElement ?=> Unit)(using Element): Unit = tag("data")(init)
inline def em(init: HTMLElement ?=> Unit)(using Element): Unit = tag("em")(init)
inline def i(init: HTMLElement ?=> Unit)(using Element): Unit = tag("i")(init)
inline def mark(init: HTMLElement ?=> Unit)(using Element): Unit = tag("mark")(init)
inline def s(init: HTMLElement ?=> Unit)(using Element): Unit = tag("s")(init)
inline def small(init: HTMLElement ?=> Unit)(using Element): Unit = tag("small")(init)
inline def span(init: HTMLSpanElement ?=> Unit)(using Element): Unit = tag("span")(init)
inline def strong(init: HTMLElement ?=> Unit)(using Element): Unit = tag("strong")(init)
inline def sub(init: HTMLElement ?=> Unit)(using Element): Unit = tag("sub")(init)
inline def sup(init: HTMLElement ?=> Unit)(using Element): Unit = tag("sup")(init)
// todo add HTMLTimeElement to scalajs-dom
inline def time(init: HTMLElement ?=> Unit)(using Element): Unit = tag("time")(init)
inline def audio(init: HTMLAudioElement ?=> Unit)(using Element): Unit = tag("audio")(init)
inline def img(init: HTMLImageElement ?=> Unit)(using Element): Unit = tag("img")(init)
inline def video(init: HTMLVideoElement ?=> Unit)(using Element): Unit = tag("video")(init)
inline def embed(init: HTMLEmbedElement ?=> Unit)(using Element): Unit = tag("embed")(init)
inline def iframe(init: HTMLIFrameElement ?=> Unit)(using Element): Unit = tag("iframe")(init)
inline def `object`(init: HTMLObjectElement ?=> Unit)(using Element): Unit = tag("object")(init)
inline def param(init: HTMLParamElement ?=> Unit)(using Element): Unit = tag("param")(init)
// todo add HTMLPictureElement to scalajs-dom
inline def picture(init: HTMLElement ?=> Unit)(using Element): Unit = tag("picture")(init)
inline def source(init: HTMLSourceElement ?=> Unit)(using Element): Unit = tag("source")(init)
inline def noscript(init: HTMLElement ?=> Unit)(using Element): Unit = tag("noscript")(init)
inline def caption(init: HTMLTableCaptionElement ?=> Unit)(using Element): Unit = tag("caption")(init)
inline def col(init: HTMLTableColElement ?=> Unit)(using Element): Unit = tag("col")(init)
inline def colgroup(init: HTMLTableColElement ?=> Unit)(using Element): Unit = tag("colgroup")(init)
inline def table(init: HTMLTableElement ?=> Unit)(using Element): Unit = tag("table")(init)
inline def tbody(init: HTMLTableSectionElement ?=> Unit)(using Element): Unit = tag("tbody")(init)
inline def td(init: HTMLTableCellElement ?=> Unit)(using Element): Unit = tag("td")(init)
inline def tfoot(init: HTMLTableSectionElement ?=> Unit)(using Element): Unit = tag("tfoot")(init)
inline def th(init: HTMLTableCellElement ?=> Unit)(using Element): Unit = tag("th")(init)
inline def thead(init: HTMLTableSectionElement ?=> Unit)(using Element): Unit = tag("thead")(init)
inline def tr(init: HTMLTableRowElement ?=> Unit)(using Element): Unit = tag("tr")(init)
inline def button(init: HTMLButtonElement ?=> Unit)(using Element): Unit = tag("button")(init)
inline def fieldset(init: HTMLFieldSetElement ?=> Unit)(using Element): Unit = tag("fieldset")(init)
inline def form(init: HTMLFormElement ?=> Unit)(using Element): Unit = tag("form")(init)
inline def input(init: HTMLInputElement ?=> Unit)(using Element): Unit = tag("input")(init)
inline def label(init: HTMLLabelElement ?=> Unit)(using Element): Unit = tag("label")(init)
inline def legend(init: HTMLLegendElement ?=> Unit)(using Element): Unit = tag("legend")(init)
inline def meter(init: HTMLElement ?=> Unit)(using Element): Unit = tag("meter")(init)
inline def option(init: HTMLOptionElement ?=> Unit)(using Element): Unit = tag("option")(init)
inline def progress(init: HTMLProgressElement ?=> Unit)(using Element): Unit = tag("progress")(init)
inline def select(init: HTMLSelectElement ?=> Unit)(using Element): Unit = tag("select")(init)
inline def textarea(init: HTMLTextAreaElement ?=> Unit)(using Element): Unit = tag("textarea")(init)
// todo add HTMLDetailsElement to scalajs-dom
inline def details(init: HTMLElement ?=> Unit)(using Element): Unit = tag("details")(init)
// todo add HTMLDialogElement to scalajs-dom
inline def dialog(init: HTMLElement ?=> Unit)(using Element): Unit = tag("dialog")(init)
inline def menu(init: HTMLMenuElement ?=> Unit)(using Element): Unit = tag("menu")(init)
// todo add HTMLSlotElement to scalajs-dom
inline def slot(init: HTMLElement ?=> Unit)(using Element): Unit = tag("slot")(init)
// todo add HTMLTemplateElement to scalajs-dom
inline def template(init: HTMLElement ?=> Unit)(using Element): Unit = tag("template")(init)

/*
Common Css Properties (from https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference)
 */

/**
 * Defines a Css property
 * @param propName Name of the property
 * @param style Css styling
 * @param pe Element to apply styling to.
 */
inline def cssProp(propName: String)(style: String)(using pe: HTMLElement): Unit =
  pe.asInstanceOf[js.Dynamic].style.updateDynamic(propName)(style)

inline def background(style: String)(using HTMLElement): Unit = cssProp("background")(style)
inline def backgroundAttachment(style: String)(using HTMLElement): Unit = cssProp("backgroundAttachment")(style)
inline def backgroundColor(style: String)(using HTMLElement): Unit = cssProp("backgroundColor")(style)
inline def backgroundImage(style: String)(using HTMLElement): Unit = cssProp("backgroundImage")(style)
inline def backgroundPosition(style: String)(using HTMLElement): Unit = cssProp("backgroundPosition")(style)
inline def backgroundRepeat(style: String)(using HTMLElement): Unit = cssProp("backgroundRepeat")(style)
inline def border(style: String)(using HTMLElement): Unit = cssProp("border")(style)
inline def borderBottom(style: String)(using HTMLElement): Unit = cssProp("borderBottom")(style)
inline def borderBottomColor(style: String)(using HTMLElement): Unit = cssProp("borderBottomColor")(style)
inline def borderBottomStyle(style: String)(using HTMLElement): Unit = cssProp("borderBottomStyle")(style)
inline def borderBottomWidth(style: String)(using HTMLElement): Unit = cssProp("borderBottomWidth")(style)
inline def borderColor(style: String)(using HTMLElement): Unit = cssProp("borderColor")(style)
inline def borderLeft(style: String)(using HTMLElement): Unit = cssProp("borderLeft")(style)
inline def borderLeftColor(style: String)(using HTMLElement): Unit = cssProp("borderLeftColor")(style)
inline def borderLeftStyle(style: String)(using HTMLElement): Unit = cssProp("borderLeftStyle")(style)
inline def borderLeftWidth(style: String)(using HTMLElement): Unit = cssProp("borderLeftWidth")(style)
inline def borderRight(style: String)(using HTMLElement): Unit = cssProp("borderRight")(style)
inline def borderRightColor(style: String)(using HTMLElement): Unit = cssProp("borderRightColor")(style)
inline def borderRightStyle(style: String)(using HTMLElement): Unit = cssProp("borderRightStyle")(style)
inline def borderRightWidth(style: String)(using HTMLElement): Unit = cssProp("borderRightWidth")(style)
inline def borderStyle(style: String)(using HTMLElement): Unit = cssProp("borderStyle")(style)
inline def borderTop(style: String)(using HTMLElement): Unit = cssProp("borderTop")(style)
inline def borderTopColor(style: String)(using HTMLElement): Unit = cssProp("borderTopColor")(style)
inline def borderTopStyle(style: String)(using HTMLElement): Unit = cssProp("borderTopStyle")(style)
inline def borderTopWidth(style: String)(using HTMLElement): Unit = cssProp("borderTopWidth")(style)
inline def borderWidth(style: String)(using HTMLElement): Unit = cssProp("borderWidth")(style)
inline def clear(style: String)(using HTMLElement): Unit = cssProp("clear")(style)
inline def clip(style: String)(using HTMLElement): Unit = cssProp("clip")(style)
inline def color(style: String)(using HTMLElement): Unit = cssProp("color")(style)
inline def cursor(style: String)(using HTMLElement): Unit = cssProp("cursor")(style)
inline def display(style: String)(using HTMLElement): Unit = cssProp("display")(style)
inline def filter(style: String)(using HTMLElement): Unit = cssProp("filter")(style)
inline def cssFloat(style: String)(using HTMLElement): Unit = cssProp("cssFloat")(style)
inline def font(style: String)(using HTMLElement): Unit = cssProp("font")(style)
inline def fontFamily(style: String)(using HTMLElement): Unit = cssProp("fontFamily")(style)
inline def fontSize(style: String)(using HTMLElement): Unit = cssProp("fontSize")(style)
inline def fontVariant(style: String)(using HTMLElement): Unit = cssProp("fontVariant")(style)
inline def fontWeight(style: String)(using HTMLElement): Unit = cssProp("fontWeight")(style)
inline def height(style: String)(using HTMLElement): Unit = cssProp("height")(style)
inline def left(style: String)(using HTMLElement): Unit = cssProp("left")(style)
inline def letterSpacing(style: String)(using HTMLElement): Unit = cssProp("letterSpacing")(style)
inline def lineHeight(style: String)(using HTMLElement): Unit = cssProp("lineHeight")(style)
inline def listStyle(style: String)(using HTMLElement): Unit = cssProp("listStyle")(style)
inline def listStyleImage(style: String)(using HTMLElement): Unit = cssProp("listStyleImage")(style)
inline def listStylePosition(style: String)(using HTMLElement): Unit = cssProp("listStylePosition")(style)
inline def listStyleType(style: String)(using HTMLElement): Unit = cssProp("listStyleType")(style)
inline def margin(style: String)(using HTMLElement): Unit = cssProp("margin")(style)
inline def marginBottom(style: String)(using HTMLElement): Unit = cssProp("marginBottom")(style)
inline def marginLeft(style: String)(using HTMLElement): Unit = cssProp("marginLeft")(style)
inline def marginRight(style: String)(using HTMLElement): Unit = cssProp("marginRight")(style)
inline def marginTop(style: String)(using HTMLElement): Unit = cssProp("marginTop")(style)
inline def overflow(style: String)(using HTMLElement): Unit = cssProp("overflow")(style)
inline def padding(style: String)(using HTMLElement): Unit = cssProp("padding")(style)
inline def paddingBottom(style: String)(using HTMLElement): Unit = cssProp("paddingBottom")(style)
inline def paddingLeft(style: String)(using HTMLElement): Unit = cssProp("paddingLeft")(style)
inline def paddingRight(style: String)(using HTMLElement): Unit = cssProp("paddingRight")(style)
inline def paddingTop(style: String)(using HTMLElement): Unit = cssProp("paddingTop")(style)
inline def pageBreakAfter(style: String)(using HTMLElement): Unit = cssProp("pageBreakAfter")(style)
inline def pageBreakBefore(style: String)(using HTMLElement): Unit = cssProp("pageBreakBefore")(style)
inline def position(style: String)(using HTMLElement): Unit = cssProp("position")(style)
inline def textAlign(style: String)(using HTMLElement): Unit = cssProp("textAlign")(style)
inline def textDecoration(style: String)(using HTMLElement): Unit = cssProp("textDecoration")(style)
inline def textIndent(style: String)(using HTMLElement): Unit = cssProp("textIndent")(style)
inline def textTransform(style: String)(using HTMLElement): Unit = cssProp("textTransform")(style)
inline def top(style: String)(using HTMLElement): Unit = cssProp("top")(style)
inline def verticalAlign(style: String)(using HTMLElement): Unit = cssProp("verticalAlign")(style)
inline def visibility(style: String)(using HTMLElement): Unit = cssProp("visibility")(style)
inline def width(style: String)(using HTMLElement): Unit = cssProp("width")(style)
inline def zIndex(style: String)(using HTMLElement): Unit = cssProp("zIndex")(style)
/*
Flexbox Css Props
 */
inline def alignContent(style: String)(using HTMLElement): Unit = cssProp("alignContent")(style)
inline def alignItems(style: String)(using HTMLElement): Unit = cssProp("alignItems")(style)
inline def alignSelf(style: String)(using HTMLElement): Unit = cssProp("alignSelf")(style)
inline def flex(style: String)(using HTMLElement): Unit = cssProp("flex")(style)
inline def flexBasis(style: String)(using HTMLElement): Unit = cssProp("flexBasis")(style)
inline def flexDirection(style: String)(using HTMLElement): Unit = cssProp("flexDirection")(style)
inline def flexFlow(style: String)(using HTMLElement): Unit = cssProp("flexFlow")(style)
inline def flexGrow(style: String)(using HTMLElement): Unit = cssProp("flexGrow")(style)
inline def flexShrink(style: String)(using HTMLElement): Unit = cssProp("flexShrink")(style)
inline def flexWrap(style: String)(using HTMLElement): Unit = cssProp("flexWrap")(style)
inline def justifyContent(style: String)(using HTMLElement): Unit = cssProp("justifyContent")(style)
inline def order(style: String)(using HTMLElement): Unit = cssProp("order")(style)
/*
Css Grid Properties
 */
inline def gridTemplateColumns(style: String)(using HTMLElement): Unit = cssProp("gridTemplateColumns")(style)
inline def gridTemplateRows(style: String)(using HTMLElement): Unit = cssProp("gridTemplateRows")(style)
inline def gridTemplate(style: String)(using HTMLElement): Unit = cssProp("gridTemplate")(style)
inline def gridAutoColumns(style: String)(using HTMLElement): Unit = cssProp("gridAutoColumns")(style)
inline def gridAutoRows(style: String)(using HTMLElement): Unit = cssProp("gridAutoRows")(style)
inline def gridAutoFlow(style: String)(using HTMLElement): Unit = cssProp("gridAutoFlow")(style)
inline def grid(style: String)(using HTMLElement): Unit = cssProp("grid")(style)
inline def gridRowStart(style: String)(using HTMLElement): Unit = cssProp("gridRowStart")(style)
inline def gridColumnStart(style: String)(using HTMLElement): Unit = cssProp("gridColumnStart")(style)
inline def gridRowEnd(style: String)(using HTMLElement): Unit = cssProp("gridRowEnd")(style)
inline def gridRow(style: String)(using HTMLElement): Unit = cssProp("gridRow")(style)
inline def gridColumn(style: String)(using HTMLElement): Unit = cssProp("gridColumn")(style)
inline def gridArea(style: String)(using HTMLElement): Unit = cssProp("gridArea")(style)
inline def rowGap(style: String)(using HTMLElement): Unit = cssProp("rowGap")(style)
inline def columnGap(style: String)(using HTMLElement): Unit = cssProp("columnGap")(style)
inline def gap(style: String)(using HTMLElement): Unit = cssProp("gap")(style)
/*
Additional useful css props
 */
inline def minHeight(style: String)(using HTMLElement): Unit = cssProp("minHeight")(style)
inline def maxHeight(style: String)(using HTMLElement): Unit = cssProp("maxHeight")(style)
inline def minWidth(style: String)(using HTMLElement): Unit = cssProp("minWidth")(style)
inline def maxWidth(style: String)(using HTMLElement): Unit = cssProp("maxWidth")(style)

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
inline def accesskey(value: String)(using HTMLElement): Unit = prop("accesskey")(value)
inline def autocapitalize(value: String)(using HTMLElement): Unit = prop("autocapitalize")(value)
inline def className(value: String)(using HTMLElement): Unit = prop("className")(value)
inline def cls(value: String)(using HTMLElement): Unit = prop("className")(value)
inline def contenteditable(value: Boolean)(using HTMLElement): Unit = prop("contenteditable")(value)
inline def contextmenu(value: String)(using HTMLElement): Unit = prop("contextmenu")(value)
inline def draggable(value: Boolean)(using HTMLElement): Unit = prop("draggable")(value)
inline def enterkeyhint(value: String)(using HTMLElement): Unit = prop("enterkeyhint")(value)
inline def hidden(value: Boolean)(using HTMLElement): Unit = prop("hidden")(value)
inline def id(value: String)(using HTMLElement): Unit = prop("id")(value)
inline def inputmode(value: String)(using HTMLElement): Unit = prop("inputmode")(value)
inline def lang(value: String)(using HTMLElement): Unit = prop("lang")(value)
inline def slot(value: String)(using HTMLElement): Unit = prop("slot")(value)
inline def spellcheck(value: Boolean)(using HTMLElement): Unit = prop("spellcheck")(value)
inline def style(value: String)(using HTMLElement): Unit = prop("style")(value)
inline def tabindex(value: Int)(using HTMLElement): Unit = prop("tabindex")(value)
inline def title(value: String)(using HTMLElement): Unit = prop("title")(value)
/*
Context-sensitive attributes: https://www.w3schools.com/tags/ref_attributes.asp
 */
inline def accept(value: String)(using HTMLElement): Unit = prop("accept")(value)
inline def action(value: String)(using HTMLElement): Unit = prop("action")(value)
inline def alt(value: String)(using HTMLElement): Unit = prop("alt")(value)
inline def autocomplete(value: String)(using HTMLElement): Unit = prop("autocomplete")(value)
inline def autofocus(value: Boolean)(using HTMLElement): Unit = prop("autofocus")(value)
inline def autoplay(value: Boolean)(using HTMLElement): Unit = prop("autoplay")(value)
inline def checked(value: Boolean)(using HTMLElement): Unit = prop("checked")(value)
inline def cols(value: Int)(using HTMLElement): Unit = prop("cols")(value)
inline def colspan(value: Int)(using HTMLElement): Unit = prop("colspan")(value)
inline def content(value: String)(using HTMLElement): Unit = prop("content")(value)
inline def controls(value: Boolean)(using HTMLElement): Unit = prop("controls")(value)
inline def datetime(value: String)(using HTMLElement): Unit = prop("datetime")(value)
inline def disabled(value: Boolean)(using HTMLElement): Unit = prop("disabled")(value)
inline def download(value: Boolean)(using HTMLElement): Unit = prop("download")(value)
inline def `for`(value: String)(using HTMLElement): Unit = prop("for")(value)
inline def formaction(value: String)(using HTMLElement): Unit = prop("formaction")(value)
inline def href(value: String)(using HTMLElement): Unit = prop("href")(value)
inline def loop(value: Boolean)(using HTMLElement): Unit = prop("loop")(value)
inline def max(value: String)(using HTMLElement): Unit = prop("max")(value)
inline def maxlength(value: Int)(using HTMLElement): Unit = prop("maxlength")(value)
inline def media(value: String)(using HTMLElement): Unit = prop("media")(value)
inline def method(value: String)(using HTMLElement): Unit = prop("method")(value)
inline def min(value: String)(using HTMLElement): Unit = prop("min")(value)
inline def multiple(value: Boolean)(using HTMLElement): Unit = prop("multiple")(value)
inline def muted(value: Boolean)(using HTMLElement): Unit = prop("muted")(value)
inline def name(value: String)(using HTMLElement): Unit = prop("name")(value)
inline def novalidate(value: Boolean)(using HTMLElement): Unit = prop("novalidate")(value)
inline def placeholder(value: String)(using HTMLElement): Unit = prop("placeholder")(value)
inline def poster(value: String)(using HTMLElement): Unit = prop("poster")(value)
inline def preload(value: String)(using HTMLElement): Unit = prop("preload")(value)
inline def readonly(value: Boolean)(using HTMLElement): Unit = prop("readonly")(value)
inline def rel(value: String)(using HTMLElement): Unit = prop("rel")(value)
inline def required(value: Boolean)(using HTMLElement): Unit = prop("required")(value)
inline def reversed(value: Boolean)(using HTMLElement): Unit = prop("reversed")(value)
inline def selected(value: Boolean)(using HTMLElement): Unit = prop("selected")(value)
inline def src(value: String)(using HTMLElement): Unit = prop("src")(value)
inline def srcset(value: String)(using HTMLElement): Unit = prop("srcset")(value)
inline def target(value: String)(using HTMLElement): Unit = prop("target")(value)
inline def `type`(value: String)(using HTMLElement): Unit = prop("type")(value)
inline def value(value: String)(using HTMLElement): Unit = prop("value")(value)
inline def wrap(value: String)(using HTMLElement): Unit = prop("wrap")(value)


inline def onabort(value: Event => Unit)(using HTMLElement): Unit = prop("onabort")(value)
inline def onblur(value: FocusEvent => Unit)(using HTMLElement): Unit = prop("onblur")(value)
inline def onchange(value: Event => Unit)(using HTMLElement): Unit = prop("onchange")(value)
inline def onclick(value: MouseEvent => Unit)(using HTMLElement): Unit = prop("onclick")(value)
inline def oncontextmenu(value: MouseEvent => Unit)(using HTMLElement): Unit = prop("oncontextmenu")(value)
inline def oncopy(value: ClipboardEvent => Unit)(using HTMLElement): Unit = prop("oncopy")(value)
inline def oncut(value: ClipboardEvent => Unit)(using HTMLElement): Unit = prop("oncut")(value)
inline def ondblclick(value: MouseEvent => Unit)(using HTMLElement): Unit = prop("ondblclick")(value)
inline def ondrag(value: DragEvent => Unit)(using HTMLElement): Unit = prop("ondrag")(value)
inline def ondragend(value: DragEvent => Unit)(using HTMLElement): Unit = prop("ondragend")(value)
inline def ondragenter(value: DragEvent => Unit)(using HTMLElement): Unit = prop("ondragenter")(value)
inline def ondragleave(value: DragEvent => Unit)(using HTMLElement): Unit = prop("ondragleave")(value)
inline def ondragover(value: DragEvent => Unit)(using HTMLElement): Unit = prop("ondragover")(value)
inline def ondragstart(value: DragEvent => Unit)(using HTMLElement): Unit = prop("ondragstart")(value)
inline def ondrop(value: DragEvent => Unit)(using HTMLElement): Unit = prop("ondrop")(value)
inline def onended(value: HTMLMediaElement => Unit)(using HTMLElement): Unit = prop("onended")(value)
inline def onerror(value: Event => Unit)(using HTMLElement): Unit = prop("onerror")(value)
inline def onfocus(value: FocusEvent => Unit)(using HTMLElement): Unit = prop("onfocus")(value)
inline def oninput(value: Event => Unit)(using HTMLElement): Unit = prop("oninput")(value)
inline def oninvalid(value: Event => Unit)(using HTMLElement): Unit = prop("oninvalid")(value)
inline def onkeydown(value: KeyboardEvent => Unit)(using HTMLElement): Unit = prop("onkeydown")(value)
inline def onkeypress(value: KeyboardEvent => Unit)(using HTMLElement): Unit = prop("onkeypress")(value)
inline def onkeyup(value: KeyboardEvent => Unit)(using HTMLElement): Unit = prop("onkeyup")(value)
inline def onload(value: Event => Unit)(using HTMLElement): Unit = prop("onload")(value)
inline def onmousedown(value: MouseEvent => Unit)(using HTMLElement): Unit = prop("onmousedown")(value)
inline def onmousemove(value: MouseEvent => Unit)(using HTMLElement): Unit = prop("onmousemove")(value)
inline def onmouseover(value: MouseEvent => Unit)(using HTMLElement): Unit = prop("onmouseover")(value)
inline def onmouseup(value: MouseEvent => Unit)(using HTMLElement): Unit = prop("onmouseup")(value)
inline def onmousewheel(value: WheelEvent => Unit)(using HTMLElement): Unit = prop("onmousewheel")(value)
inline def onoffline(value: Event => Unit)(using HTMLElement): Unit = prop("onoffline")(value)
inline def ononline(value: Event => Unit)(using HTMLElement): Unit = prop("ononline")(value)
inline def onpaste(value: ClipboardEvent => Unit)(using HTMLElement): Unit = prop("onpaste")(value)
inline def onplay(value: Event => Unit)(using HTMLElement): Unit = prop("onplay")(value)
inline def onplaying(value: Event => Unit)(using HTMLElement): Unit = prop("onplaying")(value)
inline def onpopstate(value: PopStateEvent => Unit)(using HTMLElement): Unit = prop("onpopstate")(value)
inline def onreset(value: Event => Unit)(using HTMLElement): Unit = prop("onreset")(value)
inline def onresize(value: UIEvent => Unit)(using HTMLElement): Unit = prop("onresize")(value)
inline def onscroll(value: Event => Unit)(using HTMLElement): Unit = prop("onscroll")(value)
inline def onsearch(value: Event => Unit)(using HTMLElement): Unit = prop("onsearch")(value)
inline def onselect(value: Event => Unit)(using HTMLElement): Unit = prop("onselect")(value)
inline def onsubmit(value: Event => Unit)(using HTMLElement): Unit = prop("onsubmit")(value)
inline def onwheel(value: WheelEvent => Unit)(using HTMLElement): Unit = prop("onwheel")(value)

import scala.quoted.*

extension (inline sc: StringContext)(using inline pe: Element, inline pb: Binding[?])
  /**
   * t = TextNode Interpolator
   * <br>
   * An easy way to interpolate text and elements
   */
  inline def t(inline args: Any*): Unit =
    ${ tImpl('pe, 'pb, 'sc, 'args) }

private def tImpl(
  pe: Expr[Element],
  pb: Expr[Binding[?]],
  sc: Expr[StringContext],
  args: Expr[Seq[Any]]
)(using Quotes): Expr[Unit] =
  val argsExprs = args match
  case Varargs(ae) => ae.asInstanceOf[Seq[Expr[Any]]]
  
  sc match
  case '{ StringContext(${Varargs(strings)}: _*) } =>
    strings.map(s => Expr(s.valueOrError.stripMargin)) match
    case sHead +: sTail =>
      '{
        $pe.appendChild(document.createTextNode($sHead))
        ${tArgImpl(pe, pb, sTail, argsExprs)}
       }

private def tArgImpl(
  pe: Expr[Element],
  pb: Expr[Binding[?]],
  strings: Seq[Expr[String]],
  args: Seq[Expr[Any]]
)(using q: Quotes): Expr[Unit] =
  (strings, args) match
  case (Seq(), Seq()) => '{ () }
  case (s +: sTail, a +: aTail) =>
    val applyArgToDom = a match
      case '{ $f: Frag } => '{ $f.render(using $pe, $pb) }
      case '{ $c: Component } => '{ $c.render(using $pe, $pb) }
      case '{ $u: Unit } => u
      case '{ $x: t } => '{ $pe.appendChild(document.createTextNode($x.toString)) }
    '{
      $applyArgToDom
      $pe.appendChild(document.createTextNode($s))
      ${tArgImpl(pe, pb, sTail, aTail)}
    }

extension (s: String)(using pe: Element)
  /** Creates a TextNode */
  inline def t: Unit =
    pe.appendChild(document.createTextNode(s))

/**
 * Please don't use this.. unless you must
 */
inline def dangerouslySetInnerHtml(html: String)(using parent: Element): Unit =
  parent.innerHTML = html

