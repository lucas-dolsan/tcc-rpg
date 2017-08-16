package Telas;

import ConexaoBanco.DAO;
import com.sun.glass.events.KeyEvent;
import java.awt.Cursor;

public class TelaConfigurarSala extends javax.swing.JDialog {

    DAO dao = new DAO();
    private final TelaInicial tela;

    public TelaConfigurarSala(java.awt.Frame parent, boolean modal, TelaInicial telaInicial) {
        super(parent, modal);
        initComponents();
        erroSalaSemNome.setVisible(false);
        erroSalaExistente.setVisible(false);
        tela = telaInicial;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        campoNomeSala = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        erroSalaExistente = new javax.swing.JLabel();
        campoSenhaSala = new javax.swing.JPasswordField();
        botaoCriar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        erroSalaSemNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Double Damage - Configurar sala");
        setBounds(new java.awt.Rectangle(400, 355, 355, 355));
        setMaximumSize(new java.awt.Dimension(400, 355));
        setMinimumSize(new java.awt.Dimension(400, 355));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setText("NOME DA SALA:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 20, 340, 30);

        campoNomeSala.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        campoNomeSala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNomeSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoNomeSalaKeyPressed(evt);
            }
        });
        getContentPane().add(campoNomeSala);
        campoNomeSala.setBounds(30, 50, 340, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("SENHA DA SALA (OPCIONAL): ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 340, 30);

        erroSalaExistente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        erroSalaExistente.setForeground(new java.awt.Color(204, 0, 0));
        erroSalaExistente.setText("Sala com esse nome já existente!");
        getContentPane().add(erroSalaExistente);
        erroSalaExistente.setBounds(30, 190, 340, 20);

        campoSenhaSala.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        campoSenhaSala.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSenhaSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoSenhaSalaKeyPressed(evt);
            }
        });
        getContentPane().add(campoSenhaSala);
        campoSenhaSala.setBounds(30, 150, 340, 40);

        botaoCriar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoCriar.setText("CRIAR");
        botaoCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarActionPerformed(evt);
            }
        });
        botaoCriar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoCriarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoCriar);
        botaoCriar.setBounds(30, 260, 140, 40);

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        botaoCancelar.setText("CANCELAR");
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

        erroSalaSemNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        erroSalaSemNome.setForeground(new java.awt.Color(204, 0, 0));
        erroSalaSemNome.setText("Aviso: sala sem nome!");
        getContentPane().add(erroSalaSemNome);
        erroSalaSemNome.setBounds(30, 90, 160, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static String nomeSala = "";

    private void criarSala() {
        try {

            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

            nomeSala = campoNomeSala.getText();
            if (dao.salaExiste(nomeSala)) {
                System.out.println("Erro: Esta sala já existe.");
                erroSalaExistente.setVisible(true);
            } else if (nomeSala.isEmpty()) {
                System.out.println("Erro: Nome da sala deve ser informado.");
                erroSalaSemNome.setVisible(true);
            } else {
                char[] senha = campoSenhaSala.getPassword();
                String senhaAuxiliar = String.valueOf(senha);
                System.out.println("Criando sala...");
                dao.criarSala(this, nomeSala, senhaAuxiliar);
                System.out.println("Sala: " + nomeSala + " criada com sucesso.");
                if (dao.entrarEmSala(nomeSala, senhaAuxiliar)) {
                    TelaJogo.Start(DAO.salaAtual.getFk_jogador() == DAO.player.getPk_jogador());
                    tela.dispose();
                    this.dispose();
                }
            }
        } finally {

            setCursor(Cursor.getDefaultCursor());

        }
    }
    private void botaoCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarActionPerformed
        criarSala();
    }//GEN-LAST:event_botaoCriarActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoCancelarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_botaoCancelarKeyPressed

    private void campoNomeSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNomeSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            criarSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_campoNomeSalaKeyPressed

    private void campoSenhaSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSenhaSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            criarSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_campoSenhaSalaKeyPressed

    private void botaoCriarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoCriarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            criarSala();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_botaoCriarKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JButton botaoCriar;
    private javax.swing.JTextField campoNomeSala;
    private javax.swing.JPasswordField campoSenhaSala;
    private javax.swing.JLabel erroSalaExistente;
    public static javax.swing.JLabel erroSalaSemNome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
