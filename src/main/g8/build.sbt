ThisBuild / useCoursier := true

ThisBuild / scalaVersion     := "3.1.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    scalaVersion := "3.1.0",
    name := "$name$",
    libraryDependencies ++= Dependencies.Cats.deps ++ Dependencies.Test.deps
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
