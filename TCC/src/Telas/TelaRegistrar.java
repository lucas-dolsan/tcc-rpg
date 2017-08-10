package Telas;

import Objetos.*;
import ConexaoBanco.JogadorDAO;
import java.awt.Cursor;
import java.awt.event.KeyEvent;

public class TelaRegistrar extends javax.swing.JDialog {

    JogadorDAO jogDAO = new JogadorDAO();

    public TelaRegistrar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCancelar = new javax.swing.JButton();
        botaoEntrar = new javax.swing.JButton();
        campoConfirmarSenha = new javax.swing.JPasswordField();
        campoSenha = new javax.swing.JPasswordField();
        campoEmail = new javax.swing.JTextField();
        campoUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        erroNome = new javax.swing.JLabel();
        erroEmail = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        erroSenhas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelRegistrado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Double Damage - Registrar");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(600, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 650));
        getContentPane().setLayout(null);

        botaoCancelar.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoCancelar.png"))); // NOI18N
        botaoCancelar.setText("CANCELAR");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        botaoCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoCancelarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(115, 470, 180, 40);

        botaoEntrar.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoEntrar.png"))); // NOI18N
        botaoEntrar.setText("REGISTRAR-SE");
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });
        botaoEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoEntrar);
        botaoEntrar.setBounds(315, 470, 180, 40);

        campoConfirmarSenha.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoConfirmarSenha.setForeground(new java.awt.Color(51, 51, 51));
        campoConfirmarSenha.setMaximumSize(new java.awt.Dimension(380, 40));
        campoConfirmarSenha.setMinimumSize(new java.awt.Dimension(380, 40));
        campoConfirmarSenha.setPreferredSize(new java.awt.Dimension(380, 40));
        campoConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoConfirmarSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(campoConfirmarSenha);
        campoConfirmarSenha.setBounds(115, 390, 380, 40);

        campoSenha.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoSenha.setForeground(new java.awt.Color(51, 51, 51));
        campoSenha.setMaximumSize(new java.awt.Dimension(380, 40));
        campoSenha.setMinimumSize(new java.awt.Dimension(380, 40));
        campoSenha.setPreferredSize(new java.awt.Dimension(380, 40));
        campoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(campoSenha);
        campoSenha.setBounds(115, 300, 380, 40);

        campoEmail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoEmail.setForeground(new java.awt.Color(51, 51, 51));
        campoEmail.setMaximumSize(new java.awt.Dimension(380, 40));
        campoEmail.setMinimumSize(new java.awt.Dimension(380, 40));
        campoEmail.setPreferredSize(new java.awt.Dimension(380, 40));
        campoEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoEmailKeyPressed(evt);
            }
        });
        getContentPane().add(campoEmail);
        campoEmail.setBounds(115, 180, 380, 40);

        campoUsername.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        campoUsername.setForeground(new java.awt.Color(51, 51, 51));
        campoUsername.setMaximumSize(new java.awt.Dimension(380, 40));
        campoUsername.setMinimumSize(new java.awt.Dimension(380, 40));
        campoUsername.setPreferredSize(new java.awt.Dimension(380, 40));
        campoUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoUsernameKeyPressed(evt);
            }
        });
        getContentPane().add(campoUsername);
        campoUsername.setBounds(115, 70, 380, 40);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("NOME DE USUÁRIO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(115, 50, 380, 20);

        erroNome.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        erroNome.setForeground(new java.awt.Color(255, 0, 0));
        erroNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        erroNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/erroSenhas.png"))); // NOI18N
        erroNome.setText("Nome de usuário em uso.");
        getContentPane().add(erroNome);
        erroNome.setBounds(115, 110, 380, 24);

        erroEmail.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        erroEmail.setForeground(new java.awt.Color(255, 0, 0));
        erroEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        erroEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/erroSenhas.png"))); // NOI18N
        erroEmail.setText("Email em uso.");
        getContentPane().add(erroEmail);
        erroEmail.setBounds(115, 220, 380, 30);

        jLabel5.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("SENHA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(115, 280, 380, 20);

        jLabel6.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("CONFIRMAR SENHA:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(115, 370, 380, 20);

        erroSenhas.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        erroSenhas.setForeground(new java.awt.Color(255, 0, 0));
        erroSenhas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/erroSenhas.png"))); // NOI18N
        erroSenhas.setText("Senha inválida.");
        getContentPane().add(erroSenhas);
        erroSenhas.setBounds(115, 430, 380, 30);

        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("EMAIL:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(115, 160, 380, 20);

        labelRegistrado.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        labelRegistrado.setForeground(new java.awt.Color(0, 204, 0));
        labelRegistrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRegistrado.setText("registrado com sucesso.");
        getContentPane().add(labelRegistrado);
        labelRegistrado.setBounds(120, 500, 370, 50);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    public void entrarComEnter() {
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

            String userName = campoUsername.getText();
            String email = campoEmail.getText();
            char[] senha = campoSenha.getPassword();
            char[] confirmarSenha = campoConfirmarSenha.getPassword();
            String senhaAuxiliar = String.valueOf(senha);
            String confirmaSenha = String.valueOf(confirmarSenha);
            boolean verificarEmail = jogDAO.verificarEmail(email);
            boolean verificarNome = jogDAO.verificarNomeDeUsuario(userName);
            boolean erro = false;
            if (!senhaAuxiliar.equals(confirmaSenha) || senhaAuxiliar.isEmpty() || confirmaSenha.isEmpty()) {
                erroSenhas.setVisible(true);
                erro = true;
            }
            if (verificarEmail) {
                erroEmail.setVisible(true);
                erro = true;
            }
            if (verificarNome) {
                erroNome.setVisible(true);
                erro = true;
            }
            if (!erro) {
                Jogador jogador = new Jogador(userName, email, senhaAuxiliar);
                jogDAO.criarJogador(jogador, this);
            }
        } finally {

            setCursor(Cursor.getDefaultCursor());

        }

    }
    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        entrarComEnter();
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void campoUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoUsernameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarComEnter();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_campoUsernameKeyPressed

    private void campoEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarComEnter();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_campoEmailKeyPressed

    private void campoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarComEnter();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_campoSenhaKeyPressed

    private void campoConfirmarSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoConfirmarSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarComEnter();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_campoConfirmarSenhaKeyPressed

    private void botaoCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_botaoCancelarKeyPressed

    private void botaoEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEntrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarComEnter();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
        }
    }//GEN-LAST:event_botaoEntrarKeyPressed

    public static void erros() {
        erroNome.setVisible(false);
        erroEmail.setVisible(false);
        erroSenhas.setVisible(false);
        labelRegistrado.setVisible(false);
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaRegistrar dialog = new TelaRegistrar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JPasswordField campoConfirmarSenha;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsername;
    private static javax.swing.JLabel erroEmail;
    private static javax.swing.JLabel erroNome;
    private static javax.swing.JLabel erroSenhas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel labelRegistrado;
    // End of variables declaration//GEN-END:variables
}
