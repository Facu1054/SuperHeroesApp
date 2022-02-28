package com.superheroapp.data.model.dataJson

import com.google.gson.annotations.SerializedName

data class MarvelJson(
    val attributionHTML: String = "",
    val attributionText: String = "",
    val code: Int = 0,
    val copyright: String = "",
    @SerializedName("data") val data: Data = Data(),
    val etag: String = "",
    val status: String = ""
)