lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    organization := "org.getshaka",
    name := "shaka",
    version := "0.4.2-SNAPSHOT",
    versionScheme := Some("early-semver"),
    scalaVersion := "3.1.2",
    libraryDependencies ++= Seq(
      "org.getshaka" %%% "native-converter" % "0.8.0",
      "org.scala-js" %%% "scalajs-dom" % "2.2.0"
    ),

    // publishing settings
    homepage := Some(url("https://getshaka.org")),
    licenses += ("Apache-2.0", url("https://opensource.org/licenses/Apache-2.0")),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/getshaka-org/shaka"),
        "scm:git:git@github.com:getshaka-org/shaka.git",
        Some("scm:git:git@github.com:getshaka-org/shaka.git")
      )
    ),
    developers := List(
      Developer(
        id = "augustnagro@gmail.com",
        name = "August Nagro",
        email = "augustnagro@gmail.com",
        url = url("https://augustnagro.com")
      )
    ),
    Test / publishArtifact := false,
    publishMavenStyle := true,
    pomIncludeRepository := { _ => false },
    publishTo := {
      val nexus = "https://s01.oss.sonatype.org/"
      if (isSnapshot.value)
        Some("snapshots" at nexus + "content/repositories/snapshots")
      else
        Some("releases" at nexus + "service/local/staging/deploy/maven2")
    },
    credentials += Credentials(Path.userHome / ".sbt" / ".credentials")
  )
