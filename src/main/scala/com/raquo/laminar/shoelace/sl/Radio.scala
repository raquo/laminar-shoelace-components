package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlProp, HtmlAttr}
import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Radios allow the user to select a single option from a group.
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/Radio.scala Radio.scala source code]]
  * 
  * [[https://shoelace.style/components/radio Shoelace Radio docs]]
  */
object Radio extends WebComponent("sl-radio") {

  @JSImport("@shoelace-style/shoelace/dist/components/radio/radio.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Self = Radio.type

  type Ref = RadioComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the control loses focus. */
  lazy val onBlur: EventProp[dom.Event] = eventProp("sl-blur")

  /** Emitted when the control gains focus. */
  lazy val onFocus: EventProp[dom.Event] = eventProp("sl-focus")


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


  // -- Props --

  lazy val checked: HtmlProp[Boolean, _] = L.checked

  /** The radio's value. When selected, the radio group will receive this value. */
  lazy val value: HtmlProp[String, _] = L.value


  // -- Slots --

  object slots {

    /** The radio's label. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --


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


  // -- Element type -- 

  @js.native trait RadioComponent extends js.Object { this: dom.HTMLElement => 

    var checked: Boolean

    /** The radio's value. When selected, the radio group will receive this value. */
    var value: String

    /**
      * The radio's size. When used inside a radio group, the size will be determined by the radio group's size so this
      * attribute can typically be omitted.
      */
    var size: String

    /** Disables the radio. */
    var disabled: Boolean
  }
}
