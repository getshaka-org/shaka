package org.getshaka.shaka.builders

import scala.collection.Seq
import scala.scalajs.js

import org.getshaka.shaka.{Element, Node, Binding, ComponentBuilder}
import org.getshaka.nativeconverter.NativeConverter

/*
Builders to construct html Nodes & Elements
 */

/**
 * Function that appends to a given parent Element and returns Unit
 */
type ElementBuilder = Element ?=> Unit

/**
 * Consumer function that accepts a function appending to a given
 * parent Element.
 */
type ElementBuilderBody = (Element ?=> Unit) => Unit

private def makeElement(tag: String, parent: Element, init: ElementBuilder*): ElementBuilderBody =
  val e: Element = js.Dynamic.global.document.createElement(tag).asInstanceOf[Element]
  for builder <- init do
    builder(using e)
  parent.appendChild(e)
  body => body(using e)

/*
All the HTML tags defined in https://developer.mozilla.org/en-US/docs/Web/HTML/Element
 */
inline def base(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("base", parent, init: _*)
inline def head(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("head", parent, init: _*)
inline def link(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("link", parent, init: _*)
inline def meta(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("meta", parent, init: _*)
inline def style(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("style", parent, init: _*)
inline def title(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("title", parent, init: _*)
inline def body(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("body", parent, init: _*)
inline def address(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("address", parent, init: _*)
inline def article(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("article", parent, init: _*)
inline def aside(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("aside", parent, init: _*)
inline def footer(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("footer", parent, init: _*)
inline def header(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("header", parent, init: _*)
inline def h1(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("h1", parent, init: _*)
inline def h2(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("h2", parent, init: _*)
inline def h3(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("h3", parent, init: _*)
inline def h4(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("h4", parent, init: _*)
inline def h5(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("h5", parent, init: _*)
inline def h6(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("h6", parent, init: _*)
inline def main(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("main", parent, init: _*)
inline def nav(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("nav", parent, init: _*)
inline def section(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("section", parent, init: _*)
inline def blockquote(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("blockquote", parent, init: _*)
inline def div(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("div", parent, init: _*)
inline def figcaption(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("figcaption", parent, init: _*)
inline def figure(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("figure", parent, init: _*)
inline def hr(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("hr", parent, init: _*)
inline def li(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("li", parent, init: _*)
inline def ol(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("ol", parent, init: _*)
inline def p(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("p", parent, init: _*)
inline def pre(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("pre", parent, init: _*)
inline def ul(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("ul", parent, init: _*)
inline def a(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("a", parent, init: _*)
inline def b(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("b", parent, init: _*)
inline def br(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("br", parent, init: _*)
inline def cite(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("cite", parent, init: _*)
inline def code(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("code", parent, init: _*)
inline def data(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("data", parent, init: _*)
inline def em(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("em", parent, init: _*)
inline def i(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("i", parent, init: _*)
inline def mark(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("mark", parent, init: _*)
inline def s(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("s", parent, init: _*)
inline def small(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("small", parent, init: _*)
inline def span(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("span", parent, init: _*)
inline def strong(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("strong", parent, init: _*)
inline def sub(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("sub", parent, init: _*)
inline def sup(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("sup", parent, init: _*)
inline def time(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("time", parent, init: _*)
inline def audio(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("audio", parent, init: _*)
inline def img(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("img", parent, init: _*)
inline def video(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("video", parent, init: _*)
inline def embed(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("embed", parent, init: _*)
inline def iframe(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("iframe", parent, init: _*)
inline def `object`(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("object", parent, init: _*)
inline def param(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("param", parent, init: _*)
inline def picture(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("picture", parent, init: _*)
inline def source(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("source", parent, init: _*)
inline def noscript(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("noscript", parent, init: _*)
inline def caption(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("caption", parent, init: _*)
inline def col(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("col", parent, init: _*)
inline def colgroup(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("colgroup", parent, init: _*)
inline def table(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("table", parent, init: _*)
inline def tbody(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("tbody", parent, init: _*)
inline def td(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("td", parent, init: _*)
inline def tfoot(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("tfoot", parent, init: _*)
inline def th(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("th", parent, init: _*)
inline def thead(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("thead", parent, init: _*)
inline def tr(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("tr", parent, init: _*)
inline def button(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("button", parent, init: _*)
inline def fieldset(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("fieldset", parent, init: _*)
inline def form(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("form", parent, init: _*)
inline def input(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("input", parent, init: _*)
inline def label(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("label", parent, init: _*)
inline def legend(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("legend", parent, init: _*)
inline def meter(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("meter", parent, init: _*)
inline def option(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("option", parent, init: _*)
inline def progress(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("progress", parent, init: _*)
inline def select(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("select", parent, init: _*)
inline def textarea(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("textarea", parent, init: _*)
inline def details(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("details", parent, init: _*)
inline def dialog(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("dialog", parent, init: _*)
inline def menu(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("menu", parent, init: _*)
inline def slot(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("slot", parent, init: _*)
inline def template(init: ElementBuilder*)(using parent: Element): ElementBuilderBody = makeElement("template", parent, init: _*)

/**
 * Defines a CSS property.
 * @param propName the JavaScript name for a CSS property
 */
class CssProp(propName: String):
  def apply(style: String)(using parent: Element): Unit =
    parent.asInstanceOf[js.Dynamic].style.updateDynamic(propName)(style)

/*
Common Css Properties (from https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference)
 */
val background = CssProp("background")
val backgroundAttachment = CssProp("backgroundAttachment")
val backgroundColor = CssProp("backgroundColor")
val backgroundImage = CssProp("backgroundImage")
val backgroundPosition = CssProp("backgroundPosition")
val backgroundRepeat = CssProp("backgroundRepeat")
val border = CssProp("border")
val borderBottom = CssProp("borderBottom")
val borderBottomColor = CssProp("borderBottomColor")
val borderBottomStyle = CssProp("borderBottomStyle")
val borderBottomWidth = CssProp("borderBottomWidth")
val borderColor = CssProp("borderColor")
val borderLeft = CssProp("borderLeft")
val borderLeftColor = CssProp("borderLeftColor")
val borderLeftStyle = CssProp("borderLeftStyle")
val borderLeftWidth = CssProp("borderLeftWidth")
val borderRight = CssProp("borderRight")
val borderRightColor = CssProp("borderRightColor")
val borderRightStyle = CssProp("borderRightStyle")
val borderRightWidth = CssProp("borderRightWidth")
val borderStyle = CssProp("borderStyle")
val borderTop = CssProp("borderTop")
val borderTopColor = CssProp("borderTopColor")
val borderTopStyle = CssProp("borderTopStyle")
val borderTopWidth = CssProp("borderTopWidth")
val borderWidth = CssProp("borderWidth")
val clear = CssProp("clear")
val clip = CssProp("clip")
val color = CssProp("color")
val cursor = CssProp("cursor")
val display = CssProp("display")
val filter = CssProp("filter")
val cssFloat = CssProp("cssFloat")
val font = CssProp("font")
val fontFamily = CssProp("fontFamily")
val fontSize = CssProp("fontSize")
val fontVariant = CssProp("fontVariant")
val fontWeight = CssProp("fontWeight")
val height = CssProp("height")
val left = CssProp("left")
val letterSpacing = CssProp("letterSpacing")
val lineHeight = CssProp("lineHeight")
val listStyle = CssProp("listStyle")
val listStyleImage = CssProp("listStyleImage")
val listStylePosition = CssProp("listStylePosition")
val listStyleType = CssProp("listStyleType")
val margin = CssProp("margin")
val marginBottom = CssProp("marginBottom")
val marginLeft = CssProp("marginLeft")
val marginRight = CssProp("marginRight")
val marginTop = CssProp("marginTop")
val overflow = CssProp("overflow")
val padding = CssProp("padding")
val paddingBottom = CssProp("paddingBottom")
val paddingLeft = CssProp("paddingLeft")
val paddingRight = CssProp("paddingRight")
val paddingTop = CssProp("paddingTop")
val pageBreakAfter = CssProp("pageBreakAfter")
val pageBreakBefore = CssProp("pageBreakBefore")
val position = CssProp("position")
val textAlign = CssProp("textAlign")
val textDecoration = CssProp("textDecoration")
val textIndent = CssProp("textIndent")
val textTransform = CssProp("textTransform")
val top = CssProp("top")
val verticalAlign = CssProp("verticalAlign")
val visibility = CssProp("visibility")
val width = CssProp("width")
val zIndex = CssProp("zIndex")
/*
Flexbox Css Props
 */
val alignContent = CssProp("alignContent")
val alignItems = CssProp("alignItems")
val alignSelf = CssProp("alignSelf")
val flex = CssProp("flex")
val flexBasis = CssProp("flexBasis")
val flexDirection = CssProp("flexDirection")
val flexFlow = CssProp("flexFlow")
val flexGrow = CssProp("flexGrow")
val flexShrink = CssProp("flexShrink")
val flexWrap = CssProp("flexWrap")
val justifyContent = CssProp("justifyContent")
val order = CssProp("order")
/*
Css Grid Properties
 */
val gridTemplateColums = CssProp("gridTemplateColums")
val gridTemplateRows = CssProp("gridTemplateRows")
val gridTemplate = CssProp("gridTemplate")
val gridAutoColumns = CssProp("gridAutoColumns")
val gridAutoRows = CssProp("gridAutoRows")
val gridAutoFlow = CssProp("gridAutoFlow")
val grid = CssProp("grid")
val gridRowStart = CssProp("gridRowStart")
val gridColumnStart = CssProp("gridColumnStart")
val gridRowEnd = CssProp("gridRowEnd")
val gridRow = CssProp("gridRow")
val gridColumn = CssProp("gridColumn")
val gridArea = CssProp("gridArea")
val rowGap = CssProp("rowGap")
val columnGap = CssProp("columnGap")
val gap = CssProp("gap")
/*
Additional useful css props
 */
val minHeight = CssProp("minHeight")
val maxHeight = CssProp("maxHeight")
val minWidth = CssProp("minWidth")
val maxWidth = CssProp("maxWidth")

/**
 * Defines a JavaScript property. The property may be defined
 * by-name, in which case the property evaluates to a () => Unit
 * function. Otherwise, any type with a given NativeConverter
 * in scope is translated to a native type. By default,
 * Functions and many other types have NativeConverters already predefined.
 */
class Prop(propName: String):
  def apply(fn: => Unit)(using parent: Element): Unit =
    parent.asInstanceOf[js.Dynamic].updateDynamic(propName)(() => fn)
    
  def apply[V](value: V)(using parent: Element, nc: NativeConverter[V]): Unit =
    parent.asInstanceOf[js.Dynamic].updateDynamic(propName)(nc.toNative(value))

/*
Global Attributes on HTMLElement, from https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes
 */
val accesskey = Prop("accesskey")
val autocapitalize = Prop("autocapitalize")
val className = Prop("className")
val cls = className
val contenteditable = Prop("contenteditable")
val contextmenu = Prop("contextmenu")
val draggable = Prop("draggable")
val enterkeyhint = Prop("enterkeyhint")
val hidden = Prop("hidden")
val id = Prop("id")
val inputmode = Prop("inputmode")
val lang = Prop("lang")
val slot = Prop("slot")
val spellcheck = Prop("spellcheck")
val style = Prop("style")
val tabindex = Prop("tabindex")
val title = Prop("title")
/*
Context-sensitive attributes: https://www.w3schools.com/tags/ref_attributes.asp
 */
val accept = Prop("accept")
val action = Prop("action")
val alt = Prop("alt")
val autocomplete = Prop("autocomplete")
val autofocus = Prop("autofocus")
val autoplay = Prop("autoplay")
val checked = Prop("checked")
val cols = Prop("cols")
val colspan = Prop("colspan")
val content = Prop("content")
val controls = Prop("controls")
val datetime = Prop("datetime")
val disabled = Prop("disabled")
val download = Prop("download")
val `for` = Prop("for")
val formaction = Prop("formaction")
val href = Prop("href")
val loop = Prop("loop")
val max = Prop("max")
val maxlength = Prop("maxlength")
val media = Prop("media")
val method = Prop("method")
val min = Prop("min")
val multiple = Prop("multiple")
val muted = Prop("muted")
val name = Prop("name")
val novalidate = Prop("novalidate")
val onabort = Prop("onabort")
val onblur = Prop("onblur")
val onchange = Prop("onchange")
val onclick = Prop("onclick")
val oncontextmenu = Prop("oncontextmenu")
val oncopy = Prop("oncopy")
val oncut = Prop("oncut")
val ondblclick = Prop("ondblclick")
val ondrag = Prop("ondrag")
val ondragend = Prop("ondragend")
val ondragenter = Prop("ondragenter")
val ondragleave = Prop("ondragleave")
val ondragover = Prop("ondragover")
val ondragstart = Prop("ondragstart")
val ondrop = Prop("ondrop")
val onended = Prop("onended")
val onerror = Prop("onerror")
val onfocus = Prop("onfocus")
val oninput = Prop("oninput")
val oninvalid = Prop("oninvalid")
val onkeydown = Prop("onkeydown")
val onkeypress = Prop("onkeypress")
val onkeyup = Prop("onkeyup")
val onload = Prop("onload")
val onmousedown = Prop("onmousedown")
val onmousemove = Prop("onmousemove")
val onmouseover = Prop("onmouseover")
val onmouseup = Prop("onmouseup")
val onmousewheel = Prop("onmousewheel")
val onoffline = Prop("onoffline")
val ononline = Prop("ononline")
val onpaste = Prop("onpaste")
val onplay = Prop("onplay")
val onplaying = Prop("onplaying")
val onpopstate = Prop("onpopstate")
val onreset = Prop("onreset")
val onresize = Prop("onresize")
val onscroll = Prop("onscroll")
val onsearch = Prop("onsearch")
val onselect = Prop("onselect")
val onsubmit = Prop("onsubmit")
val onwheel = Prop("onwheel")
val placeholder = Prop("placeholder")
val poster = Prop("poster")
val preload = Prop("preload")
val readonly = Prop("readonly")
val rel = Prop("rel")
val required = Prop("required")
val reversed = Prop("reversed")
val selected = Prop("selected")
val src = Prop("src")
val srcset = Prop("srcset")
val target = Prop("target")
val `type` = Prop("type")
val value = Prop("value")
val wrap = Prop("wrap")

/**
 * Could be a ComponentBuilder, or could be anything else
 * that's eta-expanded to a ComponentBuilder.
 */
type CbOrAny = (Element, Binding[?]) ?=> Any

extension (sc: StringContext)(using pe: Element, pb: Binding[?])
  /**
   * t = TextNode Interpolator
   * <br>
   * An easy way to interpolate text and elements
   */
  def t(args: CbOrAny*): Unit =
    val strings = sc.parts
    strings(0).t
    
    var i = 1
    val len = strings.length
    while i < len do
      val res = args(i - 1)(using pe, pb)
      // the builders return either Unit or the (unused) body function.
      if res != () && !res.isInstanceOf[Function1[?,?]] then
        res.toString.t
      strings(i).t
      i += 1

extension (s: String)(using pe: Element)
  /**
   * Creates a TextNode
   */
  inline def t: Unit =
    pe.appendChild(js.Dynamic.global.document.createTextNode(s).asInstanceOf[Node])

/**
 * Please don't use this.. unless you must
 */
def dangerouslySetInnerHtml(html: String)(using parent: Element): Unit =
  parent.innerHTML = html

