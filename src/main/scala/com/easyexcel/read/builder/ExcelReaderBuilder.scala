package com.easyexcel.read.builder

import com.easyexcel.read.metadata.ReadWorkbook

class ExcelReaderBuilder extends AbstractExcelReaderParameterBuilder[ExcelReaderBuilder, ReadWorkbook] {
  private var readWorkbook: ReadWorkbook = ReadWorkbook()

  override def parameter(): ReadWorkbook =  readWorkbook


}
