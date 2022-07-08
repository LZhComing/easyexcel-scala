package com.easyexcel.read.metadata

import com.easyexcel.cache.ReadCache
import com.easyexcel.cache.selector.ReadCacheSelector
import com.easyexcel.enums.ExcelTypeEnum

import java.io.{File, InputStream}
import java.nio.charset.Charset


case class ReadWorkbook(
                         excelType: ExcelTypeEnum,
                         inputStream: Option[InputStream] = None,
                         file: Option[File] = None,
                         charset: Charset = Charset.forName("UTF-8"),
                         mandatoryUseInputStream: Boolean = false,
                         autoCloseStream: Boolean = true,
                         customObject: Object,
                         readCache: ReadCache,
                         ignoreEmptyRow: Boolean = true,
                         readCacheSelector: ReadCacheSelector,
                         password: String,
                         xlsxSAXParserFactoryName: String,
                         useDefaultListener: Boolean,
                       ) extends ReadBasicParameter
