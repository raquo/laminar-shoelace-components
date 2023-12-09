package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr, StyleProp}
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Split panels display two adjacent panels, allowing the user to reposition them.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/SplitPanel.scala SplitPanel.scala source code]]
  * 
  * [[https://shoelace.style/components/split-panel Shoelace SplitPanel docs]]
  */
object SplitPanel extends WebComponent("sl-split-panel") {

  @JSImport("@shoelace-style/shoelace/dist/components/split-panel/split-panel.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Ref = SplitPanelComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the divider's position changes. */
  lazy val onReposition: EventProp[dom.Event] = eventProp("sl-reposition")


  // -- Attributes --

  /**
    * The current position of the divider from the primary panel's edge as a percentage 0-100. Defaults to 50% of the
    * container's initial size.
    */
  lazy val position: HtmlAttr[Int] = intAttr("position")

  /** The current position of the divider from the primary panel's edge in pixels. */
  lazy val positionInPixels: HtmlAttr[Int] = intAttr("position-in-pixels")

  /** Draws the split panel in a vertical orientation with the start and end panels stacked. */
  lazy val vertical: HtmlAttr[Boolean] = boolAttr("vertical")

  /** Disables resizing. Note that the position may still change as a result of resizing the host element. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /**
    * If no primary panel is designated, both panels will resize proportionally when the host element is resized. If a
    * primary panel is designated, it will maintain its size and the other panel will grow or shrink as needed when the
    * host element is resized.
    */
  lazy val primary: HtmlAttr[String] = stringAttr("primary")

  /**
    * One or more space-separated values at which the divider should snap. Values can be in pixels or percentages, e.g.
    * `"100px 50%"`.
    */
  lazy val snap: HtmlAttr[String] = stringAttr("snap")

  /** How close the divider must be to a snap point until snapping occurs. */
  lazy val snapThreshold: HtmlAttr[Int] = intAttr("snap-threshold")


  // -- Props --


  // -- Slots --

  object slots {

    /** Content to place in the start panel. */
    lazy val start: Slot = Slot("start")

    /** Content to place in the end panel. */
    lazy val end: Slot = Slot("end")

    /** The divider. Useful for slotting in a custom icon that renders as a handle. */
    lazy val divider: Slot = Slot("divider")
  }


  // -- CSS Vars --

  /** The width of the visible divider. */
  lazy val dividerWidth: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--divider-width")

  /** The invisible region around the divider where dragging can occur. This is usually wider than the divider to facilitate easier dragging. */
  lazy val dividerHitArea: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--divider-hit-area")

  /** The minimum allowed size of the primary panel. */
  lazy val min: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--min")

  /** The maximum allowed size of the primary panel. */
  lazy val max: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--max")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The start panel. */
    lazy val start: String = "start"

    /** The end panel. */
    lazy val end: String = "end"

    /** Targets both the start and end panels. */
    lazy val panel: String = "panel"

    /** The divider that separates the start and end panels. */
    lazy val divider: String = "divider"
  }


  // -- Element type -- 

  @js.native trait SplitPanelComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * The current position of the divider from the primary panel's edge as a percentage 0-100. Defaults to 50% of the
      * container's initial size.
      */
    var position: Int

    /** The current position of the divider from the primary panel's edge in pixels. */
    var positionInPixels: Int

    /** Draws the split panel in a vertical orientation with the start and end panels stacked. */
    var vertical: Boolean

    /** Disables resizing. Note that the position may still change as a result of resizing the host element. */
    var disabled: Boolean

    /**
      * If no primary panel is designated, both panels will resize proportionally when the host element is resized. If a
      * primary panel is designated, it will maintain its size and the other panel will grow or shrink as needed when the
      * host element is resized.
      */
    var primary: String | Unit

    /**
      * One or more space-separated values at which the divider should snap. Values can be in pixels or percentages, e.g.
      * `"100px 50%"`.
      */
    var snap: String | Unit

    /** How close the divider must be to a snap point until snapping occurs. */
    var snapThreshold: Int
  }
}
