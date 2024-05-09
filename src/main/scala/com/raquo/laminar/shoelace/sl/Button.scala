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
  * Buttons represent actions that are available to the user.
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/Button.scala Button.scala source code]]
  * 
  * [[https://shoelace.style/components/button Shoelace Button docs]]
  */
object Button extends WebComponent("sl-button") {

  @JSImport("@shoelace-style/shoelace/dist/components/button/button.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Self = Button.type

  type Ref = ButtonComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the button loses focus. */
  lazy val onBlur: EventProp[dom.Event] = eventProp("sl-blur")

  /** Emitted when the button gains focus. */
  lazy val onFocus: EventProp[dom.Event] = eventProp("sl-focus")

  /** Emitted when the form control has been checked for validity and its constraints aren't satisfied. */
  lazy val onInvalid: EventProp[dom.Event] = eventProp("sl-invalid")


  // -- Attributes --

  lazy val title: HtmlAttr[String] = stringAttr("title")

  /** The button's theme variant. */
  lazy val variant: CommonKeys.buttonVariant.type = CommonKeys.buttonVariant

  /** The button's size. */
  lazy val size: CommonKeys.size.type = CommonKeys.size

  /** Draws the button with a caret. Used to indicate that the button triggers a dropdown menu or similar behavior. */
  lazy val caret: HtmlAttr[Boolean] = boolAttr("caret")

  /** Disables the button. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** Draws the button in a loading state. */
  lazy val loading: HtmlAttr[Boolean] = boolAttr("loading")

  /** Draws an outlined button. */
  lazy val outline: HtmlAttr[Boolean] = boolAttr("outline")

  /** Draws a pill-style button with rounded edges. */
  lazy val pill: HtmlAttr[Boolean] = boolAttr("pill")

  /**
    * Draws a circular icon button. When this attribute is present, the button expects a single `<sl-icon>` in the
    * default slot.
    */
  lazy val circle: HtmlAttr[Boolean] = boolAttr("circle")

  /**
    * The type of button. Note that the default value is `button` instead of `submit`, which is opposite of how native
    * `<button>` elements behave. When the type is `submit`, the button will submit the surrounding form.
    */
  lazy val `type`: HtmlAttr[String] = stringAttr("type")

  lazy val typ: HtmlAttr[String] = `type`

  lazy val tpe: HtmlAttr[String] = `type`

  /**
    * The name of the button, submitted as a name/value pair with form data, but only when this button is the submitter.
    * This attribute is ignored when `href` is present.
    */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /**
    * The value of the button, submitted as a pair with the button's name as part of the form data, but only when this
    * button is the submitter. This attribute is ignored when `href` is present.
    */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** When set, the underlying button will be rendered as an `<a>` with this `href` instead of a `<button>`. */
  lazy val href: HtmlAttr[String] = stringAttr("href")

  /** Tells the browser where to open the link. Only used when `href` is present. */
  lazy val target: CommonKeys.target.type = CommonKeys.target

  /**
    * When using `href`, this attribute will map to the underlying link's `rel` attribute. Unlike regular links, the
    * default is `noreferrer noopener` to prevent security exploits. However, if you're using `target` to point to a
    * specific tab/window, this will prevent that from working correctly. You can remove or change the default value by
    * setting the attribute to an empty string or a value of your choice, respectively.
    */
  lazy val rel: HtmlAttr[String] = stringAttr("rel")

  /** Tells the browser to download the linked file as this filename. Only used when `href` is present. */
  lazy val download: HtmlAttr[String] = stringAttr("download")

  /**
    * The "form owner" to associate the button with. If omitted, the closest containing form will be used instead. The
    * value of this attribute must be an id of a form in the same document or shadow root as the button.
    */
  lazy val formId: HtmlAttr[String] = stringAttr("form")

  /** Used to override the form owner's `action` attribute. */
  lazy val formAction: HtmlAttr[String] = stringAttr("formaction")

  /** Used to override the form owner's `enctype` attribute. */
  lazy val formEncType: HtmlAttr[String] = stringAttr("formenctype")

  /** Used to override the form owner's `method` attribute. */
  lazy val formMethod: HtmlAttr[String] = stringAttr("formmethod")

  /** Used to override the form owner's `novalidate` attribute. */
  lazy val formNoValidate: HtmlAttr[Boolean] = boolAttr("formnovalidate")

  /** Used to override the form owner's `target` attribute. */
  lazy val formTarget: HtmlAttr[String] = stringAttr("formtarget")


  // -- Props --

  /**
    * The value of the button, submitted as a pair with the button's name as part of the form data, but only when this
    * button is the submitter. This attribute is ignored when `href` is present.
    */
  lazy val value: HtmlProp[String, _] = L.value


  // -- Slots --

  object slots {

    /** The button's label. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** A presentational prefix icon or similar element. */
    lazy val prefix: Slot = Slot("prefix")

    /** A presentational suffix icon or similar element. */
    lazy val suffix: Slot = Slot("suffix")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The container that wraps the prefix. */
    lazy val prefix: String = "prefix"

    /** The button's label. */
    lazy val label: String = "label"

    /** The container that wraps the suffix. */
    lazy val suffix: String = "suffix"

    /** The button's caret icon, an `<sl-icon>` element. */
    lazy val caret: String = "caret"

    /** The spinner that shows when the button is in the loading state. */
    lazy val spinner: String = "spinner"
  }


  // -- Element type -- 

  @js.native trait ButtonComponent extends js.Object { this: dom.HTMLElement => 

    val invalid: Boolean

    var title: String

    /** The button's theme variant. */
    var variant: String

    /** The button's size. */
    var size: String

    /** Draws the button with a caret. Used to indicate that the button triggers a dropdown menu or similar behavior. */
    var caret: Boolean

    /** Disables the button. */
    var disabled: Boolean

    /** Draws the button in a loading state. */
    var loading: Boolean

    /** Draws an outlined button. */
    var outline: Boolean

    /** Draws a pill-style button with rounded edges. */
    var pill: Boolean

    /**
      * Draws a circular icon button. When this attribute is present, the button expects a single `<sl-icon>` in the
      * default slot.
      */
    var circle: Boolean

    /**
      * The type of button. Note that the default value is `button` instead of `submit`, which is opposite of how native
      * `<button>` elements behave. When the type is `submit`, the button will submit the surrounding form.
      */
    var `type`: String

    /**
      * The name of the button, submitted as a name/value pair with form data, but only when this button is the submitter.
      * This attribute is ignored when `href` is present.
      */
    var name: String

    /**
      * The value of the button, submitted as a pair with the button's name as part of the form data, but only when this
      * button is the submitter. This attribute is ignored when `href` is present.
      */
    var value: String

    /** When set, the underlying button will be rendered as an `<a>` with this `href` instead of a `<button>`. */
    var href: String

    /** Tells the browser where to open the link. Only used when `href` is present. */
    var target: String

    /**
      * When using `href`, this attribute will map to the underlying link's `rel` attribute. Unlike regular links, the
      * default is `noreferrer noopener` to prevent security exploits. However, if you're using `target` to point to a
      * specific tab/window, this will prevent that from working correctly. You can remove or change the default value by
      * setting the attribute to an empty string or a value of your choice, respectively.
      */
    var rel: String

    /** Tells the browser to download the linked file as this filename. Only used when `href` is present. */
    var download: String | Unit

    /**
      * The "form owner" to associate the button with. If omitted, the closest containing form will be used instead. The
      * value of this attribute must be an id of a form in the same document or shadow root as the button.
      */
    var form: String

    /** Used to override the form owner's `action` attribute. */
    var formAction: String

    /** Used to override the form owner's `enctype` attribute. */
    var formEnctype: String

    /** Used to override the form owner's `method` attribute. */
    var formMethod: String

    /** Used to override the form owner's `novalidate` attribute. */
    var formNoValidate: Boolean

    /** Used to override the form owner's `target` attribute. */
    var formTarget: String
  }
}
