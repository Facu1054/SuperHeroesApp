package com.superheroapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.squareup.picasso.Picasso
import com.superheroapp.data.model.SuperHero
import com.superheroapp.databinding.FragmentInfoHeroBinding
import com.superheroapp.ui.viewModel.infoHeroViewModel


class InfoHeroFragment : Fragment() {
    private var _binding: FragmentInfoHeroBinding? = null
    private val binding get()=_binding!!

    private val infoHeroViewModel: infoHeroViewModel by viewModels()

    private lateinit var hero: SuperHero


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let{
            hero = it.getParcelable("idSuper")!!
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoHeroBinding.inflate(inflater,container,false)

        // Inflate the layout for this fragment
        return binding.root
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUiInfoHero(hero)

    }

    fun setUiInfoHero(superHero: SuperHero)
    {


        with(binding){
            tvNameSuperHero.text = superHero.heroName
            tvComics.text = superHero.apariciones
            tvDesciption.text = superHero.descripcion
            Picasso.get()
                .load(superHero.image)
                .into(imgSuperHero)

        }

    }

}