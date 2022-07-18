package com.easyexcel.read.metadata.holder

import com.easyexcel.metadata.ConfigurationHolder
import com.easyexcel.read.listener.ReadListener
import com.easyexcel.read.metadata.property.ExcelReadHeadProperty

trait ReadHolder extends ConfigurationHolder{
  /**
   * What handler does the currently operated cell need to execute
   *
   * @return Current {@link ReadListener}
   */
  def readListenerList: Seq[ReadListener[_]]

  /**
   * What {@link ExcelReadHeadProperty} does the currently operated cell need to execute
   *
   * @return Current {@link ExcelReadHeadProperty}
   */
  def excelReadHeadProperty: ExcelReadHeadProperty
}
