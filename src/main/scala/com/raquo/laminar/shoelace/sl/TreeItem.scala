package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{EventProp, HtmlAttr}
import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * A tree item serves as a hierarchical node that lives inside a [tree](/components/tree).
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/TreeItem.scala TreeItem.scala source code]]
  * 
  * [[https://shoelace.style/components/tree-item Shoelace TreeItem docs]]
  */
object TreeItem extends WebComponent("sl-tree-item") {

  @JSImport("@shoelace-style/shoelace/dist/components/tree-item/tree-item.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Ref = TreeItemComponent with dom.HTMLElement


  // -- Events --

  /** Emitted when the tree item expands. */
  lazy val onExpand: EventProp[dom.Event] = eventProp("sl-expand")

  /** Emitted after the tree item expands and all animations are complete. */
  lazy val onAfterExpand: EventProp[dom.Event] = eventProp("sl-after-expand")

  /** Emitted when the tree item collapses. */
  lazy val onCollapse: EventProp[dom.Event] = eventProp("sl-collapse")

  /** Emitted after the tree item collapses and all animations are complete. */
  lazy val onAfterCollapse: EventProp[dom.Event] = eventProp("sl-after-collapse")

  /** Emitted when the tree item's lazy state changes. */
  lazy val onLazyChange: EventProp[dom.Event] = eventProp("sl-lazy-change")

  /** Emitted when a lazy item is selected. Use this event to asynchronously load data and append items to the tree before expanding. After appending new items, remove the `lazy` attribute to remove the loading state and update the tree. */
  lazy val onLazyLoad: EventProp[dom.Event] = eventProp("sl-lazy-load")


  // -- Attributes --

  /** Expands the tree item. */
  lazy val expanded: HtmlAttr[Boolean] = boolAttr("expanded")

  /** Draws the tree item in a selected state. */
  lazy val defaultSelected: HtmlAttr[Boolean] = boolAttr("selected")

  /** Disables the tree item. */
  lazy val disabled: HtmlAttr[Boolean] = boolAttr("disabled")

  /** Enables lazy loading behavior. */
  lazy val `lazy`: HtmlAttr[Boolean] = boolAttr("lazy")


  // -- Props --


  // -- Slots --

  object slots {

    /** The default slot. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** The icon to show when the tree item is expanded. */
    lazy val expandIcon: Slot = Slot("expand-icon")

    /** The icon to show when the tree item is collapsed. */
    lazy val collapseIcon: Slot = Slot("collapse-icon")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The tree item's container. This element wraps everything except slotted tree item children. */
    lazy val item: String = "item"

    /** Applied when the tree item is disabled. */
    lazy val itemDisabled: String = "item--disabled"

    /** Applied when the tree item is expanded. */
    lazy val itemExpanded: String = "item--expanded"

    /** Applied when the selection is indeterminate. */
    lazy val itemIndeterminate: String = "item--indeterminate"

    /** Applied when the tree item is selected. */
    lazy val itemSelected: String = "item--selected"

    /** The tree item's indentation container. */
    lazy val indentation: String = "indentation"

    /** The container that wraps the tree item's expand button and spinner. */
    lazy val expandButton: String = "expand-button"

    /** The tree item's label. */
    lazy val label: String = "label"

    /** The container that wraps the tree item's nested children. */
    lazy val children: String = "children"

    /** The checkbox that shows when using multiselect. */
    lazy val checkbox: String = "checkbox"

    /** The checkbox's exported `base` part. */
    lazy val checkbox__base: String = "checkbox__base"

    /** The checkbox's exported `control` part. */
    lazy val checkbox__control: String = "checkbox__control"

    /** The checkbox's exported `control--checked` part. */
    lazy val checkbox__controlChecked: String = "checkbox__control--checked"

    /** The checkbox's exported `control--indeterminate` part. */
    lazy val checkbox__controlIndeterminate: String = "checkbox__control--indeterminate"

    /** The checkbox's exported `checked-icon` part. */
    lazy val checkbox__checkedIcon: String = "checkbox__checked-icon"

    /** The checkbox's exported `indeterminate-icon` part. */
    lazy val checkbox__indeterminateIcon: String = "checkbox__indeterminate-icon"

    /** The checkbox's exported `label` part. */
    lazy val checkbox__label: String = "checkbox__label"
  }


  // -- Element type -- 

  @js.native trait TreeItemComponent extends js.Object { this: dom.HTMLElement => 

    val indeterminate: Boolean

    val isLeaf: Boolean

    val loading: Boolean

    val selectable: Boolean

    /** Expands the tree item. */
    var expanded: Boolean

    /** Draws the tree item in a selected state. */
    var selected: Boolean

    /** Disables the tree item. */
    var disabled: Boolean

    /** Enables lazy loading behavior. */
    var `lazy`: Boolean
  }
}
