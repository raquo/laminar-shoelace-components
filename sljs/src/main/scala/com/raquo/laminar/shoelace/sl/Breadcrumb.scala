package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/breadcrumb Shoelace Breadcrumb docs]] */
object Breadcrumb extends WebComponent("sl-breadcrumb") {

  @JSImport("@shoelace-style/shoelace/dist/components/breadcrumb/breadcrumb.js")
  @js.native object RawImport extends js.Object

  type Ref = BreadcrumbComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /**
    * The label to use for the breadcrumb control. This will not be shown on the screen, but it will be announced by
    * screen readers and other assistive devices to provide more context for users.
    */
  lazy val label: HtmlAttr[String] = stringAttr("label")


  // -- Props --


  // -- Slots --

  object slots {

    /** One or more breadcrumb items to display. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** The separator to use between breadcrumb items. Works best with `<sl-icon>`. */
    lazy val separator: Slot = Slot("separator")
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

  @js.native trait BreadcrumbComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * The label to use for the breadcrumb control. This will not be shown on the screen, but it will be announced by
      * screen readers and other assistive devices to provide more context for users.
      */
    var label: String
  }
}
