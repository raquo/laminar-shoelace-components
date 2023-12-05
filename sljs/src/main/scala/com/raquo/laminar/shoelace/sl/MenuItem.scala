package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlProp, HtmlAttr, StyleProp}
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Menu items provide options for the user to pick from in a menu.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/sljs/src/main/scala/com/raquo/laminar/shoelace/sl/MenuItem.scala MenuItem.scala source code]]
  * 
  * [[https://shoelace.style/components/menu-item Shoelace MenuItem docs]]
  */
object MenuItem extends WebComponent("sl-menu-item") {

  @JSImport("@shoelace-style/shoelace/dist/components/menu-item/menu-item.js")
  @js.native object RawImport extends js.Object

  type Ref = MenuItemComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The type of menu item to render. To use `checked`, this value must be set to `checkbox`. */
  lazy val `type`: HtmlAttr[String] = stringAttr("type")

  lazy val typ: HtmlAttr[String] = `type`

  lazy val tpe: HtmlAttr[String] = `type`

  /** Draws the item in a checked state. */
  lazy val defaultChecked: HtmlAttr[Boolean] = boolAttr("checked")

  /** A unique value to store in the menu item. This can be used as a way to identify menu items when selected. */
  lazy val defaultValue: HtmlAttr[String] = stringAttr("value")

  /** Draws the menu item in a disabled state, preventing selection. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")


  // -- Props --

  /** Draws the item in a checked state. */
  lazy val checked: HtmlProp[Boolean, _] = L.checked

  /** A unique value to store in the menu item. This can be used as a way to identify menu items when selected. */
  lazy val value: HtmlProp[String, _] = L.value


  // -- Slots --

  object slots {

    /** The menu item's label. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** Used to prepend an icon or similar element to the menu item. */
    lazy val prefix: Slot = Slot("prefix")

    /** Used to append an icon or similar element to the menu item. */
    lazy val suffix: Slot = Slot("suffix")

    /** Used to denote a nested menu. */
    lazy val submenu: Slot = Slot("submenu")
  }


  // -- CSS Vars --

  /** The distance submenus shift to overlap the parent menu. */
  lazy val submenuOffset: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--submenu-offset")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The checked icon, which is only visible when the menu item is checked. */
    lazy val checkedIcon: String = "checked-icon"

    /** The prefix container. */
    lazy val prefix: String = "prefix"

    /** The menu item label. */
    lazy val label: String = "label"

    /** The suffix container. */
    lazy val suffix: String = "suffix"

    /** The submenu icon, visible only when the menu item has a submenu (not yet implemented). */
    lazy val submenuIcon: String = "submenu-icon"
  }


  // -- Element type -- 

  @js.native trait MenuItemComponent extends js.Object { this: dom.HTMLElement => 

    /** The type of menu item to render. To use `checked`, this value must be set to `checkbox`. */
    var `type`: String

    /** Draws the item in a checked state. */
    var checked: Boolean

    /** A unique value to store in the menu item. This can be used as a way to identify menu items when selected. */
    var value: String

    /** Draws the menu item in a disabled state, preventing selection. */
    var disabled: Boolean
  }
}
