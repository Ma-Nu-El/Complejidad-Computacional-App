package com.ufrontera.java.Controller;

import com.ufrontera.java.Model.*;

public class Controller {


    public void start(){

        Util utilities = new Util();

        App app = new App();

        /*EN ESTE CÓDIGO INVOCAMOS EL METODO AGREGAR PALABRA*/
        app.agregarPalabras();
        utilities.printHline();

         /*EN ESTE CÓDIGO INVOCAMOS EL METODO MOSTRAR PALABRA*/
        app.mostrarPalabras();
        utilities.printHline();

         /*EN ESTE CÓDIGO INVOCAMOS EL METODO BUSCAR PALABRA*/
        app.buscarPalabra();
        utilities.printHline();

         /*EN ESTE CÓDIGO INVOCAMOS EL METODO ELIMINAR PALABRA*/
        app.eliminarPalabra();
        utilities.printHline();

         /*EN ESTE CÓDIGO INVOCAMOS EL METODO MOSTRAR PALABRA*/
        app.mostrarPalabras();
        utilities.printHline();

    }

}
