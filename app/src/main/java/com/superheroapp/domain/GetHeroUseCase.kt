package com.superheroapp.domain

import com.superheroapp.data.model.dataJson.MarvelJson
import com.superheroapp.data.model.HeroRepository

class GetHeroUseCase {

    private val repository = HeroRepository()

    suspend operator fun invoke():MarvelJson? = repository.getMarvel()


}