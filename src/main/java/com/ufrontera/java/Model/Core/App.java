package com.ufrontera.java.Model.Core;

import java.io.*;

import com.ufrontera.java.Model.ConsoleUtilities.ConsoleUtilities;
import com.ufrontera.java.Model.Menu.ConsoleMenu;

public class App {

        // Creamos el arbol donde se almacenaran las palabras
        Tree palabras = new Tree();

        // Lista de palabras pre-codificada
        ListaDePalabras listaDePalabras = new ListaDePalabras();

        // Crear diccionario
        Diccionario diccionario = new Diccionario();

        // Dependencias outputFile
        String outputFileExtension = ".txt";
        String outputFileName = "Diccionario";
        String outputFile = (outputFileName + outputFileExtension);
        File newFile = new File(outputFile);

        // Dependencias Menu
        ConsoleMenu menu = new ConsoleMenu();

        // Acciones de la app

        public void printMenu() {
                ConsoleUtilities console = new ConsoleUtilities();
                console.printMenu();
        }

        public void agregarPalabras() {

                try {
                        String[][] lista = listaDePalabras.getLista();

                        for (int i = 0; i < lista.length; i++) {
                                palabras.agregar(lista[i][0], lista[i][1], lista[i][2]);
                        }

                        String addedWordsMessage = "Palabras leidas desde el codigo.";
                        System.out.println(addedWordsMessage);

                } catch (Throwable e) {
                        System.out.println("Error " + e.getMessage());
                        e.printStackTrace();
                }
        }

        public void mostrarPalabras() {
                // listaDePalabras.printLista();
                palabras.mostrar();
        }

        public void mostrarPalabrasOrdenadas() {
                System.out.println("Mostrar palabras:");
                palabras.mostrar();
        }

        public void buscarPalabra() {
                String palabraBuscada = "Saltar";
                System.out.println("-Palabra buscada: " + palabraBuscada);
                palabras.find(palabraBuscada).mostrarNombre();
        }

        public void eliminarPalabra() {
                String palabra = "Saltar";
                System.out.println("Eliminando:" + palabra);
                palabras.eliminar(palabra);
                System.out.println(palabra + " eliminada.");
        }


        // Guardar output de 'palabras.ordenar()' a
        // un 'diccionario.txt'
        public void exportarDiccionario() {

                String fileSavedMessage = "Diccionario guardado en: ";

                try {
                        PrintStream ps = new PrintStream(newFile);
                        palabras.guardarDiccionario(ps);

                        // Avisar que el diccionario se
                        // guarda exitosamente.
                        System.out.println(fileSavedMessage + outputFile);

                } catch (Throwable e) {
                        System.out.println("Error " + e.getMessage());
                        e.printStackTrace();
                }
        }

        // Importar archivo
        public void importarArchivo() throws FileNotFoundException {
                // String inputFilePath =
                // "/home/ma/myDrive/java-projects/Complejidad-Computacional-App/inputFile.txt";
                String inputFilePath = "inputFile.txt";
                File archivo = new File(inputFilePath);
                // InputFile inputFile = new InputFile();
                // inputFile.importFile(archivo);

                // https://www.w3schools.com/java/java_files_read.asp
                // https://stackoverflow.com/questions/5868369/how-can-i-read-a-large-text-file-line-by-line-using-java

                try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
                        System.out.println("Leyendo " + inputFilePath);
                        while (br.ready()) {

                                String nombre;
                                String significado;
                                String clasificacion;

                                nombre = br.readLine();
                                significado = br.readLine();
                                clasificacion = br.readLine();

                                // System.out.println(nombre + " " + significado + " " + clasificacion + ".");
                                palabras.agregar(nombre, significado, clasificacion);
                        } // end while
                        String importedFileMessage = "Archivo importado.";
                        System.out.println(importedFileMessage);
                        br.close();
                } // end try
                catch (FileNotFoundException e) {
                        String errmsg = "Error.";
                        System.out.println(errmsg);
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
