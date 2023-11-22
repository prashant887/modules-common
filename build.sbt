ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

ThisBuild / organization := "com.prashant"



lazy val root = (project in file("."))
  .settings(
    name := "modules-common"
  )

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.0"
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.5.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test
