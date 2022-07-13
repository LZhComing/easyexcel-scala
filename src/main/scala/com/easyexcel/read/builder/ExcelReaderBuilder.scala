package com.easyexcel.read.builder

import com.easyexcel.read.metadata.ReadWorkbook

class ExcelReaderBuilder extends AbstractExcelReaderParameterBuilder[ExcelReaderBuilder, ReadWorkbook] {

  override val parameter: ReadWorkbook = ReadWorkbook()
}
