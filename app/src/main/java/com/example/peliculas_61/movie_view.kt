package com.example.peliculas_61

import android.os.Bundle
import androidx.navigation.fragment.navArgs
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.peliculas_61.databinding.FragmentMovieViewBinding



class movie_view : Fragment() {
    private lateinit var binding: FragmentMovieViewBinding

    private val argumentos: movie_viewArgumentos by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_movie_view, container, false)
        val item = argumentos.item
        var listado_de_actores = ""
        binding.imageView.setImageResource(item.imagen_id)
        binding.titulo.text = item.titulo
        binding.director.text = item.director
        binding.genero.text = item.genero
        item.listadoDeActores.forEach { listado_de_actores = "\n "+listado_de_actores }

        return binding.root
    }


}