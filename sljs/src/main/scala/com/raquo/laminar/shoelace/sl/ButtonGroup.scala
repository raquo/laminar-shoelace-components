package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/button-group Shoelace ButtonGroup docs]] */
object ButtonGroup extends WebComponent("sl-button-group") {

  @JSImport("@shoelace-style/shoelace/dist/components/button-group/button-group.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --


  // -- Props --


  // -- Attributes --

  /**
    * A label to use for the button group. This won't be displayed on the screen, but it will be announced by assistive
    * devices when interacting with the control and is strongly recommended.
    */
  lazy val label: HtmlAttr[String] = stringAttr("label")


  // -- Slots --

  object slots {

    /** One or more `<sl-button>` elements to display in the button group. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait RawComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * A label to use for the button group. This won't be displayed on the screen, but it will be announced by assistive
      * devices when interacting with the control and is strongly recommended.
      */
    var label: String
  }
}
