package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/tab-panel Shoelace TabPanel docs]] */
object TabPanel extends WebComponent("sl-tab-panel") {

  @JSImport("@shoelace-style/shoelace/dist/components/tab-panel/tab-panel.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Props --


  // -- Attributes --

  /** The tab panel's name. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** When true, the tab panel will be shown. */
  lazy val active: HtmlAttr[Boolean] = boolAttr("active")


  // -- Slots --

  object slots {

    /** The tab panel's content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  object cssVars {

    /** The tab panel's padding. */
    lazy val padding: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--padding")
  }


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


}
