package com.superheroapp.ui.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.superheroapp.R
import com.superheroapp.data.model.dataJson.Result

//Convierte un listado en un RecyclerView
class SuperHeroAdapter(private var superHeroesList:List<Result>, private val onClickListener:(Result) -> Unit) : RecyclerView.Adapter<SuperHeroViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superHeroesList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int {
        return superHeroesList.size
    }
    fun setListHeroes(heroes: List<Result>) {
        this.superHeroesList = heroes as MutableList<Result>
        notifyDataSetChanged()
    }

}
/*

class SuperHeroAdapter(private var superHeroesList:List<SuperHero>, private val onClickListener:(SuperHero) -> Unit) : RecyclerView.Adapter<SuperHeroViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superHeroesList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int {
        return superHeroesList.size
    }
    fun setListHeroes(heroes: List<SuperHero>) {
        this.superHeroesList = heroes as MutableList<SuperHero>
        notifyDataSetChanged()
    }

}
 */