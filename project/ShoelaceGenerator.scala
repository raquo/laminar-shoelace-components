import WebComponentsDef.{CustomEventType, JsUndefinedType}
import com.raquo.domtypes.codegen.{CodeFormatting, DefType}
import com.raquo.domtypes.codegen.generators.SourceGenerator
import com.raquo.domtypes.defs.attrs.HtmlAttrDefs
import com.raquo.domtypes.defs.props.PropDefs
import com.raquo.domtypes.defs.reflectedAttrs.ReflectedHtmlAttrDefs
import upickle.default.*

import scala.collection.mutable
import java.nio.file.NoSuchFileException
import java.io.{File, FileOutputStream, PrintStream}
import java.nio.file.{Files, NoSuchFileException, Path}

case class ShoelaceGenerator(
  customElementsJsonPath: String,
  baseOutputDirectoryPath: String,
  baseOutputPackagePath: String,
  format: CodeFormatting = CodeFormatting(),
) extends SourceGenerator(format) {

  /** Overwrite this with directory name if you ant to output components in a subdirectory */
  lazy val componentsPackageName: String = ""

  lazy val componentsPackagePath: String = List(baseOutputPackagePath, componentsPackageName).filter(_.nonEmpty).mkString(".")

  /** Package path of EventTypes file */
  lazy val eventTypesPackagePath: String = baseOutputPackagePath

  lazy val eventTypesObjectName: String = "EventTypes"

  /** Package path of CommonTypes, CommonKeys, WebComponent, etc. files */
  lazy val helpersPackagePath: String = baseOutputPackagePath

  lazy val baseCustomEventType: String = "CustomEvent"

  lazy val baseDomEventType: String = "Event"

  /** If true, we'll import scala.scalajs.js.| - this is needed to support Scala 2. */
  lazy val useScalaJsUnionType: Boolean = true

  val Def: WebComponentsDef.type = WebComponentsDef

  private val manifest: CustomElementsManifest = {
    try {
      val fileContent = Files.readString(Path.of(customElementsJsonPath))
      read[CustomElementsManifest](fileContent)
    } catch {
      case err: NoSuchFileException =>
        throw new Exception(s"NoSuchFileException: ${err.getMessage} file not found. Make sure the path is correct. Make sure to npm install JS dependencies in the ./js folder.")
    }
  }

  private val st = ShoelaceTranslator(
    manifest = manifest,
    uiLibPropDefs = PropDefs.defs,
    uiLibAttrDefs = HtmlAttrDefs.defs,
    uiLibReflectedAttrDefs = ReflectedHtmlAttrDefs.defs,
    forceScalaAttrNames = List(
      "autocorrect" -> "autoCorrect"
    )
  )

  private val commonStringAttrs = List(
    "size", "target", "autocapitalize", "variant", "placement", "inputmode"
  )

  st.components.elements.foreach { el =>
    //pprint.pprintln(el.copy(cssParts = Nil, cssProperties = Nil, slots = Nil)) // More compact printing
  }

  def generate(): Unit = {
    println(">>>>")
    println(">>>>")
    println(">>>>")
    val elements = st.components.elements

    {
      printEventTypesFile(
        //filePackagePath = eventTypesPackagePath,
        //componentsPackagePath = componentsPackagePath,
        eventTypes = st.customEventTypes,
        //objectName = eventTypesObjectName,
        //baseCustomEventType = baseCustomEventType,
        //baseDomEventType = baseDomEventType
      )
      val output = getOutput()

      writeToFile(
        packagePath = eventTypesPackagePath,
        fileName = eventTypesObjectName + ".scala",
        fileContent = output
      )
    }

    elements.foreach { el =>
      if (el.writableNonReflectedProperties.nonEmpty) {
        println(el.tagName)
        println(el.writableNonReflectedProperties.map(_.propName).mkString("  > ", ", ", ""))
      }
    }

    elements.foreach { el =>
      //println("> " + el.tagName)
      printElementFile(
        //filePackagePath = componentsPackagePath,
        //eventTypesPackagePath = eventTypesPackagePath,
        //eventTypesObjectName = eventTypesObjectName,
        element = el
      )
      val output = getOutput()
      if (el.tagName == "sl-animation") {
        println(output)
      }
      //println(output)
      //el.writableProperties.foreach { p =>
      //  println("    - " + p.propName + "   " + p.jsTypes.mkString(" | "))
      //}
      writeToFile(
        packagePath = componentsPackagePath,
        fileName = el.scalaName + ".scala",
        fileContent = output
      )
    }

    //printAttrUsageAnalysis(elements)

    //val el = .find(_.tagName == "sl-input").get
    //pprint.pprintln(el)
    //println("---")
    //println("---")
    //println("---")

  }

  def printEventTypesFile(
    //filePackagePath: String,
    //componentsPackagePath: String,
    eventTypes: List[CustomEventType],
    //objectName: String,
    //baseCustomEventType: String,
    //baseDomEventType: String
  ): Unit = {
    line(s"package ${eventTypesPackagePath}")
    line()
    if (componentsPackagePath != eventTypesPackagePath) {
      line(s"import ${componentsPackagePath}.*")
    }
    line("import org.scalajs.dom")
    line()
    line("import scala.scalajs.js")
    if (useScalaJsUnionType) {
      line("import scala.scalajs.js.|")
    }
    line()
    line("// This file is generated at compile-time by ShoelaceGenerator.scala")
    line()
    //val objCommentLines = element.description ++ element.docUrl.map(url => s"[[$url Shoelace ${element.scalaName} docs]]").toList
    blockCommentLines(List("Common Shoelace event types"))
    enter(s"object ${eventTypesObjectName} {", "}") {
      line()
      line("@js.native")
      line(s"trait ${baseCustomEventType} extends dom.${baseDomEventType}")
      line()
      eventTypes.foreach { et =>
        line()
        line("@js.native")
        enter(s"trait ${et.scalaName} extends ${baseCustomEventType} {", "}") {
          et.fields.foreach { field =>
            val scalaTypeStr = st.scalaPropOutputType(s"prop `${field.domName}` in event type `${et.scalaName}`", field.jsTypes)
            line()
            blockCommentLines(field.description)
            line(s"val ${field.scalaName}: ${scalaTypeStr}")
          }
        }
        et.scalaName
      }
    }
  }

  def printElementFile(
    //filePackagePath: String,
    //eventTypesPackagePath: String,
    //eventTypesObjectName: String,
    element: Def.Element
  ): Unit = {
    val customEventTypes = element.events.flatMap(_.customType)

    line(s"package ${componentsPackagePath}")
    line()
    val laminarKeyTypes = List(
      if (element.events.nonEmpty) "EventProp" else "",
      if (element.writableNonReflectedProperties.nonEmpty) "HtmlProp" else "",
      if (element.attributes.nonEmpty) "HtmlAttr" else "",
    ).filter(_.nonEmpty)
    whenNonEmpty(laminarKeyTypes) { _types =>
      line(s"import com.raquo.laminar.keys.${_types.mkString("{", ", ", "}")}")
    }
    //line("import com.raquo.utils.JSImportSideEffect")
    if (customEventTypes.nonEmpty) {
      line(s"import ${eventTypesPackagePath}.${eventTypesObjectName}.*")
    }
    if (eventTypesPackagePath != componentsPackagePath) {
      line(s"import ${helpersPackagePath}.{CommonKeys, WebComponent}")
      if (element.slots.nonEmpty) {
        line(s"import ${baseOutputPackagePath}.Slot")
      }
    }
    line("import com.raquo.laminar.api.L.*")
    line("import com.raquo.laminar.defs.styles.{traits as s, units as u}")
    line("import org.scalajs.dom")
    line()
    line("import scala.scalajs.js")
    if (useScalaJsUnionType) {
      line("import scala.scalajs.js.|")
    }
    line("import scala.scalajs.js.annotation.JSImport")
    line()
    line("// This file is generated at compile-time by ShoelaceGenerator.scala")
    line()
    val objCommentLines = element.description ++ element.docUrl.map(url => s"[[$url Shoelace ${element.scalaName} docs]]").toList
    blockCommentLines(objCommentLines)
    enter(s"object ${element.scalaName} extends WebComponent(${repr(element.tagName)}) {", "}") {
      line()
      line(s"@JSImport(${repr(element.importPath)})")
      line("@js.native object RawImport extends js.Object")

      val elementBaseType = "dom." + st.elementBaseType(element.tagName)
      val showRawComponent = element.allJsProperties.nonEmpty
      if (showRawComponent) {
        line()
        line(s"type Ref = ${elementBaseType} with RawComponent")
      } else {
        line()
        line(s"type Ref = dom.${st.elementBaseType(element.tagName)}")
      }

      {
        line()
        line()
        line("// -- Events --")
        element.events.foreach { event =>
          val customEventTypeDef = event.customType
          val eventType = customEventTypeDef.map(_.scalaName).getOrElse(st.baseEventType)
          line()
          blockCommentLines(event.description)
          line(s"lazy val ${event.scalaName}: EventProp[${eventType}] = eventProp(${repr(event.domName)})")
        }
      }

      {
        line()
        line()
        line("// -- Attributes --")
        element.attributes.foreach { attr =>
          line()
          val scalaTypeStr = st.scalaAttrInputTypeStr(attr, element.tagName)
          blockCommentLines(attr.description)
          if (commonStringAttrs.contains(attr.attrName) && attr.jsTypes.forall {
            case Def.JsStringType | Def.JsStringConstantType(_) | Def.JsUndefinedType => true
            case _ => false
          }) {
            line(s"lazy val ${attr.scalaName}: CommonKeys.${attr.scalaName}.type = CommonKeys.${attr.scalaName}")
          } else {
            line(s"lazy val ${attr.scalaName}: HtmlAttr[${scalaTypeStr}] = ${attrImplName(scalaTypeStr)}(${repr(attr.attrName)})")
          }
          whenNonEmpty(attr.scalaAliases) { aliases =>
            aliases.foreach { alias =>
              line()
              line(s"lazy val ${alias}: HtmlAttr[${scalaTypeStr}] = ${attr.scalaName}")
            }
          }
        }
      }

      {
        line()
        line()
        line("// -- Props --")
        element.writableNonReflectedProperties.foreach { prop =>
          line()
          val scalaInputTypeStr = st.scalaPropInputTypeStr(prop, element.tagName)
          line(s"lazy val ${prop.propName}: HtmlPropOf[${scalaInputTypeStr}] = ${propImplName(scalaInputTypeStr)}(${repr(prop.propName)})")
        }
      }

      {
        line()
        line()
        line("// -- Slots --")
        line()
        if (element.slots.isEmpty) {
          line("/** This component has no slots - don't give it any children. */")
          line("@inline def noSlots: Unit = ()")
        } else {
          enter("object slots {", "}") {
            element.slots.map { slot =>
              line()
              val commentLines = slot.description
              if (slot.isDefault) {
                val extraString = "Note: You can just say `_ => element` instead of `_.slots.default(element)`"
                if (commentLines.length == 1) {
                  blockCommentLines(List(commentLines.head + " " + extraString))
                } else {
                  blockCommentLines(commentLines :+ extraString)
                }
              } else {
                blockCommentLines(commentLines)
              }
              line(s"lazy val ${slot.scalaName}: Slot = Slot(${repr(slot.domName)})")
            }
          }
        }
      }

      {
        line()
        line()
        line("// -- CSS Vars --")
        line()
        if (element.cssProperties.isEmpty) {
          line("/** This component has no CSS vars / custom properties. */")
          line("@inline def noCssVars: Unit = ()")
        } else {
          enter("object cssVars {", "}") {
            element.cssProperties.map { cssProp =>
              line()
              val commentLines = cssProp.description.map(_.replace(" _(default: undefined)_", ""))
              blockCommentLines(commentLines)
              line(s"lazy val ${cssProp.scalaName}: ${cssPropType(cssProp.cssType)} = ${cssPropImplName(cssProp.cssType)}(${repr(cssProp.cssName)})")
            }
          }
        }
      }

      {
        line()
        line()
        line("// -- CSS Parts --")
        line()
        if (element.cssParts.isEmpty) {
          line("/** This component has no CSS parts. */")
          line("@inline def noCssParts: Unit = ()")
        } else {
          line("/** For documentation only. You need to style these from a CSS stylesheet. */")
          enter("object cssParts {", "}") {
            element.cssParts.map { part =>
              line()
              blockCommentLines(part.description)
              line(s"lazy val ${part.scalaName}: String = ${repr(part.cssName)}")
            }
          }
        }
      }

      if (showRawComponent) {
        line()
        line()
        line("// -- Element type -- ")
        line()
        enter(s"@js.native trait RawComponent extends js.Object { this: ${elementBaseType} => ", "}") {
          element.allJsProperties.foreach { prop =>
            val context = s"RawComponent prop `${prop.propName}` in `${element.tagName}`"
            val outputType = st.scalaPropOutputType(context, prop.jsTypes)
            val defType = if (prop.readonly) "val" else "var"
            line()
            blockCommentLines(prop.description)
            line(s"${defType} ${prop.propScalaName}: ${outputType}")
          }
        }
      }
    }
  }

  def attrImplName(scalaTypeStr: String): String = {
    scalaTypeStr match {
      case "Boolean" => "boolAttr"
      case "String" => "stringAttr"
      case "Int" => "intAttr"
      case _ =>
        println(s"ATTR ...No impl defined for scala type `${scalaTypeStr}`, trying `htmlAttr` for now.")
        "htmlAttr"
    }
  }

  def propImplName(scalaTypeStr: String): String = {
    scalaTypeStr match {
      case "Boolean" => "boolProp"
      case "String" => "stringProp"
      case "Int" => "intProp"
      case "Double" => "doubleProp"
      case "dom.MutationObserver" | "js.Array[js.Object]" => "asIsProp"
      case _ =>
        println(s"PROP ...No impl defined for scala type `${scalaTypeStr}`, trying `htmlProp` for now.")
        "htmlProp"
    }
  }

  def cssPropType(cssType: Def.CssType): String = {
    cssType match {
      case WebComponentsDef.CssLengthType => "StyleProp[String] with u.Length[DSP, Int]"
      case WebComponentsDef.CssColorType => "StyleProp[String] with u.Color[SS, DSP]"
      case WebComponentsDef.CssNumberType => "StyleProp[Int]" // #nc not sure if it should be int or double...
      case WebComponentsDef.CssTimeType => "StyleProp[String] with u.Time[DSP]"
      case WebComponentsDef.CssLineType => "StyleProp[String] with s.Line"
    }
  }

  def cssPropImplName(cssType: Def.CssType): String = {
    cssType match {
      case WebComponentsDef.CssLengthType => "lengthStyle"
      case WebComponentsDef.CssColorType => "colorStyle"
      case WebComponentsDef.CssNumberType => "intStyle" // #nc
      case WebComponentsDef.CssTimeType => "timeStyle"
      case WebComponentsDef.CssLineType => "lineStyle"
    }
  }

  def printAttrUsageAnalysis(
    elements: List[Def.Element]
  ): Unit = {
    println("-- Most popular attributes --")

    val attrs = mutable.Map[String, List[Def.Element]]()

    elements.foreach { el =>
      el.attributes.foreach { attr =>
        val key = repr(attr.attrName) + " -> " + attr.jsTypes.filterNot(_ == JsUndefinedType).map("Def." + _.toString).mkString("List(", ", ", "),")
        val els = attrs.getOrElse(key, Nil)
        attrs.update(key, els :+ el)
      }
    }

    val sortedAttrs = attrs.toList.sortBy({ case (attrName, elements) => -elements.length })

    sortedAttrs
      .foreach { case (key, els) =>
        println(s"${key} // ${els.length} usages: ${els.map(_.scalaName).mkString(", ")}")
      }
    println(s"Total unique attr names: ${sortedAttrs.length}, and attr instances: ${sortedAttrs.foldLeft(0)((acc, t) => acc + t._2.length)}")
    val n = 4
    val filteredAttrs = sortedAttrs.filter(_._2.length >= n)
    println(s"(N usages >= ${n}), Total unique attr names ${filteredAttrs.length}, and attr instances: ${filteredAttrs.foldLeft(0)((acc, t) => acc + t._2.length)}")
  }

  def whenNonEmpty[A](rawList: List[A])(print: List[A] => Unit): Unit = {
    if (rawList.nonEmpty) {
      print(rawList)
    }
  }

  def replaceFirstPrefix(line: String, findReplace: List[(String, String)]): String = {
    findReplace.collectFirst {
      case (prefix, replacement) if (line.startsWith(prefix)) =>
        replacement + line.substring(prefix.length)
    }.getOrElse(line)
  }

  def writeToFile(packagePath: String, fileName: String, fileContent: String): File = {
    val filePath = baseOutputDirectoryPath + "/" + (packagePath + ".").replace(baseOutputPackagePath + ".", "").replace(".", "/") + fileName.replaceAll(".scala$", "") + ".scala"
    val outputFile = new File(filePath)
    outputFile.getParentFile.mkdirs()

    val fileOutputStream = new FileOutputStream(outputFile)
    val outputPrintStream = new PrintStream(fileOutputStream)

    outputPrintStream.print(fileContent)
    outputPrintStream.flush()

    // Flush written file contents to disk https://stackoverflow.com/a/4072895/2601788
    fileOutputStream.flush()
    fileOutputStream.getFD.sync()

    outputPrintStream.close()

    outputFile
  }
}
