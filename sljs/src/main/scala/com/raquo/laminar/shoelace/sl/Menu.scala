package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp}
import com.raquo.laminar.shoelace.sl.EventTypes.*
import com.raquo.laminar.api.L
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/menu Shoelace Menu docs]] */
object Menu extends WebComponent("sl-menu") {

  @JSImport("@shoelace-style/shoelace/dist/components/menu/menu.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --

  /** Emitted when a menu item is selected. */
  lazy val onSelect: EventProp[SelectEvent] = eventProp("sl-select")


  // -- Attributes --


  // -- Props --


  // -- Slots --

  object slots {

    /** The menu's content, including menu items, menu labels, and dividers. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()
}
