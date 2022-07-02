package com.easyexcel.analysis

import com.easyexcel.context.AnalysisContext
import com.easyexcel.read.metadata.ReadSheet

trait ExcelAnalyser {

  def analysis(readSheetList: Seq[ReadSheet], readAll: Boolean): Unit

  def finish(): Unit

  val excelExecutor: ExcelReadExecutor

  val analysisContext: AnalysisContext

}
