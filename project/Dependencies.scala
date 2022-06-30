import sbt.Keys.libraryDependencies
import sbt._

object Dependencies {

  object Versions  {
    val scala212 = "2.12.10"
    val log4j_api = "11.0"
    val log4j = "2.11.1"
    val commonsCsv = "1.8"
    val poi = "4.1.2"
  }

  object Compiles {

    lazy val commonsCsv: ModuleID = "org.apache.commons" % "commons-csv" % Versions.commonsCsv

    lazy val poi: Seq[ModuleID] = Seq(
      "org.apache.poi" % "poi" % Versions.poi,
      "org.apache.poi" % "poi-ooxml" % Versions.poi,
      "org.apache.poi" % "poi-ooxml-schemas" % Versions.poi,
      "org.apache.poi" % "poi-ooxml" % Versions.poi
    )

    lazy val log4j2: Seq[ModuleID] = Seq(
      "org.apache.logging.log4j" %% "log4j-api-scala" % Versions.log4j_api,
      "org.apache.logging.log4j" % "log4j-api" % Versions.log4j,
      "org.apache.logging.log4j" % "log4j-core" % Versions.log4j,
      "org.apache.logging.log4j" % "log4j-slf4j-impl" % Versions.log4j)
  }


  import Compiles._

  val commons = libraryDependencies ++= log4j2 ++ Seq(commonsCsv) ++ poi

}
