package com.easyexcel.analysis

import com.easyexcel.context.AnalysisContext
import com.easyexcel.context.xls.DefaultXlsxReadContext
import com.easyexcel.enums.{CSV, ExcelTypeEnum, XLS, XLSX}
import com.easyexcel.read.metadata.{ReadSheet, ReadWorkbook}
import org.apache.poi.poifs.crypt.Decryptor
import org.apache.poi.poifs.filesystem.{DocumentFactoryHelper, POIFSFileSystem}
import org.apache.poi.util.IOUtils

import java.io.InputStream
import scala.util.Using

class ExcelAnalyserImpl(readWorkbook: ReadWorkbook) extends ExcelAnalyser {

  override def analysis(readSheetList: Seq[ReadSheet], readAll: Boolean): Unit = {}

  override def finish(): Unit = {}

  override val excelExecutor: ExcelReadExecutor = null
  override val analysisContext: AnalysisContext = null
}

object ExcelAnalyserImpl {

//  def choiceExcelExecutor(readWorkbook: ReadWorkbook): (ExcelReadExecutor,AnalysisContext) = {
//    val excelType = ExcelTypeEnum.valueOf(readWorkbook)
//    excelType match {
//      case XLS =>
//        val poifsFileSystem = readWorkbook.file.map(f => new POIFSFileSystem(f)).orElse {
//          readWorkbook.inputStream.map(input => new POIFSFileSystem(input))
//        }.get
//
//        if (poifsFileSystem.getRoot.hasEntry(Decryptor.DEFAULT_POIFS_ENTRY)) {
//          Using(DocumentFactoryHelper.getDecryptedStream(poifsFileSystem.getRoot.getFileSystem, readWorkbook.password.get)) { decryptedStream =>
//            try {
//              val xlsxReadContext = new DefaultXlsxReadContext(readWorkbook, XLSX)
//              new XlsxSaxAnalyser(xlsxReadContext, decryptedStream)
//            } finally {
//              IOUtils.closeQuietly(decryptedStream)
//              IOUtils.closeQuietly(poifsFileSystem)
//            }
//          }
//
//        }
//    }
//
//  }
}

