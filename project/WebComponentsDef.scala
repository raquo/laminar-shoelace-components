case class WebComponentsDef(
  elements: List[WebComponentsDef.Element]
)

object WebComponentsDef {

  case class Element(
    tagName: String,
    scalaName: String,
    importPath: String, // e.g. "components/button/button.js"
    elementBaseType: String, // e.g. "HTMLButtonElement"
    description: List[String],
    docUrl: Option[String],
    events: List[Event],
    allJsProperties: List[Field],
    writableNonReflectedProperties: List[Field],
    attributes: List[Attribute],
    cssProperties: List[CssProperty],
    cssParts: List[CssPart],
    slots: List[Slot]
  )

  case class Event(
    description: List[String],
    domName: String,
    scalaName: String,
    customType: Option[CustomEventType]
  )

  case class Field(
    propName: String,
    propScalaName: String,
    attrName: Option[String],
    reflected: Boolean,
    readonly: Boolean,
    jsTypes: List[JsType],
    default: Option[String],
    description: List[String]
  )

  case class Attribute(
    attrName: String,
    scalaName: String,
    scalaAliases: List[String],
    jsTypes: List[JsType],
    default: Option[String],
    description: List[String]
  )

  case class CssProperty(
    description: List[String],
    cssName: String, // e.g. "--border-color"
    cssType: CssType,
    scalaName: String
  )

  case class CssPart(
    description: List[String],
    cssName: String,
    scalaName: String
  )

  case class Slot(
    description: List[String],
    domName: String,
    scalaName: String,
    isDefault: Boolean
  )

  sealed abstract class JsType

  /** Marks this JS type as valid input for HTML attributes */
  sealed trait JsAttributeInputType extends JsType

  case object JsStringType extends JsAttributeInputType

  case class JsStringConstantType(str: String) extends JsAttributeInputType {
    override def toString: String = s"""JsStringConstantType("${str}")"""
  }

  case object JsNumberType extends JsAttributeInputType

  case object JsBooleanType extends JsAttributeInputType

  case object JsUndefinedType extends JsType

  case class JsCustomType(str: String) extends JsType


  sealed abstract class CssType

  case object CssLengthType extends CssType

  case object CssColorType extends CssType

  case object CssNumberType extends CssType

  case object CssTimeType extends CssType

  case object CssLineType extends CssType // dotted, dashed, etc.


  case class CustomEventType(
    rawName: String,
    scalaName: String,
    fields: List[CustomEventTypeField]
  )

  case class CustomEventTypeField(
    domName: String,
    scalaName: String,
    jsTypes: List[JsType],
    description: List[String]
  )
}
