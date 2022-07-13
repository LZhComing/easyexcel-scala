package com.easyexcel.read.metadata

import com.easyexcel.metadata.BasicParameter
import com.easyexcel.read.listener.ReadListener

trait ReadBasicParameter extends BasicParameter {

  val headRowNumber: Int

  val customReadListenerList: Seq[ReadListener[_]]


}
