/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import ConexaoBanco.DAO;
import java.awt.event.KeyEvent;
import java.util.Random;

public class TelaRolarDado extends javax.swing.JDialog {

    DAO dao = new DAO();
    private int dado;

    public TelaRolarDado(java.awt.Frame parent, boolean modal, int dado) {
        super(parent, modal);
        initComponents();
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
        campoRolarMenos = new javax.swing.JTextField();
        campoRolarMais = new javax.swing.JTextField();

        setTitle("Double Damage - Rolar dado");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(300, 170));
        setMinimumSize(new java.awt.Dimension(300, 170));
        setPreferredSize(new java.awt.Dimension(300, 170));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoRolar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoRolar.setText("ROLAR!");
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
        botaoRolar.setBounds(170, 100, 110, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rolar dado D"+dado);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 260, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("MODIFICADORES:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 40, 140, 20);

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("+");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 60, 20, 30);

        jLabel4.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 20, 30);

        campoRolarMenos.setText("0");
        campoRolarMenos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoRolarMenosKeyPressed(evt);
            }
        });
        getContentPane().add(campoRolarMenos);
        campoRolarMenos.setBounds(40, 100, 120, 30);

        campoRolarMais.setText("0");
        campoRolarMais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoRolarMaisKeyPressed(evt);
            }
        });
        getContentPane().add(campoRolarMais);
        campoRolarMais.setBounds(40, 60, 120, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void verificarCampoComValoresVazios() {
        if (campoRolarMais.getText().equalsIgnoreCase("")) {
            campoRolarMais.setText("0");
        }
        if (campoRolarMenos.getText().equalsIgnoreCase("")) {
            campoRolarMenos.setText("0");
        }
    }

    public int rodar() {
        Random random = new Random();
        int numero = 0;
        do {
            numero = random.nextInt(dado + 1);
        } while (numero == 0);
        return numero;
    }

    public int converterCampoModificadorMaisEmInt() {
        String valorModificadorMais = campoRolarMais.getText();
        return Integer.parseInt(valorModificadorMais);
    }

    public int converterCampoModificadorMenosEmInt() {
        String valorModificadorMenos = campoRolarMenos.getText();
        return Integer.parseInt(valorModificadorMenos);
    }

    public void rolarDado() {
        verificarCampoComValoresVazios();
        int modificadorMais = converterCampoModificadorMaisEmInt();
        int modificadorMenos = converterCampoModificadorMenosEmInt();
        if (modificadorMais > 0) {
            int numero = rodar();
            int numeroModificado = numero + modificadorMais;
            dao.enviarDadoBanco(dado, numeroModificado, numero, modificadorMais, modificadorMenos, 1);
            this.dispose();
        } else if (modificadorMenos > 0) {
            int numero = rodar();
            int numeroModificado = numero - modificadorMenos;
            dao.enviarDadoBanco(dado, numeroModificado, numero, modificadorMais, modificadorMenos, 2);
            this.dispose();
        } else {
            int numero = rodar();
            int numeroModificado = 0;
            dao.enviarDadoBanco(dado, numeroModificado, numero, modificadorMais, modificadorMenos, 3);
            this.dispose();
        }
    }
    private void botaoRolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRolarActionPerformed
        rolarDado();
    }//GEN-LAST:event_botaoRolarActionPerformed

    private void botaoRolarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoRolarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rolarDado();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_botaoRolarKeyPressed

    private void campoRolarMaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoRolarMaisKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rolarDado();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_campoRolarMaisKeyPressed

    private void campoRolarMenosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoRolarMenosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rolarDado();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_campoRolarMenosKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRolar;
    private javax.swing.JTextField campoRolarMais;
    private javax.swing.JTextField campoRolarMenos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
