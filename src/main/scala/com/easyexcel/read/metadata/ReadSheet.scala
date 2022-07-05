package com.easyexcel.read.metadata

import java.util.Locale

case class ReadSheet(headRowNumber: Int,
                     head: Seq[Seq[String]],
                     autoTrim: Boolean,
                     use1904windowing: Boolean,
                     locale: Locale,
                     useScientificFormat: Boolean,
                     sheetNo: Int,
                     sheetName: String) extends ReadBasicParameter {

}
