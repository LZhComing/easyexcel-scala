package com.easyexcel.context

import com.easyexcel.read.metadata.ReadSheet


trait AnalysisContext {


  /**
   * Select the current table
   *
   * @param readSheet
   * sheet to read
   */
  def currentSheet(readSheet: ReadSheet): Unit

  /**
   * All information about the workbook you are currently working on
   *
   * @return Current workbook holder
   */
//  def readWorkbookHolder: ReadWorkbookHolder
//
//  /**
//   * All information about the sheet you are currently working on
//   *
//   * @return Current sheet holder
//   */
//  def readSheetHolder: ReadSheetHolder
//
//  /**
//   * Set row of currently operated cell
//   *
//   * @param readRowHolder
//   * Current row holder
//   */
//  def readRowHolder(readRowHolder: ReadRowHolder): Unit
//
//  /**
//   * Row of currently operated cell
//   *
//   * @return Current row holder
//   */
//  def readRowHolder: ReadRowHolder
//
//  /**
//   * The current read operation corresponds to the <code>readSheetHolder</code> or <code>readWorkbookHolder</code>
//   *
//   * @return Current holder
//   */
//  def currentReadHolder: ReadHolder
//
//  /**
//   * Custom attribute
//   *
//   * @return
//   */
//  def getCustom: Any
//
//  /**
//   * Event processor
//   *
//   * @return
//   */
//  def analysisEventProcessor: AnalysisEventProcessor

  /**
   * Data that the customer needs to read
   *
   * @return
   */
  def readSheetList: Seq[ReadSheet]

  /**
   * Data that the customer needs to read
   *
   * @param readSheetList
   */
  def readSheetList(readSheetList: Seq[ReadSheet]): Unit

}
