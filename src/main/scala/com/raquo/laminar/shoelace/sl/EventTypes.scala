package com.raquo.laminar.shoelace.sl

import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|

// This file is generated at compile-time by ShoelaceGenerator.scala

/** Common Shoelace event types */
object EventTypes {

  @js.native
  trait CustomEvent extends dom.Event


  @js.native
  trait CopyEvent extends CustomEvent {

    val value: String
  }

  @js.native
  trait ErrorEvent extends CustomEvent {

    val status: Int | Unit
  }

  @js.native
  trait HoverEvent extends CustomEvent {

    /** 'start' | 'move' | 'end' */
    val phase: String

    val value: Int
  }

  @js.native
  trait MutationEvent extends CustomEvent {

    val mutationList: js.Array[dom.MutationRecord]
  }

  @js.native
  trait RequestCloseEvent extends CustomEvent {

    /** 'close-button' | 'keyboard' | 'overlay' */
    val source: String
  }

  @js.native
  trait ResizeEvent extends CustomEvent {

    val entries: js.Array[dom.ResizeObserverEntry]
  }

  @js.native
  trait SelectEvent extends CustomEvent {

    val item: MenuItem.Ref
  }

  @js.native
  trait SelectionChangeEvent extends CustomEvent {

    val selection: js.Array[TreeItem.Ref]
  }

  @js.native
  trait SlideChangeEvent extends CustomEvent {

    val index: Int

    val slide: CarouselItem.Ref
  }

  @js.native
  trait TabHideEvent extends CustomEvent {

    val name: String
  }

  @js.native
  trait TabShowEvent extends CustomEvent {

    val name: String
  }
}
