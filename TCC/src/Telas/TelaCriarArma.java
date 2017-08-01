/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;

/**
 *
 * @author aluno
 */
public class TelaCriarArma extends javax.swing.JDialog {
    ImageIcon[] images;
    public TelaCriarArma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 

        images = new ImageIcon[100];
        Integer[] intArray = new Integer[100];
        for (int i = 1; i < 100; i++) {
            intArray[i] = new Integer(i);
            images[i] = new ImageIcon(getClass().getResource("/WeaponIcons/Iconsweapon(1).png"));
        }
        
        JComboBox caixa = new JComboBox(intArray);
        caixa.setAlignmentX(10);
        caixa.setAlignmentY(10);
        caixa.setPreferredSize(new Dimension(116, 58));
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
