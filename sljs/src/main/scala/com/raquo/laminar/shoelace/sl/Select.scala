package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.api.L
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Selects allow you to choose items from a menu of predefined options.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/sljs/src/main/scala/com/raquo/laminar/shoelace/sl/Select.scala Select.scala source code]]
  * 
  * [[https://shoelace.style/components/select Shoelace Select docs]]
  */
object Select extends WebComponent("sl-select") {

  @JSImport("@shoelace-style/shoelace/dist/components/select/select.js")
  @js.native object RawImport extends js.Object

  type Ref = SelectComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the control's value changes. */
  lazy val onChange: EventProp[dom.Event] = eventProp("sl-change")

  /** Emitted when the control's value is cleared. */
  lazy val onClear: EventProp[dom.Event] = eventProp("sl-clear")

  /** Emitted when the control receives input. */
  lazy val onInput: EventProp[dom.Event] = eventProp("sl-input")

  /** Emitted when the control gains focus. */
  lazy val onFocus: EventProp[dom.Event] = eventProp("sl-focus")

  /** Emitted when the control loses focus. */
  lazy val onBlur: EventProp[dom.Event] = eventProp("sl-blur")

  /** Emitted when the select's menu opens. */
  lazy val onShow: EventProp[dom.Event] = eventProp("sl-show")

  /** Emitted after the select's menu opens and all animations are complete. */
  lazy val onAfterShow: EventProp[dom.Event] = eventProp("sl-after-show")

  /** Emitted when the select's menu closes. */
  lazy val onHide: EventProp[dom.Event] = eventProp("sl-hide")

  /** Emitted after the select's menu closes and all animations are complete. */
  lazy val onAfterHide: EventProp[dom.Event] = eventProp("sl-after-hide")

  /** Emitted when the form control has been checked for validity and its constraints aren't satisfied. */
  lazy val onInvalid: EventProp[dom.Event] = eventProp("sl-invalid")


  // -- Attributes --

  /** The name of the select, submitted as a name/value pair with form data. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** The select's size. */
  lazy val size: CommonKeys.size.type = CommonKeys.size

  /** Placeholder text to show as a hint when the select is empty. */
  lazy val placeholder: HtmlAttr[String] = stringAttr("placeholder")

  /** Allows more than one option to be selected. */
  lazy val multiple: HtmlAttr[Boolean] = boolAttr("multiple")

  /**
    * The maximum number of selected options to show when `multiple` is true. After the maximum, "+n" will be shown to
    * indicate the number of additional items that are selected. Set to 0 to remove the limit.
    */
  lazy val maxOptionsVisible: HtmlAttr[Int] = intAttr("max-options-visible")

  /** Disables the select control. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** Adds a clear button when the select is not empty. */
  lazy val clearable: HtmlAttr[Boolean] = boolAttr("clearable")

  /**
    * Indicates whether or not the select is open. You can toggle this attribute to show and hide the menu, or you can
    * use the `show()` and `hide()` methods and this attribute will reflect the select's open state.
    */
  lazy val open: HtmlAttr[Boolean] = boolAttr("open")

  /**
    * Enable this option to prevent the listbox from being clipped when the component is placed inside a container with
    * `overflow: auto|scroll`. Hoisting uses a fixed positioning strategy that works in many, but not all, scenarios.
    */
  lazy val hoist: HtmlAttr[Boolean] = boolAttr("hoist")

  /** Draws a filled select. */
  lazy val filled: HtmlAttr[Boolean] = boolAttr("filled")

  /** Draws a pill-style select with rounded edges. */
  lazy val pill: HtmlAttr[Boolean] = boolAttr("pill")

  /** The select's label. If you need to display HTML, use the `label` slot instead. */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /**
    * The preferred placement of the select's menu. Note that the actual placement may vary as needed to keep the listbox
    * inside of the viewport.
    */
  lazy val placement: CommonKeys.placement.type = CommonKeys.placement

  /** The select's help text. If you need to display HTML, use the `help-text` slot instead. */
  lazy val helpText: HtmlAttr[String] = stringAttr("help-text")

  /**
    * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
    * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
    * the same document or shadow root for this to work.
    */
  lazy val formId: HtmlAttr[String] = stringAttr("form")

  /** The select's required attribute. */
  lazy val required: HtmlAttr[Boolean] = boolAttr("required")


  // -- Props --


  // -- Slots --

  object slots {

    /** The listbox options. Must be `<sl-option>` elements. You can use `<sl-divider>` to group items visually. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** The input's label. Alternatively, you can use the `label` attribute. */
    lazy val label: Slot = Slot("label")

    /** Used to prepend a presentational icon or similar element to the combobox. */
    lazy val prefix: Slot = Slot("prefix")

    /** An icon to use in lieu of the default clear icon. */
    lazy val clearIcon: Slot = Slot("clear-icon")

    /** The icon to show when the control is expanded and collapsed. Rotates on open and close. */
    lazy val expandIcon: Slot = Slot("expand-icon")

    /** Text that describes how to use the input. Alternatively, you can use the `help-text` attribute. */
    lazy val helpText: Slot = Slot("help-text")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The form control that wraps the label, input, and help text. */
    lazy val formControl: String = "form-control"

    /** The label's wrapper. */
    lazy val formControlLabel: String = "form-control-label"

    /** The select's wrapper. */
    lazy val formControlInput: String = "form-control-input"

    /** The help text's wrapper. */
    lazy val formControlHelpText: String = "form-control-help-text"

    /** The container the wraps the prefix, combobox, clear icon, and expand button. */
    lazy val combobox: String = "combobox"

    /** The container that wraps the prefix slot. */
    lazy val prefix: String = "prefix"

    /** The element that displays the selected option's label, an `<input>` element. */
    lazy val displayInput: String = "display-input"

    /** The listbox container where options are slotted. */
    lazy val listbox: String = "listbox"

    /** The container that houses option tags when `multiselect` is used. */
    lazy val tags: String = "tags"

    /** The individual tags that represent each multiselect option. */
    lazy val tag: String = "tag"

    /** The tag's base part. */
    lazy val tag__base: String = "tag__base"

    /** The tag's content part. */
    lazy val tag__content: String = "tag__content"

    /** The tag's remove button. */
    lazy val tag__removeButton: String = "tag__remove-button"

    /** The tag's remove button base part. */
    lazy val tag__removeButton__base: String = "tag__remove-button__base"

    /** The clear button. */
    lazy val clearButton: String = "clear-button"

    /** The container that wraps the expand icon. */
    lazy val expandIcon: String = "expand-icon"
  }


  // -- Element type -- 

  @js.native trait SelectComponent extends js.Object { this: dom.HTMLElement => 

    /** The name of the select, submitted as a name/value pair with form data. */
    var name: String

    /** The select's size. */
    var size: String

    /** Placeholder text to show as a hint when the select is empty. */
    var placeholder: String

    /** Allows more than one option to be selected. */
    var multiple: Boolean

    /**
      * The maximum number of selected options to show when `multiple` is true. After the maximum, "+n" will be shown to
      * indicate the number of additional items that are selected. Set to 0 to remove the limit.
      */
    var maxOptionsVisible: Int

    /** Disables the select control. */
    var disabled: Boolean

    /** Adds a clear button when the select is not empty. */
    var clearable: Boolean

    /**
      * Indicates whether or not the select is open. You can toggle this attribute to show and hide the menu, or you can
      * use the `show()` and `hide()` methods and this attribute will reflect the select's open state.
      */
    var open: Boolean

    /**
      * Enable this option to prevent the listbox from being clipped when the component is placed inside a container with
      * `overflow: auto|scroll`. Hoisting uses a fixed positioning strategy that works in many, but not all, scenarios.
      */
    var hoist: Boolean

    /** Draws a filled select. */
    var filled: Boolean

    /** Draws a pill-style select with rounded edges. */
    var pill: Boolean

    /** The select's label. If you need to display HTML, use the `label` slot instead. */
    var label: String

    /**
      * The preferred placement of the select's menu. Note that the actual placement may vary as needed to keep the listbox
      * inside of the viewport.
      */
    var placement: String

    /** The select's help text. If you need to display HTML, use the `help-text` slot instead. */
    var helpText: String

    /**
      * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
      * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
      * the same document or shadow root for this to work.
      */
    var form: String

    /** The select's required attribute. */
    var required: Boolean
  }
}
