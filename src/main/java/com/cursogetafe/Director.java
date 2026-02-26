package com.cursogetafe;

/**
 * Representa un <a href="https://es.wikipedia.org/wiki/Director_de_cine">director de cine</a>
 *
 * @author FPA
 * @since 1.0
 *
 */
public class Director {
    private String nombre;
    private String nacionalidad;
    private int anyoNacimiento;

    /**
     * Constructor de la clase
     * @param nombre Nombre del director
     * @param nacionalidad Nacionalidad del director
     * @param anyoNacimiento Año de nacimeinto
     */
    public Director(String nombre, String nacionalidad, int anyoNacimiento) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.anyoNacimiento = anyoNacimiento;
    }

    /**
     * Devuelve la edad del director (suponiendo que estamos en 2026)
     *
     * @return La edad del director expresada en años
     */
    public int getEdad(){
        //Solo funciona en el año 2026
        return 2026-this.anyoNacimiento;
    }

    private void validar(){
        //No hace nada
    }
}
