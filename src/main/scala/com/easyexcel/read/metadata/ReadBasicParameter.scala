package com.easyexcel.read.metadata

import com.easyexcel.metadata.BasicParameter
import com.easyexcel.read.listener.ReadListener

abstract class ReadBasicParameter extends BasicParameter {

  val headRowNumber: Int = None.orNull

  val customReadListenerList: Seq[ReadListener[_]] = Seq.empty


}
