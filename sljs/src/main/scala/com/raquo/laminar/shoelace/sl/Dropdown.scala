package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/dropdown Shoelace Dropdown docs]] */
object Dropdown extends WebComponent("sl-dropdown") {

  @JSImport("@shoelace-style/shoelace/dist/components/dropdown/dropdown.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --

  /** Emitted when the dropdown opens. */
  lazy val onShow: EventProp[dom.Event] = eventProp("sl-show")

  /** Emitted after the dropdown opens and all animations are complete. */
  lazy val onAfterShow: EventProp[dom.Event] = eventProp("sl-after-show")

  /** Emitted when the dropdown closes. */
  lazy val onHide: EventProp[dom.Event] = eventProp("sl-hide")

  /** Emitted after the dropdown closes and all animations are complete. */
  lazy val onAfterHide: EventProp[dom.Event] = eventProp("sl-after-hide")


  // -- Props --


  // -- Attributes --

  /**
    * Indicates whether or not the dropdown is open. You can toggle this attribute to show and hide the dropdown, or you
    * can use the `show()` and `hide()` methods and this attribute will reflect the dropdown's open state.
    */
  lazy val open: HtmlAttr[Boolean] = boolAttr("open")

  /**
    * The preferred placement of the dropdown panel. Note that the actual placement may vary as needed to keep the panel
    * inside of the viewport.
    */
  lazy val placement: CommonKeys.placement.type = CommonKeys.placement

  /** Disables the dropdown so the panel will not open. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /**
    * By default, the dropdown is closed when an item is selected. This attribute will keep it open instead. Useful for
    * dropdowns that allow for multiple interactions.
    */
  lazy val stayOpenOnSelect: HtmlAttr[Boolean] = boolAttr("stay-open-on-select")

  /** The distance in pixels from which to offset the panel away from its trigger. */
  lazy val distance: HtmlAttr[Int] = intAttr("distance")

  /** The distance in pixels from which to offset the panel along its trigger. */
  lazy val skidding: HtmlAttr[Int] = intAttr("skidding")

  /**
    * Enable this option to prevent the panel from being clipped when the component is placed inside a container with
    * `overflow: auto|scroll`. Hoisting uses a fixed positioning strategy that works in many, but not all, scenarios.
    */
  lazy val hoist: HtmlAttr[Boolean] = boolAttr("hoist")


  // -- Slots --

  object slots {

    /** The dropdown's main content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** The dropdown's trigger, usually a `<sl-button>` element. */
    lazy val trigger: Slot = Slot("trigger")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The container that wraps the trigger. */
    lazy val trigger: String = "trigger"

    /** The panel that gets shown when the dropdown is open. */
    lazy val panel: String = "panel"
  }


  // -- Element type -- 

  @js.native trait RawComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * Indicates whether or not the dropdown is open. You can toggle this attribute to show and hide the dropdown, or you
      * can use the `show()` and `hide()` methods and this attribute will reflect the dropdown's open state.
      */
    var open: Boolean

    /**
      * The preferred placement of the dropdown panel. Note that the actual placement may vary as needed to keep the panel
      * inside of the viewport.
      */
    var placement: String

    /** Disables the dropdown so the panel will not open. */
    var disabled: Boolean

    /**
      * By default, the dropdown is closed when an item is selected. This attribute will keep it open instead. Useful for
      * dropdowns that allow for multiple interactions.
      */
    var stayOpenOnSelect: Boolean

    /** The distance in pixels from which to offset the panel away from its trigger. */
    var distance: Int

    /** The distance in pixels from which to offset the panel along its trigger. */
    var skidding: Int

    /**
      * Enable this option to prevent the panel from being clipped when the component is placed inside a container with
      * `overflow: auto|scroll`. Hoisting uses a fixed positioning strategy that works in many, but not all, scenarios.
      */
    var hoist: Boolean
  }
}
