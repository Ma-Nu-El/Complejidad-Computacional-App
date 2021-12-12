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

        // Menu
        App app = new App();

        // app.printMenu();

        // Preguntar por posicion de archivo a importar
        // app.preguntarDirectorio();

        // Agregar palabras al diccionario desde la app misma
        // app.agregarPalabras();
        // consoleUtilities.printHline();

        // Importar archivo con palabras
        app.importarArchivo();
        // consoleUtilities.printHline();

        // Mostrar las palabras tal como se insertaron
        // System.out.println("Palabras DESordenadas");
        // app.mostrarPalabras();
        // consoleUtilities.printHline();

        // mostrar por pantalla las palabras ordenadas
        app.mostrarPalabrasOrdenadas();
        // consoleUtilities.printHline();

        // app.buscarPalabra();
        // consoleUtilities.printHline();

        // app.eliminarPalabra();
        // consoleUtilities.printHline();

        // guardar arbol ordenado a .txt
        app.exportarDiccionario();


        // Utilizar pilas y colas para reordenar
        // diccionario alfabeticamente al derecho
        // y al reves.


    }

}
