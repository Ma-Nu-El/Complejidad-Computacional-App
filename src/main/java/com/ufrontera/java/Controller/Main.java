package com.ufrontera.java.Controller;

/**
 * Diccionario Interactivo Complejidad Computacional Universidad de La Frontera
 *
 * [2021-12-04 Sat] Autores:
 * godoi-misael_hijerra-camilo_sepulveda-jose_fuica-morales-manuel Godoi Misael
 *
 * Godoi Misael
 * Hijerra Camilo
 * Sepulveda Jose
 * Fuica Morales Manuel
 */

public class Main {
    public static void main(String[] args) {

        ConsoleUtilities consoleUtilities = new ConsoleUtilities();

        consoleUtilities.printHline();
        consoleUtilities.printIntro();
        consoleUtilities.printHline();

        Controller controller = new Controller();
        controller.start();

    }
}
