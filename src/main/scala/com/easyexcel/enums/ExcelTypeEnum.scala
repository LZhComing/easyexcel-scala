package com.easyexcel.enums

import com.easyexcel.exception.{ExcelAnalysisException, ExcelCommonException}
import com.easyexcel.read.metadata.ReadWorkbook

import java.io.{File, InputStream}

abstract class ExcelTypeEnum(value: String)

case object csv extends ExcelTypeEnum(".csv")

case object xlsx extends ExcelTypeEnum(".xlsx")

case object xls extends ExcelTypeEnum("xls")

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
          if (fileName.endsWith(csv.toString)) {
            return csv
          }
          if (fileName.endsWith(xlsx.toString)) {
            return xlsx
          }
          if (fileName.endsWith(xls.toString)) {
            return xls
          }
          throw ExcelCommonException("Convert excel format exception.You can try specifying the 'excelType' yourself")
        }
      case (_, _) => throw ExcelAnalysisException("File and inputStream must be a non-null.")
    }
  }


}
