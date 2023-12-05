package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr, StyleProp}
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Dividers are used to visually separate or group elements.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/Divider.scala Divider.scala source code]]
  * 
  * [[https://shoelace.style/components/divider Shoelace Divider docs]]
  */
object Divider extends WebComponent("sl-divider") {

  @JSImport("@shoelace-style/shoelace/dist/components/divider/divider.js")
  @js.native object RawImport extends js.Object

  type Ref = DividerComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** Draws the divider in a vertical orientation. */
  lazy val vertical: HtmlAttr[Boolean] = boolAttr("vertical")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()


  // -- CSS Vars --

  /** The color of the divider. */
  lazy val color: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--color")

  /** The width of the divider. */
  lazy val width: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--width")

  /** The spacing of the divider. */
  lazy val spacing: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--spacing")


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait DividerComponent extends js.Object { this: dom.HTMLElement => 

    /** Draws the divider in a vertical orientation. */
    var vertical: Boolean
  }
}
