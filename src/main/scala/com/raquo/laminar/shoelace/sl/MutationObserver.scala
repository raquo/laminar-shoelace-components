package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.shoelace.sl.EventTypes.*
import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * The Mutation Observer component offers a thin, declarative interface to the [`MutationObserver API`](https://developer.mozilla.org/en-US/docs/Web/API/MutationObserver).
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/MutationObserver.scala MutationObserver.scala source code]]
  * 
  * [[https://shoelace.style/components/mutation-observer Shoelace MutationObserver docs]]
  */
object MutationObserver extends WebComponent("sl-mutation-observer") {

  @JSImport("@shoelace-style/shoelace/dist/components/mutation-observer/mutation-observer.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Ref = MutationObserverComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when a mutation occurs. */
  lazy val onMutation: EventProp[MutationEvent] = eventProp("sl-mutation")


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


  // -- Props --


  // -- Slots --

  object slots {

    /** The content to watch for mutations. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait MutationObserverComponent extends js.Object { this: dom.HTMLElement => 

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
