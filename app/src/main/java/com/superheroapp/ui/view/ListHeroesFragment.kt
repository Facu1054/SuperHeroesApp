package com.superheroapp.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.superheroapp.R
import com.superheroapp.data.model.SuperHero
import com.superheroapp.data.model.dataJson.Result
import com.superheroapp.databinding.FragmentListHeroesBinding
import com.superheroapp.ui.view.adapter.SuperHeroAdapter
import com.superheroapp.ui.viewModel.listHeroViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListHeroesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
interface Communicator {

    fun passData(idSuper: String)

}
class ListHeroesFragment : Fragment() {

    private var _binding: FragmentListHeroesBinding? = null
    private val binding get()=_binding!!
    private val listHeroViewModel: listHeroViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListHeroesBinding.inflate(inflater,container,false)

        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listHeroViewModel.onCreate()
        setupViewModel()
    }
    private fun setupViewModel() {
        listHeroViewModel.marvel.observe(this,{
            initRecyclerView(it.data.results)
        })

    }

    fun initRecyclerView(results: MutableList<Result>){
        binding.recyclerSuperHeroes.layoutManager = LinearLayoutManager(this.requireContext())
        binding.recyclerSuperHeroes.adapter =
            SuperHeroAdapter(results) { selectedHero ->
                onItemSelected(selectedHero)
            }

    }



    fun onItemSelected(superHero: Result){

        val superHe = SuperHero(superHero.id.toString(),
            superHero.name,superHero.description,
      superHero.thumbnail.path+"."+superHero.thumbnail.extension,
            superHero.comics.available.toString())
        //Se adjunta un objeto de tipo SuperHero
        val bundle = bundleOf("idSuper" to superHe)

        //Se hace la navegacion pero aparte se le envia un argumento
        view?.let { Navigation.findNavController(it).navigate(R.id.infoHeroFragment, bundle) }


    }

}