package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * The visually hidden utility makes content accessible to assistive devices without displaying it on the screen.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/VisuallyHidden.scala VisuallyHidden.scala source code]]
  * 
  * [[https://shoelace.style/components/visually-hidden Shoelace VisuallyHidden docs]]
  */
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


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()
}
