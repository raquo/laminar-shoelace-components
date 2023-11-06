package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/format-number Shoelace FormatNumber docs]] */
object FormatNumber extends WebComponent("sl-format-number") {

  @JSImport("@shoelace-style/shoelace/dist/components/format-number/format-number.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --


  // -- Attributes --

  /** The number to format. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** The formatting style to use. */
  lazy val `type`: HtmlAttr[String] = stringAttr("type")

  lazy val typ: HtmlAttr[String] = `type`

  lazy val tpe: HtmlAttr[String] = `type`

  /** Turns off grouping separators. */
  lazy val noGrouping: HtmlAttr[Boolean] = boolAttr("no-grouping")

  /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code to use when formatting. */
  lazy val currency: HtmlAttr[String] = stringAttr("currency")

  /** How to display the currency. */
  lazy val currencyDisplay: HtmlAttr[String] = stringAttr("currency-display")

  /** The minimum number of integer digits to use. Possible values are 1-21. */
  lazy val minimumIntegerDigits: HtmlAttr[Int] = intAttr("minimum-integer-digits")

  /** The minimum number of fraction digits to use. Possible values are 0-20. */
  lazy val minimumFractionDigits: HtmlAttr[Int] = intAttr("minimum-fraction-digits")

  /** The maximum number of fraction digits to use. Possible values are 0-0. */
  lazy val maximumFractionDigits: HtmlAttr[Int] = intAttr("maximum-fraction-digits")

  /** The minimum number of significant digits to use. Possible values are 1-21. */
  lazy val minimumSignificantDigits: HtmlAttr[Int] = intAttr("minimum-significant-digits")

  /** The maximum number of significant digits to use,. Possible values are 1-21. */
  lazy val maximumSignificantDigits: HtmlAttr[Int] = intAttr("maximum-significant-digits")


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

    /** The formatting style to use. */
    var `type`: String

    /** Turns off grouping separators. */
    var noGrouping: Boolean

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code to use when formatting. */
    var currency: String

    /** How to display the currency. */
    var currencyDisplay: String

    /** The minimum number of integer digits to use. Possible values are 1-21. */
    var minimumIntegerDigits: Int

    /** The minimum number of fraction digits to use. Possible values are 0-20. */
    var minimumFractionDigits: Int

    /** The maximum number of fraction digits to use. Possible values are 0-0. */
    var maximumFractionDigits: Int

    /** The minimum number of significant digits to use. Possible values are 1-21. */
    var minimumSignificantDigits: Int

    /** The maximum number of significant digits to use,. Possible values are 1-21. */
    var maximumSignificantDigits: Int
  }
}
