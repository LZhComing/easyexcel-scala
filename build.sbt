import Dependencies.Versions

lazy val root = (project in file("."))
  .settings(commonSettings)

//工程通用配置
lazy val commonSettings = Seq(
  name := "easyexcel-scala",
  organization := "liquor",
  version := "0.0.1-SNAPSHOT",
  scalaVersion := Versions.scala213,
  Dependencies.commons,
)