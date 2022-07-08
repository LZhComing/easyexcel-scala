package com.easyexcel.enums

sealed abstract class ExcelTypeEnum(val value: String, val magic: Array[Byte]) {

  val MAX_PATTERN_LENGTH: Int = 8

  case object CSV extends ExcelTypeEnum(".csv", Array(-27, -89, -109, -27))

  case object XLS extends ExcelTypeEnum(".xls", Array(-48, -49, 17, -32, -95, -79, 26, -31))

  case object XLSX extends ExcelTypeEnum(".xlsx",Array(80, 75, 3, 4))




}
