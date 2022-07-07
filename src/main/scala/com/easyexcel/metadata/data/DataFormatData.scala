package com.easyexcel.metadata.data

case class DataFormatData(index: Int, format: String)

object DataFormatData {

  def merge(source: DataFormatData, target: DataFormatData): DataFormatData = {
    target.copy(index = source.index, format = source.format)
  }

}
