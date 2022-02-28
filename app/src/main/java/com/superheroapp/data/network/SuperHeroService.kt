package com.superheroapp.data.network

import com.superheroapp.core.RetrofitHelper
import com.superheroapp.data.model.dataJson.MarvelJson
import com.superheroapp.data.model.dataJson.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SuperHeroService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getSuperHeroes(): MarvelJson {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(HeroApiClient::class.java).getAllSuperHeroes()
            response.body() ?: MarvelJson()
        }
    }
    suspend fun getSuperHero(): Result {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(HeroApiClient::class.java).getAllSuperHero()
            response.body() ?: Result()
        }
    }

}