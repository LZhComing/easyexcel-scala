package com.easyexcel.metadata

import com.easyexcel.metadata.properties.{ColumnWidthProperty, FontProperty, LoopMergeProperty, StyleProperty}

import java.lang.reflect.Field

case class Head(columnIndex: Int,
                field: Field,
                fieldName: String,
                headNameList: Seq[String] = Seq.empty,
                forceIndex: Boolean,
                forceName: Boolean,
                columnWidthProperty: ColumnWidthProperty,
                loopMergeProperty: LoopMergeProperty,
                styleProperty: StyleProperty,
                fontProperty: FontProperty)
