package com.superheroapp.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.superheroapp.data.model.dataJson.MarvelJson
import com.superheroapp.domain.GetHeroUseCase
import com.superheroapp.data.model.SuperHero
import kotlinx.coroutines.launch

class listHeroViewModel: ViewModel() {
    val marvel = MutableLiveData<MarvelJson>()


    private var recyclerListData: MutableLiveData<List<SuperHero>>
    var getQuotesUseCase = GetHeroUseCase()
    init {
        recyclerListData =  MutableLiveData()
    }

    fun onCreate() {
        viewModelScope.launch {
            val result = getQuotesUseCase()

            if (result != null) {
                if(result.status == "Ok"){
                    //Se le asigna el valor obtenido de retrofit
                    marvel.postValue(result!!)
                }
            }
        }
    }







}