package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/format-bytes Shoelace FormatBytes docs]] */
object FormatBytes extends WebComponent("sl-format-bytes") {

  @JSImport("@shoelace-style/shoelace/dist/components/format-bytes/format-bytes.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --


  // -- Attributes --

  /** The number to format in bytes. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** The type of unit to display. */
  lazy val unit: HtmlAttr[String] = stringAttr("unit")

  /** Determines how to display the result, e.g. "100 bytes", "100 b", or "100b". */
  lazy val display: HtmlAttr[String] = stringAttr("display")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait RawComponent extends js.Object { this: dom.HTMLElement => 

    /** The type of unit to display. */
    var unit: String

    /** Determines how to display the result, e.g. "100 bytes", "100 b", or "100b". */
    var display: String
  }
}
