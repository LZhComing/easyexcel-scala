package com.easyexcel.enums

sealed trait CellDataTypeEnum {

  case object STRING extends CellDataTypeEnum

  case object DIRECT_STRING extends CellDataTypeEnum

  case object NUMBER extends CellDataTypeEnum

  case object BOOLEAN extends CellDataTypeEnum

  case object EMPTY extends CellDataTypeEnum

  case object ERROR extends CellDataTypeEnum

  case object DATE extends CellDataTypeEnum

  case object RICH_TEXT_STRING extends CellDataTypeEnum

  val TYPE_ROUTING_MAP = Map(
    "s" -> STRING,
    "str" -> DIRECT_STRING,
    "inlineStr" -> DIRECT_STRING,
    "e" -> ERROR,
    "b" -> BOOLEAN,
    "n" -> NUMBER)

  def buildFromCellType(cellType: String): CellDataTypeEnum = {
    TYPE_ROUTING_MAP.getOrElse(cellType, EMPTY)
  }

}
