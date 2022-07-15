package com.easyexcel.analysis

import com.easyexcel.context.AnalysisContext
import com.easyexcel.read.metadata.{ReadSheet, ReadWorkbook}

class ExcelAnalyserImpl(readWorkbook: ReadWorkbook) extends ExcelAnalyser {

  override def analysis(readSheetList: Seq[ReadSheet], readAll: Boolean): Unit = {}

  override def finish(): Unit = {}

  override val excelExecutor: ExcelReadExecutor = null
  override val analysisContext: AnalysisContext = null
}

object ExcelAnalyserImpl {

//  def choiceExcelExecutor(readWorkbook: ReadWorkbook): (ExcelReadExecutor,AnalysisContext) = {
//
//  }
}

