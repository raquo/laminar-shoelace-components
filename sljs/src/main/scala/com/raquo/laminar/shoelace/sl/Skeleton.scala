package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr, StyleProp}
import com.raquo.laminar.api.L
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/** [[https://shoelace.style/components/skeleton Shoelace Skeleton docs]] */
object Skeleton extends WebComponent("sl-skeleton") {

  @JSImport("@shoelace-style/shoelace/dist/components/skeleton/skeleton.js")
  @js.native object RawImport extends js.Object

  type Ref = SkeletonComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /** Determines which effect the skeleton will use. */
  lazy val effect: HtmlAttr[String] = stringAttr("effect")


  // -- Props --


  // -- Slots --

  /** This component has no slots - don't give it any children. */
  @inline def noSlots: Unit = ()


  // -- CSS Vars --

  /** The skeleton's border radius. */
  lazy val borderRadius: StyleProp[String] with u.Length[DSP, Int] = lengthStyle("--border-radius")

  /** The color of the skeleton. */
  lazy val color: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--color")

  /** The sheen color when the skeleton is in its loading state. */
  lazy val sheenColor: StyleProp[String] with u.Color[SS, DSP] = colorStyle("--sheen-color")


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The skeleton's indicator which is responsible for its color and animation. */
    lazy val indicator: String = "indicator"
  }


  // -- Element type -- 

  @js.native trait SkeletonComponent extends js.Object { this: dom.HTMLElement => 

    /** Determines which effect the skeleton will use. */
    var effect: String
  }
}
