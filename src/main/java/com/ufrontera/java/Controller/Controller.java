package com.ufrontera.java.Controller;

import java.io.FileNotFoundException;

import com.ufrontera.java.Model.ConsoleUtilities.*;
import com.ufrontera.java.Model.Core.*;

public class Controller {

        public App app = new App();

        public void start() throws FileNotFoundException {

                ConsoleUtilities console = new ConsoleUtilities();

                console.initConsole();

                // Saludo inicial
                console.printIntro();
                // consoleUtilities.printHline();

                // ACCIONES DEL MENU
                // ---------------------------------------
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

                // Eliminar palabra
                // app.eliminarPalabra();

                // Buscar palabra
                // app.buscarPalabra();

                // --------------------------------------

                // DEBUG:
                // --------------------------------------
                // Mostrar las palabras tal como se insertaron
                // System.out.println("Palabras DESordenadas");
                // app.mostrarPalabras();
                // consoleUtilities.printHline();
                // --------------------------------------

        }


}
