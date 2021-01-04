package com.sicredi.sicreditestapp.ui.extension

import java.text.NumberFormat

fun Float.toMoneyFormat() = NumberFormat.getCurrencyInstance().format(this) ?: ""
