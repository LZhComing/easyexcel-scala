package com.easyexcel.enums

sealed trait HolderEnum {

  case object WORKBOOK extends HolderEnum

  case object SHEET extends HolderEnum

  case object TABLE extends HolderEnum

  case object ROW extends HolderEnum


}
