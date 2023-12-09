package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Button groups can be used to group related buttons into sections.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/ButtonGroup.scala ButtonGroup.scala source code]]
  * 
  * [[https://shoelace.style/components/button-group Shoelace ButtonGroup docs]]
  */
object ButtonGroup extends WebComponent("sl-button-group") {

  @JSImport("@shoelace-style/shoelace/dist/components/button-group/button-group.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Ref = ButtonGroupComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /**
    * A label to use for the button group. This won't be displayed on the screen, but it will be announced by assistive
    * devices when interacting with the control and is strongly recommended.
    */
  lazy val label: HtmlAttr[String] = stringAttr("label")


  // -- Props --


  // -- Slots --

  object slots {

    /** One or more `<sl-button>` elements to display in the button group. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait ButtonGroupComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * A label to use for the button group. This won't be displayed on the screen, but it will be announced by assistive
      * devices when interacting with the control and is strongly recommended.
      */
    var label: String
  }
}
