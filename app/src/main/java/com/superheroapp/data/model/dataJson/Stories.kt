package com.superheroapp.data.model.dataJson

data class Stories(
    val available: Int = 0,
    val collectionURI: String = "",
    val items: MutableList<ItemXXX> = mutableListOf(),
    val returned: Int = 0
)