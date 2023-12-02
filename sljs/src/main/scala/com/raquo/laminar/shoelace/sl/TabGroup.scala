package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr, StyleProp}
import com.raquo.laminar.shoelace.sl.EventTypes.*
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Tab groups organize content into a container that shows one section at a time.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/sljs/src/main/scala/com/raquo/laminar/shoelace/sl/TabGroup.scala TabGroup.scala source code]]
  * 
  * [[https://shoelace.style/components/tab-group Shoelace TabGroup docs]]
  */
object TabGroup extends WebComponent("sl-tab-group") {

  @JSImport("@shoelace-style/shoelace/dist/components/tab-group/tab-group.js")
  @js.native object RawImport extends js.Object

  type Ref = TabGroupComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when a tab is shown. */
  lazy val onTabShow: EventProp[TabShowEvent] = eventProp("sl-tab-show")

  /** Emitted when a tab is hidden. */
  lazy val onTabHide: EventProp[TabHideEvent] = eventProp("sl-tab-hide")


  // -- Attributes --

  /** The placement of the tabs. */
  lazy val placement: CommonKeys.placement.type = CommonKeys.placement

  /**
    * When set to auto, navigating tabs with the arrow keys will instantly show the corresponding tab panel. When set to
    * manual, the tab will receive focus but will not show until the user presses spacebar or enter.
    */
  lazy val activation: HtmlAttr[String] = stringAttr("activation")

  /** Disables the scroll arrows that appear when tabs overflow. */
  lazy val noScrollControls: HtmlAttr[Boolean] = boolAttr("no-scroll-controls")


  // -- Props --


  // -- Slots --

  object slots {

    /** Used for grouping tab panels in the tab group. Must be `<sl-tab-panel>` elements. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** Used for grouping tabs in the tab group. Must be `<sl-tab>` elements. */
    lazy val nav: Slot = Slot("nav")
  }


  // -- CSS Vars --

  /** The color of the active tab indicator. */
  lazy val indicatorColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--indicator-color")

  /** The color of the indicator's track (the line that separates tabs from panels). */
  lazy val trackColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--track-color")

  /** The width of the indicator's track (the line that separates tabs from panels). */
  lazy val trackWidth: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--track-width")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The tab group's navigation container where tabs are slotted in. */
    lazy val nav: String = "nav"

    /** The container that wraps the tabs. */
    lazy val tabs: String = "tabs"

    /** The line that highlights the currently selected tab. */
    lazy val activeTabIndicator: String = "active-tab-indicator"

    /** The tab group's body where tab panels are slotted in. */
    lazy val body: String = "body"

    /** The previous/next scroll buttons that show when tabs are scrollable, an `<sl-icon-button>`. */
    lazy val scrollButton: String = "scroll-button"

    /** The starting scroll button. */
    lazy val scrollButtonStart: String = "scroll-button--start"

    /** The ending scroll button. */
    lazy val scrollButtonEnd: String = "scroll-button--end"

    /** The scroll button's exported `base` part. */
    lazy val scrollButton__base: String = "scroll-button__base"
  }


  // -- Element type -- 

  @js.native trait TabGroupComponent extends js.Object { this: dom.HTMLElement => 

    /** The placement of the tabs. */
    var placement: String

    /**
      * When set to auto, navigating tabs with the arrow keys will instantly show the corresponding tab panel. When set to
      * manual, the tab will receive focus but will not show until the user presses spacebar or enter.
      */
    var activation: String

    /** Disables the scroll arrows that appear when tabs overflow. */
    var noScrollControls: Boolean
  }
}
