package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{StyleProp}
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * A carousel item represent a slide within a [carousel](/components/carousel).
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/CarouselItem.scala CarouselItem.scala source code]]
  */
object CarouselItem extends WebComponent("sl-carousel-item") {

  @JSImport("@shoelace-style/shoelace/dist/components/carousel-item/carousel-item.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Attributes --


  // -- Props --


  // -- Slots --

  object slots {

    /** The carousel item's content.. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** The slide's aspect ratio. Inherited from the carousel by default. */
  lazy val aspectRatio: StyleProp[Int] = intStyle("--aspect-ratio")


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()
}
