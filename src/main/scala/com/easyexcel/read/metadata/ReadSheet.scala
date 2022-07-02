package com.easyexcel.read.metadata

import java.util.Locale

/**
 * @author: zhengzhicong
 * @date: 2022/06/30 20:56
 * @description: ${description}
 */
case class ReadSheet(headRowNumber: Int,
                     head: Seq[Seq[String]],
                     autoTrim: Boolean,
                     use1904windowing: Boolean,
                     locale: Locale,
                     useScientificFormat: Boolean,
                     sheetNo: Int,
                     sheetName: String) extends ReadBasicParameter {

}
