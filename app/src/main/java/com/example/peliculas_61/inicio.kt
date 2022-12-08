package com.example.peliculas_61

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.peliculas_61.databinding.FragmentInicioBinding



class inicio : Fragment() {
    private lateinit var binding: FragmentInicioBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_inicio,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.buttonInicio.setOnClickListener{view :View-> view.findNavController().navigate(R.id.action_inicio_to_lista_movies)}
    }


}