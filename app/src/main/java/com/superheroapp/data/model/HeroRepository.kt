package com.superheroapp.data.model

import com.superheroapp.data.model.dataJson.MarvelJson
import com.superheroapp.data.network.SuperHeroService

class HeroRepository {

    private val api = SuperHeroService()


    suspend fun getMarvel():MarvelJson{
        val response = api.getSuperHeroes()

        SuperHeroProvider.results = response.data.results

        return response
    }



}