package com.easyexcel.exception

case class ExcelGenerateException(override val message: String = "",
                                  override val cause: Throwable = None.orNull) extends ExcelRuntimeException
