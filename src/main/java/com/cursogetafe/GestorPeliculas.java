package com.cursogetafe;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class GestorPeliculas {
    private List<Pelicula> peliculas = new ArrayList<Pelicula>();
    public void addPelicula(Pelicula nuevaPelicula) {
        this.peliculas.add(nuevaPelicula);
    }
}
