package com.example.peliculas_61.data


import com.example.peliculas_61.R
import com.example.peliculas_61.model.Movie

class Datasource {
    fun movieList(): List<Movie> {
        return listOf<Movie>(
            Movie(
                "Toy Storie",
                "John Lasseter",
                "animada",
                R.drawable.toy_story,
                arrayOf("Andrew Stanon","Joel Cohen")
            ),

            Movie(
                "La vida es bella",
                "Roberto Benigni",
                "drama",
                R.drawable.la_vida_es_bella,
                arrayOf("Nicoletta Braschi")
            ),

            Movie(
                "Interestellar",
                "Chirtopher Nola",
                "drama",
                R.drawable.interstellar,
                arrayOf("Matt Daemon")),

            Movie(
                "En busca del arca perdida",
                "Steven Spielberg",
                "aventura",
                R.drawable.arca_perdida,
                arrayOf("Harrison Ford")
            ),
                Movie(
                    "Platoon",
                    "Oliver Stone",
                    "belica",
                    R.drawable.platoon,
                    arrayOf("Willem Dafoe")

                )

        )
    }
}