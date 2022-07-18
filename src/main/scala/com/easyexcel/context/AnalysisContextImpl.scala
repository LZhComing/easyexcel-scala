package com.easyexcel.context
import com.easyexcel.read.metadata.ReadSheet

class AnalysisContextImpl extends AnalysisContext {
  /**
   * Select the current table
   *
   * @param readSheet
   * sheet to read
   */
  override def currentSheet(readSheet: ReadSheet): Unit = {}

  /**
   * Data that the customer needs to read
   *
   * @return
   */
  override def readSheetList: Seq[ReadSheet] = Seq.empty

  /**
   * Data that the customer needs to read
   *
   * @param readSheetList
   */
  override def readSheetList(readSheetList: Seq[ReadSheet]): Unit = {}
}
