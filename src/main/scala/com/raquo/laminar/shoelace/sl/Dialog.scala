package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr, StyleProp}
import com.raquo.laminar.shoelace.sl.EventTypes.*
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Dialogs, sometimes called "modals", appear above the page and require the user's immediate attention.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/Dialog.scala Dialog.scala source code]]
  * 
  * [[https://shoelace.style/components/dialog Shoelace Dialog docs]]
  */
object Dialog extends WebComponent("sl-dialog") {

  @JSImport("@shoelace-style/shoelace/dist/components/dialog/dialog.js")
  @js.native object RawImport extends js.Object

  type Ref = DialogComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the dialog opens. */
  lazy val onShow: EventProp[dom.Event] = eventProp("sl-show")

  /** Emitted after the dialog opens and all animations are complete. */
  lazy val onAfterShow: EventProp[dom.Event] = eventProp("sl-after-show")

  /** Emitted when the dialog closes. */
  lazy val onHide: EventProp[dom.Event] = eventProp("sl-hide")

  /** Emitted after the dialog closes and all animations are complete. */
  lazy val onAfterHide: EventProp[dom.Event] = eventProp("sl-after-hide")

  /** Emitted when the dialog opens and is ready to receive focus. Calling `event.preventDefault()` will prevent focusing and allow you to set it on a different element, such as an input. */
  lazy val onInitialFocus: EventProp[dom.Event] = eventProp("sl-initial-focus")

  /** Emitted when the user attempts to close the dialog by clicking the close button, clicking the overlay, or pressing escape. Calling `event.preventDefault()` will keep the dialog open. Avoid using this unless closing the dialog will result in destructive behavior such as data loss. */
  lazy val onRequestClose: EventProp[RequestCloseEvent] = eventProp("sl-request-close")


  // -- Attributes --

  /**
    * Indicates whether or not the dialog is open. You can toggle this attribute to show and hide the dialog, or you can
    * use the `show()` and `hide()` methods and this attribute will reflect the dialog's open state.
    */
  lazy val open: HtmlAttr[Boolean] = boolAttr("open")

  /**
    * The dialog's label as displayed in the header. You should always include a relevant label even when using
    * `no-header`, as it is required for proper accessibility. If you need to display HTML, use the `label` slot instead.
    */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /**
    * Disables the header. This will also remove the default close button, so please ensure you provide an easy,
    * accessible way for users to dismiss the dialog.
    */
  lazy val noHeader: HtmlAttr[Boolean] = boolAttr("no-header")


  // -- Props --


  // -- Slots --

  object slots {

    /** The dialog's main content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** The dialog's label. Alternatively, you can use the `label` attribute. */
    lazy val label: Slot = Slot("label")

    /** Optional actions to add to the header. Works best with `<sl-icon-button>`. */
    lazy val headerActions: Slot = Slot("header-actions")

    /** The dialog's footer, usually one or more buttons representing various options. */
    lazy val footer: Slot = Slot("footer")
  }


  // -- CSS Vars --

  /** The preferred width of the dialog. Note that the dialog will shrink to accommodate smaller screens. */
  lazy val width: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--width")

  /** The amount of padding to use for the header. */
  lazy val headerSpacing: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--header-spacing")

  /** The amount of padding to use for the body. */
  lazy val bodySpacing: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--body-spacing")

  /** The amount of padding to use for the footer. */
  lazy val footerSpacing: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--footer-spacing")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The overlay that covers the screen behind the dialog. */
    lazy val overlay: String = "overlay"

    /** The dialog's panel (where the dialog and its content are rendered). */
    lazy val panel: String = "panel"

    /** The dialog's header. This element wraps the title and header actions. */
    lazy val header: String = "header"

    /** Optional actions to add to the header. Works best with `<sl-icon-button>`. */
    lazy val headerActions: String = "header-actions"

    /** The dialog's title. */
    lazy val title: String = "title"

    /** The close button, an `<sl-icon-button>`. */
    lazy val closeButton: String = "close-button"

    /** The close button's exported `base` part. */
    lazy val closeButton__base: String = "close-button__base"

    /** The dialog's body. */
    lazy val body: String = "body"

    /** The dialog's footer. */
    lazy val footer: String = "footer"
  }


  // -- Element type -- 

  @js.native trait DialogComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * Indicates whether or not the dialog is open. You can toggle this attribute to show and hide the dialog, or you can
      * use the `show()` and `hide()` methods and this attribute will reflect the dialog's open state.
      */
    var open: Boolean

    /**
      * The dialog's label as displayed in the header. You should always include a relevant label even when using
      * `no-header`, as it is required for proper accessibility. If you need to display HTML, use the `label` slot instead.
      */
    var label: String

    /**
      * Disables the header. This will also remove the default close button, so please ensure you provide an easy,
      * accessible way for users to dismiss the dialog.
      */
    var noHeader: Boolean
  }
}
