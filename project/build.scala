import sbt.Keys._
import play.Project._
import sbt.{Def, Build}
import net.litola.SassPlugin

object ApplicationBuild extends Build {
  val appName         = "vp"

  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    jdbc,
    anorm,
    cache
  )

  val myOrganization = Seq(organization := "vp")

  val myCompilerOptions = Seq(scalacOptions := Seq("-deprecation", "-unchecked", "-feature", "-Xlint", "-language:reflectiveCalls", "-Xmax-classfile-name", "128"))

  val myScalaVersion = Seq(scalaVersion := "2.10.3")

  val appSettings: Seq[Def.Setting[_]] = myOrganization ++ SassPlugin.sassSettings ++ myScalaVersion ++ myCompilerOptions

  val main = play.Project(
    appName,
    appVersion,
    appDependencies,
    settings = play.Project.playScalaSettings
  ).settings(appSettings: _*)

}