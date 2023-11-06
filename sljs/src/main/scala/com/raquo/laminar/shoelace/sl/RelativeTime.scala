package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/relative-time Shoelace RelativeTime docs]] */
object RelativeTime extends WebComponent("sl-relative-time") {

  @JSImport("@shoelace-style/shoelace/dist/components/relative-time/relative-time.js")
  @js.native object RawImport extends js.Object

  @js.native trait RawComponent extends js.Object {
  }

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --


  // -- Props --


  // -- Attributes --

  /** The formatting style to use. */
  lazy val format: HtmlAttr[String] = stringAttr("format")

  /**
    * When `auto`, values such as "yesterday" and "tomorrow" will be shown when possible. When `always`, values such as
    * "1 day ago" and "in 1 day" will be shown.
    */
  lazy val numeric: HtmlAttr[String] = stringAttr("numeric")

  /** Keep the displayed value up to date as time passes. */
  lazy val sync: HtmlAttr[Boolean] = boolAttr("sync")


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


}