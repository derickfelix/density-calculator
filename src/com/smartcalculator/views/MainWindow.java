/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartcalculator.views;

import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author derickfelix
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnShowDensity = new javax.swing.JButton();
        btnShowVolume = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartCalculator");

        btnShowDensity.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        btnShowDensity.setText("Density");
        btnShowDensity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDensityActionPerformed(evt);
            }
        });

        btnShowVolume.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        btnShowVolume.setText("Volume");
        btnShowVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowVolumeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select a Calculator Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShowDensity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnShowVolume, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnShowDensity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShowVolume)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowDensityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDensityActionPerformed
        // TODO add your handling code here:
        DensityCalculator dc = new DensityCalculator();
        dc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnShowDensityActionPerformed

    private void btnShowVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowVolumeActionPerformed
        // TODO add your handling code here:
        VolumeCalculator vc = new VolumeCalculator();
        vc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnShowVolumeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the System look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            String systemLookAndFeel = javax.swing.UIManager.getSystemLookAndFeelClassName();
            javax.swing.UIManager.setLookAndFeel(systemLookAndFeel);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println("Error: " + e);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowDensity;
    private javax.swing.JButton btnShowVolume;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
