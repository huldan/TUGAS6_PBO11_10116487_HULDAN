/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.huldan.latihanmvcjdbc.view;

import edu.huldan.latihanmvcjdbc.error.PelangganException;
import java.sql.SQLException;

/**
 * NIM   : 10116487
 * Nama  : Selly Huldan               
 * Kelas : PBO-11
 * 
 */
public class MainViewPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form MainViewPelanggan
     */
    public MainViewPelanggan() {
        initComponents();
        
    }

    public void loadDatabase() throws SQLException, PelangganException {
        pelangganView1.loadDatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pelangganView1 = new edu.huldan.latihanmvcjdbc.view.PelangganView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Pendataan Pelanggan Barbershop");
        getContentPane().add(pelangganView1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.huldan.latihanmvcjdbc.view.PelangganView pelangganView1;
    // End of variables declaration//GEN-END:variables
}
