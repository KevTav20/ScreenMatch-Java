package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmath.modelos.Pelicula;

public class calculadoraDeTiempo {
    private int tiempoTotal;

    public void incluye(Pelicula pelicula){
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }
}
