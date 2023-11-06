package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/badge Shoelace Badge docs]] */
object Badge extends WebComponent("sl-badge") {

  @JSImport("@shoelace-style/shoelace/dist/components/badge/badge.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Props --


  // -- Attributes --

  /** The badge's theme variant. */
  lazy val variant: CommonKeys.variant.type = CommonKeys.variant

  /** Draws a pill-style badge with rounded edges. */
  lazy val pill: HtmlAttr[Boolean] = boolAttr("pill")

  /** Makes the badge pulsate to draw attention. */
  lazy val pulse: HtmlAttr[Boolean] = boolAttr("pulse")


  // -- Slots --

  object slots {

    /** The badge's content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
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
  }


}
