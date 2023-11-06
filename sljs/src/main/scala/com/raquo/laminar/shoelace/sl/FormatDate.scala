package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/format-date Shoelace FormatDate docs]] */
object FormatDate extends WebComponent("sl-format-date") {

  @JSImport("@shoelace-style/shoelace/dist/components/format-date/format-date.js")
  @js.native object RawImport extends js.Object

  @js.native trait RawComponent extends js.Object {
  }

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --


  // -- Props --


  // -- Attributes --

  /** The format for displaying the weekday. */
  lazy val weekday: HtmlAttr[String] = stringAttr("weekday")

  /** The format for displaying the era. */
  lazy val era: HtmlAttr[String] = stringAttr("era")

  /** The format for displaying the year. */
  lazy val year: HtmlAttr[String] = stringAttr("year")

  /** The format for displaying the month. */
  lazy val month: HtmlAttr[String] = stringAttr("month")

  /** The format for displaying the day. */
  lazy val day: HtmlAttr[String] = stringAttr("day")

  /** The format for displaying the hour. */
  lazy val hour: HtmlAttr[String] = stringAttr("hour")

  /** The format for displaying the minute. */
  lazy val minute: HtmlAttr[String] = stringAttr("minute")

  /** The format for displaying the second. */
  lazy val second: HtmlAttr[String] = stringAttr("second")

  /** The format for displaying the time. */
  lazy val timeZoneName: HtmlAttr[String] = stringAttr("time-zone-name")

  /** The time zone to express the time in. */
  lazy val timeZone: HtmlAttr[String] = stringAttr("time-zone")

  /** The format for displaying the hour. */
  lazy val hourFormat: HtmlAttr[String] = stringAttr("hour-format")


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