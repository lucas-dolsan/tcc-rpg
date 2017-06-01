package Telas;

import ConexaoBanco.JogadorDAO;
import static Telas.TelaRegistrar.erros;
import com.sun.glass.events.KeyEvent;
import javax.swing.JDialog;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        botaoRegistrarSe = new javax.swing.JButton();
        erroLogin = new javax.swing.JLabel();
        planoDeFundoTelaLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RPG - TCC");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setName("Frame"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(null);

        campoLogin.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        campoLogin.setForeground(new java.awt.Color(51, 51, 51));
        campoLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoLoginKeyPressed(evt);
            }
        });
        getContentPane().add(campoLogin);
        campoLogin.setBounds(415, 405, 445, 55);
        campoLogin.getAccessibleContext().setAccessibleName("");

        campoSenha.setFont(new java.awt.Font("SansSerif", 0, 30)); // NOI18N
        campoSenha.setForeground(new java.awt.Color(51, 51, 51));
        campoSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(campoSenha);
        campoSenha.setBounds(415, 520, 445, 55);

        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMAIL:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(415, 360, 440, 40);

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SENHA:");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(415, 470, 445, 40);

        botaoEntrar.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoEntrar.setForeground(new java.awt.Color(51, 51, 51));
        botaoEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoEntrar.png"))); // NOI18N
        botaoEntrar.setText("ENTRAR");
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
        botaoEntrar.setBounds(415, 605, 210, 50);

        botaoRegistrarSe.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoRegistrarSe.setForeground(new java.awt.Color(51, 51, 51));
        botaoRegistrarSe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoRegistrar.png"))); // NOI18N
        botaoRegistrarSe.setText("REGISTRAR-SE");
        botaoRegistrarSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarSeActionPerformed(evt);
            }
        });
        botaoRegistrarSe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoRegistrarSeKeyPressed(evt);
            }
        });
        getContentPane().add(botaoRegistrarSe);
        botaoRegistrarSe.setBounds(650, 605, 210, 50);

        erroLogin.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        erroLogin.setForeground(new java.awt.Color(255, 0, 0));
        erroLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/erroSenhas.png"))); // NOI18N
        erroLogin.setText("Credenciais incorretas.");
        getContentPane().add(erroLogin);
        erroLogin.setBounds(415, 582, 210, 20);

        planoDeFundoTelaLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        planoDeFundoTelaLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/telaLogin.jpg"))); // NOI18N
        planoDeFundoTelaLogin.setAlignmentY(0.0F);
        planoDeFundoTelaLogin.setAutoscrolls(true);
        planoDeFundoTelaLogin.setMaximumSize(new java.awt.Dimension(1280, 720));
        planoDeFundoTelaLogin.setMinimumSize(new java.awt.Dimension(1280, 720));
        planoDeFundoTelaLogin.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(planoDeFundoTelaLogin);
        planoDeFundoTelaLogin.setBounds(0, 0, 1280, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRegistrarSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarSeActionPerformed
        campoLogin.setText("");
        campoSenha.setText("");
        JDialog tela = new TelaRegistrar(this, true);
        erros();
        tela.setVisible(true);
    }//GEN-LAST:event_botaoRegistrarSeActionPerformed
    public void entrarComEnter() {
        JogadorDAO jogador = new JogadorDAO();
        String login = campoLogin.getText();
        char[] senha = campoSenha.getPassword();
        String senhaAuxiliar = String.valueOf(senha);
        jogador.logar(login, senhaAuxiliar, this);
        jogador.modificarUltimoLogin(login);
    }

    private void campoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarComEnter();
        }
    }//GEN-LAST:event_campoLoginKeyPressed

    private void campoSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarComEnter();
        }
    }//GEN-LAST:event_campoSenhaKeyPressed

    private void botaoRegistrarSeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoRegistrarSeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JDialog tela = new TelaRegistrar(this, true);
            erros();
            tela.setVisible(true);
        }
    }//GEN-LAST:event_botaoRegistrarSeKeyPressed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        entrarComEnter();
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEntrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarComEnter();
        }
    }//GEN-LAST:event_botaoEntrarKeyPressed
    
    public static void abrirTela(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
                erroLogin.setVisible(false);
            }
        });
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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
                erroLogin.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoRegistrarSe;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    public static javax.swing.JLabel erroLogin;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel planoDeFundoTelaLogin;
    // End of variables declaration//GEN-END:variables
}
