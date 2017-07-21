package Telas;

import ConexaoBanco.JogadorDAO;
import static ConexaoBanco.JogadorDAO.isVOIPAtivado;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;

public class TelaJogo extends javax.swing.JFrame {

    public TelaJogo() {
        initComponents();
        botaoFecharSala.setVisible(false);
        campoEnviarTexto.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        dadoD20 = new javax.swing.JButton();
        dadoD100 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botaoDadoPersonalizado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Double Damage - Sala: "+ TelaConfigurarSala.nomeSala
        );
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

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
        campoEnviarTexto.setBounds(210, 590, 630, 40);

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
        botaoEnviar.setBounds(730, 630, 110, 40);

        DefaultCaret caret = (DefaultCaret)areaDeChat.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        areaDeChat.setEditable(false);
        areaDeChat.setColumns(20);
        areaDeChat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        areaDeChat.setRows(5);
        areaDeChat.setToolTipText("");
        areaDeChat.setWrapStyleWord(true);
        areaDeChat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        areaDeChat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaDeChatKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(areaDeChat);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(210, 10, 630, 490);

        dadoD4.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD4.setForeground(new java.awt.Color(51, 51, 51));
        dadoD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d4.png"))); // NOI18N
        dadoD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD4ActionPerformed(evt);
            }
        });
        dadoD4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD4KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD4);
        dadoD4.setBounds(210, 510, 60, 60);

        dadoD6.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD6.setForeground(new java.awt.Color(51, 51, 51));
        dadoD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d6.png"))); // NOI18N
        dadoD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD6ActionPerformed(evt);
            }
        });
        dadoD6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD6KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD6);
        dadoD6.setBounds(270, 510, 60, 60);

        dadoD8.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD8.setForeground(new java.awt.Color(51, 51, 51));
        dadoD8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d8.png"))); // NOI18N
        dadoD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD8ActionPerformed(evt);
            }
        });
        dadoD8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD8KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD8);
        dadoD8.setBounds(330, 510, 60, 60);

        dadoD10.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD10.setForeground(new java.awt.Color(51, 51, 51));
        dadoD10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d10.png"))); // NOI18N
        dadoD10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD10ActionPerformed(evt);
            }
        });
        dadoD10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD10KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD10);
        dadoD10.setBounds(390, 510, 60, 60);

        dadoD20.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD20.setForeground(new java.awt.Color(51, 51, 51));
        dadoD20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d20.png"))); // NOI18N
        dadoD20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD20ActionPerformed(evt);
            }
        });
        dadoD20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD20KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD20);
        dadoD20.setBounds(450, 510, 60, 60);

        dadoD100.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD100.setForeground(new java.awt.Color(51, 51, 51));
        dadoD100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d100.png"))); // NOI18N
        dadoD100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD100ActionPerformed(evt);
            }
        });
        dadoD100.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD100KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD100);
        dadoD100.setBounds(510, 510, 60, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoMic.png"))); // NOI18N
        jButton1.setText("Juntar-se a conversa");
        jButton1.setToolTipText("AVISO: Você só poderá se comunicar com jogadores na sua rede local .");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 520, 190, 40);

        botaoDadoPersonalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dice-multiple.png"))); // NOI18N
        botaoDadoPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDadoPersonalizadoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoDadoPersonalizado);
        botaoDadoPersonalizado.setBounds(570, 510, 60, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void popupFecharSala() {
        int sair = JOptionPane.showConfirmDialog(null, "Deseja fechar a sala?", "Fechar sala", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            painel.setVisible(false);
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
            painel.setVisible(false);
            this.dispose();
            TelaInicial.Start();
            JogadorDAO.mensagemSairDaSala();
        }
    }//GEN-LAST:event_botaoSairDaSalaActionPerformed
    public void enviarTexto() {
        String texto = campoEnviarTexto.getText();
        if (!texto.isEmpty()) {
            JogadorDAO.enviarChatBanco(texto);
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

    private void dadoD20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD20ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 20);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD20ActionPerformed

    private void dadoD100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD100ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 100);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD100ActionPerformed

    private void botaoSairDaSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoSairDaSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_botaoSairDaSalaKeyPressed

    private void botaoEnviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEnviarKeyPressed
        enviarTexto();
    }//GEN-LAST:event_botaoEnviarKeyPressed

    private void campoEnviarTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEnviarTextoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enviarTexto();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_campoEnviarTextoKeyPressed

    private void areaDeChatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaDeChatKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enviarTexto();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_areaDeChatKeyPressed

    private void dadoD4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_dadoD4KeyPressed

    private void dadoD6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_dadoD6KeyPressed

    private void dadoD8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD8KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_dadoD8KeyPressed

    private void dadoD10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD10KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_dadoD10KeyPressed

    private void dadoD20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD20KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_dadoD20KeyPressed

    private void dadoD100KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD100KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_dadoD100KeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JogadorDAO.mensagemSairDaSala();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame telaSom = new TelaConfigurarSom();
        telaSom.setVisible(true);
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_formKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JFrame telaSom = new TelaConfigurarSom();
            telaSom.setVisible(true);
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupFecharSala();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void botaoDadoPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDadoPersonalizadoActionPerformed
        TelaRolarCustomizado tela = new TelaRolarCustomizado(this, true);
        tela.setVisible(true);
    }//GEN-LAST:event_botaoDadoPersonalizadoActionPerformed
    public static PainelDeControle painel = null;

    public static void Start(boolean dono) {
        painel = new PainelDeControle();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
                if (dono) {
                    botaoFecharSala.setVisible(true);
                    painel.setVisible(true);
                }else{
                    painel.dispose();
                }
                if (isVOIPAtivado(TelaConfigurarSala.nomeSala) == false) {
                    jButton1.setEnabled(false);
                } else if (isVOIPAtivado(TelaConfigurarSala.nomeSala) == true) {
                    jButton1.setEnabled(true);
                }
                new Thread() {
                    @Override
                    public void run() {
                        while (true) {
                            JogadorDAO.lerChat();
                            if (isVOIPAtivado(TelaConfigurarSala.nomeSala) == false) {
                                jButton1.setEnabled(false);
                            } else if (isVOIPAtivado(TelaConfigurarSala.nomeSala) == true) {
                                jButton1.setEnabled(true);
                            }
                            try {
                                Thread.sleep(1);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                    }
                }.start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea areaDeChat;
    private javax.swing.JButton botaoDadoPersonalizado;
    private javax.swing.JButton botaoEnviar;
    public static javax.swing.JButton botaoFecharSala;
    private javax.swing.JButton botaoSairDaSala;
    private javax.swing.JTextField campoEnviarTexto;
    private javax.swing.JButton dadoD10;
    private javax.swing.JButton dadoD100;
    private javax.swing.JButton dadoD20;
    private javax.swing.JButton dadoD4;
    private javax.swing.JButton dadoD6;
    private javax.swing.JButton dadoD8;
    public static javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
