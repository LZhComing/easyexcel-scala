package com.easyexcel.metadata

import java.util.Locale

trait BasicParameter {

  val head: Seq[Seq[String]]

  val autoTrim: Boolean

  val use1904windowing: Boolean

  val locale: Locale

  val useScientificFormat: Boolean
}
