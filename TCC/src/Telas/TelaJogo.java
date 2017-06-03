package Telas;

import ConexaoBanco.JogadorDAO;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class TelaJogo extends javax.swing.JFrame {

    public static boolean donoSala = false;

    public TelaJogo() {
        initComponents();
        botaoFecharSala.setVisible(false);
        campoEnviarTexto.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        botaoFecharSala = new javax.swing.JButton();
        botaoSairDaSala = new javax.swing.JButton();
        campoEnviarTexto = new javax.swing.JTextField();
        botaoEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaDeChat = new javax.swing.JTextArea();
        dadoD4 = new javax.swing.JButton();
        dadoD6 = new javax.swing.JButton();
        dadoD8 = new javax.swing.JButton();
        dadoD10 = new javax.swing.JButton();
        dadoD12 = new javax.swing.JButton();
        dadoD20 = new javax.swing.JButton();
        dadoD100 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RPG - TCC - Sala: "+ TelaConfigurarSala.nomeSala
        );
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(null);

        jTree1.setAlignmentX(0.0F);
        jTree1.setAlignmentY(0.0F);
        jTree1.setPreferredSize(new java.awt.Dimension(75, 75));
        jScrollPane1.setViewportView(jTree1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 190, 570);

        botaoFecharSala.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoFecharSala.setForeground(new java.awt.Color(51, 51, 51));
        botaoFecharSala.setText("Fechar sala");
        botaoFecharSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharSalaActionPerformed(evt);
            }
        });
        botaoFecharSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoFecharSalaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoFecharSala);
        botaoFecharSala.setBounds(20, 590, 150, 40);

        botaoSairDaSala.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoSairDaSala.setForeground(new java.awt.Color(51, 51, 51));
        botaoSairDaSala.setText("Sair da sala");
        botaoSairDaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairDaSalaActionPerformed(evt);
            }
        });
        botaoSairDaSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoSairDaSalaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoSairDaSala);
        botaoSairDaSala.setBounds(20, 630, 150, 40);

        campoEnviarTexto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        campoEnviarTexto.setForeground(new java.awt.Color(51, 51, 51));
        campoEnviarTexto.setMaximumSize(new java.awt.Dimension(630, 50));
        campoEnviarTexto.setMinimumSize(new java.awt.Dimension(630, 50));
        campoEnviarTexto.setPreferredSize(new java.awt.Dimension(630, 50));
        campoEnviarTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoEnviarTextoKeyPressed(evt);
            }
        });
        getContentPane().add(campoEnviarTexto);
        campoEnviarTexto.setBounds(210, 590, 630, 50);

        botaoEnviar.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoEnviar.setForeground(new java.awt.Color(51, 51, 51));
        botaoEnviar.setText("Enviar");
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });
        botaoEnviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoEnviarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoEnviar);
        botaoEnviar.setBounds(730, 640, 110, 40);

        areaDeChat.setEditable(false);
        areaDeChat.setColumns(20);
        areaDeChat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        areaDeChat.setRows(5);
        areaDeChat.setToolTipText("");
        areaDeChat.setWrapStyleWord(true);
        areaDeChat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(areaDeChat);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(210, 10, 630, 490);

        dadoD4.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD4.setForeground(new java.awt.Color(51, 51, 51));
        dadoD4.setText("D4");
        dadoD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD4ActionPerformed(evt);
            }
        });
        getContentPane().add(dadoD4);
        dadoD4.setBounds(210, 510, 60, 60);

        dadoD6.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD6.setForeground(new java.awt.Color(51, 51, 51));
        dadoD6.setText("D6");
        dadoD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD6ActionPerformed(evt);
            }
        });
        getContentPane().add(dadoD6);
        dadoD6.setBounds(270, 510, 60, 60);

        dadoD8.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD8.setForeground(new java.awt.Color(51, 51, 51));
        dadoD8.setText("D8");
        dadoD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD8ActionPerformed(evt);
            }
        });
        getContentPane().add(dadoD8);
        dadoD8.setBounds(330, 510, 60, 60);

        dadoD10.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD10.setForeground(new java.awt.Color(51, 51, 51));
        dadoD10.setText("D10");
        dadoD10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD10ActionPerformed(evt);
            }
        });
        getContentPane().add(dadoD10);
        dadoD10.setBounds(390, 510, 60, 60);

        dadoD12.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD12.setForeground(new java.awt.Color(51, 51, 51));
        dadoD12.setText("D12");
        dadoD12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD12ActionPerformed(evt);
            }
        });
        getContentPane().add(dadoD12);
        dadoD12.setBounds(450, 510, 60, 60);

        dadoD20.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD20.setForeground(new java.awt.Color(51, 51, 51));
        dadoD20.setText("D20");
        dadoD20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD20ActionPerformed(evt);
            }
        });
        getContentPane().add(dadoD20);
        dadoD20.setBounds(510, 510, 60, 60);

        dadoD100.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD100.setForeground(new java.awt.Color(51, 51, 51));
        dadoD100.setText("D100");
        dadoD100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD100ActionPerformed(evt);
            }
        });
        getContentPane().add(dadoD100);
        dadoD100.setBounds(570, 510, 70, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void popupFecharSala() {
        int sair = JOptionPane.showConfirmDialog(null, "Deseja fechar a sala?", "Fechar sala", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();
            JogadorDAO.fecharSala(this, TelaConfigurarSala.nomeSala);
            TelaInicial.Start();
        }
    }
    private void botaoFecharSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharSalaActionPerformed
        popupFecharSala();
    }//GEN-LAST:event_botaoFecharSalaActionPerformed

    private void botaoFecharSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoFecharSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_botaoFecharSalaKeyPressed

    private void botaoSairDaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairDaSalaActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair da sala?", "Sair da sala", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();
            TelaInicial.Start();
        }
    }//GEN-LAST:event_botaoSairDaSalaActionPerformed
    public void enviarTexto() {
        String texto = campoEnviarTexto.getText();
        if (!texto.isEmpty()) {
            areaDeChat.append("[" + JogadorDAO.nickName + "]: " + texto + "\n");
            campoEnviarTexto.setText("");
        }

    }
    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed
        enviarTexto();
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void dadoD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD4ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 4);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD4ActionPerformed

    private void dadoD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD6ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 6);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD6ActionPerformed

    private void dadoD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD8ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 8);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD8ActionPerformed

    private void dadoD10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD10ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 10);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD10ActionPerformed

    private void dadoD12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD12ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 12);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD12ActionPerformed

    private void dadoD20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD20ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 20);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD20ActionPerformed

    private void dadoD100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD100ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 100);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD100ActionPerformed

    private void botaoSairDaSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoSairDaSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            popupFecharSala();
        }
    }//GEN-LAST:event_botaoSairDaSalaKeyPressed

    private void botaoEnviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEnviarKeyPressed
        enviarTexto();
    }//GEN-LAST:event_botaoEnviarKeyPressed

    private void campoEnviarTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEnviarTextoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enviarTexto();
        }
    }//GEN-LAST:event_campoEnviarTextoKeyPressed

    public static void Start() {
        if (donoSala) {
            botaoFecharSala.setVisible(true);
        }
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
            java.util.logging.Logger.getLogger(TelaJogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea areaDeChat;
    private javax.swing.JButton botaoEnviar;
    public static javax.swing.JButton botaoFecharSala;
    private javax.swing.JButton botaoSairDaSala;
    private javax.swing.JTextField campoEnviarTexto;
    private javax.swing.JButton dadoD10;
    private javax.swing.JButton dadoD100;
    private javax.swing.JButton dadoD12;
    private javax.swing.JButton dadoD20;
    private javax.swing.JButton dadoD4;
    private javax.swing.JButton dadoD6;
    private javax.swing.JButton dadoD8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
