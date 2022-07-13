package com.easyexcel.read.builder

import com.easyexcel.metadata.AbstractParameterBuilder
import com.easyexcel.read.metadata.ReadBasicParameter

abstract class AbstractExcelReaderParameterBuilder[T <: AbstractExcelReaderParameterBuilder[T, C], C <: ReadBasicParameter]
  extends AbstractParameterBuilder[T, C] {


  def headRowNumber(headRowNumber: Int): T = {
    this.asInstanceOf[T]
  }


}
