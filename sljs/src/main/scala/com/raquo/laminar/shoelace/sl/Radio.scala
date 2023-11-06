package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/radio Shoelace Radio docs]] */
object Radio extends WebComponent("sl-radio") {

  @JSImport("@shoelace-style/shoelace/dist/components/radio/radio.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --

  /** Emitted when the control loses focus. */
  lazy val onBlur: EventProp[dom.Event] = eventProp("sl-blur")

  /** Emitted when the control gains focus. */
  lazy val onFocus: EventProp[dom.Event] = eventProp("sl-focus")


  // -- Props --


  // -- Attributes --

  /** The radio's value. When selected, the radio group will receive this value. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /**
    * The radio's size. When used inside a radio group, the size will be determined by the radio group's size so this
    * attribute can typically be omitted.
    */
  lazy val size: CommonKeys.size.type = CommonKeys.size

  /** Disables the radio. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Slots --

  object slots {

    /** The radio's label. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
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

    /** The circular container that wraps the radio's checked state. */
    lazy val control: String = "control"

    /** The radio control when the radio is checked. */
    lazy val controlChecked: String = "control--checked"

    /** The checked icon, an `<sl-icon>` element. */
    lazy val checkedIcon: String = "checked-icon"

    /** The container that wraps the radio's label. */
    lazy val label: String = "label"
  }


}
