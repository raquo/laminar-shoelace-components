package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/popup Shoelace Popup docs]] */
object Popup extends WebComponent("sl-popup") {

  @JSImport("@shoelace-style/shoelace/dist/components/popup/popup.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --

  /** Emitted when the popup is repositioned. This event can fire a lot, so avoid putting expensive operations in your listener or consider debouncing it. */
  lazy val onReposition: EventProp[dom.Event] = eventProp("sl-reposition")


  // -- Props --


  // -- Attributes --

  /**
    * Activates the positioning logic and shows the popup. When this attribute is removed, the positioning logic is torn
    * down and the popup will be hidden.
    */
  lazy val active: HtmlAttr[Boolean] = boolAttr("active")

  /**
    * The preferred placement of the popup. Note that the actual placement will vary as configured to keep the
    * panel inside of the viewport.
    */
  lazy val placement: CommonKeys.placement.type = CommonKeys.placement

  /**
    * Determines how the popup is positioned. The `absolute` strategy works well in most cases, but if overflow is
    * clipped, using a `fixed` position strategy can often workaround it.
    */
  lazy val strategy: HtmlAttr[String] = stringAttr("strategy")

  /** The distance in pixels from which to offset the panel away from its anchor. */
  lazy val distance: HtmlAttr[Int] = intAttr("distance")

  /** The distance in pixels from which to offset the panel along its anchor. */
  lazy val skidding: HtmlAttr[Int] = intAttr("skidding")

  /**
    * Attaches an arrow to the popup. The arrow's size and color can be customized using the `--arrow-size` and
    * `--arrow-color` custom properties. For additional customizations, you can also target the arrow using
    * `::part(arrow)` in your stylesheet.
    */
  lazy val arrow: HtmlAttr[Boolean] = boolAttr("arrow")

  /**
    * The placement of the arrow. The default is `anchor`, which will align the arrow as close to the center of the
    * anchor as possible, considering available space and `arrow-padding`. A value of `start`, `end`, or `center` will
    * align the arrow to the start, end, or center of the popover instead.
    */
  lazy val arrowPlacement: HtmlAttr[String] = stringAttr("arrow-placement")

  /**
    * The amount of padding between the arrow and the edges of the popup. If the popup has a border-radius, for example,
    * this will prevent it from overflowing the corners.
    */
  lazy val arrowPadding: HtmlAttr[Int] = intAttr("arrow-padding")

  /**
    * When set, placement of the popup will flip to the opposite site to keep it in view. You can use
    * `flipFallbackPlacements` to further configure how the fallback placement is determined.
    */
  lazy val flip: HtmlAttr[Boolean] = boolAttr("flip")

  /**
    * If the preferred placement doesn't fit, popup will be tested in these fallback placements until one fits. Must be a
    * string of any number of placements separated by a space, e.g. "top bottom left". If no placement fits, the flip
    * fallback strategy will be used instead.
    */
  lazy val flipFallbackPlacements: HtmlAttr[String] = stringAttr("flip-fallback-placements")

  /**
    * When neither the preferred placement nor the fallback placements fit, this value will be used to determine whether
    * the popup should be positioned using the best available fit based on available space or as it was initially
    * preferred.
    */
  lazy val flipFallbackStrategy: HtmlAttr[String] = stringAttr("flip-fallback-strategy")

  /** The amount of padding, in pixels, to exceed before the flip behavior will occur. */
  lazy val flipPadding: HtmlAttr[Int] = intAttr("flip-padding")

  /** Moves the popup along the axis to keep it in view when clipped. */
  lazy val shift: HtmlAttr[Boolean] = boolAttr("shift")

  /** The amount of padding, in pixels, to exceed before the shift behavior will occur. */
  lazy val shiftPadding: HtmlAttr[Int] = intAttr("shift-padding")

  /** When set, this will cause the popup to automatically resize itself to prevent it from overflowing. */
  lazy val autoSize: HtmlAttr[String] = stringAttr("auto-size")

  /** Syncs the popup's width or height to that of the anchor element. */
  lazy val sync: HtmlAttr[String] = stringAttr("sync")

  /** The amount of padding, in pixels, to exceed before the auto-size behavior will occur. */
  lazy val autoSizePadding: HtmlAttr[Int] = intAttr("auto-size-padding")


  // -- Slots --

  object slots {

    /** The popup's content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** The element the popup will be anchored to. If the anchor lives outside of the popup, you can use the `anchor` attribute or property instead. */
    lazy val anchor: Slot = Slot("anchor")
  }


  // -- CSS Vars --

  object cssVars {

    /** The size of the arrow. Note that an arrow won't be shown unless the `arrow` attribute is used. */
    lazy val arrowSize: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--arrow-size")

    /** The color of the arrow. */
    lazy val arrowColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--arrow-color")

    /** A read-only custom property that determines the amount of width the popup can be before overflowing. Useful for positioning child elements that need to overflow. This property is only available when using `auto-size`. */
    lazy val autoSizeAvailableWidth: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--auto-size-available-width")

    /** A read-only custom property that determines the amount of height the popup can be before overflowing. Useful for positioning child elements that need to overflow. This property is only available when using `auto-size`. */
    lazy val autoSizeAvailableHeight: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--auto-size-available-height")
  }


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The arrow's container. Avoid setting `top|bottom|left|right` properties, as these values are assigned dynamically as the popup moves. This is most useful for applying a background color to match the popup, and maybe a border or box shadow. */
    lazy val arrow: String = "arrow"

    /** The popup's container. Useful for setting a background color, box shadow, etc. */
    lazy val popup: String = "popup"
  }


}
