package Telas;

import ConexaoBanco.JogadorDAO;
import Objetos.Jogador;
import ServidorVoIP.Server;
import static Telas.TelaConfigurarSala.nomeSala;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PainelDeControle extends javax.swing.JFrame {

    public static boolean estadoVoip = false;
    Server server = null;
    public PainelDeControle() {
        if (JogadorDAO.player.getPk_jogador() == JogadorDAO.salaAtual.getFk_jogador()) {
            JogadorDAO.alterarVOIP(0);
        }
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void runServer() {
        new Thread() {
            @Override
            public void run() {
                try {
                    server = new Server(1049, false);
                } catch (Exception ex) {
                    server = null;
                    JOptionPane.showMessageDialog(rootPane, ex, getTitle(), JOptionPane.ERROR_MESSAGE);
                } catch (Throwable ex) {
                    Logger.getLogger(PainelDeControle.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        senhaSala = new javax.swing.JLabel();
        botaoLimparChat = new javax.swing.JButton();
        caixaJogadores = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        checkboxChat = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Painel de Controle de Sala");
        setMaximumSize(new java.awt.Dimension(440, 470));
        setMinimumSize(new java.awt.Dimension(440, 470));
        setPreferredSize(new java.awt.Dimension(440, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        senhaSala.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        senhaSala.setText("Jogadores:");
        getContentPane().add(senhaSala);
        senhaSala.setBounds(20, 10, 160, 32);

        botaoLimparChat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoLimparChat.setText("Limpar Chat da Sala");
        botaoLimparChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparChatActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLimparChat);
        botaoLimparChat.setBounds(10, 140, 230, 32);

        caixaJogadores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caixaJogadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        caixaJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaJogadoresActionPerformed(evt);
            }
        });
        getContentPane().add(caixaJogadores);
        caixaJogadores.setBounds(10, 50, 230, 32);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Banir!");
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 90, 110, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Iniciar voIP (desligado)");
        jButton2.setToolTipText("AVISO: Esta funcão só está disponível para jogadores conectados em LAN.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 230, 230, 32);

        checkboxChat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkboxChat.setText("limpar chat diariamente");
        checkboxChat.setToolTipText("limpa o chat automaticamente todos os dias  as 00:00 horas.");
        getContentPane().add(checkboxChat);
        checkboxChat.setBounds(10, 190, 230, 24);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Desbanir!");
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 90, 110, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparChatActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Deseja limpar o chat?", "Limpar chat", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            JogadorDAO.limparChat();
        }
    }//GEN-LAST:event_botaoLimparChatActionPerformed

    private void caixaJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaJogadoresActionPerformed
        listarJogadoresAtuais();
    }//GEN-LAST:event_caixaJogadoresActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (!estadoVoip) {

            if (JogadorDAO.player.getPk_jogador() == JogadorDAO.salaAtual.getFk_jogador()) {
                jButton2.setText("Iniciar voIP (ligado)");
                JogadorDAO.alterarVOIP(1);
                this.estadoVoip = true;
                runServer();

            }
        } else if (JogadorDAO.player.getPk_jogador() == JogadorDAO.salaAtual.getFk_jogador()) {

            jButton2.setText("Iniciar voIP (desligado)");
            JogadorDAO.alterarVOIP(0);
            try {
                server.s.close();
            } catch (IOException ex) {
                Logger.getLogger(PainelDeControle.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.estadoVoip = false;
            server = null;
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void listarJogadoresAtuais() {
        for (Jogador jogador : JogadorDAO.jogadoresAtuais) {
            caixaJogadores.addItem(jogador.getNome_jog());
        }
    }

    public static void Start() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PainelDeControle().setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimparChat;
    public static javax.swing.JComboBox<String> caixaJogadores;
    private javax.swing.JRadioButton checkboxChat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel senhaSala;
    // End of variables declaration//GEN-END:variables
}
