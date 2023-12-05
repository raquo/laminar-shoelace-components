package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlProp, HtmlAttr}
import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.Slot
import com.raquo.laminar.tags.CustomHtmlTag
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Textareas collect data from the user and allow multiple lines of text.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/Textarea.scala Textarea.scala source code]]
  * 
  * [[https://shoelace.style/components/textarea Shoelace Textarea docs]]
  */
object Textarea extends WebComponent("sl-textarea") with ControlledInput {

  @JSImport("@shoelace-style/shoelace/dist/components/textarea/textarea.js")
  @js.native object RawImport extends js.Object

  type Ref = TextareaComponent with dom.HTMLTextAreaElement

  override protected lazy val tag: CustomHtmlTag[Ref] = {
    tagWithControlledInput(value, initial = "", onInput)
  }


  // -- Events --

  /** Emitted when the control loses focus. */
  lazy val onBlur: EventProp[dom.Event] = eventProp("sl-blur")

  /** Emitted when an alteration to the control's value is committed by the user. */
  lazy val onChange: EventProp[dom.Event] = eventProp("sl-change")

  /** Emitted when the control gains focus. */
  lazy val onFocus: EventProp[dom.Event] = eventProp("sl-focus")

  /** Emitted when the control receives input. */
  lazy val onInput: EventProp[dom.Event] = eventProp("sl-input")

  /** Emitted when the form control has been checked for validity and its constraints aren't satisfied. */
  lazy val onInvalid: EventProp[dom.Event] = eventProp("sl-invalid")


  // -- Attributes --

  lazy val title: HtmlAttr[String] = stringAttr("title")

  /** The name of the textarea, submitted as a name/value pair with form data. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** The current value of the textarea, submitted as a name/value pair with form data. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** The textarea's size. */
  lazy val size: CommonKeys.size.type = CommonKeys.size

  /** Draws a filled textarea. */
  lazy val filled: HtmlAttr[Boolean] = boolAttr("filled")

  /** The textarea's label. If you need to display HTML, use the `label` slot instead. */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /** The textarea's help text. If you need to display HTML, use the `help-text` slot instead. */
  lazy val helpText: HtmlAttr[String] = stringAttr("help-text")

  /** Placeholder text to show as a hint when the input is empty. */
  lazy val placeholder: HtmlAttr[String] = stringAttr("placeholder")

  /** The number of rows to display by default. */
  lazy val rows: HtmlAttr[Int] = intAttr("rows")

  /** Controls how the textarea can be resized. */
  lazy val resize: HtmlAttr[String] = stringAttr("resize")

  /** Disables the textarea. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** Makes the textarea readonly. */
  lazy val readOnly: HtmlAttr[Boolean] = boolAttr("readonly")

  /**
    * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
    * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
    * the same document or shadow root for this to work.
    */
  lazy val formId: HtmlAttr[String] = stringAttr("form")

  /** Makes the textarea a required field. */
  lazy val required: HtmlAttr[Boolean] = boolAttr("required")

  /** The minimum length of input that will be considered valid. */
  lazy val minLength: HtmlAttr[Int] = intAttr("minlength")

  /** The maximum length of input that will be considered valid. */
  lazy val maxLength: HtmlAttr[Int] = intAttr("maxlength")

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

  /** Enables spell checking on the textarea. */
  lazy val spellCheck: HtmlAttr[Boolean] = boolAttr("spellcheck")

  /**
    * Tells the browser what type of data will be entered by the user, allowing it to display the appropriate virtual
    * keyboard on supportive devices.
    */
  lazy val inputMode: CommonKeys.inputMode.type = CommonKeys.inputMode


  // -- Props --

  /** The current value of the textarea, submitted as a name/value pair with form data. */
  lazy val value: HtmlProp[String, _] = L.value


  // -- Slots --

  object slots {

    /** The textarea's label. Alternatively, you can use the `label` attribute. */
    lazy val label: Slot = Slot("label")

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

    /** The input's wrapper. */
    lazy val formControlInput: String = "form-control-input"

    /** The help text's wrapper. */
    lazy val formControlHelpText: String = "form-control-help-text"

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The internal `<textarea>` control. */
    lazy val textarea: String = "textarea"
  }


  // -- Element type -- 

  @js.native trait TextareaComponent extends js.Object { this: dom.HTMLTextAreaElement => 

    var title: String

    /** The name of the textarea, submitted as a name/value pair with form data. */
    var name: String

    /** The current value of the textarea, submitted as a name/value pair with form data. */
    var value: String

    /** The textarea's size. */
    var size: String

    /** Draws a filled textarea. */
    var filled: Boolean

    /** The textarea's label. If you need to display HTML, use the `label` slot instead. */
    var label: String

    /** The textarea's help text. If you need to display HTML, use the `help-text` slot instead. */
    var helpText: String

    /** Placeholder text to show as a hint when the input is empty. */
    var placeholder: String

    /** The number of rows to display by default. */
    var rows: Int

    /** Controls how the textarea can be resized. */
    var resize: String

    /** Disables the textarea. */
    var disabled: Boolean

    /** Makes the textarea readonly. */
    var readonly: Boolean

    /**
      * By default, form controls are associated with the nearest containing `<form>` element. This attribute allows you
      * to place the form control outside of a form and associate it with the form that has this `id`. The form must be in
      * the same document or shadow root for this to work.
      */
    var form: String

    /** Makes the textarea a required field. */
    var required: Boolean

    /** The minimum length of input that will be considered valid. */
    var minlength: Int

    /** The maximum length of input that will be considered valid. */
    var maxlength: Int

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

    /** Enables spell checking on the textarea. */
    var spellcheck: Boolean

    /**
      * Tells the browser what type of data will be entered by the user, allowing it to display the appropriate virtual
      * keyboard on supportive devices.
      */
    var inputmode: String
  }
}
