package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.api.L
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.defs.styles.{traits as s, units as u}
import com.raquo.laminar.keys
import com.raquo.laminar.keys.DerivedStyleProp
import com.raquo.laminar.modifiers.SimpleKeySetter
import com.raquo.laminar.modifiers.SimpleKeySetter.StyleSetter
import org.scalajs.dom
import scala.scalajs.js

trait CommonTypes {

  // #TODO[API] I should make use of Laminar helpers like lengthAutoStyle in StyleProps.scala,
  //  but they're defined together with the listings in the same traits, and I don't want
  //  to expose all those props. Split them out. Need minor breaking changes in Laminar.

  protected type DSP[V] = DerivedStyleProp[V]

  protected type SS = StyleSetter[String, String]

  //// #TODO[Perf] I'm not convinced that these cache maps actually have a net benefit.
  ////  - I don't really think that we need reference equality among keys on different components
  ////  - We still refer to attrs as `lazy val`, this doesn't help with that
  ////  - Whether we save any RAM or not depends on which attrs on which components you use
  //
  //private val boolAttrs = js.Dictionary[HtmlAttr[Boolean]]()
  //
  //private val intAttrs = js.Dictionary[HtmlAttr[Int]]()
  //
  //private val stringAttrs = js.Dictionary[HtmlAttr[String]]()

  protected def eventProp[Ev <: dom.Event](name: String): EventProp[Ev] = L.eventProp(name)

  // #nc what about reflected props?
  
  protected def stringProp(name: String): HtmlProp[String] = L.htmlProp(name, None, Codec.stringAsIs)

  protected def intProp(name: String): HtmlProp[Int] = L.htmlProp(name, None, Codec.intAsIs)

  protected def doubleProp(name: String): HtmlProp[Double] = L.htmlProp(name, None, Codec.doubleAsIs)

  protected def boolProp(name: String): HtmlProp[Boolean] = L.htmlProp(name, None, Codec.booleanAsIs)

  protected def asIsProp[V](name: String): HtmlProp[V] = L.htmlProp(name, None, Codec.asIsCodec[V])

  protected def boolAttr(name: String): HtmlAttr[Boolean] = {
    L.htmlAttr(name, Codec.booleanAsAttrPresence)
  }

  protected def intAttr(name: String): HtmlAttr[Int] = {
    L.htmlAttr(name, Codec.intAsString)
  }

  protected def stringAttr(name: String): HtmlAttr[String] = {
    //stringAttrs.getOrElseUpdate(name, L.htmlAttr(name, StringAsIsCodec))
    L.htmlAttr(name, Codec.stringAsIs)
  }

  protected def lengthStyle(name: String): StyleProp[String] with u.Length[DSP] = {
    new StyleProp[String](name) with u.Length[DSP]
  }

  protected def colorStyle(name: String): StyleProp[String] with s.Color with u.Color[SS] = {
    new StyleProp[String](name) with s.Color with u.Color[SS]
  }

  protected def timeStyle(key: String): StyleProp[String] with u.Time[DSP] = {
    new StyleProp[String](key) with u.Time[DSP]
  }

  protected def lineStyle(key: String): StyleProp[String] with s.Line = {
    new StyleProp[String](key) with s.Line
  }

  protected def doubleStyle(key: String): StyleProp[Double] = {
    new StyleProp[Double](key)
  }

  protected def intStyle(key: String): StyleProp[Int] = {
    new StyleProp[Int](key)
  }
}
