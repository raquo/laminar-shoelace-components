package com.raquo.laminar.shoelace.sl

import com.raquo.laminar.keys.{HtmlAttr}
import com.raquo.laminar.api.L
import com.raquo.laminar.nodes.Slot
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.|
import scala.scalajs.js.annotation.JSImport

// This file is generated at compile-time by ShoelaceGenerator.scala

/**
  * Breadcrumb Items are used inside [breadcrumbs](/components/breadcrumb) to represent different links.
  * 
  * [[https://github.com/raquo/laminar-shoelace-components/blob/master/src/main/scala/com/raquo/laminar/shoelace/sl/BreadcrumbItem.scala BreadcrumbItem.scala source code]]
  * 
  * [[https://shoelace.style/components/breadcrumb-item Shoelace BreadcrumbItem docs]]
  */
object BreadcrumbItem extends WebComponent("sl-breadcrumb-item") {

  @JSImport("@shoelace-style/shoelace/dist/components/breadcrumb-item/breadcrumb-item.js", JSImport.Namespace)
  @js.native object RawImport extends js.Object

  type Self = BreadcrumbItem.type

  type Ref = BreadcrumbItemComponent with dom.HTMLElement


  // -- Events --


  // -- Attributes --

  /**
    * Optional URL to direct the user to when the breadcrumb item is activated. When set, a link will be rendered
    * internally. When unset, a button will be rendered instead.
    */
  lazy val href: HtmlAttr[String] = stringAttr("href")

  /** Tells the browser where to open the link. Only used when `href` is set. */
  lazy val target: CommonKeys.target.type = CommonKeys.target

  /** The `rel` attribute to use on the link. Only used when `href` is set. */
  lazy val rel: HtmlAttr[String] = stringAttr("rel")


  // -- Props --


  // -- Slots --

  object slots {

    /** The breadcrumb item's label. Note: You can just say `_ => element` instead of `_.slots.default(element)` */
    lazy val default: Slot = Slot("")

    /** An optional prefix, usually an icon or icon button. */
    lazy val prefix: Slot = Slot("prefix")

    /** An optional suffix, usually an icon or icon button. */
    lazy val suffix: Slot = Slot("suffix")

    /** The separator to use for the breadcrumb item. This will only change the separator for this item. If you want to change it for all items in the group, set the separator on `<sl-breadcrumb>` instead. */
    lazy val separator: Slot = Slot("separator")
  }


  // -- CSS Vars --


  // -- CSS Parts --

  /** For documentation only. You need to style these from a CSS stylesheet. */
  object cssParts {

    /** The component's base wrapper. */
    lazy val base: String = "base"

    /** The breadcrumb item's label. */
    lazy val label: String = "label"

    /** The container that wraps the prefix. */
    lazy val prefix: String = "prefix"

    /** The container that wraps the suffix. */
    lazy val suffix: String = "suffix"

    /** The container that wraps the separator. */
    lazy val separator: String = "separator"
  }


  // -- Element type -- 

  @js.native trait BreadcrumbItemComponent extends js.Object { this: dom.HTMLElement => 

    /**
      * Optional URL to direct the user to when the breadcrumb item is activated. When set, a link will be rendered
      * internally. When unset, a button will be rendered instead.
      */
    var href: String | Unit

    /** Tells the browser where to open the link. Only used when `href` is set. */
    var target: String | Unit

    /** The `rel` attribute to use on the link. Only used when `href` is set. */
    var rel: String
  }
}
