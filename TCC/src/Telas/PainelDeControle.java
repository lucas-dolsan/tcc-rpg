package Telas;

import ConexaoBanco.DAO;
import Objetos.Jogador;
import ServidorVoIP.ServerRunner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PainelDeControle extends javax.swing.JFrame {

    DAO dao = new DAO();
    JFrame voipFrame = null;
    public boolean estadoVoip = false;
    public int port = 0;

    public PainelDeControle() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        botaoCriarObjetos = new javax.swing.JButton();
        botaoMudarMapa = new javax.swing.JButton();
        botaoCriarNPC = new javax.swing.JButton();
        botaoCriarMonstro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Painel de Controle de Sala");
        setMaximumSize(new java.awt.Dimension(440, 470));
        setMinimumSize(new java.awt.Dimension(440, 470));
        setPreferredSize(new java.awt.Dimension(440, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        senhaSala.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        senhaSala.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senhaSala.setText("JOGADORES:");
        getContentPane().add(senhaSala);
        senhaSala.setBounds(10, 10, 420, 32);

        botaoLimparChat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoLimparChat.setText("LIMPAR CHAT");
        botaoLimparChat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparChatActionPerformed(evt);
            }
        });
        getContentPane().add(botaoLimparChat);
        botaoLimparChat.setBounds(10, 120, 210, 32);

        caixaJogadores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        caixaJogadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        caixaJogadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaJogadoresActionPerformed(evt);
            }
        });
        getContentPane().add(caixaJogadores);
        caixaJogadores.setBounds(10, 40, 420, 32);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("BANIR");
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 80, 210, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("INICIAR VOIP (OFF)");
        jButton2.setToolTipText("AVISO: Esta funcão só está disponível para jogadores conectados em LAN.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(220, 120, 210, 32);

        checkboxChat.setFont(new java.awt.Font("The Bold Font", 0, 14)); // NOI18N
        checkboxChat.setText("LIMPAR CHAT DIARIAMENTE");
        checkboxChat.setToolTipText("limpa o chat automaticamente todos os dias  as 00:00 horas.");
        checkboxChat.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkboxChatStateChanged(evt);
            }
        });
        getContentPane().add(checkboxChat);
        checkboxChat.setBounds(10, 410, 240, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("DESBANIR");
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 80, 210, 30);

        botaoCriarObjetos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCriarObjetos.setText("CRIAR OBJETOS");
        botaoCriarObjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarObjetosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriarObjetos);
        botaoCriarObjetos.setBounds(10, 160, 210, 30);

        botaoMudarMapa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoMudarMapa.setText("MUDAR MAPA");
        getContentPane().add(botaoMudarMapa);
        botaoMudarMapa.setBounds(220, 160, 210, 30);

        botaoCriarNPC.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCriarNPC.setText("CRIAR NPC");
        getContentPane().add(botaoCriarNPC);
        botaoCriarNPC.setBounds(10, 200, 210, 30);

        botaoCriarMonstro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCriarMonstro.setText("CRIAR MONSTRO");
        getContentPane().add(botaoCriarMonstro);
        botaoCriarMonstro.setBounds(220, 200, 210, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparChatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparChatActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Deseja limpar o chat?", "Limpar chat", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            dao.limparChat();
        }
    }//GEN-LAST:event_botaoLimparChatActionPerformed

    private void caixaJogadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaJogadoresActionPerformed
        listarJogadoresAtuais();
    }//GEN-LAST:event_caixaJogadoresActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (!estadoVoip) {
            do {
                String configPort = JOptionPane.showInputDialog("Escolha em qual porta o servidor de voIP funcionará: ");
                port = Integer.parseInt(configPort);
                if (port < 1024 || port > 65535) {
                    JOptionPane.showMessageDialog(null, "AVISO: Apenas valores maiores que 1024 e menores que 65535!");
                }
            } while (port < 1024 || port > 65535);
            new Thread() {
                @Override
                public void run() {
                    try {
                        TelaJogo.jButton1.setEnabled(false);
                        voipFrame = new ServerRunner(port);
                        voipFrame.setVisible(false);
                        JFrame telaSom = new TelaConfigurarSom();
                        telaSom.setVisible(true);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }.start();
            estadoVoip = true;
            jButton2.setText("DESLIGAR VOIP (ON)");
            TelaJogo.jButton1.setEnabled(false);
            dao.alterarPorta(port, TelaConfigurarSala.nomeSala);
            dao.alterarVOIP(1);
        } else {
            System.out.println("Parando servidor de voIP...");
            estadoVoip = false;
            voipFrame.setVisible(false);
            voipFrame.dispose();
            jButton2.setText("Ligar voIP (off)");
            TelaJogo.jButton1.setEnabled(true);
            dao.alterarVOIP(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void checkboxChatStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkboxChatStateChanged
        if (checkboxChat.isSelected()) {
            dao.modificarChatDaily(DAO.salaAtual.getNome_sala(), 1);
        } else {
            dao.modificarChatDaily(DAO.salaAtual.getNome_sala(), 0);
        }
    }//GEN-LAST:event_checkboxChatStateChanged

    private void botaoCriarObjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarObjetosActionPerformed
        TelaCriarObjetos telaCriarObjetos = new TelaCriarObjetos(this, false);
        telaCriarObjetos.setVisible(true);
        botaoCriarObjetos.setEnabled(false);
    }//GEN-LAST:event_botaoCriarObjetosActionPerformed
    public static void listarJogadoresAtuais() {
        for (Jogador jogador : DAO.jogadoresAtuais) {
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
    private javax.swing.JButton botaoCriarMonstro;
    private javax.swing.JButton botaoCriarNPC;
    public static javax.swing.JButton botaoCriarObjetos;
    private javax.swing.JButton botaoLimparChat;
    private javax.swing.JButton botaoMudarMapa;
    public static javax.swing.JComboBox<String> caixaJogadores;
    public javax.swing.JRadioButton checkboxChat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel senhaSala;
    // End of variables declaration//GEN-END:variables
}
