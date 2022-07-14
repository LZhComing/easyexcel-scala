package com.easyexcel

import com.easyexcel.read.builder.ExcelReaderBuilder
import com.easyexcel.read.listener.ReadListener

import java.io.File

/**
 * Reader and writer factory class
 *
 * <h1>Quick start</h1>
 * <h2>Read</h2>
 * <h3>Sample1</h3>
 *
 * <h3>Sample2</h3>
 *
 * <h2>Write</h2>
 *
 * <h3>Sample1</h3>
 *
 * <h3>Sample2</h3>
 *
 * @author jipengfei
 */
trait EasyExcelFactory {


  def read(file: File, head: Class[_], readListener: ReadListener[_]): ExcelReaderBuilder = {
    val builder = new ExcelReaderBuilder
    builder
  }

}
