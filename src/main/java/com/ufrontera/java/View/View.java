package com.ufrontera.java.View;

// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it.

import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame {

    // Importar
    // Exportar
    // Mostrar
    // Agregar
    // Eliminar
    // Buscar
    private JButton importButton = new JButton("Importar");
    private JButton exportButton = new JButton("Exportar");
    private JButton displayButton = new JButton("Mostrar");
    private JButton addButton = new JButton("Agregar");
    private JButton deleteButton = new JButton("Borrar");
    private JButton searchButton = new JButton("Buscar");

    public View() {

        // Sets up the view and adds the components

        JPanel appPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 700);

        appPanel.add(importButton);
        appPanel.add(exportButton);
        appPanel.add(displayButton);
        appPanel.add(addButton);
        appPanel.add(deleteButton);
        appPanel.add(searchButton);

        this.add(appPanel);

        // End of setting up the components --------

    }


    // LISTENERS

    // Listener para boton 'Importar'
    public void addImportListener(ActionListener listenForImportButton) {

        importButton.addActionListener(listenForImportButton);

    }

    // Listener para boton 'Exportar'
    public void addExportListener(ActionListener listenForExportButton) {

        exportButton.addActionListener(listenForExportButton);

    }

    // Listener para boton 'Mostrar'
    public void addDisplayListener(ActionListener listenForDisplayButton){
        displayButton.addActionListener(listenForDisplayButton);
    }

    // Listener para boton 'Agregar'
    public void addAddListener(ActionListener listenForAddButton){
        addButton.addActionListener(listenForAddButton);

    }

    // Listener para boton 'Borrar'
    public void addDeleteListener(ActionListener listenForDeleteButton){
        deleteButton.addActionListener(listenForDeleteButton);
    }

    // Listener para boton 'Buscar'
    public void addSearchListener(ActionListener listenForSearchButton){
        searchButton.addActionListener(listenForSearchButton);
    }


    // Open a popup that contains the error message passed

    public void displayErrorMessage(String errorMessage) {

        JOptionPane.showMessageDialog(this, errorMessage);

    }

}
