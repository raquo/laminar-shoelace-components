package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr, StyleProp}
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Tab panels are used inside [tab groups](/components/tab-group) to display tabbed content.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/TabPanel.scala TabPanel.scala source code]]
  * 
  * [[https://shoelace.style/components/tab-panel Shoelace TabPanel docs]]
  */
object TabPanel extends WebComponent("sl-tab-panel") {

  @JSImport("@shoelace-style/shoelace/dist/components/tab-panel/tab-panel.js")
  @js.native object RawImport extends js.Object

  type Ref = TabPanelComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** The tab panel's name. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /** When true, the tab panel will be shown. */
  lazy val active: HtmlAttr[Boolean] = boolAttr("active")


  // -- Props --


  // -- Slots --

  object slots {

    /** The tab panel's content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** The tab panel's padding. */
  lazy val padding: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--padding")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"
  }


  // -- Element type -- 

  @js.native trait TabPanelComponent extends js.Object { this: dom.HTMLElement => 

    /** The tab panel's name. */
    var name: String

    /** When true, the tab panel will be shown. */
    var active: Boolean
  }
}
