package Telas;

public class TelaConfigurarSala extends javax.swing.JDialog {
    public TelaConfigurarSala(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        campoNomeSala = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoSenhaSala = new javax.swing.JPasswordField();
        botaoCriar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RPG - TCC - Configurar sala");
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome da sala:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 340, 30);

        campoNomeSala.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        campoNomeSala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(campoNomeSala);
        campoNomeSala.setBounds(30, 80, 340, 40);

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("senha da sala:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 130, 340, 30);

        campoSenhaSala.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        campoSenhaSala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(campoSenhaSala);
        campoSenhaSala.setBounds(30, 160, 340, 40);

        botaoCriar.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoCriar.setText("criar");
        botaoCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriar);
        botaoCriar.setBounds(227, 432, 140, 40);

        jButton2.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        jButton2.setText("cancelar");
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 432, 150, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/telaLogin.jpg"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static String nomeSala = "";
    private void botaoCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarActionPerformed
        nomeSala = campoNomeSala.getText();
        char[] senha = campoSenhaSala.getPassword();
        String senhaAuxiliar = String.valueOf(senha);
        
        
        TelaJogo.Start(this);
    }//GEN-LAST:event_botaoCriarActionPerformed
    
    public static void Start() {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(TelaConfigurarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfigurarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfigurarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfigurarSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaConfigurarSala dialog = new TelaConfigurarSala(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton botaoCriar;
    private javax.swing.JTextField campoNomeSala;
    private javax.swing.JPasswordField campoSenhaSala;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
