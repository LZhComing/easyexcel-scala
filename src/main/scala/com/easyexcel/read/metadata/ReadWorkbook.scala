package com.easyexcel.read.metadata

import com.easyexcel.cache.ReadCache
import com.easyexcel.cache.selector.ReadCacheSelector
import com.easyexcel.converters.Converter
import com.easyexcel.enums.ExcelTypeEnum
import com.easyexcel.read.listener.ReadListener

import java.io.{File, InputStream}
import java.nio.charset.Charset
import java.util.Locale

case class ReadWorkbook(head: Seq[Seq[String]] = Seq.empty,
                        clazz: Option[Class[_]] = None,
                        customConverterList: Seq[Converter[_]] = Seq.empty,
                        autoTrim: Boolean = true,
                        use1904windowing: Boolean = false,
                        locale: Locale = Locale.getDefault,
                        useScientificFormat: Boolean = false,
                        headRowNumber: Int = 1,
                        customReadListenerList: Seq[ReadListener[_]] = Seq.empty,

                        excelType: Option[ExcelTypeEnum] = None,
                        inputStream: Option[InputStream] = None,
                        file: Option[File] = None,
                        charset: Charset = Charset.forName("UTF-8"),
                        mandatoryUseInputStream: Boolean = false,
                        autoCloseStream: Boolean = true,
                        customObject: Option[Object] = None,
                        readCache: Option[ReadCache] = None,
                        ignoreEmptyRow: Boolean = true,
                        readCacheSelector: Option[ReadCacheSelector] = None,
                        password: Option[String] = None,
                        xlsxSAXParserFactoryName: Option[String] = None,
                        useDefaultListener: Boolean = true) extends ReadBasicParameter {

}


