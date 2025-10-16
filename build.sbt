ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.7.3"

lazy val root = (project in file("."))
  .settings(
    name := "my-first-scala-project",
    idePackagePrefix := Some("com.ceiba.application")
  )