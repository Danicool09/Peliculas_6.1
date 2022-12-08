package com.example.peliculas_61

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.peliculas_61.data.Datasource
import com.example.peliculas_61.databinding.FragmentListaMoviesBinding


class lista_movies : Fragment() {
    private lateinit var binding: FragmentListaMoviesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val data = Datasource().movieList()
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_lista_movies,container,false)
        binding.reciclerViewMovies.adapter = ItemAdapter(this,data)

        return binding.root
    }




}