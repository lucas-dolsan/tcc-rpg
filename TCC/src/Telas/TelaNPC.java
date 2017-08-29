package Telas;

import ConexaoBanco.DAO;
import Objetos.FichaPersonagem;

public class TelaNPC extends javax.swing.JDialog {

    DAO dao = new DAO();

    public TelaNPC(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        nomeEmUso.setVisible(false);
        campoDano.setText("0");
        campoDefesa.setText("0");
        campoVida.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImagem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoFuncao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoVida = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoDano = new javax.swing.JTextField();
        campoDefesa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoLore = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaNPC = new javax.swing.JTable();
        botaAdicionarImagem = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoMatarNPC = new javax.swing.JButton();
        botaoSalvarEdicao = new javax.swing.JButton();
        nomeEmUso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(440, 590));
        setMinimumSize(new java.awt.Dimension(440, 590));
        setPreferredSize(new java.awt.Dimension(440, 590));
        setResizable(false);
        getContentPane().setLayout(null);

        labelImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelImagem);
        labelImagem.setBounds(10, 11, 150, 280);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NOME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 0, 220, 30);
        getContentPane().add(campoNome);
        campoNome.setBounds(170, 30, 260, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("FUNÇÃO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 60, 260, 20);
        getContentPane().add(campoFuncao);
        campoFuncao.setBounds(170, 80, 260, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("VIDA:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 110, 80, 20);
        getContentPane().add(campoVida);
        campoVida.setBounds(170, 130, 80, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DANO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 110, 80, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DEFESA:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(350, 110, 80, 20);
        getContentPane().add(campoDano);
        campoDano.setBounds(260, 130, 80, 30);
        getContentPane().add(campoDefesa);
        campoDefesa.setBounds(350, 130, 80, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("LORE:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(170, 160, 260, 20);

        campoLore.setColumns(20);
        campoLore.setRows(5);
        jScrollPane1.setViewportView(campoLore);
        campoLore.setLineWrap(true);
        campoLore.setWrapStyleWord(true);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 180, 260, 110);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ITENS:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 290, 150, 30);

        tabelaNPC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelaNPC);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 320, 420, 200);

        botaAdicionarImagem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaAdicionarImagem.setText("ADICIONAR IMAGEM");
        botaAdicionarImagem.setEnabled(false);
        getContentPane().add(botaAdicionarImagem);
        botaAdicionarImagem.setBounds(10, 523, 150, 30);

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoSalvar.setText("SALVAR");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar);
        botaoSalvar.setBounds(351, 523, 80, 30);

        botaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoExcluir.setText("EXCLUIR");
        botaoExcluir.setEnabled(false);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(270, 523, 80, 30);

        botaoMatarNPC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoMatarNPC.setText("MATAR NPC");
        botaoMatarNPC.setEnabled(false);
        getContentPane().add(botaoMatarNPC);
        botaoMatarNPC.setBounds(160, 523, 110, 30);

        botaoSalvarEdicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoSalvarEdicao.setText("SALVAR");
        botaoSalvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarEdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvarEdicao);
        botaoSalvarEdicao.setBounds(351, 523, 80, 30);

        nomeEmUso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomeEmUso.setForeground(new java.awt.Color(255, 0, 0));
        nomeEmUso.setText("Nome de personagem já em uso!");
        getContentPane().add(nomeEmUso);
        nomeEmUso.setBounds(170, 290, 260, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private int transformarVidaEmInt() {
        if (campoVida.getText() == null) {
            return 0;
        } else {
            String vida = campoVida.getText();
            return Integer.parseInt(vida);
        }
    }

    private int transformarDanoEmInt() {
        if (campoDano.getText() == null) {
            return 0;
        } else {
            String dano = campoDano.getText();
            return Integer.parseInt(dano);
        }
    }

    private int transformarDefesaEmInt() {
        if (campoDefesa.getText() == null) {
            return 0;
        } else {
            String defesa = campoDefesa.getText();
            return Integer.parseInt(defesa);
        }
    }
    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        if (dao.personagemExiste(campoNome.getText())) {
            nomeEmUso.setVisible(true);
        } else {
            String nome = campoNome.getText();
            if (nome == null) {
                nome = " ";
            }
            int vida = transformarVidaEmInt();
            int dano = transformarDanoEmInt();
            int defesa = transformarDefesaEmInt();
            String lore = campoLore.getText();
            if (lore == null) {
                lore = " ";
            }
            String funcao = campoFuncao.getText();
            if (funcao == null) {
                funcao = " ";
            }
            FichaPersonagem p = new FichaPersonagem(DAO.salaAtual.getPk_sala(), " ", lore, " ", funcao, nome, " ", " ", 0, 0, vida, dano, 0, 0, 0, 0, 0, 0, defesa, "n");
            dao.criarPersonagem(p);
            this.dispose();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        dao.excluirPersonagem();
        this.dispose();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoSalvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarEdicaoActionPerformed
        if (campoNome.getText().equalsIgnoreCase(DAO.nomePersonagem)) {
            String nome = campoNome.getText();
            if (nome == null) {
                nome = " ";
            }
            int vida = transformarVidaEmInt();
            int dano = transformarDanoEmInt();
            int defesa = transformarDefesaEmInt();
            String lore = campoLore.getText();
            if (lore == null) {
                lore = " ";
            }
            String funcao = campoFuncao.getText();
            if (funcao == null) {
                funcao = " ";
            }
            FichaPersonagem p = new FichaPersonagem(DAO.salaAtual.getPk_sala(), " ", lore, " ", funcao, nome, " ", " ", 0, 0, vida, dano, 0, 0, 0, 0, 0, 0, defesa, "n");
            dao.salvarEdicaoPersonagem(p);
            this.dispose();
        } else {
            if (dao.personagemExiste(campoNome.getText())) {
                nomeEmUso.setVisible(true);
            } else {
                String nome = campoNome.getText();
                if (nome == null) {
                    nome = " ";
                }
                int vida = transformarVidaEmInt();
                int dano = transformarDanoEmInt();
                int defesa = transformarDefesaEmInt();
                String lore = campoLore.getText();
                if (lore == null) {
                    lore = " ";
                }
                String funcao = campoFuncao.getText();
                if (funcao == null) {
                    funcao = " ";
                }
                FichaPersonagem p = new FichaPersonagem(DAO.salaAtual.getPk_sala(), " ", lore, " ", funcao, nome, " ", " ", 0, 0, vida, dano, 0, 0, 0, 0, 0, 0, defesa, "n");
                dao.salvarEdicaoPersonagem(p);
                this.dispose();
            }
        }
    }//GEN-LAST:event_botaoSalvarEdicaoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaAdicionarImagem;
    public javax.swing.JButton botaoExcluir;
    public javax.swing.JButton botaoMatarNPC;
    public static javax.swing.JButton botaoSalvar;
    public javax.swing.JButton botaoSalvarEdicao;
    public javax.swing.JTextField campoDano;
    public javax.swing.JTextField campoDefesa;
    public javax.swing.JTextField campoFuncao;
    public javax.swing.JTextArea campoLore;
    public javax.swing.JTextField campoNome;
    public javax.swing.JTextField campoVida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel nomeEmUso;
    private javax.swing.JTable tabelaNPC;
    // End of variables declaration//GEN-END:variables
}
