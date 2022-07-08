package com.easyexcel.metadata

import com.easyexcel.converters.Converter

import java.util.Locale

trait BasicParameter {

  val head: Seq[Seq[String]] = Seq.empty

  val clazz: Option[Class[_]] = None

  val customConverterList: Seq[Converter[_]] = Seq.empty

  val autoTrim: Boolean  = true

  val use1904windowing: Boolean = false

  val locale: Locale = Locale.getDefault

  val useScientificFormat: Boolean = false


}
