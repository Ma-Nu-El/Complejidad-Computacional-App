package com.ufrontera.java.Model.Core;

public class Diccionario {

    // Dependencias para crear diccionario con palabras
    // ordenadas.
    ListaDePalabras lista = new ListaDePalabras();

    private int filas = lista.getNumeroDeFilas();
    private int columnas = lista.getNumeroDeColumnas();

    String[][] diccionario = new String[this.filas][this.columnas];

    public String[][] getDiccionario() {
        return diccionario;
    }

}
