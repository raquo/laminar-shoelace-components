package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/visually-hidden Shoelace VisuallyHidden docs]] */
object VisuallyHidden extends WebComponent("sl-visually-hidden") {

  @JSImport("@shoelace-style/shoelace/dist/components/visually-hidden/visually-hidden.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Attributes --


  // -- Props --


  // -- Slots --

  object slots {

    /** The content to be visually hidden. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()
}
