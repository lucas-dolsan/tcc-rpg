package Telas;

import ConexaoBanco.JogadorDAO;
import java.awt.event.KeyEvent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoConfigurarConta = new javax.swing.JButton();
        botaoCriarSala = new javax.swing.JButton();
        botaoEntrarEmSala = new javax.swing.JButton();
        botaoDeslogar = new javax.swing.JButton();
        planoDeFundoTelaInicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RPG - TCC - " + JogadorDAO.nickName);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEJA BEM-VINDO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(425, 30, 440, 110);

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(JogadorDAO.nickName);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 110, 580, 80);

        botaoConfigurarConta.setBackground(new java.awt.Color(255, 255, 255));
        botaoConfigurarConta.setFont(new java.awt.Font("Coneria Script Demo", 1, 24)); // NOI18N
        botaoConfigurarConta.setForeground(new java.awt.Color(0, 0, 0));
        botaoConfigurarConta.setText("Configurar Conta");
        botaoConfigurarConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoConfigurarContaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoConfigurarConta);
        botaoConfigurarConta.setBounds(430, 430, 450, 60);

        botaoCriarSala.setBackground(new java.awt.Color(255, 255, 255));
        botaoCriarSala.setFont(new java.awt.Font("Coneria Script Demo", 1, 24)); // NOI18N
        botaoCriarSala.setForeground(new java.awt.Color(0, 0, 0));
        botaoCriarSala.setText("Criar Nova Sala");
        botaoCriarSala.setName(""); // NOI18N
        botaoCriarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarSalaActionPerformed(evt);
            }
        });
        botaoCriarSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoCriarSalaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoCriarSala);
        botaoCriarSala.setBounds(430, 230, 450, 60);

        botaoEntrarEmSala.setBackground(new java.awt.Color(255, 255, 255));
        botaoEntrarEmSala.setFont(new java.awt.Font("Coneria Script Demo", 1, 24)); // NOI18N
        botaoEntrarEmSala.setForeground(new java.awt.Color(0, 0, 0));
        botaoEntrarEmSala.setText("Entrar em uma Sala");
        botaoEntrarEmSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarEmSalaActionPerformed(evt);
            }
        });
        botaoEntrarEmSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoEntrarEmSalaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoEntrarEmSala);
        botaoEntrarEmSala.setBounds(430, 330, 450, 60);

        botaoDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/deslogar.png"))); // NOI18N
        botaoDeslogar.setToolTipText("Desconectar.");
        botaoDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeslogarActionPerformed(evt);
            }
        });
        botaoDeslogar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoDeslogarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoDeslogar);
        botaoDeslogar.setBounds(1190, 650, 80, 40);

        planoDeFundoTelaInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        planoDeFundoTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/telaLogin.jpg"))); // NOI18N
        planoDeFundoTelaInicial.setAlignmentY(0.0F);
        planoDeFundoTelaInicial.setMaximumSize(new java.awt.Dimension(1280, 720));
        planoDeFundoTelaInicial.setMinimumSize(new java.awt.Dimension(1280, 720));
        planoDeFundoTelaInicial.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(planoDeFundoTelaInicial);
        planoDeFundoTelaInicial.setBounds(0, 0, 1280, 720);
        planoDeFundoTelaInicial.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void deslogar() {
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Desconectar.", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();
            TelaLogin.abrirTela();
        }
    }
    private void botaoDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeslogarActionPerformed
        deslogar();
    }//GEN-LAST:event_botaoDeslogarActionPerformed

    private void botaoCriarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarSalaActionPerformed
        JDialog tela = new TelaConfigurarSala(this, true, this);
        tela.setVisible(true);
    }//GEN-LAST:event_botaoCriarSalaActionPerformed

    private void botaoCriarSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoCriarSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JDialog tela = new TelaConfigurarSala(this, true, this);
            tela.setVisible(true);
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            deslogar();
        }
    }//GEN-LAST:event_botaoCriarSalaKeyPressed
    private void botaoEntrarEmSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEntrarEmSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            deslogar();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JDialog tela = new TelaEntrarEmSala(this, true, this);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_botaoEntrarEmSalaKeyPressed

    private void botaoDeslogarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoDeslogarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            deslogar();
        }
    }//GEN-LAST:event_botaoDeslogarKeyPressed

    private void botaoEntrarEmSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarEmSalaActionPerformed
        JDialog tela = new TelaEntrarEmSala(this, true, this);
        tela.setVisible(true);
    }//GEN-LAST:event_botaoEntrarEmSalaActionPerformed

    private void botaoConfigurarContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoConfigurarContaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            deslogar();
        }
    }//GEN-LAST:event_botaoConfigurarContaKeyPressed

    public static void Start() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfigurarConta;
    private javax.swing.JButton botaoCriarSala;
    private javax.swing.JButton botaoDeslogar;
    private javax.swing.JButton botaoEntrarEmSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel planoDeFundoTelaInicial;
    // End of variables declaration//GEN-END:variables
}
