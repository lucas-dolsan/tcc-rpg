/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import ConexaoBanco.JogadorDAO;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.util.Random;
import javax.swing.text.NumberFormatter;

public class TelaRolarDado extends javax.swing.JDialog {

    private static NumberFormat format = NumberFormat.getInstance();
    private static NumberFormatter formatter = new NumberFormatter(format);
     private int dado;

    public TelaRolarDado(java.awt.Frame parent, boolean modal, int dado) {
        super(parent, modal);
        initComponents();
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        this.dado = dado;
        jLabel1.setText("Rolar dado D" + this.dado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoRolar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoFormatadoMais = new javax.swing.JFormattedTextField(formatter);
        campoFormatadoMenos = new javax.swing.JFormattedTextField(formatter);

        setTitle("RPG - TCC - Rolar dado");
        setMaximumSize(new java.awt.Dimension(280, 200));
        setMinimumSize(new java.awt.Dimension(280, 200));
        setPreferredSize(new java.awt.Dimension(280, 200));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoRolar.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoRolar.setForeground(new java.awt.Color(51, 51, 51));
        botaoRolar.setText("Rolar!");
        botaoRolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRolarActionPerformed(evt);
            }
        });
        botaoRolar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoRolarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoRolar);
        botaoRolar.setBounds(180, 130, 83, 33);

        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rolar dado D"+dado);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 260, 20);

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Modificadores:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 40, 120, 16);

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("+");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 20, 30);

        jLabel4.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 100, 20, 30);

        campoFormatadoMais.setText("0");
        campoFormatadoMais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoFormatadoMaisKeyPressed(evt);
            }
        });
        getContentPane().add(campoFormatadoMais);
        campoFormatadoMais.setBounds(50, 60, 110, 30);

        campoFormatadoMenos.setText("0");
        campoFormatadoMenos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoFormatadoMenosKeyPressed(evt);
            }
        });
        getContentPane().add(campoFormatadoMenos);
        campoFormatadoMenos.setBounds(50, 100, 110, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void rolarDado() {
        Random random = new Random();
        int modificadorMais = (int) campoFormatadoMais.getValue();
        int modificadorMenos = (int) campoFormatadoMenos.getValue();
        if (modificadorMais > 0) {
            int numero = random.nextInt(dado);
            int numeroModificado = numero + modificadorMais;
            TelaJogo.areaDeChat.append("[" + JogadorDAO.nickName + " rolou D" + this.dado + "]=" + numeroModificado + " {[" + numero + "+" + modificadorMais + "]}\n");
            this.dispose();
        } else if (modificadorMenos > 0) {
            int numero = random.nextInt(dado);
            int numeroModificado = numero - modificadorMenos;
            TelaJogo.areaDeChat.append("[" + JogadorDAO.nickName + " rolou D" + this.dado + "]=" + numeroModificado + " {[" + numero + "-" + modificadorMenos + "]}\n");
            this.dispose();
        } else {
            int numero = random.nextInt(dado);
            TelaJogo.areaDeChat.append("[" + JogadorDAO.nickName + " rolou D" + this.dado + "]=" + numero + "\n");
            this.dispose();
        }
    }
    private void botaoRolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRolarActionPerformed
        rolarDado();
    }//GEN-LAST:event_botaoRolarActionPerformed

    private void botaoRolarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoRolarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rolarDado();
        }
    }//GEN-LAST:event_botaoRolarKeyPressed

    private void campoFormatadoMenosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFormatadoMenosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rolarDado();
        }
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            campoFormatadoMenos.setValue(0);

        }
    }//GEN-LAST:event_campoFormatadoMenosKeyPressed

    private void campoFormatadoMaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoFormatadoMaisKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            campoFormatadoMais.setValue(0);
        }
    }//GEN-LAST:event_campoFormatadoMaisKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRolar;
    private javax.swing.JFormattedTextField campoFormatadoMais;
    private javax.swing.JFormattedTextField campoFormatadoMenos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
