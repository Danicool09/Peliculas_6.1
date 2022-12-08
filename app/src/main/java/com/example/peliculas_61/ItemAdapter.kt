package com.example.peliculas_61

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView

import com.example.peliculas_61.model.Movie

class ItemAdapter(private val context: lista_movies, private val dataset:List<Movie>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){
    class ItemViewHolder(private val view:View):RecyclerView.ViewHolder(view){
        val cartel : ImageView = view.findViewById(R.id.cartel)
        val tituloPeli : TextView = view.findViewById(R.id.tituloPeli)
        val director : TextView = view.findViewById(R.id.director)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)
        return ItemViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.cartel.setImageResource(item.cartel)
        holder.tituloPeli.text = item.titulo
        holder.director.text = item.director

        holder.cartel.setOnClickListener{
            context.findNavController().navigate(R.id.action_lista_movies_to_movie_view)
        }
    }
    override fun getItemCount() = dataset.size
}