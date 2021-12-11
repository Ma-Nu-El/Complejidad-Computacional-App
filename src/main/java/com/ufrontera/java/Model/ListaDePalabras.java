package com.ufrontera.java.Model;

public class ListaDePalabras {

    // palabra, significado, tipo

    private String[][] lista = {
                { "Saltar", "Elevarse del suelo u otra superficie con impulso para caer en el mismo lugar o en otro.", "Verbo" },
                { "Volar", "Moverse por el aire usando alas o un medio artificial.", "Verbo" },
                { "Caminar", "Andar de un lugar a otro usando las piernas.", "Verbo" },
                { "Comer", "Tomar alimento por la boca.", "Verbo" },
                { "Escribir", "Representar ideas, palabras, números o notas musicales mediante letras u otros signos gráficos.", "Verbo" },
                { "Nacer", "Salir del vientre de la madre (o huevo).", "Verbo" },
                { "Aplaudir", "Chocar repetidamente las palmas de las manos.", "Verbo" },
                { "Nadar", "Avanzar en el agua [una persona o un animal] haciendo los movimientos con las manos.", "Verbo" },
                { "Decir", "Articular, pronunciar o emitir los sonidos de una lengua.", "Verbo" },
                { "Jugar", "Realizar una actividad o hacer una cosa, generalmente ejercitando alguna capacidad o destreza.", "Verbo" },
                { "Cantar", "Producir sonidos armoniosos o emitir su voz.", "Verbo" },
                { "Zarpar", "Trabajar con la zapa.", "Verbo" },
                { "Correr", "Desplazarse rápidamente.", "Verbo" }
                // // añadir mas palabras
        };

    public void printLista(){
        String[][] palabras = this.lista;
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[0].length; j++) {
                System.out.print(palabras[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String[][] getLista() {
        return lista;
    }

    public int getNumeroDeFilas(){
        int filas= this.lista.length;
        return filas;
    }

    public int getNumeroDeColumnas(){
        int columnas= this.lista[0].length;
        return columnas;
    }

}
