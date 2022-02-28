package com.superheroapp.data.network

import com.superheroapp.data.model.dataJson.MarvelJson
import com.superheroapp.data.model.dataJson.Result
import retrofit2.Response
import retrofit2.http.GET

interface HeroApiClient {
    @GET("/v1/public/characters?ts=1&apikey=1378ff089b8c31cfb25aeac411efa755&hash=44ccc5cb7dc366523d38e60bf03caf31")
    suspend fun getAllSuperHeroes(): Response<MarvelJson>
    @GET("/v1/public/characters/1011334?ts=1&apikey=1378ff089b8c31cfb25aeac411efa755&hash=44ccc5cb7dc366523d38e60bf03caf31")
    suspend fun getAllSuperHero(): Response<Result>

}