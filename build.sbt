import VersionHelper.{versionFmt, fallbackVersion}

ThisBuild / version := "0.1.0"

ThisBuild / scalaVersion := Versions.Scala_3

// Lets me depend on Maven Central artifacts immediately without waiting
resolvers ++= Resolver.sonatypeOssRepos("public")

// Makes sure to increment the version for local development
ThisBuild / version := dynverGitDescribeOutput.value
  .mkVersion(out => versionFmt(out, dynverSonatypeSnapshots.value), fallbackVersion(dynverCurrentDate.value))

ThisBuild / dynver := {
  val d = new java.util.Date
  sbtdynver.DynVer
    .getGitDescribeOutput(d)
    .mkVersion(out => versionFmt(out, dynverSonatypeSnapshots.value), fallbackVersion(d))
}

lazy val generateShoelace = taskKey[Unit]("generates the component definitions")

lazy val root = project.in(file("."))
  .aggregate(js, jvm)
  .settings(noPublish)
  .settings(
    name := "Laminar Shoelace Components",
    generateShoelace := {
      ShoelaceGenerator(
        customElementsJsonPath = "sljs/node_modules/@shoelace-style/shoelace/dist/custom-elements.json",
        baseOutputDirectoryPath = "sljs/src/main/scala/com/raquo/laminar/shoelace/sl",
        baseOutputPackagePath = "com.raquo.laminar.shoelace.sl"
      ).generate()
    }
  )

lazy val shared = crossProject(JSPlatform, JVMPlatform)
  .in(file("shared"))
  .settings(noPublish)
  .settings(commonSettings)

lazy val jvm = project
  .in(file("sljvm"))
  .dependsOn(shared.jvm)
  .settings(noPublish)
  .settings(commonSettings)

lazy val js = project
  .in(file("sljs"))
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(shared.js)
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= List(
      "com.raquo" %%% "laminar" % Versions.Laminar % "provided"
    ),
    (Compile / doc / scalacOptions) ++= Seq(
      "-no-link-warnings" // Suppress scaladoc "Could not find any member to link for" warnings
    ),
    scalacOptions ++= {
      val sourcesUrl = s"https://raw.githubusercontent.com/raquo/laminar-shoelace-components/${git.gitHeadCommit.value.get}"
      val sourcesOptionName = if (scalaVersion.value.startsWith("2.")) "-P:scalajs:mapSourceURI" else "-scalajs-mapSourceURI"
      Seq(
        s"${sourcesOptionName}:${file("js").toURI}->$sourcesUrl/js/",
        s"${sourcesOptionName}:${file("shared").toURI}->$sourcesUrl/shared/"
      )
    }
  )
  .settings(
    //name := "Laminar Shoelace Components",
    normalizedName := "laminar-shoelace",
    organization := "com.raquo",
    homepage := Some(url("https://github.com/raquo/laminar-shoelace-components")),
    licenses += ("MIT", url("https://github.com/raquo/laminar-shoelace-components/blob/master/LICENSE.md")),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/raquo/laminar-shoelace-components"),
        "scm:git@github.com/raquo/laminar-shoelace-components.git"
      )
    ),
    developers := List(
      Developer(
        id = "raquo",
        name = "Nikita Gazarov",
        email = "nikita@raquo.com",
        url = url("https://github.com/raquo")
      )
    ),
    (Test / publishArtifact) := false,
    pomIncludeRepository := { _ => false },
    sonatypeCredentialHost := "s01.oss.sonatype.org",
    sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
  )

lazy val commonSettings = Seq(
  scalacOptions ++= Seq(
    "-deprecation"
  )
)

lazy val noPublish = Seq(
  publishLocal / skip := true,
  publish / skip := true
)

// -- Aliases

// Run the frontend development loop (also run vite: `cd frontend; npm run dev`)
addCommandAlias("cup", ";~client/fastLinkJS")
// Start the backend server, and make sure to stop it afterwards
addCommandAlias("sup", ";server/reStop ;~server/reStart ;server/reStop")
// Build frontend for production
addCommandAlias("cbuild", ";buildClient")
// Package the application into a jar. Run the jar with: `java -jar dist/app.jar`
addCommandAlias("jar", ";packageApplication")
