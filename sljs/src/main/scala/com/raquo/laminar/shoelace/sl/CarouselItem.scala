package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

object CarouselItem extends WebComponent("sl-carousel-item") {

  @JSImport("@shoelace-style/shoelace/dist/components/carousel-item/carousel-item.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Props --


  // -- Attributes --


  // -- Slots --

  object slots {

    /** The carousel item's content.. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  object cssVars {

    /** The slide's aspect ratio. Inherited from the carousel by default. */
    lazy val aspectRatio: StyleProp[Int] = intStyle("--aspect-ratio")
  }


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


}
