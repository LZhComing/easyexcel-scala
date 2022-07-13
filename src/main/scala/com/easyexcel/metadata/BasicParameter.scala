package com.easyexcel.metadata

import com.easyexcel.converters.Converter

import java.util.Locale

abstract class BasicParameter {

  val head: Seq[Seq[String]]

  val clazz: Option[Class[_]]

  val customConverterList: Seq[Converter[_]]

  val autoTrim: Boolean

  val use1904windowing: Boolean

  val locale: Locale

  val useScientificFormat: Boolean


}
