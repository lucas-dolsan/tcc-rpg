package Telas;

import ConexaoBanco.DAO;
import Objetos.FichaTexto;

public class TelaFichaDeTexto extends javax.swing.JDialog {

    DAO dao = new DAO();

    public TelaFichaDeTexto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fichaSemNome.setVisible(false);
        nomeExiste.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeFichaTexto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        telaTextoFicha = new javax.swing.JTextArea();
        botaoSalvar = new javax.swing.JButton();
        botaoCriar = new javax.swing.JButton();
        fichaSemNome = new javax.swing.JLabel();
        botaoExcluirFichaTexto = new javax.swing.JButton();
        nomeExiste = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(715, 560));
        setMinimumSize(new java.awt.Dimension(715, 560));
        setPreferredSize(new java.awt.Dimension(715, 560));
        setSize(new java.awt.Dimension(715, 560));
        getContentPane().setLayout(null);
        getContentPane().add(nomeFichaTexto);
        nomeFichaTexto.setBounds(180, 10, 200, 29);

        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        jLabel1.setText("Nome da ficha:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 131, 29);

        telaTextoFicha.setColumns(20);
        telaTextoFicha.setRows(5);
        jScrollPane1.setViewportView(telaTextoFicha);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 680, 420);

        botaoSalvar.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar);
        botaoSalvar.setBounds(600, 480, 90, 30);

        botaoCriar.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoCriar.setText("Criar");
        botaoCriar.setEnabled(false);
        botaoCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriar);
        botaoCriar.setBounds(400, 480, 90, 30);

        fichaSemNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fichaSemNome.setForeground(new java.awt.Color(204, 0, 0));
        fichaSemNome.setText("Ficha sem nome!");
        getContentPane().add(fichaSemNome);
        fichaSemNome.setBounds(280, 480, 140, 30);

        botaoExcluirFichaTexto.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoExcluirFichaTexto.setText("Excluir");
        botaoExcluirFichaTexto.setEnabled(false);
        botaoExcluirFichaTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirFichaTextoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluirFichaTexto);
        botaoExcluirFichaTexto.setBounds(500, 480, 90, 30);

        nomeExiste.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeExiste.setForeground(new java.awt.Color(204, 0, 0));
        nomeExiste.setText("Nome já existe!");
        getContentPane().add(nomeExiste);
        nomeExiste.setBounds(410, 10, 200, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarActionPerformed
        String nomeFicha = nomeFichaTexto.getText();
        if (nomeFicha.isEmpty() || nomeFicha.equalsIgnoreCase(" ")) {
            fichaSemNome.setVisible(true);
        } else {
            FichaTexto ft = new FichaTexto(DAO.salaAtual.getPk_sala(), nomeFichaTexto.getText(), telaTextoFicha.getText());
            dao.criarFichaTexto(ft);
        }
        this.dispose();
    }//GEN-LAST:event_botaoCriarActionPerformed

    private void botaoExcluirFichaTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirFichaTextoActionPerformed
        dao.excluirFichaTexto();
        this.dispose();
    }//GEN-LAST:event_botaoExcluirFichaTextoActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (nomeFichaTexto.getText().equalsIgnoreCase(DAO.nomeFichaTexto)) {
            FichaTexto ft = new FichaTexto(DAO.salaAtual.getPk_sala(), nomeFichaTexto.getText(), telaTextoFicha.getText());
            dao.salvarEdicaoFichaTexto(ft);
            this.dispose();
        } else {
            if (dao.fichaExiste(nomeFichaTexto.getText())) {
                nomeExiste.setVisible(true);
            } else {
                FichaTexto ft = new FichaTexto(DAO.salaAtual.getPk_sala(), nomeFichaTexto.getText(), telaTextoFicha.getText());
                dao.salvarEdicaoFichaTexto(ft);
                this.dispose();
            }
        }
        this.dispose();
    }//GEN-LAST:event_botaoSalvarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaoCriar;
    public javax.swing.JButton botaoExcluirFichaTexto;
    public javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel fichaSemNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomeExiste;
    public javax.swing.JTextField nomeFichaTexto;
    public javax.swing.JTextArea telaTextoFicha;
    // End of variables declaration//GEN-END:variables
}
