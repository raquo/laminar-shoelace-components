package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/input Shoelace Input docs]] */
object Input extends WebComponent("sl-input") {

  @JSImport("@shoelace-style/shoelace/dist/components/input/input.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLInputElement with RawComponent


  // -- Events --

  /** Emitted when the control loses focus. */
  lazy val onBlur: EventProp[dom.Event] = eventProp("sl-blur")

  /** Emitted when an alteration to the control's value is committed by the user. */
  lazy val onChange: EventProp[dom.Event] = eventProp("sl-change")

  /** Emitted when the clear button is activated. */
  lazy val onClear: EventProp[dom.Event] = eventProp("sl-clear")

  /** Emitted when the control gains focus. */
  lazy val onFocus: EventProp[dom.Event] = eventProp("sl-focus")

  /** Emitted when the control receives input. */
  lazy val onInput: EventProp[dom.Event] = eventProp("sl-input")

  /** Emitted when the form control has been checked for validity and its constraints aren't satisfied. */
  lazy val onInvalid: EventProp[dom.Event] = eventProp("sl-invalid")


  // -- Props --


  // -- Attributes --

  lazy val title: HtmlAttr[String] = stringAttr("title")

  /**
    * The type of input. Works the same as a native `<input>` element, but only a subset of types are supported. Defaults
    * to `text`.
    */
  lazy val `type`: HtmlAttr[String] = stringAttr("type")

  lazy val typ: HtmlAttr[String] = `type`

  lazy val tpe: HtmlAttr[String] = `type`

  /** The name of the input, submitted as a name/value pair with form data. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** The current value of the input, submitted as a name/value pair with form data. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** The input's size. */
  lazy val size: CommonKeys.size.type = CommonKeys.size

  /** Draws a filled input. */
  lazy val filled: HtmlAttr[Boolean] = boolAttr("filled")

  /** Draws a pill-style input with rounded edges. */
  lazy val pill: HtmlAttr[Boolean] = boolAttr("pill")

  /** The input's label. If you need to display HTML, use the `label` slot instead. */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /** The input's help text. If you need to display HTML, use the `help-text` slot instead. */
  lazy val helpText: HtmlAttr[String] = stringAttr("help-text")

  /** Adds a clear button when the input is not empty. */
  lazy val clearable: HtmlAttr[Boolean] = boolAttr("clearable")

  /** Disables the input. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** Placeholder text to show as a hint when the input is empty. */
  lazy val placeholder: HtmlAttr[String] = stringAttr("placeholder")

  /** Makes the input readonly. */
  lazy val readOnly: HtmlAttr[Boolean] = boolAttr("readonly")

  /** Adds a button to toggle the password's visibility. Only applies to password types. */
  lazy val passwordToggle: HtmlAttr[Boolean] = boolAttr("password-toggle")

  /** Determines whether or not the password is currently visible. Only applies to password input types. */
  lazy val passwordVisible: HtmlAttr[Boolean] = boolAttr("password-visible")

  /** Hides the browser's built-in increment/decrement spin buttons for number inputs. */
  lazy val noSpinButtons: HtmlAttr[Boolean] = boolAttr("no-spin-buttons")

  /**
    * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
    * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
    * the same document or shadow root for this to work.
    */
  lazy val formId: HtmlAttr[String] = stringAttr("form")

  /** Makes the input a required field. */
  lazy val required: HtmlAttr[Boolean] = boolAttr("required")

  /** A regular expression pattern to validate input against. */
  lazy val pattern: HtmlAttr[String] = stringAttr("pattern")

  /** The minimum length of input that will be considered valid. */
  lazy val minLength: HtmlAttr[Int] = intAttr("minlength")

  /** The maximum length of input that will be considered valid. */
  lazy val maxLength: HtmlAttr[Int] = intAttr("maxlength")

  /** The input's minimum value. Only applies to date and number input types. */
  lazy val min: HtmlAttr[Int] = intAttr("min")

  /** The input's maximum value. Only applies to date and number input types. */
  lazy val max: HtmlAttr[Int] = intAttr("max")

  /**
    * Specifies the granularity that the value must adhere to, or the special value `any` which means no stepping is
    * implied, allowing any numeric value. Only applies to date and number input types.
    */
  lazy val step: HtmlAttr[Int] = intAttr("step")

  /** Controls whether and how text input is automatically capitalized as it is entered by the user. */
  lazy val autoCapitalize: CommonKeys.autoCapitalize.type = CommonKeys.autoCapitalize

  /** Indicates whether the browser's autocorrect feature is on or off. */
  lazy val autoCorrect: HtmlAttr[String] = stringAttr("autocorrect")

  /**
    * Specifies what permission the browser has to provide assistance in filling out form field values. Refer to
    * [this page on MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/autocomplete) for available values.
    */
  lazy val autoComplete: HtmlAttr[String] = stringAttr("autocomplete")

  /** Indicates that the input should receive focus on page load. */
  lazy val autoFocus: HtmlAttr[Boolean] = boolAttr("autofocus")

  /** Used to customize the label or icon of the Enter key on virtual keyboards. */
  lazy val enterkeyhint: HtmlAttr[String] = stringAttr("enterkeyhint")

  /** Enables spell checking on the input. */
  lazy val spellCheck: HtmlAttr[Boolean] = boolAttr("spellcheck")

  /**
    * Tells the browser what type of data will be entered by the user, allowing it to display the appropriate virtual
    * keyboard on supportive devices.
    */
  lazy val inputMode: CommonKeys.inputMode.type = CommonKeys.inputMode


  // -- Slots --

  object slots {

    /** The input's label. Alternatively, you can use the `label` attribute. */
    lazy val label: Slot = Slot("label")

    /** Used to prepend a presentational icon or similar element to the input. */
    lazy val prefix: Slot = Slot("prefix")

    /** Used to append a presentational icon or similar element to the input. */
    lazy val suffix: Slot = Slot("suffix")

    /** An icon to use in lieu of the default clear icon. */
    lazy val clearIcon: Slot = Slot("clear-icon")

    /** An icon to use in lieu of the default show password icon. */
    lazy val showPasswordIcon: Slot = Slot("show-password-icon")

    /** An icon to use in lieu of the default hide password icon. */
    lazy val hidePasswordIcon: Slot = Slot("hide-password-icon")

    /** Text that describes how to use the input. Alternatively, you can use the `help-text` attribute. */
    lazy val helpText: Slot = Slot("help-text")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The form control that wraps the label, input, and help text. */
    lazy val formControl: String = "form-control"

    /** The label's wrapper. */
    lazy val formControlLabel: String = "form-control-label"

    /** The input's wrapper. */
    lazy val formControlInput: String = "form-control-input"

    /** The help text's wrapper. */
    lazy val formControlHelpText: String = "form-control-help-text"

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The internal `<input>` control. */
    lazy val input: String = "input"

    /** The container that wraps the prefix. */
    lazy val prefix: String = "prefix"

    /** The clear button. */
    lazy val clearButton: String = "clear-button"

    /** The password toggle button. */
    lazy val passwordToggleButton: String = "password-toggle-button"

    /** The container that wraps the suffix. */
    lazy val suffix: String = "suffix"
  }


  // -- Element type -- 

  @js.native trait RawComponent extends js.Object { this: dom.HTMLInputElement => 

    var title: String

    /**
      * The type of input. Works the same as a native `<input>` element, but only a subset of types are supported. Defaults
      * to `text`.
      */
    var `type`: String

    /** The name of the input, submitted as a name/value pair with form data. */
    var name: String

    /** The input's size. */
    var size: String

    /** Draws a filled input. */
    var filled: Boolean

    /** Draws a pill-style input with rounded edges. */
    var pill: Boolean

    /** The input's label. If you need to display HTML, use the `label` slot instead. */
    var label: String

    /** The input's help text. If you need to display HTML, use the `help-text` slot instead. */
    var helpText: String

    /** Adds a clear button when the input is not empty. */
    var clearable: Boolean

    /** Disables the input. */
    var disabled: Boolean

    /** Placeholder text to show as a hint when the input is empty. */
    var placeholder: String

    /** Makes the input readonly. */
    var readonly: Boolean

    /** Adds a button to toggle the password's visibility. Only applies to password types. */
    var passwordToggle: Boolean

    /** Determines whether or not the password is currently visible. Only applies to password input types. */
    var passwordVisible: Boolean

    /** Hides the browser's built-in increment/decrement spin buttons for number inputs. */
    var noSpinButtons: Boolean

    /**
      * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
      * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
      * the same document or shadow root for this to work.
      */
    var form: String

    /** Makes the input a required field. */
    var required: Boolean

    /** A regular expression pattern to validate input against. */
    var pattern: String

    /** The minimum length of input that will be considered valid. */
    var minlength: Int

    /** The maximum length of input that will be considered valid. */
    var maxlength: Int

    /** The input's minimum value. Only applies to date and number input types. */
    var min: Int | String

    /** The input's maximum value. Only applies to date and number input types. */
    var max: Int | String

    /**
      * Specifies the granularity that the value must adhere to, or the special value `any` which means no stepping is
      * implied, allowing any numeric value. Only applies to date and number input types.
      */
    var step: Int | String

    /** Controls whether and how text input is automatically capitalized as it is entered by the user. */
    var autocapitalize: String

    /** Indicates whether the browser's autocorrect feature is on or off. */
    var autocorrect: String

    /**
      * Specifies what permission the browser has to provide assistance in filling out form field values. Refer to
      * [this page on MDN](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/autocomplete) for available values.
      */
    var autocomplete: String

    /** Indicates that the input should receive focus on page load. */
    var autofocus: Boolean

    /** Used to customize the label or icon of the Enter key on virtual keyboards. */
    var enterkeyhint: String

    /** Enables spell checking on the input. */
    var spellcheck: Boolean

    /**
      * Tells the browser what type of data will be entered by the user, allowing it to display the appropriate virtual
      * keyboard on supportive devices.
      */
    var inputmode: String
  }
}
