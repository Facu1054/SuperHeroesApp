package com.superheroapp.ui.view.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.superheroapp.data.model.dataJson.Result
import com.superheroapp.databinding.ItemSuperheroBinding

//Conecta la vista con los datos
class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: Result, onclickListener:(Result) -> Unit){
        with(binding) {

            tvNameSuperHero.text = superHeroModel.name
            tvDescription.text = superHeroModel.description
            Picasso.get()
                .load(superHeroModel.thumbnail.path+"."+superHeroModel.thumbnail.extension)
                .into(imgSuperHero)
            itemView.setOnClickListener {
                onclickListener(superHeroModel)

            }
        }

    }


}