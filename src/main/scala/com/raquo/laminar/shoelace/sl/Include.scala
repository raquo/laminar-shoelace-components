package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.shoelace.sl.EventTypes.*
import com.raquo.laminar.api.L
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Includes give you the power to embed external HTML files into the page.
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/Include.scala Include.scala source code]]
  * 
  * [[https://shoelace.style/components/include Shoelace Include docs]]
  */
object Include extends WebComponent("sl-include") {

  @JSImport("@shoelace-style/shoelace/dist/components/include/include.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Self = Include.type

  type Ref = IncludeComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the included file is loaded. */
  lazy val onLoad: EventProp[dom.Event] = eventProp("sl-load")

  /** Emitted when the included file fails to load due to an error. */
  lazy val onError: EventProp[ErrorEvent] = eventProp("sl-error")


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


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()


  // -- CSS Vars --


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait IncludeComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * The location of the HTML file to include. Be sure you trust the content you are including as it will be executed as
      * code and can result in XSS attacks.
      */
    var src: String

    /** The fetch mode to use. */
    var mode: String

    /**
      * Allows included scripts to be executed. Be sure you trust the content you are including as it will be executed as
      * code and can result in XSS attacks.
      */
    var allowScripts: Boolean
  }
}
