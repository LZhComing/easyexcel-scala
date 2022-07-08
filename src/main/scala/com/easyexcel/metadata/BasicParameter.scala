package com.easyexcel.metadata

import com.easyexcel.converters.Converter

import java.util.Locale

trait BasicParameter {

  val head: Seq[Seq[String]] = Seq.empty

  val clazz: Class[_] = None.orNull

  val customConverterList: Seq[Converter[_]] = Seq.empty

  val autoTrim: Boolean  = None.orNull

  val use1904windowing: Boolean = None.orNull

  val locale: Locale = Locale.getDefault

  val useScientificFormat: Boolean = None.orNull


}
