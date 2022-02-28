package com.superheroapp.data.model

import com.superheroapp.data.model.dataJson.Result

class SuperHeroProvider {
    //todo  va a proveer el listado de heroes
    companion object {
        var results: List<Result> = emptyList()
        var result: Result = Result()



    }
}