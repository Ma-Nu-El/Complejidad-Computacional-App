package com.ufrontera.java.Controller;

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
    public static void main(String[] args) {

        Util utilities = new Util();

        utilities.printHline();
        utilities.printIntro();
        utilities.printHline();

        Controller controller = new Controller();
        controller.start();

    }

}
