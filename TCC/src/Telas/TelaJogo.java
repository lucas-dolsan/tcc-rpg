package Telas;

import ConexaoBanco.DAO;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;

public class TelaJogo extends javax.swing.JFrame {

    static DAO dao = new DAO();
    public static PainelDeControle painel = null;
    public static ImageIcon imagemIcone = null;

    public TelaJogo() {
        initComponents();
        botaoFecharSala.setVisible(true);
        botaoFecharSala.setEnabled(false);
        campoEnviarTexto.requestFocus();
        dao.associarJogadorASala();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoFecharSala = new javax.swing.JButton();
        botaoSairDaSala = new javax.swing.JButton();
        campoEnviarTexto = new javax.swing.JTextField();
        botaoEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaDeChat = new javax.swing.JTextArea();
        dadoD4 = new javax.swing.JButton();
        dadoD6 = new javax.swing.JButton();
        dadoD8 = new javax.swing.JButton();
        dadoD10 = new javax.swing.JButton();
        dadoD20 = new javax.swing.JButton();
        dadoD100 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botaoDadoPersonalizado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        caixaFichasTexto = new javax.swing.JComboBox<>();
        botaoVisualizarFicha = new javax.swing.JButton();
        botaoCriarFicha = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        caixaFichaPersonagem = new javax.swing.JComboBox<>();
        botaoVisualizarPersonagem = new javax.swing.JButton();
        botaoCriarPersonagem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        caixaNPC = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        caixaMonstros = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mapaLabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoAnotacao = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        botaoAtualizarMapa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Double Damage - Sala: "+ TelaConfigurarSala.nomeSala
        );
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1320, 680));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        botaoFecharSala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoFecharSala.setText("FECHAR SALA");
        botaoFecharSala.setToolTipText("AVISO: este botão irá excluir a sala!");
        botaoFecharSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharSalaActionPerformed(evt);
            }
        });
        botaoFecharSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoFecharSalaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoFecharSala);
        botaoFecharSala.setBounds(10, 530, 240, 40);

        botaoSairDaSala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoSairDaSala.setText("SAIR DA SALA");
        botaoSairDaSala.setToolTipText("AVISO: ao clicar você volta ao menu principal!");
        botaoSairDaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairDaSalaActionPerformed(evt);
            }
        });
        botaoSairDaSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoSairDaSalaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoSairDaSala);
        botaoSairDaSala.setBounds(10, 580, 240, 40);

        campoEnviarTexto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        campoEnviarTexto.setForeground(new java.awt.Color(51, 51, 51));
        campoEnviarTexto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        campoEnviarTexto.setMaximumSize(new java.awt.Dimension(630, 50));
        campoEnviarTexto.setMinimumSize(new java.awt.Dimension(630, 50));
        campoEnviarTexto.setPreferredSize(new java.awt.Dimension(630, 50));
        campoEnviarTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoEnviarTextoKeyPressed(evt);
            }
        });
        getContentPane().add(campoEnviarTexto);
        campoEnviarTexto.setBounds(270, 580, 580, 40);

        botaoEnviar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoEnviar.setText("ENVIAR");
        botaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEnviarActionPerformed(evt);
            }
        });
        botaoEnviar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoEnviarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoEnviar);
        botaoEnviar.setBounds(860, 580, 110, 40);

        DefaultCaret caret = (DefaultCaret)areaDeChat.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        areaDeChat.setEditable(false);
        areaDeChat.setColumns(20);
        areaDeChat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        areaDeChat.setRows(5);
        areaDeChat.setWrapStyleWord(true);
        areaDeChat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        areaDeChat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        areaDeChat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaDeChatKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(areaDeChat);
        areaDeChat.setLineWrap(true);
        areaDeChat.setWrapStyleWord(true);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(270, 10, 700, 490);

        dadoD4.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD4.setForeground(new java.awt.Color(51, 51, 51));
        dadoD4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d4.png"))); // NOI18N
        dadoD4.setToolTipText("Rodar dado D4!");
        dadoD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD4ActionPerformed(evt);
            }
        });
        dadoD4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD4KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD4);
        dadoD4.setBounds(270, 510, 60, 60);

        dadoD6.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD6.setForeground(new java.awt.Color(51, 51, 51));
        dadoD6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d6.png"))); // NOI18N
        dadoD6.setToolTipText("Rodar dado D6!");
        dadoD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD6ActionPerformed(evt);
            }
        });
        dadoD6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD6KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD6);
        dadoD6.setBounds(340, 510, 60, 60);

        dadoD8.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD8.setForeground(new java.awt.Color(51, 51, 51));
        dadoD8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d8.png"))); // NOI18N
        dadoD8.setToolTipText("Rodar dado D8!");
        dadoD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD8ActionPerformed(evt);
            }
        });
        dadoD8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD8KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD8);
        dadoD8.setBounds(410, 510, 60, 60);

        dadoD10.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD10.setForeground(new java.awt.Color(51, 51, 51));
        dadoD10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d10.png"))); // NOI18N
        dadoD10.setToolTipText("Rodar dado D10!");
        dadoD10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD10ActionPerformed(evt);
            }
        });
        dadoD10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD10KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD10);
        dadoD10.setBounds(480, 510, 60, 60);

        dadoD20.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD20.setForeground(new java.awt.Color(51, 51, 51));
        dadoD20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d20.png"))); // NOI18N
        dadoD20.setToolTipText("Rodar dado D20!");
        dadoD20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD20ActionPerformed(evt);
            }
        });
        dadoD20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD20KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD20);
        dadoD20.setBounds(550, 510, 60, 60);

        dadoD100.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        dadoD100.setForeground(new java.awt.Color(51, 51, 51));
        dadoD100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoDice-d100.png"))); // NOI18N
        dadoD100.setToolTipText("Rodar dado D100!");
        dadoD100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dadoD100ActionPerformed(evt);
            }
        });
        dadoD100.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dadoD100KeyPressed(evt);
            }
        });
        getContentPane().add(dadoD100);
        dadoD100.setBounds(620, 510, 60, 60);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoMic.png"))); // NOI18N
        jButton1.setText("Juntar-se à conversa");
        jButton1.setToolTipText("AVISO: Você só poderá se comunicar com jogadores na sua rede local .");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(760, 520, 210, 40);

        botaoDadoPersonalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/dice-multiple.png"))); // NOI18N
        botaoDadoPersonalizado.setToolTipText("Rodar dado com valor personalizado!");
        botaoDadoPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDadoPersonalizadoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoDadoPersonalizado);
        botaoDadoPersonalizado.setBounds(690, 510, 60, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("FICHAS DE TEXTO:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 240, 20);

        caixaFichasTexto.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        caixaFichasTexto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {""}));
        caixaFichasTexto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caixaFichasTextoFocusGained(evt);
            }
        });
        getContentPane().add(caixaFichasTexto);
        caixaFichasTexto.setBounds(10, 30, 240, 30);

        botaoVisualizarFicha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        botaoVisualizarFicha.setText("VISUALIZAR FICHA");
        botaoVisualizarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarFichaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVisualizarFicha);
        botaoVisualizarFicha.setBounds(10, 100, 240, 30);

        botaoCriarFicha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        botaoCriarFicha.setText("CRIAR FICHA DE TEXTO");
        botaoCriarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarFichaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriarFicha);
        botaoCriarFicha.setBounds(10, 70, 240, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("FICHAS DE PERSONAGEM:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 140, 240, 20);

        caixaFichaPersonagem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        caixaFichaPersonagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        caixaFichaPersonagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caixaFichaPersonagemFocusGained(evt);
            }
        });
        getContentPane().add(caixaFichaPersonagem);
        caixaFichaPersonagem.setBounds(10, 160, 240, 30);

        botaoVisualizarPersonagem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        botaoVisualizarPersonagem.setText("VISUALIZAR PERSONAGEM");
        botaoVisualizarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVisualizarPersonagemActionPerformed(evt);
            }
        });
        getContentPane().add(botaoVisualizarPersonagem);
        botaoVisualizarPersonagem.setBounds(10, 230, 240, 30);

        botaoCriarPersonagem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        botaoCriarPersonagem.setText("CRIAR PERSONAGEM");
        botaoCriarPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarPersonagemActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriarPersonagem);
        botaoCriarPersonagem.setBounds(10, 200, 240, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("NPCs:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 270, 240, 20);

        getContentPane().add(caixaNPC);
        caixaNPC.setBounds(10, 290, 240, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("VISUALIZAR NPC");
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 330, 240, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("MONSTROS:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 370, 240, 20);

        getContentPane().add(caixaMonstros);
        caixaMonstros.setBounds(10, 390, 240, 30);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setText("VISUALIZAR MONSTRO");
        getContentPane().add(jButton3);
        jButton3.setBounds(10, 430, 240, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("MAPA DA AVENTURA:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(990, 10, 320, 20);

        mapaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mapaLabel.setToolTipText("Clique para visualizar a imagem completa");
        mapaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mapaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapaLabelMouseClicked(evt);
            }
        });
        getContentPane().add(mapaLabel);
        mapaLabel.setBounds(990, 30, 320, 230);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton4.setText("MANUAIS DE JOGO");
        getContentPane().add(jButton4);
        jButton4.setBounds(990, 310, 320, 30);

        campoAnotacao.setColumns(20);
        campoAnotacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campoAnotacao.setRows(5);
        jScrollPane1.setViewportView(campoAnotacao);
        campoAnotacao.setLineWrap(true);
        campoAnotacao.setWrapStyleWord(true);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(990, 380, 320, 240);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("ANOTAÇÕES DO MESTRE:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(990, 360, 330, 20);

        botaoAtualizarMapa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botaoAtualizarMapa.setText("ATUALIZAR MAPA");
        botaoAtualizarMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarMapaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAtualizarMapa);
        botaoAtualizarMapa.setBounds(990, 270, 320, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void popupSairSala() {
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair da sala?", "Sair da sala", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.out.println(DAO.player.getNome_jog() + " saiu da sala.");
            painel.setVisible(false);
            this.dispose();
            TelaInicial.Start();
            dao.mensagemSairDaSala();
        }
    }

    private void popupFecharSala() {
        int sair = JOptionPane.showConfirmDialog(null, "Deseja fechar a sala?", "Fechar sala", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.out.println("Sala " + DAO.salaAtual.getNome_sala() + " fechada com sucesso.");
            painel.setVisible(false);
            this.dispose();
            dao.fecharSala(this, TelaConfigurarSala.nomeSala);
            TelaInicial.Start();
        }
    }
    private void botaoFecharSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharSalaActionPerformed
        popupFecharSala();
    }//GEN-LAST:event_botaoFecharSalaActionPerformed

    private void botaoFecharSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoFecharSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            popupFecharSala();
        }
    }//GEN-LAST:event_botaoFecharSalaKeyPressed

    private void botaoSairDaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairDaSalaActionPerformed
        popupSairSala();
    }//GEN-LAST:event_botaoSairDaSalaActionPerformed
    public void enviarTexto() {
        String texto = campoEnviarTexto.getText();
        if (!texto.isEmpty()) {
            dao.enviarChatBanco(texto);
            campoEnviarTexto.setText("");
        }

    }
    private void botaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEnviarActionPerformed
        enviarTexto();
    }//GEN-LAST:event_botaoEnviarActionPerformed

    private void dadoD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD4ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 4);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD4ActionPerformed

    private void dadoD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD6ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 6);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD6ActionPerformed

    private void dadoD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD8ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 8);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD8ActionPerformed

    private void dadoD10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD10ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 10);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD10ActionPerformed

    private void dadoD20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD20ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 20);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD20ActionPerformed

    private void dadoD100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dadoD100ActionPerformed
        TelaRolarDado tela = new TelaRolarDado(this, true, 100);
        tela.setVisible(true);
    }//GEN-LAST:event_dadoD100ActionPerformed

    private void botaoSairDaSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoSairDaSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();
        }
    }//GEN-LAST:event_botaoSairDaSalaKeyPressed

    private void botaoEnviarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEnviarKeyPressed
        enviarTexto();
    }//GEN-LAST:event_botaoEnviarKeyPressed

    private void campoEnviarTextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoEnviarTextoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enviarTexto();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();
        }
    }//GEN-LAST:event_campoEnviarTextoKeyPressed

    private void areaDeChatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaDeChatKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            enviarTexto();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();
        }
    }//GEN-LAST:event_areaDeChatKeyPressed

    private void dadoD4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD4KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();
        }
    }//GEN-LAST:event_dadoD4KeyPressed

    private void dadoD6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD6KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();
        }
    }//GEN-LAST:event_dadoD6KeyPressed

    private void dadoD8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD8KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();
        }
    }//GEN-LAST:event_dadoD8KeyPressed

    private void dadoD10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD10KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();
        }
    }//GEN-LAST:event_dadoD10KeyPressed

    private void dadoD20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD20KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();
        }
    }//GEN-LAST:event_dadoD20KeyPressed

    private void dadoD100KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dadoD100KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();
        }
    }//GEN-LAST:event_dadoD100KeyPressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dao.mensagemSairDaSala();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dao.pegarSalasDoBanco();
        if (!painel.estadoVoip) {
            JFrame telaSom = new TelaConfigurarSom();
            telaSom.setVisible(true);
            jButton1.setEnabled(false);
        } else {
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();
        }
    }//GEN-LAST:event_formKeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JFrame telaSom = new TelaConfigurarSom();
            telaSom.setVisible(true);
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            popupSairSala();;
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void botaoDadoPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDadoPersonalizadoActionPerformed
        TelaRolarCustomizado tela = new TelaRolarCustomizado(this, true);
        tela.setVisible(true);
    }//GEN-LAST:event_botaoDadoPersonalizadoActionPerformed

    private void caixaFichaPersonagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caixaFichaPersonagemFocusGained
        caixaFichaPersonagem.removeAllItems();
        dao.listarPersonagens();
    }//GEN-LAST:event_caixaFichaPersonagemFocusGained

    private void botaoVisualizarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarPersonagemActionPerformed
        dao.pegarDadosPersonagem(caixaFichaPersonagem.getSelectedItem().toString());
    }//GEN-LAST:event_botaoVisualizarPersonagemActionPerformed

    private void botaoCriarPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarPersonagemActionPerformed
        TelaPersonagem telaPersonagem = new TelaPersonagem(this, rootPaneCheckingEnabled);
        telaPersonagem.botaoSalvarPersonagem.setEnabled(true);
        telaPersonagem.zerarValores();
        telaPersonagem.setVisible(true);
    }//GEN-LAST:event_botaoCriarPersonagemActionPerformed

    private void botaoCriarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarFichaActionPerformed
        TelaFichaDeTexto telaFichaTexto = new TelaFichaDeTexto(this, rootPaneCheckingEnabled);
        telaFichaTexto.botaoCriar.setEnabled(true);
        telaFichaTexto.setVisible(true);
    }//GEN-LAST:event_botaoCriarFichaActionPerformed

    private void botaoVisualizarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVisualizarFichaActionPerformed
        dao.pegarDadosFichaTexto(caixaFichasTexto.getSelectedItem().toString());
    }//GEN-LAST:event_botaoVisualizarFichaActionPerformed

    private void caixaFichasTextoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caixaFichasTextoFocusGained
        caixaFichasTexto.removeAllItems();
        dao.listarFichasTexto();
    }//GEN-LAST:event_caixaFichasTextoFocusGained
    private static void atualizarMapa() {
        try {
            BufferedImage imagem = ImageIO.read(dao.downloadMapa().getBinaryStream());
            imagemIcone = new ImageIcon(imagem);
            mapaLabel.setIcon(imagemIcone);
        } catch (SQLException | IOException ex) {
            ex.printStackTrace();
        }
    }
    private void botaoAtualizarMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarMapaActionPerformed
        new Thread() {
            public void run() {
                atualizarMapa();
            }
        }.start();
    }//GEN-LAST:event_botaoAtualizarMapaActionPerformed

    private void mapaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mapaLabelMouseClicked
        JDialog dialog = new JDialog();
        dialog.setUndecorated(true);
        JLabel label = new JLabel(imagemIcone);
        dialog.setLocationRelativeTo(this);
        dialog.setUndecorated(false);
        dialog.add(label);
        dialog.pack();
        dialog.setVisible(true);
    }//GEN-LAST:event_mapaLabelMouseClicked

    public static void Start(boolean dono) {
        if (dono) {
            DAO.donoDaSala = true;
        }
        painel = new PainelDeControle();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
                if (DAO.player.getPk_jogador() == DAO.salaAtual.getFk_jogador()) {
                    dao.alterarIP(DAO.salaAtual.getNome_sala());
                    botaoFecharSala.setEnabled(true);
                    painel.setVisible(true);
                } else {
                    painel.dispose();
                }

                new Thread() {
                    public void run() {
                        atualizarMapa();
                    }

                }.start();

                new Thread() {
                    @Override
                    public void run() {
                        if (dao.isVOIPAtivado(DAO.salaAtual.getNome_sala())) {
                            System.out.println("voIP está ativado");
                        } else {
                            System.out.println("voIP está desativado");
                        }
                        while (true) {
                            painel.port = dao.pegarPorta(TelaConfigurarSala.nomeSala);
                            if (!(DAO.player.getPk_jogador() == DAO.salaAtual.getFk_jogador())) {
                                if (dao.isVOIPAtivado(DAO.salaAtual.getNome_sala())) {
                                    jButton1.setEnabled(true);
                                } else {
                                    jButton1.setEnabled(false);
                                }
                            }
                            if (dao.verificarChatDaily(DAO.salaAtual.getNome_sala())) {
                                painel.checkboxChat.setSelected(true);
                            } else {
                                painel.checkboxChat.setSelected(false);
                            }
                            dao.lerChat();
                            try {
                                Thread.sleep(5);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(TelaJogo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }.start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea areaDeChat;
    private javax.swing.JButton botaoAtualizarMapa;
    private javax.swing.JButton botaoCriarFicha;
    private javax.swing.JButton botaoCriarPersonagem;
    private javax.swing.JButton botaoDadoPersonalizado;
    private javax.swing.JButton botaoEnviar;
    public static javax.swing.JButton botaoFecharSala;
    private javax.swing.JButton botaoSairDaSala;
    private javax.swing.JButton botaoVisualizarFicha;
    private javax.swing.JButton botaoVisualizarPersonagem;
    public static javax.swing.JComboBox<String> caixaFichaPersonagem;
    public static javax.swing.JComboBox<String> caixaFichasTexto;
    private javax.swing.JComboBox<String> caixaMonstros;
    private javax.swing.JComboBox<String> caixaNPC;
    private javax.swing.JTextArea campoAnotacao;
    private javax.swing.JTextField campoEnviarTexto;
    private javax.swing.JButton dadoD10;
    private javax.swing.JButton dadoD100;
    private javax.swing.JButton dadoD20;
    private javax.swing.JButton dadoD4;
    private javax.swing.JButton dadoD6;
    private javax.swing.JButton dadoD8;
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JLabel mapaLabel;
    // End of variables declaration//GEN-END:variables
}
