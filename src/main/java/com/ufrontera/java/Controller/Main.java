package com.ufrontera.java.Controller;

import com.ufrontera.java.Model.*;

/**
 * Diccionario Interactivo
 * Complejidad Computacional
 * Universidad de La Frontera
 *
 * [2021-12-04 Sat]
 * Authores: godoi-misael_hijerra-camilo_sepulveda-jose_fuica-morales-manuel
 *           Godoi Misael
 *           Hijerra Camilo
 *           Sepulveda Jose
 *           Fuica Morales Manuel
 */

public class Main {
    public static void main( String[] args ) {
        String hline = "---------------------------------";
        System.out.println(hline);
        printIntro();
        System.out.println(hline);

        App aplicacion = new App();

        aplicacion.mostrarPalabras();
        System.out.println(hline);


        aplicacion.buscarPalabra();
        System.out.println(hline);


        aplicacion.agregarPalabras();
        System.out.println(hline);


        aplicacion.eliminarPalabra();
        System.out.println(hline);


        System.out.println(hline);
        System.out.println("Fin.");
    }

    public static void printIntro(){
        System.out.println("Complejidad Computacional");
        System.out.println("Proyecto Final");
    }
}
