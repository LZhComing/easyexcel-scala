package com.easyexcel.exception

case class ExcelAnalysisException(override val message: String = "",
                                  override val cause: Throwable = None.orNull) extends ExcelRuntimeException {


}
