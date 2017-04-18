/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import ConexaoBanco.JogadorDAO;
import java.util.Random;

public class TelaRolarDado extends javax.swing.JDialog {

    public TelaRolarDado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoRolar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoModificadorMais = new javax.swing.JTextField();
        campoModificadorMenos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RPG - TCC - Rolar dado");
        setMaximumSize(new java.awt.Dimension(280, 180));
        setMinimumSize(new java.awt.Dimension(280, 180));
        setPreferredSize(new java.awt.Dimension(280, 180));
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
        getContentPane().add(botaoRolar);
        botaoRolar.setBounds(180, 110, 92, 35);

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
        jLabel2.setBounds(10, 40, 120, 12);

        campoModificadorMais.setText("0");
        getContentPane().add(campoModificadorMais);
        campoModificadorMais.setBounds(60, 60, 120, 24);

        campoModificadorMenos.setText("0");
        getContentPane().add(campoModificadorMenos);
        campoModificadorMenos.setBounds(60, 90, 120, 24);

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("+");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 60, 20, 30);

        jLabel4.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 90, 20, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRolarActionPerformed
        Random random = new Random();
        String modificadorMais = campoModificadorMais.getText();
        int modificadorMaisInt = Integer.parseInt(modificadorMais);
        String modificadorMenos = campoModificadorMenos.getText();
        int modificadorMenosInt = Integer.parseInt(modificadorMenos);
        if (modificadorMaisInt > 0) {
            int numero = random.nextInt(dado);
            int numeroModificado = numero + modificadorMaisInt;
            TelaJogo.areaDeChat.append("[" + JogadorDAO.nickName + " rolou D" + dado + "]=" + numeroModificado + " {[" + numero + "+" + modificadorMaisInt + "]}\n");
            this.dispose();
        } else if (modificadorMenosInt > 0) {
            int numero = random.nextInt(dado);
            int numeroModificado = numero - modificadorMenosInt;
            TelaJogo.areaDeChat.append("[" + JogadorDAO.nickName + " rolou D" + dado + "]=" + numeroModificado + " {[" + numero + "-" + modificadorMenosInt + "]}\n");
            this.dispose();
        } else {
            int numero = random.nextInt(dado);
            TelaJogo.areaDeChat.append("[" + JogadorDAO.nickName + " rolou D" + dado + "]=" + numero + "\n");
            this.dispose();
        }
    }//GEN-LAST:event_botaoRolarActionPerformed

    public static int dado;

    public static void Start(int dadoNumero) {
        dado = dadoNumero;
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
            java.util.logging.Logger.getLogger(TelaRolarDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRolarDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRolarDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRolarDado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaRolarDado dialog = new TelaRolarDado(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRolar;
    private javax.swing.JTextField campoModificadorMais;
    private javax.swing.JTextField campoModificadorMenos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
