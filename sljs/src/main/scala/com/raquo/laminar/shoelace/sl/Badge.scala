package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Badges are used to draw attention and display statuses or counts.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/sljs/src/main/scala/com/raquo/laminar/shoelace/sl/Badge.scala Badge.scala source code]]
  * 
  * [[https://shoelace.style/components/badge Shoelace Badge docs]]
  */
object Badge extends WebComponent("sl-badge") {

  @JSImport("@shoelace-style/shoelace/dist/components/badge/badge.js")
  @js.native object RawImport extends js.Object

  type Ref = BadgeComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The badge's theme variant. */
  lazy val variant: CommonKeys.variant.type = CommonKeys.variant

  /** Draws a pill-style badge with rounded edges. */
  lazy val pill: HtmlAttr[Boolean] = boolAttr("pill")

  /** Makes the badge pulsate to draw attention. */
  lazy val pulse: HtmlAttr[Boolean] = boolAttr("pulse")


  // -- Props --


  // -- Slots --

  object slots {

    /** The badge's content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait BadgeComponent extends js.Object { this: dom.HTMLElement => 

    /** The badge's theme variant. */
    var variant: String

    /** Draws a pill-style badge with rounded edges. */
    var pill: Boolean

    /** Makes the badge pulsate to draw attention. */
    var pulse: Boolean
  }
}
