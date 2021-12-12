package com.ufrontera.java.Model.Core;


public class Palabra {
    private String nombre;
    private String significado;
    private String clasificacion;

    public Palabra(String nombre, String significado, String clasificacion) {
        this.nombre = nombre;
        this.significado = significado;
        this.clasificacion = clasificacion;
    }

    public void mostrarNombre() {
        System.out.println(nombre);
    }

    public void mostrarSignificado(){
        System.out.println("\t Sign: " + significado);
    }

    public void mostrarClasificacion(){
        System.out.println("\t Clas: " + clasificacion);
    }


    // Getters
    public String getNombre() {
        return nombre;
    }

    // public void setNombre(String nombre) {
    //     this.nombre = nombre;
    // }

    public String getSignificado() {
        return significado;
    }

    // public void setSignificado(String significado) {
    //     this.significado = significado;
    // }

    public String getClasificacion() {
        return clasificacion;
    }

    // public void setClasificacion(String clasificacion) {
    //     this.clasificacion = clasificacion;
    // }
}
