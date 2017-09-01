package Telas;

import ConexaoBanco.DAO;
import Objetos.FichaPersonagem;
import static Telas.TelaJogo.imagemIcone;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

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
        tabela = new javax.swing.JTable();
        botaAdicionarImagem = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoMatarNPC = new javax.swing.JButton();
        botaoSalvarEdicao = new javax.swing.JButton();
        nomeEmUso = new javax.swing.JLabel();
        botaoAtualizarIMG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NPC: "+DAO.nomePersonagem
        );
        setMaximumSize(new java.awt.Dimension(500, 655));
        setMinimumSize(new java.awt.Dimension(500, 655));
        setPreferredSize(new java.awt.Dimension(500, 655));
        setResizable(false);
        getContentPane().setLayout(null);

        labelImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(labelImagem);
        labelImagem.setBounds(10, 11, 150, 280);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NOME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 0, 220, 30);
        getContentPane().add(campoNome);
        campoNome.setBounds(170, 30, 320, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("FUNÇÃO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 60, 260, 20);
        getContentPane().add(campoFuncao);
        campoFuncao.setBounds(170, 80, 320, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("VIDA:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 110, 80, 20);
        getContentPane().add(campoVida);
        campoVida.setBounds(170, 130, 90, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DANO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(290, 110, 80, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DEFESA:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 110, 80, 20);
        getContentPane().add(campoDano);
        campoDano.setBounds(290, 130, 90, 30);
        getContentPane().add(campoDefesa);
        campoDefesa.setBounds(400, 130, 90, 30);

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
        jScrollPane1.setBounds(170, 180, 320, 110);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ITENS:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 320, 150, 20);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Id","Quant.","Icone", "Nome", "Dano/Defesa", "Atributos","Descrição"
            }
        ));
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabela.setEnabled(false);
        tabela.setRowHeight(52);
        jScrollPane2.setViewportView(tabela);
        tabela.getColumnModel().getColumn(0).setMaxWidth(30);
        tabela.getColumnModel().getColumn(0).setMinWidth(30);
        tabela.getColumnModel().getColumn(1).setMinWidth(40);
        tabela.getColumnModel().getColumn(1).setMinWidth(40);
        tabela.getColumnModel().getColumn(2).setMaxWidth(52);
        tabela.getColumnModel().getColumn(2).setMinWidth(52);
        tabela.getColumnModel().getColumn(3).setMaxWidth(100);
        tabela.getColumnModel().getColumn(3).setMinWidth(100);
        tabela.getColumnModel().getColumn(4).setMaxWidth(90);
        tabela.getColumnModel().getColumn(4).setMinWidth(90);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = tabela.rowAtPoint(evt.getPoint());
                if (row >= 0&&DAO.donoDaSala) {
                    String url = tabela.getValueAt(row, 2).toString();
                    if(url.contains("weapon")){
                        String aux = tabela.getValueAt(row, 0).toString();
                        int id = Integer.parseInt(aux);
                        TelaVisualizarObjeto telaVisualizarObjeto = new TelaVisualizarObjeto(null, true,tabela.getValueAt(row, 3).toString(),tabela.getValueAt(row,2).toString(),1,id);
                        telaVisualizarObjeto.setVisible(true);
                        try{
                            tabela.removeAll();
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        dao.listarArmasNPC();
                        dao.listarArmadurasNPC();
                        dao.listarItensNPC();
                    }
                    if(url.contains("armadura")){
                        String aux = tabela.getValueAt(row, 0).toString();
                        int id = Integer.parseInt(aux);
                        TelaVisualizarObjeto telaVisualizarObjeto = new TelaVisualizarObjeto(null, true,tabela.getValueAt(row, 3).toString(),tabela.getValueAt(row,2).toString(),2,id);
                        telaVisualizarObjeto.setVisible(true);
                        try{
                            tabela.removeAll();
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        dao.listarArmasNPC();
                        dao.listarArmadurasNPC();
                        dao.listarItensNPC();
                    }
                    if(url.contains("item")){
                        String aux = tabela.getValueAt(row, 0).toString();
                        int id = Integer.parseInt(aux);
                        TelaVisualizarObjeto telaVisualizarObjeto = new TelaVisualizarObjeto(null, true,tabela.getValueAt(row, 3).toString(),tabela.getValueAt(row,2).toString(),3,id);
                        telaVisualizarObjeto.setVisible(true);
                        try{
                            tabela.removeAll();
                        }catch(Exception e){
                            e.printStackTrace();
                        }
                        dao.listarArmasNPC();
                        dao.listarArmadurasNPC();
                        dao.listarItensNPC();
                    }

                }
            }
        });

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 340, 480, 240);

        botaAdicionarImagem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaAdicionarImagem.setText("ADICIONAR IMAGEM");
        botaAdicionarImagem.setEnabled(false);
        botaAdicionarImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaAdicionarImagemActionPerformed(evt);
            }
        });
        getContentPane().add(botaAdicionarImagem);
        botaAdicionarImagem.setBounds(83, 590, 147, 30);

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoSalvar.setText("SALVAR");
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar);
        botaoSalvar.setBounds(410, 590, 80, 30);

        botaoExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoExcluir.setText("EXCLUIR");
        botaoExcluir.setEnabled(false);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(330, 590, 80, 30);

        botaoMatarNPC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoMatarNPC.setText("MATAR NPC");
        botaoMatarNPC.setEnabled(false);
        botaoMatarNPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMatarNPCActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMatarNPC);
        botaoMatarNPC.setBounds(230, 590, 100, 30);

        botaoSalvarEdicao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoSalvarEdicao.setText("SALVAR");
        botaoSalvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarEdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvarEdicao);
        botaoSalvarEdicao.setBounds(410, 590, 80, 30);

        nomeEmUso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomeEmUso.setForeground(new java.awt.Color(255, 0, 0));
        nomeEmUso.setText("Nome de personagem já em uso!");
        getContentPane().add(nomeEmUso);
        nomeEmUso.setBounds(170, 290, 260, 20);

        botaoAtualizarIMG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoAtualizarIMG.setText("ATUALIZAR IMAGEM");
        botaoAtualizarIMG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarIMGActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAtualizarIMG);
        botaoAtualizarIMG.setBounds(10, 293, 150, 29);

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

    private void botaAdicionarImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaAdicionarImagemActionPerformed
        new Thread() {
            @Override
            public void run() {
                JFileChooser escolherArquivo = new JFileChooser();
                escolherArquivo.setMaximumSize(new java.awt.Dimension(800, 600));
                escolherArquivo.setMinimumSize(new java.awt.Dimension(800, 600));
                escolherArquivo.setPreferredSize(new java.awt.Dimension(800, 600));
                FileFilter filter = new FileNameExtensionFilter("Imagens em JPEG", "jpg", "jpeg");
                FileFilter filter2 = new FileNameExtensionFilter("Imagens em PNG", "png");
                FileFilter filter3 = new FileNameExtensionFilter("Imagens em GIF", "gif");
                escolherArquivo.addChoosableFileFilter(filter);
                escolherArquivo.addChoosableFileFilter(filter2);
                escolherArquivo.addChoosableFileFilter(filter3);
                escolherArquivo.setAcceptAllFileFilterUsed(false);
                escolherArquivo.setMultiSelectionEnabled(false);
                int resultado = escolherArquivo.showOpenDialog(null);
                if (resultado == escolherArquivo.CANCEL_OPTION) {
                    System.out.println("Escolha de arquivos cancelada");
                } else {
                    String path = escolherArquivo.getSelectedFile().getPath();
                    System.out.println("Arquivo: [" + path + "] selecionado");
                    dao.uploadNPC(path);
                }
            }
        }.start();
    }//GEN-LAST:event_botaAdicionarImagemActionPerformed

    private void botaoMatarNPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMatarNPCActionPerformed

    }//GEN-LAST:event_botaoMatarNPCActionPerformed

    private void botaoAtualizarIMGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarIMGActionPerformed
        new Thread() {
            @Override
            public void run() {
                if (dao.verificarImagemNPCExiste()) {
                    try {
                        BufferedImage imagem = ImageIO.read(dao.downloadImagemNPC().getBinaryStream());
                        imagemIcone = new ImageIcon(imagem);
                        labelImagem.setIcon(imagemIcone);
                    } catch (SQLException | IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }

        }.start();
    }//GEN-LAST:event_botaoAtualizarIMGActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaAdicionarImagem;
    private javax.swing.JButton botaoAtualizarIMG;
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
    public javax.swing.JLabel labelImagem;
    private javax.swing.JLabel nomeEmUso;
    public static javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
