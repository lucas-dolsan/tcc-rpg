package Telas;

import ConexaoBanco.DAO;
import Objetos.ItemArma;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCriarArma extends javax.swing.JDialog {

    DAO dao = new DAO();

    public TelaCriarArma(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadImages();
        erro.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        caixaIcons = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDano = new javax.swing.JTextField();
        caixaPersonagem = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoAtributos = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        campoDescricao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        erro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoQuantidade = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criação de Item");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(365, 470));
        setMinimumSize(new java.awt.Dimension(365, 470));
        setPreferredSize(new java.awt.Dimension(365, 470));
        getContentPane().setLayout(null);

        caixaIcons.setMaximumSize(new java.awt.Dimension(80, 60));
        caixaIcons.setMinimumSize(new java.awt.Dimension(80, 60));
        caixaIcons.setName(""); // NOI18N
        caixaIcons.setPreferredSize(new java.awt.Dimension(80, 60));
        getContentPane().add(caixaIcons);
        caixaIcons.setBounds(10, 40, 80, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome do Item:");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 20, 240, 20);
        getContentPane().add(campoNome);
        campoNome.setBounds(100, 40, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Dano base:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 70, 240, 20);
        getContentPane().add(campoDano);
        campoDano.setBounds(100, 90, 240, 30);

        caixaPersonagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caixaPersonagemFocusGained(evt);
            }
        });
        getContentPane().add(caixaPersonagem);
        caixaPersonagem.setBounds(100, 140, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Atribuir ao personagem/NPC/monstro:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 120, 240, 20);

        campoAtributos.setColumns(20);
        campoAtributos.setRows(5);
        jScrollPane2.setViewportView(campoAtributos);
        campoAtributos.setLineWrap(true);
        campoAtributos.setWrapStyleWord(true);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 190, 330, 96);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Outros atributos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 170, 330, 20);

        campoDescricao.setColumns(20);
        campoDescricao.setRows(5);
        jScrollPane3.setViewportView(campoDescricao);
        campoDescricao.setLineWrap(true);
        campoDescricao.setWrapStyleWord(true);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 300, 330, 96);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Descrição:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 284, 330, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Icone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 20, 80, 20);

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar);
        botaoSalvar.setBounds(230, 400, 110, 30);

        erro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        erro.setForeground(new java.awt.Color(255, 0, 0));
        erro.setText("Nome, personagem ou dano faltando!");
        getContentPane().add(erro);
        erro.setBounds(10, 400, 230, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Quantidade:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 120, 90, 20);
        getContentPane().add(campoQuantidade);
        campoQuantidade.setBounds(10, 140, 80, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void caixaPersonagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caixaPersonagemFocusGained
        caixaPersonagem.removeAllItems();
        dao.listarPersonagensArmas();
    }//GEN-LAST:event_caixaPersonagemFocusGained
    private int transformarDanoEmInt() {
        if (campoDano.getText() == null) {
            return 0;
        } else {
            String vida = campoDano.getText();
            return Integer.parseInt(vida);
        }
    }

    private int tranformarQuantidadeEmInt() {
        if (campoQuantidade.getText() == null) {
            return 0;
        } else {
            String quantidade = campoQuantidade.getText();
            return Integer.parseInt(quantidade);
        }
    }

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        boolean error = false;
        String icon = caixaIcons.getSelectedItem().toString();
        int aux = icon.lastIndexOf("/");
        icon = icon.substring(aux + 1);
        String nome = null;
        if (!campoNome.getText().isEmpty() || campoNome.getText().equalsIgnoreCase(" ")) {
            nome = campoNome.getText();
        } else {
            erro.setVisible(true);
            error = true;
        }
        if (nome == null) {
            error = true;
        }
        int dano = transformarDanoEmInt();
        if (dano == 0) {
            erro.setVisible(true);
            error = true;
        }
        String nomePersonagem = caixaPersonagem.getSelectedItem().toString();
        if (nomePersonagem.isEmpty() || nomePersonagem == null) {
            erro.setVisible(true);
            error = true;
        }
        String descricao = campoDescricao.getText();
        String atributos = campoAtributos.getText();
        int quantidade = tranformarQuantidadeEmInt();
        if (!error) {
            try {
                ItemArma ia = new ItemArma(dao.pegarPk_personagem(nomePersonagem), nome, icon, dano, atributos, descricao, quantidade);
                dao.criarItemArma(ia);
                JOptionPane.showMessageDialog(this, "Item criado com sucesso!");
                caixaPersonagem.removeAllItems();
                campoAtributos.setText("");
                campoDano.setText("0");
                campoDescricao.setText("");
                campoNome.setText("");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Houve um erro durante a criação do item.\nPor favor tente novamente!");
            }

        }

    }//GEN-LAST:event_botaoSalvarActionPerformed
    private void loadImages() {
        for (int i = 1; i <= 184; i++) {
            Object icon = (new ImageIcon(getClass().getResource("/WeaponIcons/weapon(" + i + ").png")));
            caixaIcons.addItem(icon);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox<Object> caixaIcons;
    public static javax.swing.JComboBox<String> caixaPersonagem;
    private javax.swing.JTextArea campoAtributos;
    private javax.swing.JTextField campoDano;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoQuantidade;
    private javax.swing.JLabel erro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
