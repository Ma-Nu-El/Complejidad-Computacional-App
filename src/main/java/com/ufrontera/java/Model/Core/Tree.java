package com.ufrontera.java.Model.Core;

import java.io.PrintStream;

public class Tree {
    // Primer nodo del arbol
    private Node root;

    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.hijoDerecho;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.hijoIzquierdo;
        }

        if (successor != delNode.hijoDerecho) {

            successorParent.hijoIzquierdo = successor.hijoDerecho;

            successor.hijoDerecho = delNode.hijoDerecho;
        }
        return successor;
    } // Fin getSuccessor()


    // Imprimir palabras por pantalla.
    private void inOrder(Node node){

        if (node == null) {
            return;
        }

        inOrder(node.hijoIzquierdo);

        node.getPalabra().mostrarNombre();
        node.getPalabra().mostrarSignificado();
        node.getPalabra().mostrarClasificacion();

        inOrder(node.hijoDerecho);
    }

    // Guardar palabras a diccionario.
    private void inOrder(Node node, PrintStream ps) {

        if (node == null) {
            return;
        }

        inOrder(node.hijoIzquierdo, ps);

        ps.println(node.getPalabra().getNombre());
        ps.println(node.getPalabra().getSignificado());
        ps.println(node.getPalabra().getClasificacion());

        inOrder(node.hijoDerecho, ps);
    } // Fin inOrder()

    // Constructor
    public Tree() {
        root = null;
    }

    // Encontrar el nodo que tenga la palabra dada
    public Palabra find(String nombre) {
        /*
        SE DEFINE LA UBICACIÓN DE LA PALABRA PARA POSTERIORMENTE SER ORDENARDA Y ASIGNARLE UNA POSICIÓN DEFINIDA
        */
        Node current = this.root;

        while (!current.palabra.getNombre().toLowerCase().equals(nombre.toLowerCase())) {

            if (irIzquierda(nombre.toLowerCase(), current.palabra.getNombre().toLowerCase())) {
                current = current.hijoIzquierdo;
            } else {
                current = current.hijoDerecho;
            }
            if (current == null) {
                return null;
            }
        }
        return current.palabra;
    } // Fin find()

    // Agregar un nodo que contenga la palabra, significado y clasificacion
    public void agregar(String nombre, String significado, String clasificacion) {
        Node newNode = new Node();
        newNode.palabra = new Palabra(nombre, significado, clasificacion);

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;

                if (irIzquierda(nombre.toLowerCase(), current.palabra.getNombre().toLowerCase())) {
                    current = current.hijoIzquierdo;
                    if (current == null) {
                        parent.hijoIzquierdo = newNode;
                        return;
                    }
                } else {
                    current = current.hijoDerecho;
                    if (current == null) {
                        parent.hijoDerecho = newNode;
                        return;
                    }
                }
            }

        }
    } // Fin agregar()

    /*
    ELIMINA LA PALABRA INDICADA POR EL USUARIO EN LA CLASE APP
    */
    public boolean eliminar(String nombre) {
        Node current = root;
        Node parent = root;
        boolean esHijoIzquierdo = true;

        while (!current.palabra.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
            parent = current;

            if (irIzquierda(nombre.toLowerCase(), current.palabra.getNombre().toLowerCase())) {
                esHijoIzquierdo = true;
                current = current.hijoIzquierdo;
            } else {
                esHijoIzquierdo = false;
                current = current.hijoDerecho;
            }
            if (current == null) {
                return false;
            }
        } // Se obtiene el nodo a eliminar

        // Si no tiene hijos, se borra el nodo
        if (current.hijoIzquierdo == null && current.hijoDerecho == null) {
            if (current == root) {
                root = null;
            } else if (esHijoIzquierdo) {
                parent.hijoIzquierdo = null;
            } else {
                parent.hijoDerecho = null;
            }

        } else if (current.hijoDerecho == null) {
            if (current == root) {
                root = current.hijoIzquierdo;
            } else if (esHijoIzquierdo) {
                parent.hijoIzquierdo = current.hijoIzquierdo;
            } else {
                parent.hijoDerecho = current.hijoIzquierdo;
            }

            // Si no tiene hijo izquierdo, se reemplaza por el subarbol derecho
        } else if (current.hijoIzquierdo == null) {
            if (current == root) {
                root = current.hijoDerecho;
            } else if (esHijoIzquierdo) {
                parent.hijoIzquierdo = current.hijoDerecho;
            } else {
                parent.hijoDerecho = current.hijoDerecho;
            }
        } else {
            Node successor = getSuccessor(current);

            if (current == root) {
                root = successor;
            } else if (esHijoIzquierdo) {
                parent.hijoIzquierdo = successor;
            } else {
                parent.hijoDerecho = successor;
            }
            successor.hijoIzquierdo = current.hijoIzquierdo;
        }
        return true; 
    } // Fin eliminar()

    // Mostrar palabras ordenadas por consola
    public void mostrar() {
        inOrder(this.root);
    } // Fin ordenar()

    // Guardar diccionario con palabras ordenadas
    public void guardarDiccionario(PrintStream ps) {
        inOrder(this.root, ps);
    } // Fin ordenar()

    /*
    COMPARA LETRA POR LETRA PARA LUEGO ORDENAR LAS PALABRAS
    */
    public static boolean irIzquierda(String nombreNuevo, String nombreActual) {
        boolean irIzquierda = false;

        // abecedario
        char[] abc = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
            'x', 'y', 'z'};

        
        int cont = 0, limite = 0;

        if (nombreNuevo.length() > nombreActual.length()) {
            limite = nombreActual.length();
        } else if (nombreActual.length() > nombreNuevo.length()) {
            limite = nombreNuevo.length();
        } else if (nombreNuevo.length() == nombreActual.length()) {
            limite = nombreNuevo.length();
        }

        while (cont < limite) {

            if (nombreNuevo.charAt(cont) == nombreActual.charAt(cont)) {
                if (cont == limite - 1 && nombreNuevo.length() > nombreActual.length()) {
                    irIzquierda = false;
                    break;

                } else if (cont == limite - 1 && nombreActual.length() > nombreNuevo.length()) {
                    irIzquierda = true;
                    break;
                }
                cont++;

            } else if (nombreNuevo.charAt(cont) != nombreActual.charAt(cont)) {
                int contNueva = 0, contActual = 0;
                char letraNueva = nombreNuevo.charAt(cont);
                char letraActual = nombreActual.charAt(cont);

                for (int i = 0; i < abc.length; i++) {
                    if (letraNueva == abc[i]) {
                        contNueva = i;

                    } else if (letraActual == abc[i]) {
                        contActual = i;
                    }
                }

                if (contNueva > contActual) {
                    irIzquierda = false;
                    break;

                } else if (contActual > contNueva) {
                    irIzquierda = true;
                    break;
                }
            }
        }
        return irIzquierda;
    } // Fin irIzquierda()

} // Fin Tree{}
