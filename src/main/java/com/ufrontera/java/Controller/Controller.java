package com.ufrontera.java.Controller;

import java.io.FileNotFoundException;

import com.ufrontera.java.Model.ConsoleUtilities.*;
import com.ufrontera.java.Model.Core.*;

public class Controller {


    public void start() throws FileNotFoundException{

        ConsoleUtilities console = new ConsoleUtilities();
        // Saludo inicial
        console.initConsole();
        console.printIntro();
        // consoleUtilities.printHline();

        // Menu
        App app = new App();

        // app.printMenu();

        // Acciones del menu
        // -------------------------------------------------
        // Importar
        // Exportar
        // Mostrar
        // Agregar
        // Eliminar
        // Buscar

        // Importar archivo con palabras
        app.importarArchivo();

        // Exportar arbol ordenado a una lista
        app.exportarDiccionario();

        // Mostrar por pantalla
        // app.mostrarPalabrasOrdenadas();

        // Agregar palabras al diccionario desde la app
        // app.agregarPalabras();

        // app.eliminarPalabra();

        // app.buscarPalabra();


        // -------------------------------------------------
        // MAYBE:
        // Utilizar pilas y colas para reordenar
        // diccionario alfabeticamente al derecho
        // y al reves.

        // DEBUG:
        // Mostrar las palabras tal como se insertaron
        // System.out.println("Palabras DESordenadas");
        // app.mostrarPalabras();
        // consoleUtilities.printHline();

    }

}
