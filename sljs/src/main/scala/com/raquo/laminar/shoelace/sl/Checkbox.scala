package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlProp, HtmlAttr}
import com.raquo.laminar.api.L
import com.raquo.laminar.tags.CustomHtmlTag
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/checkbox Shoelace Checkbox docs]] */
object Checkbox extends WebComponent("sl-checkbox") with ControlledInput {

  @JSImport("@shoelace-style/shoelace/dist/components/checkbox/checkbox.js")
  @js.native object RawImport extends js.Object

  type Ref = CheckboxComponent with dom.HTMLElement

  override protected lazy val tag: CustomHtmlTag[Ref] = {
    tagWithControlledInputs(checked, onInput, initial = false)
  }


  // -- Events --

  /** Emitted when the checkbox loses focus. */
  lazy val onBlur: EventProp[dom.Event] = eventProp("sl-blur")

  /** Emitted when the checked state changes. */
  lazy val onChange: EventProp[dom.Event] = eventProp("sl-change")

  /** Emitted when the checkbox gains focus. */
  lazy val onFocus: EventProp[dom.Event] = eventProp("sl-focus")

  /** Emitted when the checkbox receives input. */
  lazy val onInput: EventProp[dom.Event] = eventProp("sl-input")

  /** Emitted when the form control has been checked for validity and its constraints aren't satisfied. */
  lazy val onInvalid: EventProp[dom.Event] = eventProp("sl-invalid")


  // -- Attributes --

  lazy val title: HtmlAttr[String] = stringAttr("title")

  /** The name of the checkbox, submitted as a name/value pair with form data. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** The current value of the checkbox, submitted as a name/value pair with form data. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** The checkbox's size. */
  lazy val size: CommonKeys.size.type = CommonKeys.size

  /** Disables the checkbox. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** Draws the checkbox in a checked state. */
  lazy val defaultChecked: HtmlAttr[Boolean] = boolAttr("checked")

  /**
    * Draws the checkbox in an indeterminate state. This is usually applied to checkboxes that represents a "select
    * all/none" behavior when associated checkboxes have a mix of checked and unchecked states.
    */
  lazy val indeterminate: HtmlAttr[Boolean] = boolAttr("indeterminate")

  /**
    * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
    * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
    * the same document or shadow root for this to work.
    */
  lazy val formId: HtmlAttr[String] = stringAttr("form")

  /** Makes the checkbox a required field. */
  lazy val required: HtmlAttr[Boolean] = boolAttr("required")


  // -- Props --

  /** The current value of the checkbox, submitted as a name/value pair with form data. */
  lazy val value: HtmlProp[String, _] = L.value

  /** Draws the checkbox in a checked state. */
  lazy val checked: HtmlProp[Boolean, _] = L.checked


  // -- Slots --

  object slots {

    /** The checkbox's label. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The square container that wraps the checkbox's checked state. */
    lazy val control: String = "control"

    /** Matches the control part when the checkbox is checked. */
    lazy val controlChecked: String = "control--checked"

    /** Matches the control part when the checkbox is indeterminate. */
    lazy val controlIndeterminate: String = "control--indeterminate"

    /** The checked icon, an `<sl-icon>` element. */
    lazy val checkedIcon: String = "checked-icon"

    /** The indeterminate icon, an `<sl-icon>` element. */
    lazy val indeterminateIcon: String = "indeterminate-icon"

    /** The container that wraps the checkbox's label. */
    lazy val label: String = "label"
  }


  // -- Element type -- 

  @js.native trait CheckboxComponent extends js.Object { this: dom.HTMLElement => 

    var title: String

    /** The name of the checkbox, submitted as a name/value pair with form data. */
    var name: String

    /** The current value of the checkbox, submitted as a name/value pair with form data. */
    var value: String

    /** The checkbox's size. */
    var size: String

    /** Disables the checkbox. */
    var disabled: Boolean

    /** Draws the checkbox in a checked state. */
    var checked: Boolean

    /**
      * Draws the checkbox in an indeterminate state. This is usually applied to checkboxes that represents a "select
      * all/none" behavior when associated checkboxes have a mix of checked and unchecked states.
      */
    var indeterminate: Boolean

    /**
      * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
      * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
      * the same document or shadow root for this to work.
      */
    var form: String

    /** Makes the checkbox a required field. */
    var required: Boolean
  }
}
