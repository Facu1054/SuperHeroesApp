package com.superheroapp.data.model.dataJson

data class Data(
    val count: Int = 0,
    val limit: Int = 0,
    val offset: Int = 0,
    val results: MutableList<Result> = mutableListOf(),
    val total: Int = 0
)