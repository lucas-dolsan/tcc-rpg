package Telas;

import ConexaoBanco.DAO;
import Objetos.FichaPersonagem;

public class TelaPersonagem extends javax.swing.JDialog {
    
    DAO dao = new DAO();
    
    public TelaPersonagem(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        nomeEmUso.setVisible(false);
        erroSemNome.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        campoNomeJogador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoNomePersonagem = new javax.swing.JTextField();
        botaoEquipamentos = new javax.swing.JButton();
        botaoMagias = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoOutrosAtributos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoLore = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoRaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoClasse = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        campoIdade = new javax.swing.JTextField();
        campoNivel = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        campoVida = new javax.swing.JTextField();
        campoMana = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        campoDivindade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        campoForca = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        campoConstituicao = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        campoDestreza = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        campoInteligencia = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        campoSabedoria = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        campoCarisma = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        campoDefesa = new javax.swing.JTextField();
        botaoSalvarPersonagem = new javax.swing.JButton();
        botaoExcluirPersonagem = new javax.swing.JButton();
        nomeEmUso = new javax.swing.JLabel();
        salvarEdicao = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        erroSemNome = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Double Damage - Ficha de Personagem");
        setMinimumSize(new java.awt.Dimension(780, 380));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 12)); // NOI18N
        jLabel1.setText("Nome DO Personagem:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 180, 20);
        getContentPane().add(campoNomeJogador);
        campoNomeJogador.setBounds(10, 80, 180, 30);

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 12)); // NOI18N
        jLabel2.setText("Nome DO Jogador:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 60, 180, 20);
        getContentPane().add(campoNomePersonagem);
        campoNomePersonagem.setBounds(10, 30, 180, 30);

        botaoEquipamentos.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoEquipamentos.setText("EQUIPAMENTOS");
        botaoEquipamentos.setEnabled(false);
        botaoEquipamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEquipamentosActionPerformed(evt);
            }
        });
        getContentPane().add(botaoEquipamentos);
        botaoEquipamentos.setBounds(620, 190, 150, 30);

        botaoMagias.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoMagias.setText("MAGIAS");
        botaoMagias.setEnabled(false);
        botaoMagias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMagiasActionPerformed(evt);
            }
        });
        getContentPane().add(botaoMagias);
        botaoMagias.setBounds(620, 230, 150, 30);

        campoOutrosAtributos.setColumns(20);
        campoOutrosAtributos.setRows(5);
        jScrollPane1.setViewportView(campoOutrosAtributos);
        campoOutrosAtributos.setLineWrap(true);
        campoOutrosAtributos.setWrapStyleWord(true);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 250, 270, 90);

        campoLore.setColumns(20);
        campoLore.setRows(5);
        jScrollPane2.setViewportView(campoLore);
        campoLore.setLineWrap(true);
        campoLore.setWrapStyleWord(true);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(6, 250, 330, 90);

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel3.setText("LORE:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 230, 100, 20);

        jLabel4.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel4.setText("Outros atributos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 230, 140, 20);

        jLabel5.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel5.setText("Raça:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 110, 80, 20);
        getContentPane().add(campoRaca);
        campoRaca.setBounds(10, 130, 180, 30);

        jLabel6.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel6.setText("Classe:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 160, 90, 20);
        getContentPane().add(campoClasse);
        campoClasse.setBounds(10, 180, 180, 30);

        jLabel7.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel7.setText("nível:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 60, 80, 20);

        jLabel8.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel8.setText("IDADE:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(290, 60, 90, 20);
        getContentPane().add(campoIdade);
        campoIdade.setBounds(290, 80, 80, 30);
        getContentPane().add(campoNivel);
        campoNivel.setBounds(200, 80, 80, 30);

        jLabel9.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel9.setText("Vida:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 10, 80, 20);

        jLabel10.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel10.setText("Mana:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 10, 90, 20);
        getContentPane().add(campoVida);
        campoVida.setBounds(200, 30, 80, 30);
        getContentPane().add(campoMana);
        campoMana.setBounds(290, 30, 80, 30);

        jLabel12.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel12.setText("divindade:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(200, 110, 170, 20);
        getContentPane().add(campoDivindade);
        campoDivindade.setBounds(200, 130, 170, 30);

        jLabel13.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel13.setText("Força:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(380, 30, 100, 20);
        getContentPane().add(campoForca);
        campoForca.setBounds(380, 50, 110, 30);

        jLabel14.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel14.setText("Constituição:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(380, 80, 110, 20);
        getContentPane().add(campoConstituicao);
        campoConstituicao.setBounds(380, 100, 110, 30);

        jLabel15.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel15.setText("Destreza:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(380, 130, 110, 20);
        getContentPane().add(campoDestreza);
        campoDestreza.setBounds(380, 150, 110, 30);

        jLabel16.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel16.setText(" inteligência:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(500, 30, 110, 20);
        getContentPane().add(campoInteligencia);
        campoInteligencia.setBounds(500, 50, 110, 30);

        jLabel17.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel17.setText("sabedoria:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(500, 80, 110, 20);
        getContentPane().add(campoSabedoria);
        campoSabedoria.setBounds(500, 100, 110, 30);

        jLabel18.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel18.setText("carisma:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(500, 130, 110, 20);
        getContentPane().add(campoCarisma);
        campoCarisma.setBounds(500, 150, 110, 30);

        jLabel19.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel19.setText("defesa:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(620, 30, 90, 20);
        getContentPane().add(campoDefesa);
        campoDefesa.setBounds(620, 50, 110, 30);

        botaoSalvarPersonagem.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoSalvarPersonagem.setText("salvar");
        botaoSalvarPersonagem.setEnabled(false);
        botaoSalvarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarPersonagemActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvarPersonagem);
        botaoSalvarPersonagem.setBounds(620, 270, 150, 30);

        botaoExcluirPersonagem.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        botaoExcluirPersonagem.setText("excluir ficha");
        botaoExcluirPersonagem.setEnabled(false);
        botaoExcluirPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirPersonagemActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluirPersonagem);
        botaoExcluirPersonagem.setBounds(620, 310, 150, 30);

        nomeEmUso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nomeEmUso.setForeground(new java.awt.Color(255, 0, 0));
        nomeEmUso.setText("Nome do personagem já em uso!");
        getContentPane().add(nomeEmUso);
        nomeEmUso.setBounds(10, 210, 270, 14);

        salvarEdicao.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        salvarEdicao.setText("salvar edição");
        salvarEdicao.setEnabled(false);
        salvarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarEdicaoActionPerformed(evt);
            }
        });
        getContentPane().add(salvarEdicao);
        salvarEdicao.setBounds(620, 270, 150, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atributos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("The Bold Font", 1, 14))); // NOI18N
        jPanel1.setFocusable(false);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(370, 10, 400, 180);

        erroSemNome.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        erroSemNome.setForeground(new java.awt.Color(255, 0, 0));
        erroSemNome.setText("Personagem sem nome!");
        getContentPane().add(erroSemNome);
        erroSemNome.setBounds(10, 210, 210, 17);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoMagiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMagiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoMagiasActionPerformed
    public void zerarValores() {
        campoVida.setText("0");
        campoMana.setText("0");
        campoNivel.setText("0");
        campoIdade.setText("0");
        campoForca.setText("0");
        campoInteligencia.setText("0");
        campoDefesa.setText("0");
        campoConstituicao.setText("0");
        campoSabedoria.setText("0");
        campoDestreza.setText("0");
        campoCarisma.setText("0");
    }
    
    private int transformarVidaEmInt() {
        if (campoVida.getText() == null) {
            return 0;
        } else {
            String vida = campoVida.getText();
            return Integer.parseInt(vida);
        }
    }
    
    private int transformarManaEmInt() {
        if (campoMana.getText() == null) {
            return 0;
        } else {
            String mana = campoMana.getText();
            return Integer.parseInt(mana);
        }
    }
    
    private int transformarNivelEmInt() {
        if (campoNivel.getText() == null) {
            return 0;
        } else {
            String nivel = campoNivel.getText();
            return Integer.parseInt(nivel);
        }
    }
    
    private int transformarIdadeEmInt() {
        if (campoIdade.getText() == null) {
            return 0;
        } else {
            String idade = campoIdade.getText();
            return Integer.parseInt(idade);
        }
    }
    
    private int transformarForcaEmInt() {
        if (campoForca.getText() == null) {
            return 0;
        } else {
            String forca = campoForca.getText();
            return Integer.parseInt(forca);
        }
    }
    
    private int transformarInteligenciaEmInt() {
        if (campoInteligencia.getText() == null) {
            return 0;
        } else {
            String inteligencia = campoInteligencia.getText();
            return Integer.parseInt(inteligencia);
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
    
    private int transformarConstituicaoEmInt() {
        if (campoConstituicao.getText() == null) {
            return 0;
        } else {
            String constituicao = campoConstituicao.getText();
            return Integer.parseInt(constituicao);
        }
    }
    
    private int transformarSabedoriaEmInt() {
        if (campoSabedoria.getText() == null) {
            return 0;
        } else {
            String sabedoria = campoSabedoria.getText();
            return Integer.parseInt(sabedoria);
        }
    }
    
    private int transformarDestrezaEmInt() {
        if (campoDestreza.getText() == null) {
            return 0;
        } else {
            String destreza = campoDestreza.getText();
            return Integer.parseInt(destreza);
        }
    }
    
    private int transformarCarismaEmInt() {
        if (campoCarisma.getText() == null) {
            return 0;
        } else {
            String carisma = campoCarisma.getText();
            return Integer.parseInt(carisma);
        }
    }
    private void botaoSalvarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarPersonagemActionPerformed
        if (dao.personagemExiste(campoNomePersonagem.getText())) {
            erroSemNome.setVisible(true);
        } else {
            boolean aux = false;
            String nomePersonagem = campoNomePersonagem.getText();
            if (nomePersonagem == null) {
                erroSemNome.setVisible(true);
                aux = true;
            }
            String nomeJogador = campoNomeJogador.getText();
            if (nomeJogador == null) {
                nomeJogador = " ";
            }
            String raca = campoRaca.getText();
            if (raca == null) {
                raca = " ";
            }
            String classe = campoClasse.getText();
            if (classe == null) {
                classe = " ";
            }
            int vida = transformarVidaEmInt();
            int mana = transformarManaEmInt();
            int nivel = transformarNivelEmInt();
            int idade = transformarIdadeEmInt();
            String divindade = campoDivindade.getText();
            if (divindade == null) {
                divindade = " ";
            }
            String lore = campoLore.getText();
            if (lore == null) {
                lore = " ";
            }
            String outrosAtributos = campoOutrosAtributos.getText();
            if (outrosAtributos == null) {
                outrosAtributos = " ";
            }
            int forca = transformarForcaEmInt();
            int inteligencia = transformarInteligenciaEmInt();
            int defesa = transformarDefesaEmInt();
            int constituicao = transformarConstituicaoEmInt();
            int sabedoria = transformarSabedoriaEmInt();
            int destreza = transformarDestrezaEmInt();
            int carisma = transformarCarismaEmInt();
            if (!aux) {
                FichaPersonagem p = new FichaPersonagem(DAO.salaAtual.getPk_sala(), outrosAtributos, lore, raca, classe, nomePersonagem, nomeJogador, divindade, nivel, idade, vida, mana, forca, constituicao, destreza, inteligencia, sabedoria, carisma, defesa);
                dao.criarPersonagem(p);
                this.dispose();
            }
            
        }
    }//GEN-LAST:event_botaoSalvarPersonagemActionPerformed

    private void salvarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarEdicaoActionPerformed
        if (campoNomePersonagem.getText().equalsIgnoreCase(DAO.nomePersonagem)) {
            String nomePersonagem = campoNomePersonagem.getText();
            if (nomePersonagem == null) {
                nomePersonagem = " ";
            }
            String nomeJogador = campoNomeJogador.getText();
            if (nomeJogador == null) {
                nomeJogador = " ";
            }
            String raca = campoRaca.getText();
            if (raca == null) {
                raca = " ";
            }
            String classe = campoClasse.getText();
            if (classe == null) {
                classe = " ";
            }
            int vida = transformarVidaEmInt();
            int mana = transformarManaEmInt();
            int nivel = transformarNivelEmInt();
            int idade = transformarIdadeEmInt();
            String divindade = campoDivindade.getText();
            if (divindade == null) {
                divindade = " ";
            }
            String lore = campoLore.getText();
            if (lore == null) {
                lore = " ";
            }
            String outrosAtributos = campoOutrosAtributos.getText();
            if (outrosAtributos == null) {
                outrosAtributos = " ";
            }
            int forca = transformarForcaEmInt();
            int inteligencia = transformarInteligenciaEmInt();
            int defesa = transformarDefesaEmInt();
            int constituicao = transformarConstituicaoEmInt();
            int sabedoria = transformarSabedoriaEmInt();
            int destreza = transformarDestrezaEmInt();
            int carisma = transformarCarismaEmInt();
            FichaPersonagem p = new FichaPersonagem(DAO.salaAtual.getPk_sala(), outrosAtributos, lore, raca, classe, nomePersonagem, nomeJogador, divindade, nivel, idade, vida, mana, forca, constituicao, destreza, inteligencia, sabedoria, carisma, defesa);
            dao.salvarEdicaoPersonagem(p);
            this.dispose();
        } else {
            if (dao.personagemExiste(campoNomePersonagem.getText())) {
                nomeEmUso.setVisible(true);
            } else {
                String nomePersonagem = campoNomePersonagem.getText();
                if (nomePersonagem == null) {
                    nomePersonagem = " ";
                }
                String nomeJogador = campoNomeJogador.getText();
                if (nomeJogador == null) {
                    nomeJogador = " ";
                }
                String raca = campoRaca.getText();
                if (raca == null) {
                    raca = " ";
                }
                String classe = campoClasse.getText();
                if (classe == null) {
                    classe = " ";
                }
                int vida = transformarVidaEmInt();
                int mana = transformarManaEmInt();
                int nivel = transformarNivelEmInt();
                int idade = transformarIdadeEmInt();
                String divindade = campoDivindade.getText();
                if (divindade == null) {
                    divindade = " ";
                }
                String lore = campoLore.getText();
                if (lore == null) {
                    lore = " ";
                }
                String outrosAtributos = campoOutrosAtributos.getText();
                if (outrosAtributos == null) {
                    outrosAtributos = " ";
                }
                int forca = transformarForcaEmInt();
                int inteligencia = transformarInteligenciaEmInt();
                int defesa = transformarDefesaEmInt();
                int constituicao = transformarConstituicaoEmInt();
                int sabedoria = transformarSabedoriaEmInt();
                int destreza = transformarDestrezaEmInt();
                int carisma = transformarCarismaEmInt();
                FichaPersonagem p = new FichaPersonagem(DAO.salaAtual.getPk_sala(), outrosAtributos, lore, raca, classe, nomePersonagem, nomeJogador, divindade, nivel, idade, vida, mana, forca, constituicao, destreza, inteligencia, sabedoria, carisma, defesa);
                dao.salvarEdicaoPersonagem(p);
                this.dispose();
            }
        }

    }//GEN-LAST:event_salvarEdicaoActionPerformed

    private void botaoExcluirPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirPersonagemActionPerformed
        dao.excluirPersonagem();
        this.dispose();
    }//GEN-LAST:event_botaoExcluirPersonagemActionPerformed

    private void botaoEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEquipamentosActionPerformed
        TelaEquipamentos telaEquipamentos = new TelaEquipamentos(null, true);
        telaEquipamentos.setVisible(true);
    }//GEN-LAST:event_botaoEquipamentosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton botaoEquipamentos;
    public javax.swing.JButton botaoExcluirPersonagem;
    public javax.swing.JButton botaoMagias;
    public static javax.swing.JButton botaoSalvarPersonagem;
    public javax.swing.JTextField campoCarisma;
    public javax.swing.JTextField campoClasse;
    public javax.swing.JTextField campoConstituicao;
    public javax.swing.JTextField campoDefesa;
    public javax.swing.JTextField campoDestreza;
    public javax.swing.JTextField campoDivindade;
    public javax.swing.JTextField campoForca;
    public javax.swing.JTextField campoIdade;
    public javax.swing.JTextField campoInteligencia;
    public javax.swing.JTextArea campoLore;
    public javax.swing.JTextField campoMana;
    public javax.swing.JTextField campoNivel;
    public javax.swing.JTextField campoNomeJogador;
    public javax.swing.JTextField campoNomePersonagem;
    public javax.swing.JTextArea campoOutrosAtributos;
    public javax.swing.JTextField campoRaca;
    public javax.swing.JTextField campoSabedoria;
    public javax.swing.JTextField campoVida;
    private javax.swing.JLabel erroSemNome;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JLabel nomeEmUso;
    public javax.swing.JButton salvarEdicao;
    // End of variables declaration//GEN-END:variables
}
