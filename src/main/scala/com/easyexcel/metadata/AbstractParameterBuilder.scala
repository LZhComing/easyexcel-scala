package com.easyexcel.metadata

trait AbstractParameterBuilder[T <: AbstractParameterBuilder[T, C], C <: BasicParameter] {

  def parameter(): C

}
