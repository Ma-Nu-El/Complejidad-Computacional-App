package com.ufrontera.java.Controller;

import java.io.FileNotFoundException;

import com.ufrontera.java.Model.*;

public class Controller {


    public void start() throws FileNotFoundException{

        ConsoleUtilities consoleUtilities = new ConsoleUtilities();

        App app = new App();

        // Agregar palabras al diccionario desde la app misma
        // app.agregarPalabras();
        // consoleUtilities.printHline();

        // Importar archivo con palabras
        app.importarArchivo();
        consoleUtilities.printHline();

        // Mostrar las palabras tal como se insertaron
        // System.out.println("Palabras DESordenadas");
        // app.mostrarPalabras();
        // consoleUtilities.printHline();

        // mostrar por pantalla las palabras ordenadas
        app.mostrarPalabrasOrdenadas();
        consoleUtilities.printHline();

        // app.buscarPalabra();
        // consoleUtilities.printHline();

        // app.eliminarPalabra();
        // consoleUtilities.printHline();

        // guardar arbol ordenado a .txt
        app.exportarDiccionario();

    }

}
