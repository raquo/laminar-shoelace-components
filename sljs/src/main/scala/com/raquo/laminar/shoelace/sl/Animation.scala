package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlProp, HtmlAttr}
import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Animate elements declaratively with nearly 100 baked-in presets, or roll your own with custom keyframes. Powered by the [Web Animations API](https://developer.mozilla.org/en-US/docs/Web/API/Web_Animations_API).
  * 
  * [[https://https://github.com/raquo/laminar-shoelace-components/blob/master/sljs/src/main/scala/com/raquo/laminar/shoelace/sl/Animation.scala Animation.scala source code]]
  * 
  * [[https://shoelace.style/components/animation Shoelace Animation docs]]
  */
object Animation extends WebComponent("sl-animation") {

  @JSImport("@shoelace-style/shoelace/dist/components/animation/animation.js")
  @js.native object RawImport extends js.Object

  type Ref = AnimationComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the animation is canceled. */
  lazy val onCancel: EventProp[dom.Event] = eventProp("sl-cancel")

  /** Emitted when the animation finishes. */
  lazy val onFinish: EventProp[dom.Event] = eventProp("sl-finish")

  /** Emitted when the animation starts or restarts. */
  lazy val onStart: EventProp[dom.Event] = eventProp("sl-start")


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


  // -- Props --

  /** The keyframes to use for the animation. If this is set, `name` will be ignored. */
  lazy val keyframes: HtmlProp[js.Array[js.Object], _] = asIsProp("keyframes")

  /** Gets and sets the current animation time. */
  lazy val currentTime: HtmlProp[Int, _] = intProp("currentTime")


  // -- Slots --

  object slots {

    /** The element to animate. Avoid slotting in more than one element, as subsequent ones will be ignored. To animate multiple elements, either wrap them in a single container or use multiple `<sl-animation>` elements. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** This component has no CSS parts. */
  @inline def noCssParts: Unit = ()


  // -- Element type -- 

  @js.native trait AnimationComponent extends js.Object { this: dom.HTMLElement => 

    /** The name of the built-in animation to use. For custom animations, use the `keyframes` prop. */
    var name: String

    /**
      * Plays the animation. When omitted, the animation will be paused. This attribute will be automatically removed when
      * the animation finishes or gets canceled.
      */
    var play: Boolean

    /** The number of milliseconds to delay the start of the animation. */
    var delay: Int

    /**
      * Determines the direction of playback as well as the behavior when reaching the end of an iteration.
      * [Learn more](https://developer.mozilla.org/en-US/docs/Web/CSS/animation-direction)
      */
    var direction: String

    /** The number of milliseconds each iteration of the animation takes to complete. */
    var duration: Int

    /**
      * The easing function to use for the animation. This can be a Shoelace easing function or a custom easing function
      * such as `cubic-bezier(0, 1, .76, 1.14)`.
      */
    var easing: String

    /** The number of milliseconds to delay after the active period of an animation sequence. */
    var endDelay: Int

    /** Sets how the animation applies styles to its target before and after its execution. */
    var fill: String

    /** The number of iterations to run before the animation completes. Defaults to `Infinity`, which loops. */
    var iterations: Int

    /** The offset at which to start the animation, usually between 0 (start) and 1 (end). */
    var iterationStart: Int

    /** The keyframes to use for the animation. If this is set, `name` will be ignored. */
    var keyframes: js.Array[js.Object] | Unit

    /**
      * Sets the animation's playback rate. The default is `1`, which plays the animation at a normal speed. Setting this
      * to `2`, for example, will double the animation's speed. A negative value can be used to reverse the animation. This
      * value can be changed without causing the animation to restart.
      */
    var playbackRate: Int

    /** Gets and sets the current animation time. */
    var currentTime: Int
  }
}
