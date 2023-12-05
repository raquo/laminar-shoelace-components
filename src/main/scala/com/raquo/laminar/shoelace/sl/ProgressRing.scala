package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlProp, HtmlAttr, StyleProp}
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Progress rings are used to show the progress of a determinate operation in a circular fashion.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/ProgressRing.scala ProgressRing.scala source code]]
  * 
  * [[https://shoelace.style/components/progress-ring Shoelace ProgressRing docs]]
  */
object ProgressRing extends WebComponent("sl-progress-ring") {

  @JSImport("@shoelace-style/shoelace/dist/components/progress-ring/progress-ring.js")
  @js.native object RawImport extends js.Object

  type Ref = ProgressRingComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The current progress as a percentage, 0 to 100. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** A custom label for assistive devices. */
  lazy val label: HtmlAttr[String] = stringAttr("label")


  // -- Props --

  /** The current progress as a percentage, 0 to 100. */
  lazy val value: HtmlProp[Int, _] = intProp("value")


  // -- Slots --

  object slots {

    /** A label to show inside the ring. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** The diameter of the progress ring (cannot be a percentage). */
  lazy val size: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--size")

  /** The width of the track. */
  lazy val trackWidth: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--track-width")

  /** The color of the track. */
  lazy val trackColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--track-color")

  /** The width of the indicator. Defaults to the track width. */
  lazy val indicatorWidth: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--indicator-width")

  /** The color of the indicator. */
  lazy val indicatorColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--indicator-color")

  /** The duration of the indicator's transition when the value changes. */
  lazy val indicatorTransitionDuration: StyleProp[String] with u.Time[DSP] = timeStyle("--indicator-transition-duration")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The progress ring label. */
    lazy val label: String = "label"
  }


  // -- Element type -- 

  @js.native trait ProgressRingComponent extends js.Object { this: dom.HTMLElement => 

    /** The current progress as a percentage, 0 to 100. */
    var value: Int

    /** A custom label for assistive devices. */
    var label: String
  }
}
