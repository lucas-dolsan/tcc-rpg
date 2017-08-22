package Telas;

import ConexaoBanco.DAO;
import com.sun.glass.events.KeyEvent;
import java.awt.Cursor;

public class TelaEntrarEmSala extends javax.swing.JDialog {

    DAO dao = new DAO();
    private final TelaInicial tela;

    public TelaEntrarEmSala(java.awt.Frame parent, boolean modal, TelaInicial telaInicial) {
        super(parent, modal);
        initComponents();
        new Thread() {
            public void run() {
                try {
                    caixaDeSalas.setEnabled(false);
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    caixaDeSalas.removeAllItems();
                    dao.listarSalas();
                } finally {
                    caixaDeSalas.setEnabled(true);
                    setCursor(Cursor.getDefaultCursor());
                }
            }
        }.start();

        erroEntrarEmSala.setVisible(false);
        tela = telaInicial;
    }

    TelaEntrarEmSala(TelaInicial aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caixaDeSalas = new javax.swing.JComboBox<>();
        campoSenhaSala = new javax.swing.JTextField();
        botaoEntrarEmSala = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        erroEntrarEmSala = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Double Damage - Entrar em Sala");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(400, 355));
        setMinimumSize(new java.awt.Dimension(400, 355));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        caixaDeSalas.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        caixaDeSalas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        caixaDeSalas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caixaDeSalasFocusGained(evt);
            }
        });
        caixaDeSalas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caixaDeSalasKeyPressed(evt);
            }
        });
        getContentPane().add(caixaDeSalas);
        caixaDeSalas.setBounds(30, 80, 340, 40);

        campoSenhaSala.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        campoSenhaSala.setForeground(new java.awt.Color(51, 51, 51));
        campoSenhaSala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSenhaSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaSalaKeyPressed(evt);
            }
        });
        getContentPane().add(campoSenhaSala);
        campoSenhaSala.setBounds(30, 180, 340, 40);

        botaoEntrarEmSala.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoEntrarEmSala.setForeground(new java.awt.Color(51, 51, 51));
        botaoEntrarEmSala.setText("Entrar");
        botaoEntrarEmSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarEmSalaActionPerformed(evt);
            }
        });
        botaoEntrarEmSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoEntrarEmSalaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoEntrarEmSala);
        botaoEntrarEmSala.setBounds(30, 260, 140, 40);

        botaoCancelar.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(51, 51, 51));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });
        botaoCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoCancelarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoCancelar);
        botaoCancelar.setBounds(230, 260, 140, 40);

        erroEntrarEmSala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        erroEntrarEmSala.setForeground(new java.awt.Color(204, 0, 0));
        erroEntrarEmSala.setText("Erro: senha da sala incorreta!");
        getContentPane().add(erroEntrarEmSala);
        erroEntrarEmSala.setBounds(30, 230, 270, 17);

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nome da Sala:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 50, 340, 30);

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 150, 340, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void entrarEmSala() {
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            String nomeSala = (caixaDeSalas.getSelectedItem().toString());
            String senhaSala = campoSenhaSala.getText();
            if (dao.entrarEmSala(nomeSala, senhaSala)) {
                TelaJogo.Start(dao.verificarDono());
                tela.dispose();
                this.dispose();
                System.out.println("[" + nomeSala + "]");
                dao.mensagemEntrarNaSala();
                System.out.println(DAO.nickName + " entrou na sala");
            } else {
                System.out.println("Erro ao entrar na sala " + nomeSala);
                erroEntrarEmSala.setVisible(true);
            }
        } finally {
            setCursor(Cursor.getDefaultCursor());

        }

    }
    private void botaoEntrarEmSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarEmSalaActionPerformed
        entrarEmSala();
    }//GEN-LAST:event_botaoEntrarEmSalaActionPerformed

    private void campoSenhaSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarEmSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_campoSenhaSalaKeyPressed

    private void caixaDeSalasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caixaDeSalasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarEmSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_caixaDeSalasKeyPressed

    private void botaoEntrarEmSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEntrarEmSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarEmSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_botaoEntrarEmSalaKeyPressed

    private void botaoCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_botaoCancelarKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrarEmSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_formKeyPressed

    private void caixaDeSalasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caixaDeSalasFocusGained

    }//GEN-LAST:event_caixaDeSalasFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoEntrarEmSala;
    public static javax.swing.JComboBox<String> caixaDeSalas;
    private javax.swing.JTextField campoSenhaSala;
    private javax.swing.JLabel erroEntrarEmSala;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
