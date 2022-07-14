package com.easyexcel.read.builder

import com.easyexcel.converters.Converter
import com.easyexcel.read.listener.ReadListener
import com.easyexcel.read.metadata.ReadSheet

import java.util.Locale

class ExcelReaderSheetBuilder extends AbstractExcelReaderParameterBuilder[ExcelReaderSheetBuilder, ReadSheet] {

  override var parameter: ReadSheet = ReadSheet()

  override def head(head: Seq[Seq[String]]): ExcelReaderSheetBuilder = {
    parameter = parameter.copy(head = head)
    self
  }

  override def head(head: Class[_]): ExcelReaderSheetBuilder = {
    parameter = parameter.copy(clazz = Some(head))
    self
  }

  override def registerConverter(converter: Converter[_]): ExcelReaderSheetBuilder = {
    parameter = parameter.copy(customConverterList = parameter.customConverterList :+ converter)
    self
  }

  override def use1904windowing(use1904windowing: Boolean): ExcelReaderSheetBuilder = {
    parameter = parameter.copy(use1904windowing = use1904windowing)
    self
  }

  override def locale(locale: Locale): ExcelReaderSheetBuilder = {
    parameter = parameter.copy(locale = locale)
    self
  }

  override def autoTrim(autoTrim: Boolean): ExcelReaderSheetBuilder = {
    parameter = parameter.copy(autoTrim = autoTrim)
    self
  }

  override def headRowNumber(headRowNumber: Int): ExcelReaderSheetBuilder = {
    parameter = parameter.copy(headRowNumber = headRowNumber)
    self
  }

  override def registerReadListener(readListener: ReadListener[_]): ExcelReaderSheetBuilder = {
    parameter = parameter.copy(customReadListenerList = parameter.customReadListenerList :+ readListener)
    self
  }
}
