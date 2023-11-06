package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.shoelace.sl.EventTypes.*
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/rating Shoelace Rating docs]] */
object Rating extends WebComponent("sl-rating") {

  @JSImport("@shoelace-style/shoelace/dist/components/rating/rating.js")
  @js.native object RawImport extends js.Object

  type Ref = RatingComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the rating's value changes. */
  lazy val onChange: EventProp[dom.Event] = eventProp("sl-change")

  /** Emitted when the user hovers over a value. The `phase` property indicates when hovering starts, moves to a new value, or ends. The `value` property tells what the rating's value would be if the user were to commit to the hovered value. */
  lazy val onHover: EventProp[HoverEvent] = eventProp("sl-hover")


  // -- Attributes --

  /** A label that describes the rating to assistive devices. */
  lazy val label: HtmlAttr[String] = stringAttr("label")

  /** The current rating. */
  lazy val defaultValue: HtmlAttr[Int] = intAttr("value")

  /** The highest rating to show. */
  lazy val max: HtmlAttr[Int] = intAttr("max")

  /**
    * The precision at which the rating will increase and decrease. For example, to allow half-star ratings, set this
    * attribute to `0.5`.
    */
  lazy val precision: HtmlAttr[Int] = intAttr("precision")

  /** Makes the rating readonly. */
  lazy val readOnly: HtmlAttr[Boolean] = boolAttr("readonly")

  /** Disables the rating. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()


  // -- CSS Vars --

  object cssVars {

    /** The inactive color for symbols. */
    lazy val symbolColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--symbol-color")

    /** The active color for symbols. */
    lazy val symbolColorActive: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--symbol-color-active")

    /** The size of symbols. */
    lazy val symbolSize: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--symbol-size")

    /** The spacing to use around symbols. */
    lazy val symbolSpacing: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--symbol-spacing")
  }


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait RatingComponent extends js.Object { this: dom.HTMLElement => 

    /** A label that describes the rating to assistive devices. */
    var label: String

    /** The highest rating to show. */
    var max: Int

    /**
      * The precision at which the rating will increase and decrease. For example, to allow half-star ratings, set this
      * attribute to `0.5`.
      */
    var precision: Int

    /** Makes the rating readonly. */
    var readonly: Boolean

    /** Disables the rating. */
    var disabled: Boolean
  }
}
