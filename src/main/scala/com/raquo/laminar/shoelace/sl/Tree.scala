package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr, StyleProp}
import com.raquo.laminar.shoelace.sl.EventTypes.*
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Trees allow you to display a hierarchical list of selectable [tree items](/components/tree-item). Items with children can be expanded and collapsed as desired by the user.
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/Tree.scala Tree.scala source code]]
  * 
  * [[https://shoelace.style/components/tree Shoelace Tree docs]]
  */
object Tree extends WebComponent("sl-tree") {

  @JSImport("@shoelace-style/shoelace/dist/components/tree/tree.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Self = Tree.type

  type Ref = TreeComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when a tree item is selected or deselected. */
  lazy val onSelectionChange: EventProp[SelectionChangeEvent] = eventProp("sl-selection-change")


  // -- Attributes --

  /**
    * The selection behavior of the tree. Single selection allows only one node to be selected at a time. Multiple
    * displays checkboxes and allows more than one node to be selected. Leaf allows only leaf nodes to be selected.
    */
  lazy val selection: HtmlAttr[String] = stringAttr("selection")


  // -- Props --


  // -- Slots --

  object slots {

    /** The default slot. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** The icon to show when the tree item is expanded. Works best with `<sl-icon>`. */
    lazy val expandIcon: Slot = Slot("expand-icon")

    /** The icon to show when the tree item is collapsed. Works best with `<sl-icon>`. */
    lazy val collapseIcon: Slot = Slot("collapse-icon")
  }


  // -- CSS Vars --

  /** The size of the indentation for nested items. */
  lazy val indentSize: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--indent-size")

  /** The color of the indentation line. */
  lazy val indentGuideColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--indent-guide-color")

  /** The amount of vertical spacing to leave between the top and bottom of the indentation line's starting position. */
  lazy val indentGuideOffset: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--indent-guide-offset")

  /** The style of the indentation line, e.g. solid, dotted, dashed. */
  lazy val indentGuideStyle: StyleProp[String] with s.Line = lineStyle("--indent-guide-style")

  /** The width of the indentation line. */
  lazy val indentGuideWidth: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--indent-guide-width")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait TreeComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * The selection behavior of the tree. Single selection allows only one node to be selected at a time. Multiple
      * displays checkboxes and allows more than one node to be selected. Leaf allows only leaf nodes to be selected.
      */
    var selection: String
  }
}
