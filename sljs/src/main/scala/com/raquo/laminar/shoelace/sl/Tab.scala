package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/tab Shoelace Tab docs]] */
object Tab extends WebComponent("sl-tab") {

  @JSImport("@shoelace-style/shoelace/dist/components/tab/tab.js")
  @js.native object RawImport extends js.Object

  @js.native trait RawComponent extends js.Object {
  }

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --

  /** Emitted when the tab is closable and the close button is activated. */
  lazy val onClose: EventProp[dom.Event] = eventProp("sl-close")


  // -- Props --


  // -- Attributes --

  /** The name of the tab panel this tab is associated with. The panel must be located in the same tab group. */
  lazy val panel: HtmlAttr[String] = stringAttr("panel")

  /** Draws the tab in an active state. */
  lazy val active: HtmlAttr[Boolean] = boolAttr("active")

  /** Makes the tab closable and shows a close button. */
  lazy val closable: HtmlAttr[Boolean] = boolAttr("closable")

  /** Disables the tab and prevents selection. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Slots --

  object slots {

    /** The tab's label. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The close button, an `<sl-icon-button>`. */
    lazy val closeButton: String = "close-button"

    /** The close button's exported `base` part. */
    lazy val closeButton__base: String = "close-button__base"
  }


}
