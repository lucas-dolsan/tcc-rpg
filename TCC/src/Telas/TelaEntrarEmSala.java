package Telas;

import ConexaoBanco.JogadorDAO;
import com.sun.glass.events.KeyEvent;

public class TelaEntrarEmSala extends javax.swing.JDialog {

    private final TelaInicial tela;

    public TelaEntrarEmSala(java.awt.Frame parent, boolean modal, TelaInicial telaInicial) {
        super(parent, modal);
        initComponents();
        JogadorDAO.listarSalas();
        erroEntrarEmSala.setVisible(false);
        tela = telaInicial;
    }

    TelaEntrarEmSala(TelaInicial aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caixaDeSalas = new javax.swing.JComboBox<>();
        campoSenhaSala = new javax.swing.JTextField();
        botaoEntrarEmSala = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        erroEntrarEmSala = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RPG - TCC - Entrar em Sala");
        setMaximumSize(new java.awt.Dimension(400, 490));
        setMinimumSize(new java.awt.Dimension(400, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        caixaDeSalas.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        caixaDeSalas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        getContentPane().add(caixaDeSalas);
        caixaDeSalas.setBounds(30, 80, 340, 40);

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

        botaoEntrarEmSala.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoEntrarEmSala.setForeground(new java.awt.Color(51, 51, 51));
        botaoEntrarEmSala.setText("Entrar");
        botaoEntrarEmSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarEmSalaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEntrarEmSala);
        botaoEntrarEmSala.setBounds(30, 300, 140, 40);

        botaoCancelar.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(51, 51, 51));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(230, 300, 140, 40);

        erroEntrarEmSala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        erroEntrarEmSala.setForeground(new java.awt.Color(204, 0, 0));
        erroEntrarEmSala.setText("Erro: senha da sala incorreta!");
        getContentPane().add(erroEntrarEmSala);
        erroEntrarEmSala.setBounds(30, 230, 270, 17);

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nome da Sala:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 50, 340, 30);

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 150, 340, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/telaLogin.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(400, 490));
        jLabel1.setMinimumSize(new java.awt.Dimension(400, 490));
        jLabel1.setPreferredSize(new java.awt.Dimension(400, 490));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void entrarEmSala() {
        String nomeSala = (caixaDeSalas.getSelectedItem().toString());
        String senhaSala = campoSenhaSala.getText();
        if (JogadorDAO.entrarEmSala(nomeSala, senhaSala)) {
            TelaJogo.Start(JogadorDAO.verificarDono());
            tela.dispose();
            this.dispose();
        } else {
            erroEntrarEmSala.setVisible(true);
        }
    }
    private void botaoEntrarEmSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarEmSalaActionPerformed
        entrarEmSala();
    }//GEN-LAST:event_botaoEntrarEmSalaActionPerformed

    private void campoSenhaSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarEmSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_campoSenhaSalaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEntrarEmSala;
    public static javax.swing.JComboBox<String> caixaDeSalas;
    private javax.swing.JTextField campoSenhaSala;
    private javax.swing.JLabel erroEntrarEmSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
