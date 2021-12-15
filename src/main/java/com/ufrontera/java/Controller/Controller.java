package com.ufrontera.java.Controller;

import java.io.FileNotFoundException;

import com.ufrontera.java.Model.ConsoleUtilities.*;
import com.ufrontera.java.Model.Core.App;
import com.ufrontera.java.Vista.MenuPrincipal;

public class Controller {

        // Crear el nucleo.
        private App app = new App();

        public void startCLI() throws FileNotFoundException {

                // Crear CLI
                ConsoleUtilities console = new ConsoleUtilities();

                // Inicializar CLI
                console.init();

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

                // Descomentar las que se quieren ejecutar.

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

        public void startGUI() throws FileNotFoundException{

                // Crear GUI
                MenuPrincipal vista = new MenuPrincipal();
                // Inicializar GUI
                vista.init();

        }

}
