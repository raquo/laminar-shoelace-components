package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{StyleProp}
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Cards can be used to group related subjects in a container.
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/Card.scala Card.scala source code]]
  * 
  * [[https://shoelace.style/components/card Shoelace Card docs]]
  */
object Card extends WebComponent("sl-card") {

  @JSImport("@shoelace-style/shoelace/dist/components/card/card.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --


  // -- Attributes --


  // -- Props --


  // -- Slots --

  object slots {

    /** The card's main content. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** An optional header for the card. */
    lazy val header: Slot = Slot("header")

    /** An optional footer for the card. */
    lazy val footer: Slot = Slot("footer")

    /** An optional image to render at the start of the card. */
    lazy val image: Slot = Slot("image")
  }


  // -- CSS Vars --

  /** The card's border color, including borders that occur inside the card. */
  lazy val borderColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--border-color")

  /** The border radius for the card's edges. */
  lazy val borderRadius: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--border-radius")

  /** The width of the card's borders. */
  lazy val borderWidth: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--border-width")

  /** The padding to use for the card's sections. */
  lazy val padding: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--padding")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The container that wraps the card's image. */
    lazy val image: String = "image"

    /** The container that wraps the card's header. */
    lazy val header: String = "header"

    /** The container that wraps the card's main content. */
    lazy val body: String = "body"

    /** The container that wraps the card's footer. */
    lazy val footer: String = "footer"
  }
}
