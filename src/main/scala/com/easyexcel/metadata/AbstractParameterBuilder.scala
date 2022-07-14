package com.easyexcel.metadata

import com.easyexcel.converters.Converter

import java.util.Locale

trait AbstractParameterBuilder[T <: AbstractParameterBuilder[T, C], C <: BasicParameter] {

  var parameter: C

  def head(head: Seq[Seq[String]]): T

  def head(head: Class[_]): T

  def registerConverter(converter: Converter[_]): T

  def use1904windowing(use1904windowing: Boolean): T

  def locale(locale: Locale): T

  def autoTrim(autoTrim: Boolean): T


  protected def self: T = {
    this.asInstanceOf[T]
  }

}
