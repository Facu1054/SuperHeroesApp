package com.superheroapp.data.model.dataJson

data class Result(
    val comics: Comics = Comics(),
    val description: String = "",
    val events: Events = Events(),
    val id: Int = 0,
    val modified: String ="",
    val name: String = "",
    val resourceURI: String = "",
    val series: Series = Series(),
    val stories: Stories = Stories(),
    val thumbnail: Thumbnail = Thumbnail(),
    val urls: MutableList<Url> = mutableListOf()
)