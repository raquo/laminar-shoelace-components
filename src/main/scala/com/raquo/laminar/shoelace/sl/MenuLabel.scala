package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Menu labels are used to describe a group of menu items.
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/MenuLabel.scala MenuLabel.scala source code]]
  * 
  * [[https://shoelace.style/components/menu-label Shoelace MenuLabel docs]]
  */
object MenuLabel extends WebComponent("sl-menu-label") {

  @JSImport("@shoelace-style/shoelace/dist/components/menu-label/menu-label.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Attributes --


  // -- Props --


  // -- Slots --

  object slots {

    /** The menu label's content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }
}
