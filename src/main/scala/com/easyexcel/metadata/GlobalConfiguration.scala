package com.easyexcel.metadata

import java.util.Locale

case class GlobalConfiguration(autoTrim: Boolean = true,
                               use1904windowing: Boolean = false,
                               locale: Locale = Locale.getDefault,
                               useScientificFormat: Boolean = false)
