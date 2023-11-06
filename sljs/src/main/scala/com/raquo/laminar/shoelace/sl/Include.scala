package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.shoelace.sl.EventTypes.*
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/include Shoelace Include docs]] */
object Include extends WebComponent("sl-include") {

  @JSImport("@shoelace-style/shoelace/dist/components/include/include.js")
  @js.native object RawImport extends js.Object

  @js.native trait RawComponent extends js.Object {
  }

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --

  /** Emitted when the included file is loaded. */
  lazy val onLoad: EventProp[dom.Event] = eventProp("sl-load")

  /** Emitted when the included file fails to load due to an error. */
  lazy val onError: EventProp[ErrorEvent] = eventProp("sl-error")


  // -- Props --


  // -- Attributes --

  /**
    * The location of the HTML file to include. Be sure you trust the content you are including as it will be executed as
    * code and can result in XSS attacks.
    */
  lazy val src: HtmlAttr[String] = stringAttr("src")

  /** The fetch mode to use. */
  lazy val mode: HtmlAttr[String] = stringAttr("mode")

  /**
    * Allows included scripts to be executed. Be sure you trust the content you are including as it will be executed as
    * code and can result in XSS attacks.
    */
  lazy val allowScripts: HtmlAttr[Boolean] = boolAttr("allow-scripts")


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
