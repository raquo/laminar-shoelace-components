package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/progress-bar Shoelace ProgressBar docs]] */
object ProgressBar extends WebComponent("sl-progress-bar") {

  @JSImport("@shoelace-style/shoelace/dist/components/progress-bar/progress-bar.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --


  // -- Props --


  // -- Attributes --

  /** The current progress as a percentage, 0 to 100. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** When true, percentage is ignored, the label is hidden, and the progress bar is drawn in an indeterminate state. */
  lazy val indeterminate: HtmlAttr[Boolean] = boolAttr("indeterminate")

  /** A custom label for assistive devices. */
  lazy val label: HtmlAttr[String] = stringAttr("label")


  // -- Slots --

  object slots {

    /** A label to show inside the progress indicator. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  object cssVars {

    /** The progress bar's height. */
    lazy val height: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--height")

    /** The color of the track. */
    lazy val trackColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--track-color")

    /** The color of the indicator. */
    lazy val indicatorColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--indicator-color")

    /** The color of the label. */
    lazy val labelColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--label-color")
  }


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The progress bar's indicator. */
    lazy val indicator: String = "indicator"

    /** The progress bar's label. */
    lazy val label: String = "label"
  }


  // -- Element type -- 

  @js.native trait RawComponent extends js.Object { this: dom.HTMLElement => 

    /** When true, percentage is ignored, the label is hidden, and the progress bar is drawn in an indeterminate state. */
    var indeterminate: Boolean

    /** A custom label for assistive devices. */
    var label: String
  }
}
