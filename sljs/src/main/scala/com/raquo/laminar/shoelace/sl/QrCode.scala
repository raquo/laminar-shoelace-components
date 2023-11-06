package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/qr-code Shoelace QrCode docs]] */
object QrCode extends WebComponent("sl-qr-code") {

  @JSImport("@shoelace-style/shoelace/dist/components/qr-code/qr-code.js")
  @js.native object RawImport extends js.Object

  @js.native trait RawComponent extends js.Object {
  }

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --


  // -- Props --


  // -- Attributes --

  /** The QR code's value. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** The label for assistive devices to announce. If unspecified, the value will be used instead. */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /** The size of the QR code, in pixels. */
  lazy val size: HtmlAttr[Int] = intAttr("size")

  /** The fill color. This can be any valid CSS color, but not a CSS custom property. */
  lazy val fill: HtmlAttr[String] = stringAttr("fill")

  /** The background color. This can be any valid CSS color or `transparent`. It cannot be a CSS custom property. */
  lazy val background: HtmlAttr[String] = stringAttr("background")

  /** The edge radius of each module. Must be between 0 and 0.5. */
  lazy val radius: HtmlAttr[Int] = intAttr("radius")

  /** The level of error correction to use. [Learn more](https://www.qrcode.com/en/about/error_correction.html) */
  lazy val errorCorrection: HtmlAttr[String] = stringAttr("error-correction")


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()


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