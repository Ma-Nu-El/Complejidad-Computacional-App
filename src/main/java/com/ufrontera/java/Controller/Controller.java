package com.ufrontera.java.Controller;

import java.io.FileNotFoundException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.ufrontera.java.Model.ConsoleUtilities.*;
import com.ufrontera.java.Model.Core.App;
import com.ufrontera.java.View.View;

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
                // app.importarArchivo();

                // Exportar arbol ordenado a una lista
                // app.exportarDiccionario();

                // Mostrar por pantalla
                // app.mostrarPalabrasOrdenadas();

                // Agregar palabras al diccionario desde la app
                // app.agregarPalabras();

                // Eliminar palabra
                // app.eliminarPalabra();

                // Buscar palabra
                app.buscarPalabra();

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
                View vista = new View();
                vista.setVisible(true);

                // ACCIONES DEL MENU
                vista.addImportListener(new ImportListener());
                vista.addExportListener(new ExportListener());
                vista.addDisplayListener(new DisplayListener());
                vista.addAddListener(new AddListener());
                vista.addDeleteListener(new DeleteListener());
                vista.addSearchListener(new SearchListener());

        }

        class ImportListener implements ActionListener{

                @Override
                public void actionPerformed(ActionEvent arg0) {
                        try {
                                app.importarArchivo();
                                System.out.println("Archivo importado.");
                        } catch (FileNotFoundException e) {
                                e.printStackTrace();
                        }
                }

        }

        class ExportListener implements ActionListener{

                @Override
                public void actionPerformed(ActionEvent arg0) {
                        app.exportarDiccionario();
                        System.out.println("Archivo exportado.");
                }

        }

        class DisplayListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent arg0) {
                    app.mostrarPalabras();
            }
        }

        class AddListener implements ActionListener {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                        app.agregarPalabras();
                        // System.out.println("Demo: agregar palabra.");

                }
        }

        class DeleteListener implements ActionListener {

                @Override
                public void actionPerformed(ActionEvent arg0) {

                        app.eliminarPalabra();
                        // System.out.println("Demo: eliminar palabra.");
                }
        }

        class SearchListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent arg0) {
                    app.buscarPalabra();
                    // System.out.println("Demo: buscar palabra.");
            }
        }

}
