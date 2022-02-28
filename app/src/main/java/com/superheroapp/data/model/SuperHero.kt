package com.superheroapp.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SuperHero(
    @SerializedName("idSuper") val idSuper: String,
    @SerializedName("heroName") val heroName: String,
    @SerializedName("descripcion")val descripcion: String,
    @SerializedName("path")val image: String,
    @SerializedName("apariciones")val apariciones: String
    ): Parcelable
