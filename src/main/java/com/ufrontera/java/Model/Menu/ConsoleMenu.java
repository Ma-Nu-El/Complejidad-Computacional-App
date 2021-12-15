package com.ufrontera.java.Model.Menu;

import com.ufrontera.java.Model.ConsoleUtilities.*;

public class ConsoleMenu {
    // Ejemplo: https://www.youtube.com/watch?v=25kUc_ammbw
    //
    //import
    //display
    //export
    //modify
    //- add
    //- remove
    //- invert

    ConsoleUtilities console = new ConsoleUtilities();

    public void displayHeader(){

        console.printHline();
        System.out.println(console.getTitleIndent()+ "Diccionario Interactivo");
        System.out.println(console.getSubTitleIndent()+ "Menu");
        console.printHline();
        console.printHline();

    }

    public void displayImportOption (int counter, String indent){
        System.out.println(counter + indent + "Importar archivo.");
    }

    public void displayShowBufferedWordsOption(int counter, String indent){
        System.out.println(counter + indent + "Mostrar las palabras guardadas en memoria.");
    }

    public void displayOrderWordsOption(int counter, String indent){
        System.out.println(counter + indent + "Ordenar las palabras guardadas en memoria.");
    }

    public void displayExportOption (int counter, String indent){
        System.out.println(counter + indent + "Exportar las palabras guardadas en memoria a archivo.");
    }

    public void displayAddOption(int counter, String indent){
        System.out.println(counter + indent + "Agregar palabra a memoria.");
    }

    public void displayDeleteOption(int counter, String indent){
        System.out.println(counter + indent + "Borrar palabra de memoria.");
    }

    public void displaySearchWordOption(int counter, String indent){
        System.out.println(counter + indent + "Borrar palabra de memoria.");

    }

    public void displayInvertWordsOption(int counter, String indent){
        System.out.println(counter + indent + "Invertir orden de palabras en memoria.");
    }

    public void displayMenu(String indent){
        int counter=0;
        displayHeader();
        counter++;
        displayImportOption(counter, indent);
        counter++;
        displayShowBufferedWordsOption(counter, indent);
        counter++;
        displayOrderWordsOption(counter, indent);
        counter++;
        displayExportOption(counter, indent);
        counter++;
        displayAddOption(counter, indent);
        counter++;
        displayDeleteOption(counter, indent);
        counter++;
        displayInvertWordsOption(counter, indent);
    }
}
