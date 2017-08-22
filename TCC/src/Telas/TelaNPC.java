package Telas;

public class TelaNPC extends javax.swing.JDialog {

    public TelaNPC(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(455, 600));
        setMinimumSize(new java.awt.Dimension(455, 600));
        setPreferredSize(new java.awt.Dimension(455, 600));
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
        getContentPane().add(botaAdicionarImagem);
        botaAdicionarImagem.setBounds(10, 523, 150, 30);

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoSalvar.setText("SALVAR");
        getContentPane().add(botaoSalvar);
        botaoSalvar.setBounds(351, 523, 80, 30);

        botaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoExcluir.setText("EXCLUIR");
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(270, 523, 80, 30);

        botaoMatarNPC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoMatarNPC.setText("MATAR NPC");
        getContentPane().add(botaoMatarNPC);
        botaoMatarNPC.setBounds(160, 523, 110, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaAdicionarImagem;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoMatarNPC;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoDano;
    private javax.swing.JTextField campoDefesa;
    private javax.swing.JTextField campoFuncao;
    private javax.swing.JTextArea campoLore;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoVida;
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
    private javax.swing.JTable tabelaNPC;
    // End of variables declaration//GEN-END:variables
}
