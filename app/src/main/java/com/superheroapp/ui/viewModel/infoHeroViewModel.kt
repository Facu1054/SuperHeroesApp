package com.superheroapp.ui.viewModel

import androidx.lifecycle.*
import com.superheroapp.data.model.dataJson.Result
import com.superheroapp.data.model.SuperHero

class infoHeroViewModel(): ViewModel() {
    private var superHeroSelected = MutableLiveData<Result>()
    private var idSelected = MutableLiveData<Int>()
    val superHeroModel = MutableLiveData<SuperHero>()


    //var idHero = id

    fun getSelectedHero(): LiveData<Result> {
        return superHeroSelected
    }
    fun setSelectedHero(superHero: Result){
        superHeroSelected.value = superHero
    }
    fun getSelectedId(): LiveData<Int> {
        return idSelected
    }
    fun setSelectedId(id: Int){
        idSelected.value = id
    }
    fun getSelectedSuperHero(): LiveData<SuperHero> {
        return superHeroModel
    }
    fun setSelectedSuperHero(superHero: SuperHero){
        superHeroModel.value = superHero
    }




}

