package com.superheroapp.data.model.dataJson

data class Comics(
    val available: Int =0,
    val collectionURI: String = "",
    val items: MutableList<Item> = mutableListOf(),
    val returned: Int = 0
)