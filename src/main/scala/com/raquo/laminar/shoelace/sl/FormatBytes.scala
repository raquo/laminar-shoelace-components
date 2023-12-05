package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlProp, HtmlAttr}
import com.raquo.laminar.api.L
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Formats a number as a human readable bytes value.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/FormatBytes.scala FormatBytes.scala source code]]
  * 
  * [[https://shoelace.style/components/format-bytes Shoelace FormatBytes docs]]
  */
object FormatBytes extends WebComponent("sl-format-bytes") {

  @JSImport("@shoelace-style/shoelace/dist/components/format-bytes/format-bytes.js")
  @js.native object RawImport extends js.Object

  type Ref = FormatBytesComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The number to format in bytes. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** The type of unit to display. */
  lazy val unit: HtmlAttr[String] = stringAttr("unit")

  /** Determines how to display the result, e.g. "100 bytes", "100 b", or "100b". */
  lazy val display: HtmlAttr[String] = stringAttr("display")


  // -- Props --

  /** The number to format in bytes. */
  lazy val value: HtmlProp[Int, _] = intProp("value")


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()


  // -- CSS Vars --


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait FormatBytesComponent extends js.Object { this: dom.HTMLElement => 

    /** The number to format in bytes. */
    var value: Int

    /** The type of unit to display. */
    var unit: String

    /** Determines how to display the result, e.g. "100 bytes", "100 b", or "100b". */
    var display: String
  }
}
