package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlProp, HtmlAttr}
import com.raquo.laminar.api.L
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Formats a date/time using the specified locale and options.
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/FormatDate.scala FormatDate.scala source code]]
  * 
  * [[https://shoelace.style/components/format-date Shoelace FormatDate docs]]
  */
object FormatDate extends WebComponent("sl-format-date") {

  @JSImport("@shoelace-style/shoelace/dist/components/format-date/format-date.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Self = FormatDate.type

  type Ref = FormatDateComponent with dom.HTMLElement


  // -- Events --


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


  // -- Props --

  /**
    * The date/time to format. If not set, the current date and time will be used. When passing a string, it's strongly
    * recommended to use the ISO 8601 format to ensure timezones are handled correctly. To convert a date to this format
    * in JavaScript, use [`date.toISOString()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString).
    */
  lazy val date: HtmlProp[js.Date | String, _] = dateProp("date")


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()


  // -- CSS Vars --


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait FormatDateComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * The date/time to format. If not set, the current date and time will be used. When passing a string, it's strongly
      * recommended to use the ISO 8601 format to ensure timezones are handled correctly. To convert a date to this format
      * in JavaScript, use [`date.toISOString()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Date/toISOString).
      */
    var date: js.Date | String

    /** The format for displaying the weekday. */
    var weekday: String

    /** The format for displaying the era. */
    var era: String

    /** The format for displaying the year. */
    var year: String

    /** The format for displaying the month. */
    var month: String

    /** The format for displaying the day. */
    var day: String

    /** The format for displaying the hour. */
    var hour: String

    /** The format for displaying the minute. */
    var minute: String

    /** The format for displaying the second. */
    var second: String

    /** The format for displaying the time. */
    var timeZoneName: String

    /** The time zone to express the time in. */
    var timeZone: String

    /** The format for displaying the hour. */
    var hourFormat: String
  }
}
