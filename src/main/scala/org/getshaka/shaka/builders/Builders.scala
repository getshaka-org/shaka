package org.getshaka.shaka.builders

import scala.collection.Seq
import scala.scalajs.js
import org.getshaka.shaka.*
import org.getshaka.nativeconverter.NativeConverter
import org.scalajs.dom.*

/*
Builders to construct html Nodes & Elements
 */

inline def tag[T](inline tagName: String)(inline init: T ?=> Any)(using inline parent: Element): Unit =
  val e: Element = document.createElement(tagName)
  init(using e.asInstanceOf[T])
  parent.appendChild(e)

/*
All the HTML tags defined in https://developer.mozilla.org/en-US/docs/Web/HTML/Element
 */
inline def base(inline init: HTMLBaseElement ?=> Any)(using inline e: Element): Unit = tag("base")(init)
inline def head(inline init: HTMLHeadElement ?=> Any)(using inline e: Element): Unit = tag("head")(init)
inline def link(inline init: HTMLLinkElement ?=> Any)(using inline e: Element): Unit = tag("link")(init)
inline def meta(inline init: HTMLMetaElement ?=> Any)(using inline e: Element): Unit = tag("meta")(init)
inline def style(inline init: HTMLStyleElement ?=> Any)(using inline e: Element): Unit = tag("style")(init)
inline def title(inline init: HTMLTitleElement ?=> Any)(using inline e: Element): Unit = tag("title")(init)
inline def body(inline init: HTMLBodyElement ?=> Any)(using inline e: Element): Unit = tag("body")(init)
inline def address(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("address")(init)
inline def article(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("article")(init)
inline def aside(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("aside")(init)
inline def footer(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("footer")(init)
inline def header(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("header")(init)
inline def h1(inline init: HTMLHeadingElement ?=> Any)(using inline e: Element): Unit = tag("h1")(init)
inline def h2(inline init: HTMLHeadingElement ?=> Any)(using inline e: Element): Unit = tag("h2")(init)
inline def h3(inline init: HTMLHeadingElement ?=> Any)(using inline e: Element): Unit = tag("h3")(init)
inline def h4(inline init: HTMLHeadingElement ?=> Any)(using inline e: Element): Unit = tag("h4")(init)
inline def h5(inline init: HTMLHeadingElement ?=> Any)(using inline e: Element): Unit = tag("h5")(init)
inline def h6(inline init: HTMLHeadingElement ?=> Any)(using inline e: Element): Unit = tag("h6")(init)
inline def main(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("main")(init)
inline def nav(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("nav")(init)
inline def section(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("section")(init)
inline def blockquote(inline init: HTMLQuoteElement ?=> Any)(using inline e: Element): Unit = tag("blockquote")(init)
inline def div(inline init: HTMLDivElement ?=> Any)(using inline e: Element): Unit = tag("div")(init)
inline def figcaption(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("figcaption")(init)
inline def figure(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("figure")(init)
inline def hr(inline init: HTMLHRElement ?=> Any)(using inline e: Element): Unit = tag("hr")(init)
inline def li(inline init: HTMLLIElement ?=> Any)(using inline e: Element): Unit = tag("li")(init)
inline def ol(inline init: HTMLOListElement ?=> Any)(using inline e: Element): Unit = tag("ol")(init)
inline def p(inline init: HTMLParagraphElement ?=> Any)(using inline e: Element): Unit = tag("p")(init)
inline def pre(inline init: HTMLPreElement ?=> Any)(using inline e: Element): Unit = tag("pre")(init)
inline def ul(inline init: HTMLUListElement ?=> Any)(using inline e: Element): Unit = tag("ul")(init)
inline def a(inline init: HTMLAnchorElement ?=> Any)(using inline e: Element): Unit = tag("a")(init)
inline def b(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("b")(init)
inline def br(inline init: HTMLBRElement ?=> Any)(using inline e: Element): Unit = tag("br")(init)
inline def cite(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("cite")(init)
inline def code(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("code")(init)
inline def data(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("data")(init)
inline def em(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("em")(init)
inline def i(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("i")(init)
inline def mark(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("mark")(init)
inline def s(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("s")(init)
inline def small(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("small")(init)
inline def span(inline init: HTMLSpanElement ?=> Any)(using inline e: Element): Unit = tag("span")(init)
inline def strong(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("strong")(init)
inline def sub(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("sub")(init)
inline def sup(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("sup")(init)
// todo add HTMLTimeElement to scalajs-dom
inline def time(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("time")(init)
inline def audio(inline init: HTMLAudioElement ?=> Any)(using inline e: Element): Unit = tag("audio")(init)
inline def img(inline init: HTMLImageElement ?=> Any)(using inline e: Element): Unit = tag("img")(init)
inline def video(inline init: HTMLVideoElement ?=> Any)(using inline e: Element): Unit = tag("video")(init)
inline def embed(inline init: HTMLEmbedElement ?=> Any)(using inline e: Element): Unit = tag("embed")(init)
inline def iframe(inline init: HTMLIFrameElement ?=> Any)(using inline e: Element): Unit = tag("iframe")(init)
inline def `object`(inline init: HTMLObjectElement ?=> Any)(using inline e: Element): Unit = tag("object")(init)
inline def param(inline init: HTMLParamElement ?=> Any)(using inline e: Element): Unit = tag("param")(init)
// todo add HTMLPictureElement to scalajs-dom
inline def picture(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("picture")(init)
inline def source(inline init: HTMLSourceElement ?=> Any)(using inline e: Element): Unit = tag("source")(init)
inline def noscript(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("noscript")(init)
inline def caption(inline init: HTMLTableCaptionElement ?=> Any)(using inline e: Element): Unit = tag("caption")(init)
inline def col(inline init: HTMLTableColElement ?=> Any)(using inline e: Element): Unit = tag("col")(init)
inline def colgroup(inline init: HTMLTableColElement ?=> Any)(using inline e: Element): Unit = tag("colgroup")(init)
inline def table(inline init: HTMLTableElement ?=> Any)(using inline e: Element): Unit = tag("table")(init)
inline def tbody(inline init: HTMLTableSectionElement ?=> Any)(using inline e: Element): Unit = tag("tbody")(init)
inline def td(inline init: HTMLTableCellElement ?=> Any)(using inline e: Element): Unit = tag("td")(init)
inline def tfoot(inline init: HTMLTableSectionElement ?=> Any)(using inline e: Element): Unit = tag("tfoot")(init)
inline def th(inline init: HTMLTableCellElement ?=> Any)(using inline e: Element): Unit = tag("th")(init)
inline def thead(inline init: HTMLTableSectionElement ?=> Any)(using inline e: Element): Unit = tag("thead")(init)
inline def tr(inline init: HTMLTableRowElement ?=> Any)(using inline e: Element): Unit = tag("tr")(init)
inline def button(inline init: HTMLButtonElement ?=> Any)(using inline e: Element): Unit = tag("button")(init)
inline def fieldset(inline init: HTMLFieldSetElement ?=> Any)(using inline e: Element): Unit = tag("fieldset")(init)
inline def form(inline init: HTMLFormElement ?=> Any)(using inline e: Element): Unit = tag("form")(init)
inline def input(inline init: HTMLInputElement ?=> Any)(using inline e: Element): Unit = tag("input")(init)
inline def label(inline init: HTMLLabelElement ?=> Any)(using inline e: Element): Unit = tag("label")(init)
inline def legend(inline init: HTMLLegendElement ?=> Any)(using inline e: Element): Unit = tag("legend")(init)
inline def meter(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("meter")(init)
inline def option(inline init: HTMLOptionElement ?=> Any)(using inline e: Element): Unit = tag("option")(init)
inline def progress(inline init: HTMLProgressElement ?=> Any)(using inline e: Element): Unit = tag("progress")(init)
inline def select(inline init: HTMLSelectElement ?=> Any)(using inline e: Element): Unit = tag("select")(init)
inline def textarea(inline init: HTMLTextAreaElement ?=> Any)(using inline e: Element): Unit = tag("textarea")(init)
// todo add HTMLDetailsElement to scalajs-dom
inline def details(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("details")(init)
// todo add HTMLDialogElement to scalajs-dom
inline def dialog(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("dialog")(init)
inline def menu(inline init: HTMLMenuElement ?=> Any)(using inline e: Element): Unit = tag("menu")(init)
// todo add HTMLSlotElement to scalajs-dom
inline def slot(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("slot")(init)
// todo add HTMLTemplateElement to scalajs-dom
inline def template(inline init: HTMLElement ?=> Any)(using inline e: Element): Unit = tag("template")(init)

/*
Common Css Properties (from https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference)
 */

/** Defines a Css property
  * @param propName
  *   Name of the property
  * @param style
  *   Css styling
  * @param pe
  *   Element to apply styling to.
  */
inline def cssProp(inline propName: String)(inline style: String)(using inline pe: HTMLElement): Unit =
  pe.asInstanceOf[js.Dynamic].style.updateDynamic(propName)(style)

inline def background(inline style: String)(using inline e: HTMLElement): Unit = cssProp("background")(style)
inline def backgroundAttachment(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("backgroundAttachment")(style)
inline def backgroundColor(inline style: String)(using inline e: HTMLElement): Unit = cssProp("backgroundColor")(style)
inline def backgroundImage(inline style: String)(using inline e: HTMLElement): Unit = cssProp("backgroundImage")(style)
inline def backgroundPosition(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("backgroundPosition")(style)
inline def backgroundRepeat(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("backgroundRepeat")(style)
inline def border(inline style: String)(using inline e: HTMLElement): Unit = cssProp("border")(style)
inline def borderBottom(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderBottom")(style)
inline def borderBottomColor(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("borderBottomColor")(style)
inline def borderBottomStyle(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("borderBottomStyle")(style)
inline def borderBottomWidth(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("borderBottomWidth")(style)
inline def borderColor(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderColor")(style)
inline def borderLeft(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderLeft")(style)
inline def borderLeftColor(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderLeftColor")(style)
inline def borderLeftStyle(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderLeftStyle")(style)
inline def borderLeftWidth(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderLeftWidth")(style)
inline def borderRight(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderRight")(style)
inline def borderRightColor(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("borderRightColor")(style)
inline def borderRightStyle(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("borderRightStyle")(style)
inline def borderRightWidth(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("borderRightWidth")(style)
inline def borderStyle(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderStyle")(style)
inline def borderTop(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderTop")(style)
inline def borderTopColor(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderTopColor")(style)
inline def borderTopStyle(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderTopStyle")(style)
inline def borderTopWidth(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderTopWidth")(style)
inline def borderWidth(inline style: String)(using inline e: HTMLElement): Unit = cssProp("borderWidth")(style)
inline def clear(inline style: String)(using inline e: HTMLElement): Unit = cssProp("clear")(style)
inline def clip(inline style: String)(using inline e: HTMLElement): Unit = cssProp("clip")(style)
inline def color(inline style: String)(using inline e: HTMLElement): Unit = cssProp("color")(style)
inline def cursor(inline style: String)(using inline e: HTMLElement): Unit = cssProp("cursor")(style)
inline def display(inline style: String)(using inline e: HTMLElement): Unit = cssProp("display")(style)
inline def filter(inline style: String)(using inline e: HTMLElement): Unit = cssProp("filter")(style)
inline def cssFloat(inline style: String)(using inline e: HTMLElement): Unit = cssProp("cssFloat")(style)
inline def font(inline style: String)(using inline e: HTMLElement): Unit = cssProp("font")(style)
inline def fontFamily(inline style: String)(using inline e: HTMLElement): Unit = cssProp("fontFamily")(style)
inline def fontSize(inline style: String)(using inline e: HTMLElement): Unit = cssProp("fontSize")(style)
inline def fontVariant(inline style: String)(using inline e: HTMLElement): Unit = cssProp("fontVariant")(style)
inline def fontWeight(inline style: String)(using inline e: HTMLElement): Unit = cssProp("fontWeight")(style)
inline def height(inline style: String)(using inline e: HTMLElement): Unit = cssProp("height")(style)
inline def left(inline style: String)(using inline e: HTMLElement): Unit = cssProp("left")(style)
inline def letterSpacing(inline style: String)(using inline e: HTMLElement): Unit = cssProp("letterSpacing")(style)
inline def lineHeight(inline style: String)(using inline e: HTMLElement): Unit = cssProp("lineHeight")(style)
inline def listStyle(inline style: String)(using inline e: HTMLElement): Unit = cssProp("listStyle")(style)
inline def listStyleImage(inline style: String)(using inline e: HTMLElement): Unit = cssProp("listStyleImage")(style)
inline def listStylePosition(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("listStylePosition")(style)
inline def listStyleType(inline style: String)(using inline e: HTMLElement): Unit = cssProp("listStyleType")(style)
inline def margin(inline style: String)(using inline e: HTMLElement): Unit = cssProp("margin")(style)
inline def marginBottom(inline style: String)(using inline e: HTMLElement): Unit = cssProp("marginBottom")(style)
inline def marginLeft(inline style: String)(using inline e: HTMLElement): Unit = cssProp("marginLeft")(style)
inline def marginRight(inline style: String)(using inline e: HTMLElement): Unit = cssProp("marginRight")(style)
inline def marginTop(inline style: String)(using inline e: HTMLElement): Unit = cssProp("marginTop")(style)
inline def overflow(inline style: String)(using inline e: HTMLElement): Unit = cssProp("overflow")(style)
inline def padding(inline style: String)(using inline e: HTMLElement): Unit = cssProp("padding")(style)
inline def paddingBottom(inline style: String)(using inline e: HTMLElement): Unit = cssProp("paddingBottom")(style)
inline def paddingLeft(inline style: String)(using inline e: HTMLElement): Unit = cssProp("paddingLeft")(style)
inline def paddingRight(inline style: String)(using inline e: HTMLElement): Unit = cssProp("paddingRight")(style)
inline def paddingTop(inline style: String)(using inline e: HTMLElement): Unit = cssProp("paddingTop")(style)
inline def pageBreakAfter(inline style: String)(using inline e: HTMLElement): Unit = cssProp("pageBreakAfter")(style)
inline def pageBreakBefore(inline style: String)(using inline e: HTMLElement): Unit = cssProp("pageBreakBefore")(style)
inline def position(inline style: String)(using inline e: HTMLElement): Unit = cssProp("position")(style)
inline def textAlign(inline style: String)(using inline e: HTMLElement): Unit = cssProp("textAlign")(style)
inline def textDecoration(inline style: String)(using inline e: HTMLElement): Unit = cssProp("textDecoration")(style)
inline def textIndent(inline style: String)(using inline e: HTMLElement): Unit = cssProp("textIndent")(style)
inline def textTransform(inline style: String)(using inline e: HTMLElement): Unit = cssProp("textTransform")(style)
inline def top(inline style: String)(using inline e: HTMLElement): Unit = cssProp("top")(style)
inline def verticalAlign(inline style: String)(using inline e: HTMLElement): Unit = cssProp("verticalAlign")(style)
inline def visibility(inline style: String)(using inline e: HTMLElement): Unit = cssProp("visibility")(style)
inline def width(inline style: String)(using inline e: HTMLElement): Unit = cssProp("width")(style)
inline def zIndex(inline style: String)(using inline e: HTMLElement): Unit = cssProp("zIndex")(style)
/*
Flexbox Css Props
 */
inline def alignContent(inline style: String)(using inline e: HTMLElement): Unit = cssProp("alignContent")(style)
inline def alignItems(inline style: String)(using inline e: HTMLElement): Unit = cssProp("alignItems")(style)
inline def alignSelf(inline style: String)(using inline e: HTMLElement): Unit = cssProp("alignSelf")(style)
inline def flex(inline style: String)(using inline e: HTMLElement): Unit = cssProp("flex")(style)
inline def flexBasis(inline style: String)(using inline e: HTMLElement): Unit = cssProp("flexBasis")(style)
inline def flexDirection(inline style: String)(using inline e: HTMLElement): Unit = cssProp("flexDirection")(style)
inline def flexFlow(inline style: String)(using inline e: HTMLElement): Unit = cssProp("flexFlow")(style)
inline def flexGrow(inline style: String)(using inline e: HTMLElement): Unit = cssProp("flexGrow")(style)
inline def flexShrink(inline style: String)(using inline e: HTMLElement): Unit = cssProp("flexShrink")(style)
inline def flexWrap(inline style: String)(using inline e: HTMLElement): Unit = cssProp("flexWrap")(style)
inline def justifyContent(inline style: String)(using inline e: HTMLElement): Unit = cssProp("justifyContent")(style)
inline def order(inline style: String)(using inline e: HTMLElement): Unit = cssProp("order")(style)
/*
Css Grid Properties
 */
inline def gridTemplateColumns(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("gridTemplateColumns")(style)
inline def gridTemplateRows(inline style: String)(using inline e: HTMLElement): Unit =
  cssProp("gridTemplateRows")(style)
inline def gridTemplate(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gridTemplate")(style)
inline def gridAutoColumns(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gridAutoColumns")(style)
inline def gridAutoRows(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gridAutoRows")(style)
inline def gridAutoFlow(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gridAutoFlow")(style)
inline def grid(inline style: String)(using inline e: HTMLElement): Unit = cssProp("grid")(style)
inline def gridRowStart(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gridRowStart")(style)
inline def gridColumnStart(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gridColumnStart")(style)
inline def gridRowEnd(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gridRowEnd")(style)
inline def gridRow(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gridRow")(style)
inline def gridColumn(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gridColumn")(style)
inline def gridArea(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gridArea")(style)
inline def rowGap(inline style: String)(using inline e: HTMLElement): Unit = cssProp("rowGap")(style)
inline def columnGap(inline style: String)(using inline e: HTMLElement): Unit = cssProp("columnGap")(style)
inline def gap(inline style: String)(using inline e: HTMLElement): Unit = cssProp("gap")(style)
/*
Additional useful css props
 */
inline def minHeight(inline style: String)(using inline e: HTMLElement): Unit = cssProp("minHeight")(style)
inline def maxHeight(inline style: String)(using inline e: HTMLElement): Unit = cssProp("maxHeight")(style)
inline def minWidth(inline style: String)(using inline e: HTMLElement): Unit = cssProp("minWidth")(style)
inline def maxWidth(inline style: String)(using inline e: HTMLElement): Unit = cssProp("maxWidth")(style)

/** Define a Javascript property
  * @param propName
  *   name of the prop
  * @param value
  *   prop value
  * @param parent
  *   given Element to apply this property to
  * @param nc
  *   given NativeConverter for `value`
  * @tparam V
  *   value's type
  */
inline def prop[V](inline propName: String)(
    inline value: V
)(using inline parent: Element, inline nc: NativeConverter[V]): Unit =
  parent.asInstanceOf[js.Dynamic].updateDynamic(propName)(nc.toNative(value))

/*
Global Attributes on HTMLElement, from https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes
 */
inline def accesskey(inline value: String)(using inline e: HTMLElement): Unit = prop("accesskey")(value)
inline def autocapitalize(inline value: String)(using inline e: HTMLElement): Unit = prop("autocapitalize")(value)
inline def className(inline value: String)(using inline e: HTMLElement): Unit = prop("className")(value)
inline def cls(inline value: String)(using inline e: HTMLElement): Unit = prop("className")(value)
inline def contenteditable(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("contenteditable")(value)
inline def contextmenu(inline value: String)(using inline e: HTMLElement): Unit = prop("contextmenu")(value)
inline def draggable(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("draggable")(value)
inline def enterkeyhint(inline value: String)(using inline e: HTMLElement): Unit = prop("enterkeyhint")(value)
inline def hidden(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("hidden")(value)
inline def id(inline value: String)(using inline e: HTMLElement): Unit = prop("id")(value)
inline def inputmode(inline value: String)(using inline e: HTMLElement): Unit = prop("inputmode")(value)
inline def lang(inline value: String)(using inline e: HTMLElement): Unit = prop("lang")(value)
inline def slot(inline value: String)(using inline e: HTMLElement): Unit = prop("slot")(value)
inline def spellcheck(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("spellcheck")(value)
inline def style(inline value: String)(using inline e: HTMLElement): Unit = prop("style")(value)
inline def tabindex(inline value: Int)(using inline e: HTMLElement): Unit = prop("tabindex")(value)
inline def title(inline value: String)(using inline e: HTMLElement): Unit = prop("title")(value)
/*
Context-sensitive attributes: https://www.w3schools.com/tags/ref_attributes.asp
 */
inline def accept(inline value: String)(using inline e: HTMLElement): Unit = prop("accept")(value)
inline def action(inline value: String)(using inline e: HTMLElement): Unit = prop("action")(value)
inline def alt(inline value: String)(using inline e: HTMLElement): Unit = prop("alt")(value)
inline def autocomplete(inline value: String)(using inline e: HTMLElement): Unit = prop("autocomplete")(value)
inline def autofocus(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("autofocus")(value)
inline def autoplay(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("autoplay")(value)
inline def checked(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("checked")(value)
inline def cols(inline value: Int)(using inline e: HTMLElement): Unit = prop("cols")(value)
inline def colspan(inline value: Int)(using inline e: HTMLElement): Unit = prop("colspan")(value)
inline def content(inline value: String)(using inline e: HTMLElement): Unit = prop("content")(value)
inline def controls(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("controls")(value)
inline def datetime(inline value: String)(using inline e: HTMLElement): Unit = prop("datetime")(value)
inline def disabled(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("disabled")(value)
inline def download(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("download")(value)
inline def `for`(inline value: String)(using inline e: HTMLElement): Unit = prop("htmlFor")(value)
inline def htmlFor(inline value: String)(using inline e: HTMLElement): Unit = prop("htmlFor")(value)
inline def formaction(inline value: String)(using inline e: HTMLElement): Unit = prop("formaction")(value)
inline def href(inline value: String)(using inline e: HTMLElement): Unit = prop("href")(value)
inline def loop(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("loop")(value)
inline def max(inline value: String)(using inline e: HTMLElement): Unit = prop("max")(value)
inline def maxlength(inline value: Int)(using inline e: HTMLElement): Unit = prop("maxlength")(value)
inline def media(inline value: String)(using inline e: HTMLElement): Unit = prop("media")(value)
inline def method(inline value: String)(using inline e: HTMLElement): Unit = prop("method")(value)
inline def min(inline value: String)(using inline e: HTMLElement): Unit = prop("min")(value)
inline def multiple(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("multiple")(value)
inline def muted(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("muted")(value)
inline def name(inline value: String)(using inline e: HTMLElement): Unit = prop("name")(value)
inline def novalidate(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("novalidate")(value)
inline def placeholder(inline value: String)(using inline e: HTMLElement): Unit = prop("placeholder")(value)
inline def poster(inline value: String)(using inline e: HTMLElement): Unit = prop("poster")(value)
inline def preload(inline value: String)(using inline e: HTMLElement): Unit = prop("preload")(value)
inline def readonly(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("readonly")(value)
inline def rel(inline value: String)(using inline e: HTMLElement): Unit = prop("rel")(value)
inline def required(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("required")(value)
inline def reversed(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("reversed")(value)
inline def selected(inline value: Boolean)(using inline e: HTMLElement): Unit = prop("selected")(value)
inline def src(inline value: String)(using inline e: HTMLElement): Unit = prop("src")(value)
inline def srcset(inline value: String)(using inline e: HTMLElement): Unit = prop("srcset")(value)
inline def target(inline value: String)(using inline e: HTMLElement): Unit = prop("target")(value)
inline def `type`(inline value: String)(using inline e: HTMLElement): Unit = prop("type")(value)
inline def value(inline value: String)(using inline e: HTMLElement): Unit = prop("value")(value)
inline def wrap(inline value: String)(using inline e: HTMLElement): Unit = prop("wrap")(value)

inline def onabort(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onabort")(value)
inline def onblur(inline value: FocusEvent => Unit)(using inline e: HTMLElement): Unit = prop("onblur")(value)
inline def onchange(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onchange")(value)
inline def onclick(inline value: MouseEvent => Unit)(using inline e: HTMLElement): Unit = prop("onclick")(value)
inline def oncontextmenu(inline value: MouseEvent => Unit)(using inline e: HTMLElement): Unit =
  prop("oncontextmenu")(value)
inline def oncopy(inline value: ClipboardEvent => Unit)(using inline e: HTMLElement): Unit = prop("oncopy")(value)
inline def oncut(inline value: ClipboardEvent => Unit)(using inline e: HTMLElement): Unit = prop("oncut")(value)
inline def ondblclick(inline value: MouseEvent => Unit)(using inline e: HTMLElement): Unit = prop("ondblclick")(value)
inline def ondrag(inline value: DragEvent => Unit)(using inline e: HTMLElement): Unit = prop("ondrag")(value)
inline def ondragend(inline value: DragEvent => Unit)(using inline e: HTMLElement): Unit = prop("ondragend")(value)
inline def ondragenter(inline value: DragEvent => Unit)(using inline e: HTMLElement): Unit = prop("ondragenter")(value)
inline def ondragleave(inline value: DragEvent => Unit)(using inline e: HTMLElement): Unit = prop("ondragleave")(value)
inline def ondragover(inline value: DragEvent => Unit)(using inline e: HTMLElement): Unit = prop("ondragover")(value)
inline def ondragstart(inline value: DragEvent => Unit)(using inline e: HTMLElement): Unit = prop("ondragstart")(value)
inline def ondrop(inline value: DragEvent => Unit)(using inline e: HTMLElement): Unit = prop("ondrop")(value)
inline def onended(inline value: HTMLMediaElement => Unit)(using inline e: HTMLElement): Unit = prop("onended")(value)
inline def onerror(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onerror")(value)
inline def onfocus(inline value: FocusEvent => Unit)(using inline e: HTMLElement): Unit = prop("onfocus")(value)
inline def oninput(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("oninput")(value)
inline def oninvalid(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("oninvalid")(value)
inline def onkeydown(inline value: KeyboardEvent => Unit)(using inline e: HTMLElement): Unit = prop("onkeydown")(value)
inline def onkeypress(inline value: KeyboardEvent => Unit)(using inline e: HTMLElement): Unit =
  prop("onkeypress")(value)
inline def onkeyup(inline value: KeyboardEvent => Unit)(using inline e: HTMLElement): Unit = prop("onkeyup")(value)
inline def onload(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onload")(value)
inline def onmousedown(inline value: MouseEvent => Unit)(using inline e: HTMLElement): Unit = prop("onmousedown")(value)
inline def onmousemove(inline value: MouseEvent => Unit)(using inline e: HTMLElement): Unit = prop("onmousemove")(value)
inline def onmouseover(inline value: MouseEvent => Unit)(using inline e: HTMLElement): Unit = prop("onmouseover")(value)
inline def onmouseup(inline value: MouseEvent => Unit)(using inline e: HTMLElement): Unit = prop("onmouseup")(value)
inline def onmousewheel(inline value: WheelEvent => Unit)(using inline e: HTMLElement): Unit =
  prop("onmousewheel")(value)
inline def onoffline(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onoffline")(value)
inline def ononline(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("ononline")(value)
inline def onpaste(inline value: ClipboardEvent => Unit)(using inline e: HTMLElement): Unit = prop("onpaste")(value)
inline def onplay(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onplay")(value)
inline def onplaying(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onplaying")(value)
inline def onpopstate(inline value: PopStateEvent => Unit)(using inline e: HTMLElement): Unit =
  prop("onpopstate")(value)
inline def onreset(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onreset")(value)
inline def onresize(inline value: UIEvent => Unit)(using inline e: HTMLElement): Unit = prop("onresize")(value)
inline def onscroll(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onscroll")(value)
inline def onsearch(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onsearch")(value)
inline def onselect(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onselect")(value)
inline def onsubmit(inline value: Event => Unit)(using inline e: HTMLElement): Unit = prop("onsubmit")(value)
inline def onwheel(inline value: WheelEvent => Unit)(using inline e: HTMLElement): Unit = prop("onwheel")(value)

import scala.quoted.*

extension (inline sc: StringContext)(using inline pe: Element, inline pb: Binding[?])
  /** t = TextNode Interpolator <br> An easy way to interpolate text and elements
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
    case '{ StringContext(${ Varargs(strings) }: _*) } =>
      strings.map(s => Expr(s.valueOrError.stripMargin)) match
        case sHead +: sTail =>
          '{
            $pe.appendChild(document.createTextNode($sHead))
            ${ tArgImpl(pe, pb, sTail, argsExprs) }
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
        case '{ $f: Frag }      => '{ $f.render(using $pe, $pb) }
        case '{ $c: Component } => '{ $c.render(using $pe, $pb) }
        case '{ $u: Unit }      => u
        case '{ $x: t }         => '{ $pe.appendChild(document.createTextNode($x.toString)) }
      '{
        $applyArgToDom
        $pe.appendChild(document.createTextNode($s))
        ${ tArgImpl(pe, pb, sTail, aTail) }
      }

extension (s: String)(using pe: Element)
  /** Creates a TextNode */
  inline def t: Unit =
    pe.appendChild(document.createTextNode(s))

/** Please don't use this.. unless you must
  */
inline def dangerouslySetInnerHtml(html: String)(using parent: Element): Unit =
  parent.innerHTML = html
