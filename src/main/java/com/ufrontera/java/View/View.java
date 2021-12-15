package com.ufrontera.java.View;

// This is the View
// Its only job is to display what the user sees
// It performs no calculations, but instead passes
// information entered by the user to whomever needs
// it.

import java.awt.event.ActionListener;

import javax.swing.*;

public class View extends JFrame{

	private JTextField firstNumber  = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
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

    public View(){

		// Sets up the view and adds the components

		JPanel calcPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);

		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);


		calcPanel.add(importButton);
		calcPanel.add(exportButton);
		calcPanel.add(displayButton);
		calcPanel.add(addButton);
		calcPanel.add(deleteButton);
		calcPanel.add(searchButton);

		this.add(calcPanel);

		// End of setting up the components --------

	}

	public int getFirstNumber(){

		return Integer.parseInt(firstNumber.getText());

	}

	public int getSecondNumber(){

		return Integer.parseInt(secondNumber.getText());

	}

	public int getCalcSolution(){

		return Integer.parseInt(calcSolution.getText());

	}

	public void setCalcSolution(int solution){

		calcSolution.setText(Integer.toString(solution));

	}

	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed

    // Listener para boton 'Importar'
	public void addImportListener(ActionListener listenForCalcButton){

		importButton.addActionListener(listenForCalcButton);

	}


    // Listener para boton 'Exportar'
	public void addExportListener(ActionListener listenForCalcButton){

		exportButton.addActionListener(listenForCalcButton);

	}


	// Open a popup that contains the error message passed

	public void displayErrorMessage(String errorMessage){

		JOptionPane.showMessageDialog(this, errorMessage);

	}

}
