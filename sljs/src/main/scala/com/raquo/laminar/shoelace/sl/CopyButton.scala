package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlProp, HtmlAttr, StyleProp}
import com.raquo.laminar.shoelace.sl.EventTypes.*
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Copies text data to the clipboard when the user clicks the trigger.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/sljs/src/main/scala/com/raquo/laminar/shoelace/sl/CopyButton.scala CopyButton.scala source code]]
  * 
  * [[https://shoelace.style/components/copy Shoelace CopyButton docs]]
  */
object CopyButton extends WebComponent("sl-copy-button") {

  @JSImport("@shoelace-style/shoelace/dist/components/copy-button/copy-button.js")
  @js.native object RawImport extends js.Object

  type Ref = CopyButtonComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the data has been copied. */
  lazy val onCopy: EventProp[CopyEvent] = eventProp("sl-copy")

  /** Emitted when the data could not be copied. */
  lazy val onError: EventProp[ErrorEvent] = eventProp("sl-error")


  // -- Attributes --

  /** The text value to copy. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /**
    * An id that references an element in the same document from which data will be copied. If both this and `value` are
    * present, this value will take precedence. By default, the target element's `textContent` will be copied. To copy an
    * attribute, append the attribute name wrapped in square brackets, e.g. `from="el[value]"`. To copy a property,
    * append a dot and the property name, e.g. `from="el.value"`.
    */
  lazy val from: HtmlAttr[String] = stringAttr("from")

  /** Disables the copy button. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** A custom label to show in the tooltip. */
  lazy val copyLabel: HtmlAttr[String] = stringAttr("copy-label")

  /** A custom label to show in the tooltip after copying. */
  lazy val successLabel: HtmlAttr[String] = stringAttr("success-label")

  /** A custom label to show in the tooltip when a copy error occurs. */
  lazy val errorLabel: HtmlAttr[String] = stringAttr("error-label")

  /** The length of time to show feedback before restoring the default trigger. */
  lazy val feedbackDuration: HtmlAttr[Int] = intAttr("feedback-duration")

  /** The preferred placement of the tooltip. */
  lazy val tooltipPlacement: HtmlAttr[String] = stringAttr("tooltip-placement")

  /**
    * Enable this option to prevent the tooltip from being clipped when the component is placed inside a container with
    * `overflow: auto|hidden|scroll`. Hoisting uses a fixed positioning strategy that works in many, but not all,
    * scenarios.
    */
  lazy val hoist: HtmlAttr[Boolean] = boolAttr("hoist")


  // -- Props --

  lazy val status: HtmlProp[String, _] = stringProp("status")

  /** The text value to copy. */
  lazy val value: HtmlProp[String, _] = L.value


  // -- Slots --

  object slots {

    /** The icon to show in the default copy state. Works best with `<sl-icon>`. */
    lazy val copyIcon: Slot = Slot("copy-icon")

    /** The icon to show when the content is copied. Works best with `<sl-icon>`. */
    lazy val successIcon: Slot = Slot("success-icon")

    /** The icon to show when a copy error occurs. Works best with `<sl-icon>`. */
    lazy val errorIcon: Slot = Slot("error-icon")
  }


  // -- CSS Vars --

  /** The color to use for success feedback. */
  lazy val successColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--success-color")

  /** The color to use for error feedback. */
  lazy val errorColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--error-color")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The internal `<button>` element. */
    lazy val button: String = "button"

    /** The container that holds the copy icon. */
    lazy val copyIcon: String = "copy-icon"

    /** The container that holds the success icon. */
    lazy val successIcon: String = "success-icon"

    /** The container that holds the error icon. */
    lazy val errorIcon: String = "error-icon"

    /** The tooltip's exported `base` part. */
    lazy val tooltip__base: String = "tooltip__base"

    /** The tooltip's exported `popup` part. */
    lazy val tooltip__base__popup: String = "tooltip__base__popup"

    /** The tooltip's exported `arrow` part. */
    lazy val tooltip__base__arrow: String = "tooltip__base__arrow"

    /** The tooltip's exported `body` part. */
    lazy val tooltip__body: String = "tooltip__body"
  }


  // -- Element type -- 

  @js.native trait CopyButtonComponent extends js.Object { this: dom.HTMLElement => 

    val isCopying: Boolean

    var status: String

    /** The text value to copy. */
    var value: String

    /**
      * An id that references an element in the same document from which data will be copied. If both this and `value` are
      * present, this value will take precedence. By default, the target element's `textContent` will be copied. To copy an
      * attribute, append the attribute name wrapped in square brackets, e.g. `from="el[value]"`. To copy a property,
      * append a dot and the property name, e.g. `from="el.value"`.
      */
    var from: String

    /** Disables the copy button. */
    var disabled: Boolean

    /** A custom label to show in the tooltip. */
    var copyLabel: String

    /** A custom label to show in the tooltip after copying. */
    var successLabel: String

    /** A custom label to show in the tooltip when a copy error occurs. */
    var errorLabel: String

    /** The length of time to show feedback before restoring the default trigger. */
    var feedbackDuration: Int

    /** The preferred placement of the tooltip. */
    var tooltipPlacement: String

    /**
      * Enable this option to prevent the tooltip from being clipped when the component is placed inside a container with
      * `overflow: auto|hidden|scroll`. Hoisting uses a fixed positioning strategy that works in many, but not all,
      * scenarios.
      */
    var hoist: Boolean
  }
}
