package com.example.deflatam_weatherapp.model

// Obtener el listado de las ciudades

data class PronosticoResponse(
    val list: List<DiaPronostico>
)

// Obtenenemos el pronóstico por día

data class DiaPronostico(
    val dt_txt: String,
    val main: Main,
    val weather: List<Weather>
)
