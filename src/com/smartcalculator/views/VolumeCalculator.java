/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartcalculator.views;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author derickfelix
 */
public class VolumeCalculator extends javax.swing.JFrame {

    private char guestResult;
    /**
     * Creates new form VolumeCalculator
     */
    public VolumeCalculator() {
        initComponents();
        configComponents();
    }
    private void configComponents(){
        this.spnHeight.setEnabled(false);
        this.spnWidth.setEnabled(false);
        this.spnLength.setEnabled(false);
        this.spnVolume.setEnabled(false);
        this.lblResult.setText("");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneSelect = new javax.swing.JPanel();
        btnLength = new javax.swing.JButton();
        btnHeight = new javax.swing.JButton();
        btnWidth = new javax.swing.JButton();
        btnVolume = new javax.swing.JButton();
        paneValues = new javax.swing.JPanel();
        lblWaterImage = new javax.swing.JLabel();
        spnHeight = new javax.swing.JSpinner();
        spnWidth = new javax.swing.JSpinner();
        spnLength = new javax.swing.JSpinner();
        spnVolume = new javax.swing.JSpinner();
        lblTitleVolume = new javax.swing.JLabel();
        paneResult = new javax.swing.JPanel();
        btnCalculate = new javax.swing.JButton();
        lblTitleResult = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Volume Calculator");
        setResizable(false);

        paneSelect.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnLength.setText("Length");
        btnLength.setToolTipText("Select Length");
        btnLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLengthActionPerformed(evt);
            }
        });

        btnHeight.setText("Height");
        btnHeight.setToolTipText("Select Height");
        btnHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeightActionPerformed(evt);
            }
        });

        btnWidth.setText("Width");
        btnWidth.setToolTipText("Select Width");
        btnWidth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWidthActionPerformed(evt);
            }
        });

        btnVolume.setText("Volume");
        btnVolume.setToolTipText("Select Length");
        btnVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneSelectLayout = new javax.swing.GroupLayout(paneSelect);
        paneSelect.setLayout(paneSelectLayout);
        paneSelectLayout.setHorizontalGroup(
            paneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSelectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneSelectLayout.createSequentialGroup()
                        .addGroup(paneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLength, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnWidth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneSelectLayout.setVerticalGroup(
            paneSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSelectLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnHeight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnWidth)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLength)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolume)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        paneValues.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblWaterImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/smartcalculator/resources/volumeWaterPic.jpeg"))); // NOI18N

        spnHeight.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnHeight.setToolTipText("Height Measure");

        spnWidth.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnWidth.setToolTipText("Width Measure");

        spnLength.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnLength.setToolTipText("Length Measure");

        spnVolume.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnVolume.setToolTipText("Volume Measure");

        lblTitleVolume.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTitleVolume.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleVolume.setText("Volume");

        javax.swing.GroupLayout paneValuesLayout = new javax.swing.GroupLayout(paneValues);
        paneValues.setLayout(paneValuesLayout);
        paneValuesLayout.setHorizontalGroup(
            paneValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneValuesLayout.createSequentialGroup()
                .addGroup(paneValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneValuesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblWaterImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnWidth, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(spnHeight)))
                    .addGroup(paneValuesLayout.createSequentialGroup()
                        .addGroup(paneValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneValuesLayout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(spnLength, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paneValuesLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(lblTitleVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(spnVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneValuesLayout.setVerticalGroup(
            paneValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneValuesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitleVolume))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneValuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneValuesLayout.createSequentialGroup()
                        .addComponent(lblWaterImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(paneValuesLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(spnHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );

        paneResult.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCalculate.setText("Calculate");
        btnCalculate.setToolTipText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblTitleResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTitleResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleResult.setText("Result");
        lblTitleResult.setToolTipText("Result");

        lblResult.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblResult.setForeground(new java.awt.Color(42, 42, 42));
        lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResult.setText("00");

        javax.swing.GroupLayout paneResultLayout = new javax.swing.GroupLayout(paneResult);
        paneResult.setLayout(paneResultLayout);
        paneResultLayout.setHorizontalGroup(
            paneResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneResultLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitleResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneResultLayout.setVerticalGroup(
            paneResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneResultLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnCalculate)
                .addGap(18, 18, 18)
                .addComponent(lblTitleResult)
                .addGap(18, 18, 18)
                .addComponent(lblResult)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneValues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paneResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(paneValues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(paneSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void setZeroValues(){
        this.spnHeight.setValue(0);
        this.spnWidth.setValue(0);
        this.spnLength.setValue(0);
        this.spnVolume.setValue(0);
        this.lblResult.setText("");
    }
    private String removeLastZero(String number) {

        String string = "";
        String noPoint = "";
        if (number.endsWith("0")) {
            for (int i = 0; i < number.length() - 1; i++) {
                // get the value of the number
                string += number.charAt(i);
            }

            if (string.endsWith("0")) {
                for (int i = 0; i < string.length() - 2; i++) {
                    // get the value of the number
                    noPoint += number.charAt(i);
                }

                return noPoint;
            }

            return string;
        }

        return number;
    }
     private String formateNumber(Object arg) {
        String formated;
        formated = String.format("%.2f", arg);
        formated = removeLastZero(formated);
        
        return formated;
    }
    
    private void btnLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLengthActionPerformed
        // TODO add your handling code here:
        this.spnHeight.setEnabled(true);
        this.spnWidth.setEnabled(true);
        this.spnLength.setEnabled(false);
        this.spnVolume.setEnabled(true);
        this.guestResult = 'l';
        this.lblTitleResult.setText("Length");
        setZeroValues();
    }//GEN-LAST:event_btnLengthActionPerformed

    private void btnWidthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWidthActionPerformed
        // TODO add your handling code here:
        this.spnHeight.setEnabled(true);
        this.spnWidth.setEnabled(false);
        this.spnLength.setEnabled(true);
        this.spnVolume.setEnabled(true);
        this.guestResult = 'w';
        this.lblTitleResult.setText("Width");
        setZeroValues();
    }//GEN-LAST:event_btnWidthActionPerformed

    private void btnHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeightActionPerformed
        // TODO add your handling code here:
        this.spnHeight.setEnabled(false);
        this.spnWidth.setEnabled(true);
        this.spnLength.setEnabled(true);
        this.spnVolume.setEnabled(true);
        this.guestResult = 'h';
        this.lblTitleResult.setText("Height");
        setZeroValues();
        
    }//GEN-LAST:event_btnHeightActionPerformed

    private void btnVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeActionPerformed
        // TODO add your handling code here:
        this.spnHeight.setEnabled(true);
        this.spnWidth.setEnabled(true);
        this.spnLength.setEnabled(true);
        this.spnVolume.setEnabled(false);
        this.guestResult = 'v';
        this.lblTitleResult.setText("Volume");
        setZeroValues();
    }//GEN-LAST:event_btnVolumeActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        double length = (Integer) this.spnLength.getValue();
        double width = (Integer) this.spnWidth.getValue();
        double height = (Integer) this.spnHeight.getValue();
        double volume = (Integer) this.spnVolume.getValue();
        String result = "<html>";
        String formated;
        switch(guestResult){
            case 'v':
                volume = length * width * height;
                result += formateNumber(volume) + " V<sup>3</sup>";
                break;
            case 'l':
                length += (volume / height)/ width;
                result += formateNumber(length) + " l";
                break;
            case 'w':
                width += (volume / length)/ height;
                result += formateNumber(width) + " w";
                break;
            case 'h':
                height += (volume / length)/ width;
                result += formateNumber(height) + " h";
                break;
            default:
                JOptionPane.showMessageDialog(null, "You did not choice a value to find out yet.");
                break;
        }
        result += "</html>";
        this.lblResult.setText(result);
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VolumeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VolumeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VolumeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VolumeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VolumeCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnHeight;
    private javax.swing.JButton btnLength;
    private javax.swing.JButton btnVolume;
    private javax.swing.JButton btnWidth;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTitleResult;
    private javax.swing.JLabel lblTitleVolume;
    private javax.swing.JLabel lblWaterImage;
    private javax.swing.JPanel paneResult;
    private javax.swing.JPanel paneSelect;
    private javax.swing.JPanel paneValues;
    private javax.swing.JSpinner spnHeight;
    private javax.swing.JSpinner spnLength;
    private javax.swing.JSpinner spnVolume;
    private javax.swing.JSpinner spnWidth;
    // End of variables declaration//GEN-END:variables
}