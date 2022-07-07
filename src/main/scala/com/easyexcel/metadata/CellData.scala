package com.easyexcel.metadata

import com.easyexcel.enums.CellDataTypeEnum

case class CellData[T](typ: CellDataTypeEnum,
                       numberValue: BigDecimal,
                       stringValue: String,
                       booleanValue: Boolean,
                       data: T,
                       rowIndex: Int,
                       columnIndex: Int) extends Cell
