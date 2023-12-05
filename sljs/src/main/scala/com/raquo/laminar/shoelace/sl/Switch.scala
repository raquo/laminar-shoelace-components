package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlProp, HtmlAttr, StyleProp}
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import com.raquo.laminar.nodes.Slot
import com.raquo.laminar.tags.CustomHtmlTag
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Switches allow the user to toggle an option on or off.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/sljs/src/main/scala/com/raquo/laminar/shoelace/sl/Switch.scala Switch.scala source code]]
  * 
  * [[https://shoelace.style/components/switch Shoelace Switch docs]]
  */
object Switch extends WebComponent("sl-switch") with ControlledInput {

  @JSImport("@shoelace-style/shoelace/dist/components/switch/switch.js")
  @js.native object RawImport extends js.Object

  type Ref = SwitchComponent with dom.HTMLElement

  override protected lazy val tag: CustomHtmlTag[Ref] = {
    tagWithControlledInput(checked, initial = false, onInput)
  }


  // -- Events --

  /** Emitted when the control loses focus. */
  lazy val onBlur: EventProp[dom.Event] = eventProp("sl-blur")

  /** Emitted when the control's checked state changes. */
  lazy val onChange: EventProp[dom.Event] = eventProp("sl-change")

  /** Emitted when the control receives input. */
  lazy val onInput: EventProp[dom.Event] = eventProp("sl-input")

  /** Emitted when the control gains focus. */
  lazy val onFocus: EventProp[dom.Event] = eventProp("sl-focus")

  /** Emitted when the form control has been checked for validity and its constraints aren't satisfied. */
  lazy val onInvalid: EventProp[dom.Event] = eventProp("sl-invalid")


  // -- Attributes --

  lazy val title: HtmlAttr[String] = stringAttr("title")

  /** The name of the switch, submitted as a name/value pair with form data. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** The current value of the switch, submitted as a name/value pair with form data. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** The switch's size. */
  lazy val size: CommonKeys.size.type = CommonKeys.size

  /** Disables the switch. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** Draws the switch in a checked state. */
  lazy val defaultChecked: HtmlAttr[Boolean] = boolAttr("checked")

  /**
    * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
    * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
    * the same document or shadow root for this to work.
    */
  lazy val formId: HtmlAttr[String] = stringAttr("form")

  /** Makes the switch a required field. */
  lazy val required: HtmlAttr[Boolean] = boolAttr("required")


  // -- Props --

  /** The current value of the switch, submitted as a name/value pair with form data. */
  lazy val value: HtmlProp[String, _] = L.value

  /** Draws the switch in a checked state. */
  lazy val checked: HtmlProp[Boolean, _] = L.checked


  // -- Slots --

  object slots {

    /** The switch's label. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** The width of the switch. */
  lazy val width: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--width")

  /** The height of the switch. */
  lazy val height: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--height")

  /** The size of the thumb. */
  lazy val thumbSize: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--thumb-size")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The control that houses the switch's thumb. */
    lazy val control: String = "control"

    /** The switch's thumb. */
    lazy val thumb: String = "thumb"

    /** The switch's label. */
    lazy val label: String = "label"
  }


  // -- Element type -- 

  @js.native trait SwitchComponent extends js.Object { this: dom.HTMLElement => 

    var title: String

    /** The name of the switch, submitted as a name/value pair with form data. */
    var name: String

    /** The current value of the switch, submitted as a name/value pair with form data. */
    var value: String

    /** The switch's size. */
    var size: String

    /** Disables the switch. */
    var disabled: Boolean

    /** Draws the switch in a checked state. */
    var checked: Boolean

    /**
      * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
      * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
      * the same document or shadow root for this to work.
      */
    var form: String

    /** Makes the switch a required field. */
    var required: Boolean
  }
}
