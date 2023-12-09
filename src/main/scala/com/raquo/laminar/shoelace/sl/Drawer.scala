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
  * Drawers slide in from a container to expose additional options and information.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/Drawer.scala Drawer.scala source code]]
  * 
  * [[https://shoelace.style/components/drawer Shoelace Drawer docs]]
  */
object Drawer extends WebComponent("sl-drawer") {

  @JSImport("@shoelace-style/shoelace/dist/components/drawer/drawer.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Ref = DrawerComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the drawer opens. */
  lazy val onShow: EventProp[dom.Event] = eventProp("sl-show")

  /** Emitted after the drawer opens and all animations are complete. */
  lazy val onAfterShow: EventProp[dom.Event] = eventProp("sl-after-show")

  /** Emitted when the drawer closes. */
  lazy val onHide: EventProp[dom.Event] = eventProp("sl-hide")

  /** Emitted after the drawer closes and all animations are complete. */
  lazy val onAfterHide: EventProp[dom.Event] = eventProp("sl-after-hide")

  /** Emitted when the drawer opens and is ready to receive focus. Calling `event.preventDefault()` will prevent focusing and allow you to set it on a different element, such as an input. */
  lazy val onInitialFocus: EventProp[dom.Event] = eventProp("sl-initial-focus")

  /** Emitted when the user attempts to close the drawer by clicking the close button, clicking the overlay, or pressing escape. Calling `event.preventDefault()` will keep the drawer open. Avoid using this unless closing the drawer will result in destructive behavior such as data loss. */
  lazy val onRequestClose: EventProp[RequestCloseEvent] = eventProp("sl-request-close")


  // -- Attributes --

  /**
    * Indicates whether or not the drawer is open. You can toggle this attribute to show and hide the drawer, or you can
    * use the `show()` and `hide()` methods and this attribute will reflect the drawer's open state.
    */
  lazy val open: HtmlAttr[Boolean] = boolAttr("open")

  /**
    * The drawer's label as displayed in the header. You should always include a relevant label even when using
    * `no-header`, as it is required for proper accessibility. If you need to display HTML, use the `label` slot instead.
    */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /** The direction from which the drawer will open. */
  lazy val placement: CommonKeys.placement.type = CommonKeys.placement

  /**
    * By default, the drawer slides out of its containing block (usually the viewport). To make the drawer slide out of
    * its parent element, set this attribute and add `position: relative` to the parent.
    */
  lazy val contained: HtmlAttr[Boolean] = boolAttr("contained")

  /**
    * Removes the header. This will also remove the default close button, so please ensure you provide an easy,
    * accessible way for users to dismiss the drawer.
    */
  lazy val noHeader: HtmlAttr[Boolean] = boolAttr("no-header")


  // -- Props --


  // -- Slots --

  object slots {

    /** The drawer's main content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** The drawer's label. Alternatively, you can use the `label` attribute. */
    lazy val label: Slot = Slot("label")

    /** Optional actions to add to the header. Works best with `<sl-icon-button>`. */
    lazy val headerActions: Slot = Slot("header-actions")

    /** The drawer's footer, usually one or more buttons representing various options. */
    lazy val footer: Slot = Slot("footer")
  }


  // -- CSS Vars --

  /** The preferred size of the drawer. This will be applied to the drawer's width or height depending on its `placement`. Note that the drawer will shrink to accommodate smaller screens. */
  lazy val size: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--size")

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

    /** The overlay that covers the screen behind the drawer. */
    lazy val overlay: String = "overlay"

    /** The drawer's panel (where the drawer and its content are rendered). */
    lazy val panel: String = "panel"

    /** The drawer's header. This element wraps the title and header actions. */
    lazy val header: String = "header"

    /** Optional actions to add to the header. Works best with `<sl-icon-button>`. */
    lazy val headerActions: String = "header-actions"

    /** The drawer's title. */
    lazy val title: String = "title"

    /** The close button, an `<sl-icon-button>`. */
    lazy val closeButton: String = "close-button"

    /** The close button's exported `base` part. */
    lazy val closeButton__base: String = "close-button__base"

    /** The drawer's body. */
    lazy val body: String = "body"

    /** The drawer's footer. */
    lazy val footer: String = "footer"
  }


  // -- Element type -- 

  @js.native trait DrawerComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * Indicates whether or not the drawer is open. You can toggle this attribute to show and hide the drawer, or you can
      * use the `show()` and `hide()` methods and this attribute will reflect the drawer's open state.
      */
    var open: Boolean

    /**
      * The drawer's label as displayed in the header. You should always include a relevant label even when using
      * `no-header`, as it is required for proper accessibility. If you need to display HTML, use the `label` slot instead.
      */
    var label: String

    /** The direction from which the drawer will open. */
    var placement: String

    /**
      * By default, the drawer slides out of its containing block (usually the viewport). To make the drawer slide out of
      * its parent element, set this attribute and add `position: relative` to the parent.
      */
    var contained: Boolean

    /**
      * Removes the header. This will also remove the default close button, so please ensure you provide an easy,
      * accessible way for users to dismiss the drawer.
      */
    var noHeader: Boolean
  }
}
