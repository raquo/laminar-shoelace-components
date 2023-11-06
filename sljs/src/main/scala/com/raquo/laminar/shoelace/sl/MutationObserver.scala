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

/** [[https://shoelace.style/components/mutation-observer Shoelace MutationObserver docs]] */
object MutationObserver extends WebComponent("sl-mutation-observer") {

  @JSImport("@shoelace-style/shoelace/dist/components/mutation-observer/mutation-observer.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement with RawComponent


  // -- Events --

  /** Emitted when a mutation occurs. */
  lazy val onMutation: EventProp[MutationEvent] = eventProp("sl-mutation")


  // -- Props --


  // -- Attributes --

  /**
    * Watches for changes to attributes. To watch only specific attributes, separate them by a space, e.g.
    * `attr="class id title"`. To watch all attributes, use `*`.
    */
  lazy val attr: HtmlAttr[String] = stringAttr("attr")

  /** Indicates whether or not the attribute's previous value should be recorded when monitoring changes. */
  lazy val attrOldValue: HtmlAttr[Boolean] = boolAttr("attr-old-value")

  /** Watches for changes to the character data contained within the node. */
  lazy val charData: HtmlAttr[Boolean] = boolAttr("char-data")

  /** Indicates whether or not the previous value of the node's text should be recorded. */
  lazy val charDataOldValue: HtmlAttr[Boolean] = boolAttr("char-data-old-value")

  /** Watches for the addition or removal of new child nodes. */
  lazy val childList: HtmlAttr[Boolean] = boolAttr("child-list")

  /** Disables the observer. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Slots --

  object slots {

    /** The content to watch for mutations. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait RawComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * Watches for changes to attributes. To watch only specific attributes, separate them by a space, e.g.
      * `attr="class id title"`. To watch all attributes, use `*`.
      */
    var attr: String

    /** Indicates whether or not the attribute's previous value should be recorded when monitoring changes. */
    var attrOldValue: Boolean

    /** Watches for changes to the character data contained within the node. */
    var charData: Boolean

    /** Indicates whether or not the previous value of the node's text should be recorded. */
    var charDataOldValue: Boolean

    /** Watches for the addition or removal of new child nodes. */
    var childList: Boolean

    /** Disables the observer. */
    var disabled: Boolean
  }
}
