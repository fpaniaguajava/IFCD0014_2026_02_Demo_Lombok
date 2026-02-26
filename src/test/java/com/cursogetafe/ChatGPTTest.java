package com.cursogetafe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChatGPTTest {


    private GestorPeliculas gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorPeliculas();
    }

    @Test
    void testAddPelicula_AgregaUnaPeliculaCorrectamente() {
        Pelicula pelicula = new Pelicula("Inception", "Christopher Nolan", "Thriller", 2010);

        gestor.addPelicula(pelicula);

        List<Pelicula> peliculas = gestor.getPeliculas();

        assertEquals(1, peliculas.size());
        assertTrue(peliculas.contains(pelicula));
    }

    @Test
    void testAddPelicula_AgregaMultiplesPeliculas() {
        Pelicula p1 = new Pelicula("Inception", "Christopher Nolan", "Thriller",2010);
        Pelicula p2 = new Pelicula("Interstellar", "Christopher Nolan", "Thriller",2014);

        gestor.addPelicula(p1);
        gestor.addPelicula(p2);

        assertEquals(2, gestor.getPeliculas().size());
    }

    @Test
    void testAddPelicula_NoEsNull() {
        Pelicula pelicula = new Pelicula("Dunkirk", "Christopher Nolan", "Thriller",2017);

        gestor.addPelicula(pelicula);

        assertNotNull(gestor.getPeliculas());
    }
}

