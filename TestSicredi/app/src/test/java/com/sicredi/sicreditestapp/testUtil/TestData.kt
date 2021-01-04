package com.sicredi.sicreditestapp.testUtil

import com.sicredi.sicreditestapp.data.model.CheckInModel
import com.sicredi.sicreditestapp.data.model.EventModel

object TestData {

    const val EMPTY_TEXT = ""
    const val BLANK_TEXT = "  "
    const val CONTENT_TEXT = "testando"
    const val VALID_EMAIL = "teste@teste.com"
    const val INVALID_EMAIL = "teste"
    const val IS_LOADING = true
    const val NOT_LOADING = false
    const val HAS_SUCCESS = true
    const val HAS_ERROR = false
    val CHECK_IN = CheckInModel(
        "1",
        "Mauricio Bittencourt",
        "test@test.com.br"
    )
    val EVENT_DETAIL = EventModel(
        id = "1",
        title = "Evento",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum tristique bibendum sodales. Etiam mattis, dolor lacinia pharetra dapibus, justo tellus aliquam mauris, pharetra venenatis nisi nibh sit amet massa. Duis fringilla molestie venenatis. Ut semper lacus libero.",
        longitude = "1231412",
        latitude = "1231412",
        image = "https://blog.sobraci.com.br/wp-content/uploads/2019/11/original-eee528b829e9cac6449f70bfa64fca5d-780x450.jpg",
        date = 1234482311111,
        price = 12.34f
    )
    val EVENT_LIST = listOf(
        EVENT_DETAIL,
        EVENT_DETAIL,
        EVENT_DETAIL
    )

}