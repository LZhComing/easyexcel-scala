package com.easyexcel

import com.easyexcel.analysis.{ExcelAnalyser, ExcelAnalyserImpl, ExcelReadExecutor}
import com.easyexcel.context.AnalysisContext
import com.easyexcel.read.metadata.{ReadSheet, ReadWorkbook}


class ExcelReader(val readWorkbook: ReadWorkbook) extends AutoCloseable {

  private[this] lazy val excelAnalyser: ExcelAnalyser = new ExcelAnalyserImpl(readWorkbook)

  override def close(): Unit = {
    finish()
  }

  def read(readSheet: Seq[ReadSheet]): ExcelReader = {
    excelAnalyser.analysis(readSheet, readAll = false)
    this
  }

  def readAll(): Unit = {
    excelAnalyser.analysis(Seq.empty, readAll = true)
  }

  def analysisContext(): AnalysisContext = {
    excelAnalyser.analysisContext
  }

  def excelExecutor(): ExcelReadExecutor = {
    excelAnalyser.excelExecutor
  }

  def finish(): Unit = {
    excelAnalyser.finish()
  }
}
