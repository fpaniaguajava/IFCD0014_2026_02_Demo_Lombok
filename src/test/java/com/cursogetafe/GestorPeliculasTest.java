package com.cursogetafe;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class GestorPeliculasTest {
    @BeforeAll
    public static void antesDeTodo() {
        //Código de preparación del entorno de pruebas para TODOS los test
    }

    @BeforeEach
    public void antesDeCadaTest() {
       //Código de preparación del entorno de pruebas para CADA UNO de los test
    }

    @Test
    public void test1() {

    }

    @AfterEach
    public void despuesDeCadaTest() {
        //Código de restauración del entorno de pruebas para CADA UNO de los test
    }

    @AfterAll
    public static void despuesDeTodo() {
        //Código de restauración del entorno de pruebas para TODOS los test
    }
}
