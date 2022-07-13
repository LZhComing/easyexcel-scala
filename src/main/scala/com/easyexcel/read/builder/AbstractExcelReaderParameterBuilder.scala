package com.easyexcel.read.builder

import com.easyexcel.metadata.AbstractParameterBuilder
import com.easyexcel.read.metadata.{ReadBasicParameter, ReadWorkbook}

abstract  class  AbstractExcelReaderParameterBuilder[T <: AbstractExcelReaderParameterBuilder[T, C], C <: ReadBasicParameter]
  extends AbstractParameterBuilder[T, C] {


  def headRowNumber(headRowNumber: Int): T = {
    parameter()
    this.asInstanceOf[T]
  }


}
