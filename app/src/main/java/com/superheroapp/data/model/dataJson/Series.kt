package com.superheroapp.data.model.dataJson

data class Series(
    val available: Int = 0,
    val collectionURI: String = "",
    val items: MutableList<ItemXX> = mutableListOf(),
    val returned: Int = 0
)