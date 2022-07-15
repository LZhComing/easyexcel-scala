package com.easyexcel.enums

sealed abstract class HolderEnum {

  case object WORKBOOK extends HolderEnum

  case object SHEET extends HolderEnum

  case object TABLE extends HolderEnum

  case object ROW extends HolderEnum


}
