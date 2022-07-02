package com.easyexcel.event

import com.easyexcel.constant.OrderConstant

trait Handler extends Order {

  override val order: Int = OrderConstant.DEFAULT_ORDER

}
