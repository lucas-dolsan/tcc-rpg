package Telas;

import ConexaoBanco.DAO;
import javax.swing.JOptionPane;

public class TelaConfigurarConta extends javax.swing.JDialog {

    DAO dao = new DAO();

    public TelaConfigurarConta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        JOptionPane.showMessageDialog(null, "Para evitar erros preencha TODOS os campos corretamente!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoSenha = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        confirmar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Double Damage - Configurar conta");
        setMaximumSize(new java.awt.Dimension(460, 320));
        setMinimumSize(new java.awt.Dimension(460, 320));
        setPreferredSize(new java.awt.Dimension(460, 320));
        getContentPane().setLayout(null);

        campoSenha.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(campoSenha);
        campoSenha.setBounds(30, 190, 400, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("INFORME O NOVO NOME DE USUÁRIO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 400, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("INFORME O NOVO EMAIL:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 90, 400, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("INFORME A NOVA SENHA:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 160, 280, 30);

        campoEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(campoEmail);
        campoEmail.setBounds(30, 120, 400, 40);

        campoNome.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(campoNome);
        campoNome.setBounds(30, 50, 400, 40);

        confirmar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        confirmar.setText("CONFIRMAR");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });
        getContentPane().add(confirmar);
        confirmar.setBounds(280, 250, 150, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 250, 150, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if (!dao.verificarEmail(campoEmail.getText())) {
            if (dao.editarJogador(campoEmail.getText(), campoSenha.getText(), campoNome.getText())) {
                JOptionPane.showMessageDialog(this, "Conta editada com sucesso!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao editar conta!!");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao editar conta!!");
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JButton confirmar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
