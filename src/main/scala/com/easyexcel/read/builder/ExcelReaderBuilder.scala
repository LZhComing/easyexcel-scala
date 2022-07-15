package com.easyexcel.read.builder

import com.easyexcel.ExcelReader
import com.easyexcel.cache.ReadCache
import com.easyexcel.converters.Converter
import com.easyexcel.enums.ExcelTypeEnum
import com.easyexcel.read.listener.ReadListener
import com.easyexcel.read.metadata.ReadWorkbook

import java.io.{File, InputStream}
import java.nio.charset.Charset
import java.util.Locale
import scala.util.Using

class ExcelReaderBuilder extends AbstractExcelReaderParameterBuilder[ExcelReaderBuilder, ReadWorkbook] {

  override var parameter: ReadWorkbook = ReadWorkbook()

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

  override def headRowNumber(headRowNumber: Int): ExcelReaderBuilder = {
    parameter = parameter.copy(headRowNumber = headRowNumber)
    self
  }

  override def registerReadListener(readListener: ReadListener[_]): ExcelReaderBuilder = {
    parameter = parameter.copy(customReadListenerList = parameter.customReadListenerList :+ readListener)
    self
  }

  def excelType(excelType: ExcelTypeEnum): ExcelReaderBuilder = {
    parameter = parameter.copy(excelType = Some(excelType))
    this
  }

  def file(file: File): ExcelReaderBuilder = {
    parameter = parameter.copy(file = Some(file))
    this
  }

  def file(inputStream: InputStream): ExcelReaderBuilder = {
    parameter = parameter.copy(inputStream = Some(inputStream))
    this
  }

  def file(pathName: String): ExcelReaderBuilder = {
    file(new File(pathName))
  }

  def charset(charset: Charset): ExcelReaderBuilder = {
    parameter = parameter.copy(charset = charset)
    this
  }

  def mandatoryUseInputStream(mandatoryUseInputStream: Boolean): ExcelReaderBuilder = {
    parameter = parameter.copy(mandatoryUseInputStream = mandatoryUseInputStream)
    this
  }

  def autoCloseStream(autoCloseStream: Boolean): ExcelReaderBuilder = {
    parameter = parameter.copy(autoCloseStream = autoCloseStream)
    this
  }

  def ignoreEmptyRow(ignoreEmptyRow: Boolean): ExcelReaderBuilder = {
    parameter = parameter.copy(ignoreEmptyRow = ignoreEmptyRow)
    this
  }

  def readCache(readCache: ReadCache): ExcelReaderBuilder = {
    parameter = parameter.copy(readCache = Some(readCache))
    this
  }

  def password(password: String): ExcelReaderBuilder = {
    parameter = parameter.copy(password = Some(password))
    this
  }

  def xlsxSAXParserFactoryName(xlsxSAXParserFactoryName: String): ExcelReaderBuilder = {
    parameter = parameter.copy(xlsxSAXParserFactoryName = Some(xlsxSAXParserFactoryName))
    this
  }

  def useDefaultListener(useDefaultListener: Boolean): ExcelReaderBuilder = {
    parameter = parameter.copy(useDefaultListener = useDefaultListener)
    this
  }

  def build(): ExcelReader = {
    new ExcelReader(parameter)
  }

  def doReadAll(): Unit = {
    Using(build()) { reader =>
      reader.readAll()
    }
  }

  def sheet(): ExcelReaderSheetBuilder = {
    sheet(None, None)
  }

  def sheet(sheetNo: Int): ExcelReaderSheetBuilder = {
    sheet(Some(sheetNo), None)
  }

  def sheet(sheetName: String): ExcelReaderSheetBuilder = {
    sheet(None, Some(sheetName))
  }

  def sheet(sheetNo: Option[Int], sheetName: Option[String]): ExcelReaderSheetBuilder = {
    val builder = new ExcelReaderSheetBuilder(build())
    sheetNo.foreach(no => builder.sheetNo(no))
    sheetName.foreach(name => builder.sheetName(name))
    builder
  }

}
