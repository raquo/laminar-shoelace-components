package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlProp, HtmlAttr}
import com.raquo.laminar.api.L.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/animation Shoelace Animation docs]] */
object Animation extends WebComponent("sl-animation") {

  @JSImport("@shoelace-style/shoelace/dist/components/animation/animation.js")
  @js.native object RawImport extends js.Object

  type Ref = dom.HTMLElement


  // -- Events --

  /** Emitted when the animation is canceled. */
  lazy val onCancel: EventProp[dom.Event] = eventProp("sl-cancel")

  /** Emitted when the animation finishes. */
  lazy val onFinish: EventProp[dom.Event] = eventProp("sl-finish")

  /** Emitted when the animation starts or restarts. */
  lazy val onStart: EventProp[dom.Event] = eventProp("sl-start")


  // -- Props --

  lazy val keyframes: HtmlPropOf[js.Array[js.Object]] = asIsProp("keyframes")

  lazy val currentTime: HtmlPropOf[Int] = intProp("currentTime")


  // -- Attributes --

  /** The name of the built-in animation to use. For custom animations, use the `keyframes` prop. */
  lazy val name: HtmlAttr[String] = stringAttr("name")

  /**
    * Plays the animation. When omitted, the animation will be paused. This attribute will be automatically removed when
    * the animation finishes or gets canceled.
    */
  lazy val play: HtmlAttr[Boolean] = boolAttr("play")

  /** The number of milliseconds to delay the start of the animation. */
  lazy val delay: HtmlAttr[Int] = intAttr("delay")

  /**
    * Determines the direction of playback as well as the behavior when reaching the end of an iteration.
    * [Learn more](https://developer.mozilla.org/en-US/docs/Web/CSS/animation-direction)
    */
  lazy val direction: HtmlAttr[String] = stringAttr("direction")

  /** The number of milliseconds each iteration of the animation takes to complete. */
  lazy val duration: HtmlAttr[Int] = intAttr("duration")

  /**
    * The easing function to use for the animation. This can be a Shoelace easing function or a custom easing function
    * such as `cubic-bezier(0, 1, .76, 1.14)`.
    */
  lazy val easing: HtmlAttr[String] = stringAttr("easing")

  /** The number of milliseconds to delay after the active period of an animation sequence. */
  lazy val endDelay: HtmlAttr[Int] = intAttr("end-delay")

  /** Sets how the animation applies styles to its target before and after its execution. */
  lazy val fill: HtmlAttr[String] = stringAttr("fill")

  /** The number of iterations to run before the animation completes. Defaults to `Infinity`, which loops. */
  lazy val iterations: HtmlAttr[Int] = intAttr("iterations")

  /** The offset at which to start the animation, usually between 0 (start) and 1 (end). */
  lazy val iterationStart: HtmlAttr[Int] = intAttr("iteration-start")

  /**
    * Sets the animation's playback rate. The default is `1`, which plays the animation at a normal speed. Setting this
    * to `2`, for example, will double the animation's speed. A negative value can be used to reverse the animation. This
    * value can be changed without causing the animation to restart.
    */
  lazy val playbackRate: HtmlAttr[Int] = intAttr("playback-rate")


  // -- Slots --

  object slots {

    /** The element to animate. Avoid slotting in more than one element, as subsequent ones will be ignored. To animate multiple elements, either wrap them in a single container or use multiple `<sl-animation>` elements. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --

  /** This component has no CSS vars / custom properties. */
  @inline def noCssVars: Unit = ()


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


}
