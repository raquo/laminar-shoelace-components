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
  * A component for displaying animated GIFs and WEBPs that play and pause on interaction.
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/AnimatedImage.scala AnimatedImage.scala source code]]
  * 
  * [[https://shoelace.style/components/animated-image Shoelace AnimatedImage docs]]
  */
object AnimatedImage extends WebComponent("sl-animated-image") {

  @JSImport("@shoelace-style/shoelace/dist/components/animated-image/animated-image.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Self = AnimatedImage.type

  type Ref = AnimatedImageComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the image loads successfully. */
  lazy val onLoad: EventProp[dom.Event] = eventProp("sl-load")

  /** Emitted when the image fails to load. */
  lazy val onError: EventProp[ErrorEvent] = eventProp("sl-error")


  // -- Attributes --

  /** The path to the image to load. */
  lazy val src: HtmlAttr[String] = stringAttr("src")

  /** A description of the image used by assistive devices. */
  lazy val alt: HtmlAttr[String] = stringAttr("alt")

  /** Plays the animation. When this attribute is remove, the animation will pause. */
  lazy val play: HtmlAttr[Boolean] = boolAttr("play")


  // -- Props --


  // -- Slots --

  object slots {

    /** Optional play icon to use instead of the default. Works best with `<sl-icon>`. */
    lazy val playIcon: Slot = Slot("play-icon")

    /** Optional pause icon to use instead of the default. Works best with `<sl-icon>`. */
    lazy val pauseIcon: Slot = Slot("pause-icon")
  }


  // -- CSS Vars --

  /** The size of the icon box. */
  lazy val controlBoxSize: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--control-box-size")

  /** The size of the play/pause icons. */
  lazy val iconSize: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--icon-size")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** control-box - The container that surrounds the pause/play icons and provides their background. */
    lazy val controlBox: String = "control-box"
  }


  // -- Element type -- 

  @js.native trait AnimatedImageComponent extends js.Object { this: dom.HTMLElement => 

    val frozenFrame: String

    val isLoaded: Boolean

    /** The path to the image to load. */
    var src: String

    /** A description of the image used by assistive devices. */
    var alt: String

    /** Plays the animation. When this attribute is remove, the animation will pause. */
    var play: Boolean
  }
}
