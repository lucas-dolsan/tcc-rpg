package Telas;

import ConexaoBanco.DAO;
import Objetos.Magia;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCriarMagia extends javax.swing.JDialog {
    
    DAO dao = new DAO();
    
    public TelaCriarMagia(java.awt.Frame parent, boolean modal) {
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
        campoEfeito = new javax.swing.JTextField();
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
        caixaTipoMagia = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criação de Item");
        setMaximumSize(new java.awt.Dimension(365, 540));
        setMinimumSize(new java.awt.Dimension(365, 540));
        setPreferredSize(new java.awt.Dimension(365, 540));
        getContentPane().setLayout(null);

        caixaIcons.setMaximumSize(new java.awt.Dimension(80, 60));
        caixaIcons.setMinimumSize(new java.awt.Dimension(80, 60));
        caixaIcons.setName(""); // NOI18N
        caixaIcons.setPreferredSize(new java.awt.Dimension(80, 60));
        getContentPane().add(caixaIcons);
        caixaIcons.setBounds(10, 40, 80, 60);

        jLabel1.setText("Nome do Item:");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 20, 240, 20);
        getContentPane().add(campoNome);
        campoNome.setBounds(100, 40, 240, 30);

        jLabel2.setText("Efeito:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 70, 190, 20);
        getContentPane().add(campoEfeito);
        campoEfeito.setBounds(100, 90, 240, 30);

        caixaPersonagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caixaPersonagemFocusGained(evt);
            }
        });
        getContentPane().add(caixaPersonagem);
        caixaPersonagem.setBounds(100, 190, 240, 30);

        jLabel3.setText("Atribuir ao personagem:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 170, 180, 20);

        campoAtributos.setColumns(20);
        campoAtributos.setRows(5);
        jScrollPane2.setViewportView(campoAtributos);
        campoAtributos.setLineWrap(true);
        campoAtributos.setWrapStyleWord(true);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 240, 330, 87);

        jLabel4.setText("Outros atributos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 220, 330, 20);

        campoDescricao.setColumns(20);
        campoDescricao.setRows(5);
        jScrollPane3.setViewportView(campoDescricao);
        campoDescricao.setLineWrap(true);
        campoDescricao.setWrapStyleWord(true);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 360, 330, 87);

        jLabel5.setText("Descrição:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 340, 330, 20);

        jLabel6.setText("Icone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 20, 80, 17);

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar);
        botaoSalvar.setBounds(240, 460, 100, 30);

        erro.setForeground(new java.awt.Color(255, 0, 0));
        erro.setText("Nome, personagem ou dano faltando!");
        getContentPane().add(erro);
        erro.setBounds(10, 460, 230, 30);

        jLabel7.setText("Tipo da magia:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 120, 70, 20);
        getContentPane().add(caixaTipoMagia);
        caixaTipoMagia.setBounds(100, 140, 240, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void caixaPersonagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caixaPersonagemFocusGained
        caixaPersonagem.removeAllItems();
        dao.listarPersonagensMagias();
    }//GEN-LAST:event_caixaPersonagemFocusGained
    
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
        String efeito = campoEfeito.getText();
        String tipo = caixaTipoMagia.getText();
        String nomePersonagem = caixaPersonagem.getSelectedItem().toString();
        if (nomePersonagem.isEmpty() || nomePersonagem == null) {
            erro.setVisible(true);
            error = true;
        }
        String descricao = campoDescricao.getText();
        String atributos = campoAtributos.getText();
        if (!error) {
            try {
                Magia ma = new Magia(dao.pegarPk_personagem(nomePersonagem), nome, icon, efeito, tipo, descricao, atributos);
                dao.criarMagia(ma);
                JOptionPane.showMessageDialog(this, "Item criado com sucesso!");
                caixaPersonagem.removeAllItems();
                campoAtributos.setText("");
                campoEfeito.setText("0");
                campoDescricao.setText("");
                campoNome.setText("");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Houve um erro durante a criação do item.\nPor favor tente novamente!");
            }
            
        }
        
    }//GEN-LAST:event_botaoSalvarActionPerformed
    private void loadImages() {
        for (int i = 1; i <= 534; i++) {
            Object icon = (new ImageIcon(getClass().getResource("/MagiaIcons/magia(" + i + ").png")));
            caixaIcons.addItem(icon);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox<Object> caixaIcons;
    public static javax.swing.JComboBox<String> caixaPersonagem;
    private javax.swing.JTextField caixaTipoMagia;
    private javax.swing.JTextArea campoAtributos;
    private javax.swing.JTextArea campoDescricao;
    private javax.swing.JTextField campoEfeito;
    private javax.swing.JTextField campoNome;
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
