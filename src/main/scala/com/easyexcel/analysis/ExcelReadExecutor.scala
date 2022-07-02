package com.easyexcel.analysis

import com.easyexcel.read.metadata.ReadSheet

trait ExcelReadExecutor {

  def sheetList(): Seq[ReadSheet]

  def execute(): Unit

}
