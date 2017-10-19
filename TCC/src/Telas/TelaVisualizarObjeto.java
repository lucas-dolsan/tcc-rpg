package Telas;

import ConexaoBanco.DAO;
import javax.swing.ImageIcon;

public class TelaVisualizarObjeto extends javax.swing.JDialog {

    DAO dao = new DAO();
    int idT = 0;
    int tipoT = 0;

    public TelaVisualizarObjeto(java.awt.Frame parent, boolean modal, String nome, String url, int tipo, int id) {
        super(parent, modal);
        initComponents();
        this.idT = id;
        this.tipoT = tipo;
        int index = url.lastIndexOf("/");
        String urlCortada = url.substring(index);
        ImageIcon img = null;
        switch (tipo) {
            case 1:
                img = new ImageIcon(getClass().getResource("/WeaponIcons/" + urlCortada));
                break;
            case 2:
                img = new ImageIcon(getClass().getResource("/ArmaduraIcons/" + urlCortada));
                break;
            default:
                img = new ImageIcon(getClass().getResource("/ItemIcons/" + urlCortada));
                break;
        }
        labelIcone.setIcon(img);
        labelNome.setText("Nome: " + nome);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caixaPersonagem = new javax.swing.JComboBox<>();
        botaoEnviarItem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botaoExcluir = new javax.swing.JButton();
        labelIcone = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Double Damage - Enviar Objeto");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(370, 170));
        setMinimumSize(new java.awt.Dimension(370, 170));
        setPreferredSize(new java.awt.Dimension(370, 170));
        getContentPane().setLayout(null);

        caixaPersonagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        caixaPersonagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caixaPersonagemFocusGained(evt);
            }
        });
        getContentPane().add(caixaPersonagem);
        caixaPersonagem.setBounds(10, 30, 160, 30);

        botaoEnviarItem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoEnviarItem.setText("ENVIAR!");
        botaoEnviarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarItemActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEnviarItem);
        botaoEnviarItem.setBounds(10, 90, 160, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ENVIAR ITEM PARA:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 160, 20);

        botaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoExcluir.setText("EXCLUIR ITEM!");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(180, 90, 160, 30);

        labelIcone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelIcone);
        labelIcone.setBounds(240, 30, 52, 52);

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(labelNome);
        labelNome.setBounds(180, 10, 160, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void caixaPersonagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caixaPersonagemFocusGained
        caixaPersonagem.removeAllItems();
        dao.listarPersonagensEnviarObjeto();
    }//GEN-LAST:event_caixaPersonagemFocusGained

    private void botaoEnviarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarItemActionPerformed
        if (caixaPersonagem.getSelectedItem().toString() != null) {
            dao.trocarItem(idT, tipoT,caixaPersonagem.getSelectedItem().toString());
            this.dispose();
        }
    }//GEN-LAST:event_botaoEnviarItemActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
       dao.excluirItem(idT, tipoT);
       this.dispose();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEnviarItem;
    private javax.swing.JButton botaoExcluir;
    public static javax.swing.JComboBox<String> caixaPersonagem;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel labelIcone;
    private static javax.swing.JLabel labelNome;
    // End of variables declaration//GEN-END:variables
}
