package com.ufrontera.java.Model;

import java.io.*;

public class App {

        // Creamos el arbol donde se almacenaran las palabras
        Tree palabras = new Tree();

        // Crear importar de palabras
        ListaDePalabras listaDePalabras = new ListaDePalabras();

        // Crear diccionario
        Diccionario diccionario = new Diccionario();

        public void agregarPalabras() {

                String[][] lista = listaDePalabras.getLista();

                for (int i = 0; i < lista.length; i++) {
                        palabras.agregar(lista[i][0], lista[i][1], lista[i][2]);
                }
        }

        public void mostrarPalabras() {
                // System.out.println("-Palabras agregadas al diccionario:");
                // palabras.ordenar();
                listaDePalabras.printLista();
        }

        // public void ordenarPalabras() {
        //         System.out.println("Palabras ordenadas:");
        //         palabras.ordenar();
        // }

        public void buscarPalabra() {
                String palabraBuscada = "Saltar";
                System.out.println("-Palabra buscada: " + palabraBuscada);
                palabras.find(palabraBuscada).mostrarNombre();
        }

        public void eliminarPalabra() {
                String palabraAEliminar = "Saltar";
                System.out.println("-Eliminar palabra: " + palabraAEliminar);
                palabras.eliminar(palabraAEliminar);
        }

        // Guardar output de 'palabras.ordenar()' a
        // un 'diccionario.txt'
        public void guardarDiccionario() {

                // 'palabras.ordenar' es un metodo
                // 'void' que imprime a consola;
                // queremos guardar ese output a un
                // archivo.

                try {
                        /**
                         * Dependencias para escribir
                         * output a un archivo.
                         */

                        String fileExtension = ".txt";
                        String filename = ("Diccionario"+fileExtension);
                        File newFile = new File(filename);
                        // FileWriter fileWriter = new FileWriter(newFile);
                        PrintStream ps = new PrintStream(newFile);

                        // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        // PrintWriter writer = new PrintWriter(bufferedWriter);

                        /**
                         * El metodo 'palabras.ordenar()'
                         * es tipo 'void'; por lo tanto
                         * no es admitido como parametro
                         * para el metodo 'write' del
                         * 'writer'.
                         * */
                        palabras.guardarDiccionario(ps);

                } catch (Throwable e) {
                        System.out.println("Error " + e.getMessage());
                        e.printStackTrace();
                }
        }
}
