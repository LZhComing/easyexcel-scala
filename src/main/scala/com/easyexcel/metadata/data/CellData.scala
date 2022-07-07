package com.easyexcel.metadata.data

import com.easyexcel.enums.CellDataTypeEnum
import com.easyexcel.metadata.Cell

case class CellData[T](typ: CellDataTypeEnum,
                       numberValue: BigDecimal,
                       stringValue: String,
                       booleanValue: Boolean,
                       data: T,
                       rowIndex: Int,
                       columnIndex: Int) extends Cell
