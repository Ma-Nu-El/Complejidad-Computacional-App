package com.ufrontera.java.Controller;

import com.ufrontera.java.Model.*;

public class Controller {


    public void start(){

        ConsoleUtilities consoleUtilities = new ConsoleUtilities();

        App app = new App();

        // agregar palabras al diccionario
        app.agregarPalabras();
        consoleUtilities.printHline();

        // mostrar las palabras tal como se introducen
        System.out.println("Palabras DESordenadas");
        app.mostrarPalabras();
        consoleUtilities.printHline();

        // mostrar por pantalla las palabras ordenadas
        // app.ordenarPalabras();
        // consoleUtilities.printHline();

        // mostrar las palabras tal como se introducen
        // System.out.println("palabras Ordenadas");
        app.mostrarPalabras();
        consoleUtilities.printHline();

        app.buscarPalabra();
        consoleUtilities.printHline();

        app.eliminarPalabra();
        consoleUtilities.printHline();

        app.mostrarPalabras();
        consoleUtilities.printHline();

        // guardar arbol ordenado a .txt
        app.guardarDiccionario();

    }

}
