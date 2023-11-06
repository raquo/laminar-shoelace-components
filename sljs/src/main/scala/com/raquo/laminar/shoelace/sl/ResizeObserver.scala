package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.shoelace.sl.EventTypes.*
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/resize-observer Shoelace ResizeObserver docs]] */
object ResizeObserver extends WebComponent("sl-resize-observer") {

  @JSImport("@shoelace-style/shoelace/dist/components/resize-observer/resize-observer.js")
  @js.native object RawImport extends js.Object

  type Ref = ResizeObserverComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the element is resized. */
  lazy val onResize: EventProp[ResizeEvent] = eventProp("sl-resize")


  // -- Attributes --

  /** Disables the observer. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --


  // -- Slots --

  object slots {

    /** One or more elements to watch for resizing. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait ResizeObserverComponent extends js.Object { this: dom.HTMLElement => 

    /** Disables the observer. */
    var disabled: Boolean
  }
}
