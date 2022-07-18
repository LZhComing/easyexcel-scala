package com.easyexcel.context.xls

import com.easyexcel.context.AnalysisContextImpl
import com.easyexcel.enums.ExcelTypeEnum
import com.easyexcel.read.metadata.ReadWorkbook

class DefaultXlsxReadContext(val readWorkbook: ReadWorkbook,val excelTypeEnum: ExcelTypeEnum)
  extends AnalysisContextImpl with XlsxReadContext {

}
