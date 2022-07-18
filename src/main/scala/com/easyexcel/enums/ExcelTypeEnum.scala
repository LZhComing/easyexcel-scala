package com.easyexcel.enums

import com.easyexcel.exception.{ExcelAnalysisException, ExcelCommonException}
import com.easyexcel.read.metadata.ReadWorkbook

import java.io.{File, InputStream}

trait ExcelTypeEnum {
  val value: String
}

case object CSV extends ExcelTypeEnum {
  override val value: String = ".csv"
}

case object XLSX extends ExcelTypeEnum {
  override val value: String = ".xlsx"
}

case object XLS extends ExcelTypeEnum {
  override val value: String = ".xls"
}

object ExcelTypeEnum extends Enumeration {

  val MAX_PATTERN_LENGTH: Int = 8

  def valueOf(readWorkBook: ReadWorkbook): ExcelTypeEnum = {
    readWorkBook.excelType match {
      case Some(typ) => typ
      case None =>
        val file = readWorkBook.file
        val inputStream = readWorkBook.inputStream
        valueOf(file, inputStream)
    }
  }

  private[this] def valueOf(file: Option[File], inputStream: Option[InputStream]): ExcelTypeEnum = {
    (file, inputStream) match {
      case (Some(f), _) =>
        if (!f.exists()) {
          throw ExcelAnalysisException("File " + f.getAbsolutePath + " not exists.")
        } else {
          val fileName = f.getName
          fileName match {
            case _ if fileName.endsWith(CSV.value) => CSV
            case _ if fileName.endsWith(XLS.value) => XLS
            case _ if fileName.endsWith(XLSX.value) => XLSX
            case _ => throw ExcelCommonException("Convert excel format exception.You can try specifying the 'excelType' yourself")
          }
        }
      case (_, _) => throw ExcelAnalysisException("File and inputStream must be a non-null.")
    }
  }


}
