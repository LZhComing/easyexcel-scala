package com.easyexcel.converters

trait Converter[T] {

  def supportJavaTypeKey: Class[Any] = {
    throw new UnsupportedOperationException("The current operation is not supported by the current converter.")
  }

}
