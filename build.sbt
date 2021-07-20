lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    organization := "org.getshaka",
    name := "shaka",
    version := "0.3.1",
    versionScheme := Some("early-semver"),

    scalaVersion := "3.0.2-SNAPSHOT",

    libraryDependencies ++= Seq(
      "org.getshaka" %%% "native-converter" % "0.5.1"
    ),

    // publishing settings
    homepage := Some(url("https://getshaka.org")),
    licenses += ("Apache-2.0", url("https://opensource.org/licenses/Apache-2.0")),
    scmInfo := Some(ScmInfo(
      url("https://github.com/getshaka-org/shaka"),
      "scm:git:git@github.com:getshaka-org/shaka.git",
      Some("scm:git:git@github.com:getshaka-org/shaka.git")
    )),
    developers := List(
      Developer(
        id = "augustnagro@gmail.com",
        name = "August Nagro",
        email = "augustnagro@gmail.com",
        url = url("https://augustnagro.com")
      )
    ),
    publishMavenStyle := true,
    Test / publishArtifact := false,
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
