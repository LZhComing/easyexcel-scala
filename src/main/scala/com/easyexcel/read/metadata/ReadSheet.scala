package com.easyexcel.read.metadata

import com.easyexcel.converters.Converter
import com.easyexcel.metadata.BasicParameter
import com.easyexcel.read.listener.ReadListener

import java.util.Locale

case class ReadSheet(override val head: Seq[Seq[String]] = Seq.empty,
                     clazz: Option[Class[_]] = None,
                     customConverterList: Seq[Converter[_]] = Seq.empty,
                     autoTrim: Boolean = true,
                     use1904windowing: Boolean = false,
                     locale: Locale = Locale.getDefault,
                     useScientificFormat: Boolean = false,
                     headRowNumber: Int = 1,
                     customReadListenerList: Seq[ReadListener[_]] = Seq.empty,

                     sheetNo: Int = 0,
                     sheetName: Option[String] = None) extends ReadBasicParameter {


}


