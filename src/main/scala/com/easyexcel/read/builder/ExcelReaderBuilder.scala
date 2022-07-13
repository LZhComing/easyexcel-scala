package com.easyexcel.read.builder

import com.easyexcel.converters.Converter
import com.easyexcel.read.metadata.ReadWorkbook

import java.util.Locale

class ExcelReaderBuilder extends AbstractExcelReaderParameterBuilder[ExcelReaderBuilder, ReadWorkbook] {

  override var parameter: ReadWorkbook = ReadWorkbook()

  override def headRowNumber(headRowNumber: Int): ExcelReaderBuilder = {
    parameter = parameter.copy(headRowNumber = headRowNumber)
    self
  }

  override def head(head: Seq[Seq[String]]): ExcelReaderBuilder = {
    parameter = parameter.copy(head = head)
    self
  }

  override def head(head: Class[_]): ExcelReaderBuilder = {
    parameter = parameter.copy(clazz = Some(head))
    self
  }

  override def registerConverter(converter: Converter[_]): ExcelReaderBuilder = {
    parameter = parameter.copy(customConverterList = parameter.customConverterList :+ converter)
    self
  }

  override def use1904windowing(use1904windowing: Boolean): ExcelReaderBuilder = {
    parameter = parameter.copy(use1904windowing = use1904windowing)
    self
  }

  override def locale(locale: Locale): ExcelReaderBuilder = {
    parameter = parameter.copy(locale = locale)
    self
  }

  override def autoTrim(autoTrim: Boolean): ExcelReaderBuilder = {
    parameter = parameter.copy(autoTrim = autoTrim)
    self
  }
}
