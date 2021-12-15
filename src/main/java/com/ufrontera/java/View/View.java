package com.ufrontera.java.View;

import java.awt.BorderLayout;

// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it.

import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame {

    private JPanel panel = new JPanel();

    private JButton importButton = new JButton("Importar");
    private JButton exportButton = new JButton("Exportar");
    private JButton displayButton = new JButton("Mostrar");
    private JButton addButton = new JButton("Agregar");
    private JButton deleteButton = new JButton("Borrar");
    private JButton searchButton = new JButton("Buscar");
    // private JButton closeButton = new JButton("Cerrar");

    public View() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 700);
        this.setTitle("UFRO Diccionario");
        this.add(panel);

        // Botones
        panel.add(importButton);
        panel.add(exportButton);
        panel.add(displayButton);
        panel.add(addButton);
        panel.add(searchButton);
        panel.add(deleteButton);
        panel.add(closeButton);

    }

    // LISTENERS

    // Boton 'Importar'
    public void addImportListener(ActionListener listenForImportButton) {

        importButton.addActionListener(listenForImportButton);

    }

    // Boton 'Exportar'
    public void addExportListener(ActionListener listenForExportButton) {

        exportButton.addActionListener(listenForExportButton);

    }

    // Boton 'Mostrar'
    public void addDisplayListener(ActionListener listenForDisplayButton){
        displayButton.addActionListener(listenForDisplayButton);
    }

    // Boton 'Agregar'
    public void addAddListener(ActionListener listenForAddButton){
        addButton.addActionListener(listenForAddButton);

    }

    // Boton 'Borrar'
    public void addDeleteListener(ActionListener listenForDeleteButton){
        deleteButton.addActionListener(listenForDeleteButton);
    }

    // Boton 'Buscar'
    public void addSearchListener(ActionListener listenForSearchButton){
        searchButton.addActionListener(listenForSearchButton);
    }


    // Open a popup that contains the error message passed

    public void displayErrorMessage(String errorMessage) {

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}
