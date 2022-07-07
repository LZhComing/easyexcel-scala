package com.easyexcel.read.builder

import com.easyexcel.metadata.AbstractParameterBuilder
import com.easyexcel.read.metadata.ReadBasicParameter

trait AbstractExcelReaderParameterBuilder[T <: AbstractExcelReaderParameterBuilder[T, C], C <: ReadBasicParameter]
  extends AbstractParameterBuilder[T, C] {

  protected val readBasicParameter: C

  def headRowNumber(headRowNumber: Int): T = {
    val head = parameter().head()
    this.asInstanceOf[T]
  }

}
