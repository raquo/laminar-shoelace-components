package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/tag Shoelace Tag docs]] */
object Tag extends WebComponent("sl-tag") {

  @JSImport("@shoelace-style/shoelace/dist/components/tag/tag.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --

  /** Emitted when the remove button is activated. */
  lazy val onRemove: EventProp[dom.Event] = eventProp("sl-remove")


  // -- Attributes --

  /** The tag's theme variant. */
  lazy val variant: CommonKeys.variant.type = CommonKeys.variant

  /** The tag's size. */
  lazy val size: CommonKeys.size.type = CommonKeys.size

  /** Draws a pill-style tag with rounded edges. */
  lazy val pill: HtmlAttr[Boolean] = boolAttr("pill")

  /** Makes the tag removable and shows a remove button. */
  lazy val removable: HtmlAttr[Boolean] = boolAttr("removable")


  // -- Props --


  // -- Slots --

  object slots {

    /** The tag's content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The tag's content. */
    lazy val content: String = "content"

    /** The tag's remove button, an `<sl-icon-button>`. */
    lazy val removeButton: String = "remove-button"

    /** The remove button's exported `base` part. */
    lazy val removeButton__base: String = "remove-button__base"
  }


  // -- Element type -- 

  @js.native trait RawComponent extends js.Object { this: dom.HTMLElement => 

    /** The tag's theme variant. */
    var variant: String

    /** The tag's size. */
    var size: String

    /** Draws a pill-style tag with rounded edges. */
    var pill: Boolean

    /** Makes the tag removable and shows a remove button. */
    var removable: Boolean
  }
}
