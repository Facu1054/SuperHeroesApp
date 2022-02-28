package com.superheroapp.data.model.dataJson

data class Events(
    val available: Int = 0,
    val collectionURI: String = "",
    val items: MutableList<ItemX> = mutableListOf(),
    val returned: Int = 0
)