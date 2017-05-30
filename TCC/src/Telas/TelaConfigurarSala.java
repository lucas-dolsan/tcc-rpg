package Telas;

import com.sun.glass.events.KeyEvent;

public class TelaConfigurarSala extends javax.swing.JDialog {

    private final TelaInicial tela;

    public TelaConfigurarSala(java.awt.Frame parent, boolean modal, TelaInicial telaInicial) {
        super(parent, modal);
        initComponents();
        erroSalaSemNome.setVisible(false);
        tela = telaInicial;
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
        erroSalaSemNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RPG - TCC - Configurar sala");
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nome da sala:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 340, 30);

        campoNomeSala.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        campoNomeSala.setForeground(new java.awt.Color(51, 51, 51));
        campoNomeSala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNomeSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeSalaKeyPressed(evt);
            }
        });
        getContentPane().add(campoNomeSala);
        campoNomeSala.setBounds(30, 80, 340, 40);

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Senha da sala (Opcional):");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 150, 340, 30);

        campoSenhaSala.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        campoSenhaSala.setForeground(new java.awt.Color(51, 51, 51));
        campoSenhaSala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSenhaSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaSalaKeyPressed(evt);
            }
        });
        getContentPane().add(campoSenhaSala);
        campoSenhaSala.setBounds(30, 180, 340, 40);

        botaoCriar.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoCriar.setForeground(new java.awt.Color(51, 51, 51));
        botaoCriar.setText("Criar");
        botaoCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarActionPerformed(evt);
            }
        });
        botaoCriar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoCriarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoCriar);
        botaoCriar.setBounds(30, 300, 140, 40);

        jButton2.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(230, 300, 140, 40);

        erroSalaSemNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        erroSalaSemNome.setForeground(new java.awt.Color(204, 0, 0));
        erroSalaSemNome.setText("Aviso: sala sem nome!");
        getContentPane().add(erroSalaSemNome);
        erroSalaSemNome.setBounds(30, 120, 160, 20);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/telaLogin.jpg"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 500));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static String nomeSala = "";

    private void criarSala() {
        nomeSala = campoNomeSala.getText();
        if (nomeSala.isEmpty()) {
            erroSalaSemNome.setVisible(true);
        } else {
            char[] senha = campoSenhaSala.getPassword();
            String senhaAuxiliar = String.valueOf(senha);
            tela.dispose();
            TelaJogo.Start(this);
        }

    }
    private void botaoCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarActionPerformed
        criarSala();
    }//GEN-LAST:event_botaoCriarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void campoNomeSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            criarSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_campoNomeSalaKeyPressed

    private void campoSenhaSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            criarSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_campoSenhaSalaKeyPressed

    private void botaoCriarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoCriarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            criarSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_botaoCriarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriar;
    private javax.swing.JTextField campoNomeSala;
    private javax.swing.JPasswordField campoSenhaSala;
    public static javax.swing.JLabel erroSalaSemNome;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
