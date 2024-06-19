import VersionHelper.fallbackVersion
import VersionHelper.versionFmt

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

ThisBuild / scalaVersion := Versions.Scala_3

lazy val generateShoelace = taskKey[List[File]]("generates the component definitions")

lazy val sl = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    generateShoelace := {
      new ShoelaceGenerator(
        onlineSourceRoot = "https://github.com/raquo/laminar-shoelace-components/blob/master",
        customElementsJsonPath = "node_modules/@shoelace-style/shoelace/dist/custom-elements.json",
        baseOutputDirectoryPath = (Compile / sourceManaged).value.getAbsolutePath() + "/scala/com/raquo/laminar/shoelace/sl",
        baseOutputPackagePath = "com.raquo.laminar.shoelace.sl"
      ).generate()
    },
    Compile / sourceGenerators += generateShoelace.taskValue
  )
  .settings(
    libraryDependencies ++= List(
      "com.raquo" %%% "laminar" % Versions.Laminar % "provided"
    ),
    (Compile / doc / scalacOptions) ++= Seq(
      "-no-link-warnings" // Suppress scaladoc "Could not find any member to link for" warnings
    ),
    scalacOptions ++= Seq(
      "-deprecation"
    ),
    scalacOptions ++= sys.env.get("CI").map { _ =>
      val localSourcesPath = (LocalRootProject / baseDirectory).value.toURI
      val remoteSourcesPath = s"https://raw.githubusercontent.com/raquo/laminar-shoelace-components/${git.gitHeadCommit.value.get}/"
      val sourcesOptionName = if (scalaVersion.value.startsWith("2.")) "-P:scalajs:mapSourceURI" else "-scalajs-mapSourceURI"

      s"${sourcesOptionName}:$localSourcesPath->$remoteSourcesPath"
    }
  )
  .settings(
    name := "Laminar Shoelace",
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
