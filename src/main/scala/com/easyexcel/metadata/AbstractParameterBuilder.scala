package com.easyexcel.metadata

import com.easyexcel.converters.Converter

import java.util.Locale

trait AbstractParameterBuilder[T <: AbstractParameterBuilder[T, C], C <: BasicParameter] {

  val parameter: C

//  def head(head: Seq[Seq[String]]): T = {
//    parameter.head = head
//    self()
//  }
//
//  def head(head: Class[_]): T = {
//    parameter.clazz = Some(head)
//    self()
//  }
//
//  def registerConverter(converter: Converter[_]): T = {
//    val seq = parameter.customConverterList match {
//      case Nil => Seq(converter)
//      case _ => parameter.customConverterList :+ converter
//    }
//    parameter.customConverterList = seq
//    self()
//  }
//
//  def use1904windowing(use1904windowing: Boolean): T = {
//    parameter.use1904windowing = use1904windowing
//    self()
//  }
//
//  def locale(locale: Locale): T = {
//    parameter.locale = locale
//    self()
//  }
//
//  def autoTrim(autoTrim: Boolean): T = {
//    parameter.autoTrim = autoTrim
//    self()
//  }


  private[this] def self(): T = {
    this.asInstanceOf[T]
  }

}
