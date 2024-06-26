package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{StyleProp}
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Spinners are used to show the progress of an indeterminate operation.
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/Spinner.scala Spinner.scala source code]]
  * 
  * [[https://shoelace.style/components/spinner Shoelace Spinner docs]]
  */
object Spinner extends WebComponent("sl-spinner") {

  @JSImport("@shoelace-style/shoelace/dist/components/spinner/spinner.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Self = Spinner.type

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Attributes --


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()


  // -- CSS Vars --

  /** The width of the track. */
  lazy val trackWidth: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--track-width")

  /** The color of the track. */
  lazy val trackColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--track-color")

  /** The color of the spinner's indicator. */
  lazy val indicatorColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--indicator-color")

  /** The time it takes for the spinner to complete one animation cycle. */
  lazy val speed: StyleProp[String] with u.Time[DSP] = timeStyle("--speed")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }
}
