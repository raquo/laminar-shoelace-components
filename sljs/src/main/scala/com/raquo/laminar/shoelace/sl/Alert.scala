package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/alert Shoelace Alert docs]] */
object Alert extends WebComponent("sl-alert") {

  @JSImport("@shoelace-style/shoelace/dist/components/alert/alert.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --

  /** Emitted when the alert opens. */
  lazy val onShow: EventProp[dom.Event] = eventProp("sl-show")

  /** Emitted after the alert opens and all animations are complete. */
  lazy val onAfterShow: EventProp[dom.Event] = eventProp("sl-after-show")

  /** Emitted when the alert closes. */
  lazy val onHide: EventProp[dom.Event] = eventProp("sl-hide")

  /** Emitted after the alert closes and all animations are complete. */
  lazy val onAfterHide: EventProp[dom.Event] = eventProp("sl-after-hide")


  // -- Attributes --

  /**
    * Indicates whether or not the alert is open. You can toggle this attribute to show and hide the alert, or you can
    * use the `show()` and `hide()` methods and this attribute will reflect the alert's open state.
    */
  lazy val open: HtmlAttr[Boolean] = boolAttr("open")

  /** Enables a close button that allows the user to dismiss the alert. */
  lazy val closable: HtmlAttr[Boolean] = boolAttr("closable")

  /** The alert's theme variant. */
  lazy val variant: CommonKeys.variant.type = CommonKeys.variant

  /**
    * The length of time, in milliseconds, the alert will show before closing itself. If the user interacts with
    * the alert before it closes (e.g. moves the mouse over it), the timer will restart. Defaults to `Infinity`, meaning
    * the alert will not close on its own.
    */
  lazy val duration: HtmlAttr[Int] = intAttr("duration")


  // -- Props --


  // -- Slots --

  object slots {

    /** The alert's main content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** An icon to show in the alert. Works best with `<sl-icon>`. */
    lazy val icon: Slot = Slot("icon")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The container that wraps the optional icon. */
    lazy val icon: String = "icon"

    /** The container that wraps the alert's main content. */
    lazy val message: String = "message"

    /** The close button, an `<sl-icon-button>`. */
    lazy val closeButton: String = "close-button"

    /** The close button's exported `base` part. */
    lazy val closeButton__base: String = "close-button__base"
  }


  // -- Element type -- 

  @js.native trait RawComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * Indicates whether or not the alert is open. You can toggle this attribute to show and hide the alert, or you can
      * use the `show()` and `hide()` methods and this attribute will reflect the alert's open state.
      */
    var open: Boolean

    /** Enables a close button that allows the user to dismiss the alert. */
    var closable: Boolean

    /** The alert's theme variant. */
    var variant: String

    /**
      * The length of time, in milliseconds, the alert will show before closing itself. If the user interacts with
      * the alert before it closes (e.g. moves the mouse over it), the timer will restart. Defaults to `Infinity`, meaning
      * the alert will not close on its own.
      */
    var duration: Int
  }
}
