package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlProp, HtmlAttr}
import com.raquo.laminar.api.L
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/radio-button Shoelace RadioButton docs]] */
object RadioButton extends WebComponent("sl-radio-button") {

  @JSImport("@shoelace-style/shoelace/dist/components/radio-button/radio-button.js")
  @js.native object RawImport extends js.Object

  type Ref = RadioButtonComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the button loses focus. */
  lazy val onBlur: EventProp[dom.Event] = eventProp("sl-blur")

  /** Emitted when the button gains focus. */
  lazy val onFocus: EventProp[dom.Event] = eventProp("sl-focus")


  // -- Attributes --

  /** The radio's value. When selected, the radio group will receive this value. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** Disables the radio button. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /**
    * The radio button's size. When used inside a radio group, the size will be determined by the radio group's size so
    * this attribute can typically be omitted.
    */
  lazy val size: CommonKeys.size.type = CommonKeys.size

  /** Draws a pill-style radio button with rounded edges. */
  lazy val pill: HtmlAttr[Boolean] = boolAttr("pill")


  // -- Props --

  /** The radio's value. When selected, the radio group will receive this value. */
  lazy val value: HtmlProp[String, _] = L.value


  // -- Slots --

  object slots {

    /** The radio button's label. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** A presentational prefix icon or similar element. */
    lazy val prefix: Slot = Slot("prefix")

    /** A presentational suffix icon or similar element. */
    lazy val suffix: Slot = Slot("suffix")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The internal `<button>` element. */
    lazy val button: String = "button"

    /** The internal button element when the radio button is checked. */
    lazy val buttonChecked: String = "button--checked"

    /** The container that wraps the prefix. */
    lazy val prefix: String = "prefix"

    /** The container that wraps the radio button's label. */
    lazy val label: String = "label"

    /** The container that wraps the suffix. */
    lazy val suffix: String = "suffix"
  }


  // -- Element type -- 

  @js.native trait RadioButtonComponent extends js.Object { this: dom.HTMLElement => 

    /** The radio's value. When selected, the radio group will receive this value. */
    var value: String

    /** Disables the radio button. */
    var disabled: Boolean

    /**
      * The radio button's size. When used inside a radio group, the size will be determined by the radio group's size so
      * this attribute can typically be omitted.
      */
    var size: String

    /** Draws a pill-style radio button with rounded edges. */
    var pill: Boolean
  }
}
