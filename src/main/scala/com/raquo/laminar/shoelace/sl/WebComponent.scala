package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.api.Laminar
import com.raquo.laminar.keys.{EventProcessor, EventProp, HtmlProp}
import com.raquo.laminar.modifiers.Modifier
import com.raquo.laminar.nodes.ReactiveHtmlElement
import com.raquo.laminar.tags.CustomHtmlTag
import org.scalajs.dom

import scala.scalajs.js

/** Base "trait" for all web components. */
abstract class WebComponent(tagName: String) extends CommonTypes { this: Self =>
  
  type Self
  
  /** Override this with JSImport-ed object of the component.
    * The import must register the component's custom element in the DOM.
    */
  def RawImport: js.Object

  useImport(RawImport)

  type Ref <: dom.HTMLElement

  type Element = ReactiveHtmlElement[Ref]

  type ModFunction = Self => Modifier[Element]

  type ComponentMod = Modifier[Element] | ModFunction

  // Note: this is overriden for components that have controlled inputs – see `tagWithControlledInputs` 
  protected lazy val tag: CustomHtmlTag[Ref] = new CustomHtmlTag(tagName)

  protected def tagWithControlledInput[Ref <: dom.html.Element, A, Ev <: dom.Event](
    prop: HtmlProp[A, _],
    initial: A,
    eventProp: EventProp[Ev]
  ): CustomHtmlTag[Ref] = {
    CustomHtmlTag.withControlledInput(tagName, prop, initial, eventProp)
  }

  // Mark imported JS object as used, to prevent dead code elimination
  @inline protected def useImport(importObject: js.Any): Unit = ()

  /** Optional syntax for using built-in Laminar events: `_.on(onDblClick.preventDefault) --> ...` */
  def on[Ev <: dom.Event, V](ev: EventProcessor[Ev, V]): EventProcessor[Ev, V] = ev

  /** Instantiate this component using the specified modifiers.
    *
    * Modifiers can be the usual Laminar modifiers (e.g. onDblClick --> observer),
    * or they can be functions from this component to a modifier (e.g. _.onClick --> observer)
    *
    * Scala 2 does not support union types, so use the [[of]] method instead.
    *
    * IntelliJ is unable to provide autocompletion when using this method, so I suggest using [[of]] too.
    * Upvote https://youtrack.jetbrains.com/issue/SCL-21713/Method-accepting-a-union-of-types-that-includes-a-Function-type-problems-with-go-to-definition-type-hints-and-autocomplete-Scala
    */
  final def apply(mods: ComponentMod*): Element = {
    val el = tag()
    mods.foreach {
      case mod: Modifier[_ >: Element] =>
        mod(el)
      case modFn: Function[_ >: this.type, _ <: Modifier[Element]] =>
        modFn(this)(el)
    }
    el
  }

  /** Instantiate this component with the specified modifiers.
    *
    * To pass standard Laminar modifiers with this method,
    * use `_ => onDblClick --> observer`.
    *
    * Same as [[apply]], but only accepts scoped functions for modifiers.
    */
  final def of(mods: ModFunction*): Element = {
    val el = tag()
    mods.foreach(_(this)(el))
    el
  }

  given toL: Conversion[WebComponent, Laminar] with
    override def apply(x: WebComponent): Laminar =
      com.raquo.laminar.api.L

  /** Lets you set standard Laminar properties when using `of` method,
    * e.g. `sl.Button.of(_.L.attr := "value")`
    */
  def L: Laminar = com.raquo.laminar.api.L
}
