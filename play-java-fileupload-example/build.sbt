name := """play-java-fileupload-example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.0"

crossScalaVersions := Seq("2.13.0", "2.12.8")

libraryDependencies += guice

testOptions += Tests.Argument(TestFrameworks.JUnit, "-a", "-v")
