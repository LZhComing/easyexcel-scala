package com.easyexcel.metadata

abstract class AbstractParameterBuilder[T <: AbstractParameterBuilder[T, C], C <: BasicParameter] {

  def parameter(): C

}
