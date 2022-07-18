package com.easyexcel.metadata

import com.easyexcel.exception.ExcelGenerateException
import com.easyexcel.metadata.property.{ColumnWidthProperty, FontProperty, LoopMergeProperty, StyleProperty}

import java.lang.reflect.Field

case class Head(columnIndex: Int,
                field: Field,
                fieldName: String,
                headNameList: Seq[String] = Seq.empty,
                forceIndex: Boolean,
                forceName: Boolean,
                columnWidthProperty: Option[ColumnWidthProperty],
                loopMergeProperty: Option[LoopMergeProperty],
                styleProperty: Option[StyleProperty],
                fontProperty: Option[FontProperty])

object Head {

  def apply(columnIndex: Integer, field: Field, fieldName: String, headNameList: Seq[String], forceIndex: Boolean,
            forceName: Boolean): Head = {
    headNameList.foreach { case null => throw ExcelGenerateException("head name can not be null.") }
    new Head(columnIndex, field, fieldName, headNameList, forceIndex, forceName, None, None, None, None)
  }

}
