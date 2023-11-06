package com.raquo.laminar.shoelace.sl

import com.raquo.airstream.core.Transaction
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.keys
import com.raquo.laminar.modifiers.KeySetter
import com.raquo.laminar.nodes.ReactiveHtmlElement
import com.raquo.laminar.tags.HtmlTag
import org.scalajs.dom

import scala.scalajs.js

/** Base "trait" for all web components. */
abstract class WebComponent(tagName: String) extends CommonTypes {

  /** Override this with JSImport-ed object of the component.
    * The import must register the component's custom element in the DOM.
    */
  def RawImport: js.Object

  use(RawImport)

  type Ref <: dom.HTMLElement

  type ModFunction = this.type => Mod[ReactiveHtmlElement[Ref]]

  type ComponentMod = ModFunction | Mod[ReactiveHtmlElement[Ref]]

  protected def tag: HtmlTag[Ref] = htmlTag(tagName)

  // Mark object as used, to prevent dead code elimination
  @inline protected def use(importObject: js.Object): Unit = ()

  /** Optional syntax for using built-in Laminar events: `_.on(onDblClick.preventDefault) --> ...` */
  def on[Ev <: dom.Event, V](ev: EventProcessor[Ev, V]): EventProcessor[Ev, V] = ev

  /** Instantiate this component using the specified modifiers.
    *
    * Modifiers can be the usual Laminar modifiers, or they can be functions from this component to a modifier. Allowing
    * these functions is very practical to access the reactive attributes of the component, with the `_.reactiveAttr`
    * syntax.
    *
    * Scala 2, use the `of` method. See https://github.com/sherpal/LaminarSAPUI5Bindings#remark-for-scala-213-users
    * IntelliJ users, consider using the `of` method. See https://youtrack.jetbrains.com/issue/SCL-21713/Method-accepting-a-union-of-types-that-includes-a-Function-type-problems-with-go-to-definition-type-hints-and-autocomplete-Scala
    */
  final def apply(mods: ComponentMod*): HtmlElement = {
    val el = tag()
    Transaction.onStart.shared {
      mods.foreach {
        case mod: Mod[_ >: ReactiveHtmlElement[Ref]] =>
          mod(el)
        case modFn: Function[_ >: this.type, _ <: ReactiveHtmlElement[Ref]] =>
          modFn(this)(el)
      }
    }
    el
  }

  /** Same as [[apply]], but accept only [[ModFunction]]s */
  final def of(mods: ModFunction*): HtmlElement = {
    val el = tag()
    Transaction.onStart.shared {
      mods.foreach(_(this)(el))
    }
    el
  }

}
