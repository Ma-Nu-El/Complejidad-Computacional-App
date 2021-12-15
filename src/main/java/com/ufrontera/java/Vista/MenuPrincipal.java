/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ufrontera.java.Vista;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;

/**
 *
 * @author ma
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        // Ventana al medio de la pantalla
        this.setLocationRelativeTo(null);
        // Título de la ventana
        String windowTitle="Diccionario Universidad De La Frontera";
        this.setTitle(windowTitle);
        // Logo de la ventana
        setIconImage(new ImageIcon(getClass().getResource("Imagenes/logo.png")).getImage());
        transparenciaButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Importar = new javax.swing.JButton();
        Exportar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Importar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufrontera/java/Vista/Imagenes/importar.png"))); // NOI18N
        Importar.setText("Importar");
        jPanel1.add(Importar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 210, 70));

        Exportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufrontera/java/Vista/Imagenes/exportar.png"))); // NOI18N
        Exportar.setText("Exportar");
        jPanel1.add(Exportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, 210, 70));

        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufrontera/java/Vista/Imagenes/mostrar.png"))); // NOI18N
        Mostrar.setText("Mostrar");
        jPanel1.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 210, 60));

        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufrontera/java/Vista/Imagenes/agregar.png"))); // NOI18N
        Agregar.setText("Agregar");
        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 210, -1));

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufrontera/java/Vista/Imagenes/eliminar.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, 210, 70));

        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufrontera/java/Vista/Imagenes/buscar.png"))); // NOI18N
        Buscar.setText("Buscar");
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 210, 70));

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufrontera/java/Vista/Imagenes/salir.png"))); // NOI18N
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 690, 100, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufrontera/java/Vista/Imagenes/fondo.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {
    //GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */

    public void init() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Exportar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Importar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Salir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    public void transparenciaButton(){

        Salir.setContentAreaFilled(false);

    }

    // LISTENERS
    // Importar
    public void ImportButton(ActionListener listenForImportButton ){
        Importar.addActionListener(listenForImportButton);
    }

    // Exportar
    public void ExportButton(ActionListener listenForExportButton ){
        Exportar.addActionListener(listenForExportButton);
    }

    // Mostrar
    public void DisplayButton(ActionListener listenForDisplayButton ){
        Mostrar.addActionListener(listenForDisplayButton);
    }

    // Agregar
    public void AddButton(ActionListener listenForAddButton ){
        Agregar.addActionListener(listenForAddButton);
    }

    // Eliminar
    public void DeleteButton(ActionListener listenForDeleteButton ){
        Eliminar.addActionListener(listenForDeleteButton);
    }

    // Buscar
    public void SearchButton(ActionListener listenForSearchButton ){
        Buscar.addActionListener(listenForSearchButton);
    }

}