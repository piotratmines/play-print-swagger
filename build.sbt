import Dependencies._

lazy val supportedScalaVersions = List("2.13.1", "2.12.10", "2.11.12")

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.github.tharry"
ThisBuild / organizationName := "tharry"

lazy val root = (project in file("."))
  .settings(
    name := "play-print-swagger",
    crossScalaVersions := supportedScalaVersions,
    libraryDependencies += "com.typesafe" % "config" % "1.3.3",
    libraryDependencies += scalaTest % Test,
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
