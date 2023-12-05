package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.inputs.InputController
import com.raquo.laminar.keys.HtmlProp
import com.raquo.laminar.modifiers.{Binder, EventListener, KeyUpdater}
import org.scalajs.dom

trait ControlledInput { this: WebComponent =>

  /** Creates controlled input block.
    *
    * Works similarly to standard Laminar controlled inputs, except you need to
    * check what prop and event(s) a particular Web Component expects.
    *
    * For general info, see [[https://laminar.dev/documentation#controlled-inputs Controlled Inputs docs]]
    */
  def controlled[Ev <: dom.Event, V](
    updater: this.type => KeyUpdater[Element, HtmlProp[V, _], V],
    listener: this.type => EventListener[Ev, _]
  ): Binder[Element] = {
    InputController.controlled(listener(this), updater(this))
  }

}
