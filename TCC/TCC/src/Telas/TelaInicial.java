package Telas;

import ConexaoBanco.JogadorDAO;
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
        botaoCriarSala = new javax.swing.JButton();
        botaoEntrarEmSala = new javax.swing.JButton();
        botaoDeslogar = new javax.swing.JButton();
        planoDeFundoTelaInicial = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RPG - TCC - " + JogadorDAO.nickName);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SEJA BEM-VINDO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(425, 30, 440, 110);

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(JogadorDAO.nickName);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 110, 580, 80);

        botaoCriarSala.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        botaoCriarSala.setText("CRIAR NOVA SALA");
        botaoCriarSala.setName(""); // NOI18N
        botaoCriarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarSalaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriarSala);
        botaoCriarSala.setBounds(430, 240, 450, 60);

        botaoEntrarEmSala.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        botaoEntrarEmSala.setText("ENTRAR EM UMA SALA");
        getContentPane().add(botaoEntrarEmSala);
        botaoEntrarEmSala.setBounds(430, 330, 450, 60);

        botaoDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/deslogar.png"))); // NOI18N
        botaoDeslogar.setToolTipText("Desconectar.");
        botaoDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeslogarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoDeslogar);
        botaoDeslogar.setBounds(1190, 650, 80, 40);

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

    private void botaoDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeslogarActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Desconectar.", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            TelaLogin.abrirTela();
        }

    }//GEN-LAST:event_botaoDeslogarActionPerformed
 
    private void botaoCriarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarSalaActionPerformed
        JDialog tela = new TelaConfigurarSala(this, true);
        tela.setVisible(true);
    }//GEN-LAST:event_botaoCriarSalaActionPerformed

    public static void Start() {
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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriarSala;
    private javax.swing.JButton botaoDeslogar;
    private javax.swing.JButton botaoEntrarEmSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel planoDeFundoTelaInicial;
    // End of variables declaration//GEN-END:variables
}
