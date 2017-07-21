package Telas;

import ConexaoBanco.JogadorDAO;
import java.awt.event.KeyEvent;
import java.util.Random;

public class TelaRolarCustomizado extends javax.swing.JDialog {

    public int dado;

    public TelaRolarCustomizado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoRolar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoRolarMenos = new javax.swing.JTextField();
        campoRolarMais = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoValorCustumizado = new javax.swing.JTextField();

        setTitle("Double Damage - Rolar dado");
        setMinimumSize(new java.awt.Dimension(300, 200));
        setResizable(false);
        getContentPane().setLayout(null);

        botaoRolar.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        botaoRolar.setForeground(new java.awt.Color(51, 51, 51));
        botaoRolar.setText("Rolar!");
        botaoRolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRolarActionPerformed(evt);
            }
        });
        botaoRolar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoRolarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoRolar);
        botaoRolar.setBounds(180, 110, 100, 30);

        jLabel2.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Modificadores:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 10, 130, 20);

        jLabel3.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("+");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 30, 20, 30);

        jLabel4.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 60, 20, 30);

        campoRolarMenos.setText("0");
        campoRolarMenos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoRolarMenosKeyPressed(evt);
            }
        });
        getContentPane().add(campoRolarMenos);
        campoRolarMenos.setBounds(50, 60, 120, 30);

        campoRolarMais.setText("0");
        campoRolarMais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoRolarMaisKeyPressed(evt);
            }
        });
        getContentPane().add(campoRolarMais);
        campoRolarMais.setBounds(50, 30, 120, 30);

        jLabel5.setFont(new java.awt.Font("The Bold Font", 1, 14)); // NOI18N
        jLabel5.setText("VALOR DADO:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 90, 120, 20);

        campoValorCustumizado.setText("0");
        getContentPane().add(campoValorCustumizado);
        campoValorCustumizado.setBounds(50, 110, 120, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public int rodar() {
        Random random = new Random();
        int numero = 0;
        do {
            numero = random.nextInt(dado + 1);
        } while (numero == 0);
        return numero;
    }

    public int converterCampoModificadorMaisEmInt() {
        String valorModificadorMais = campoRolarMais.getText();
        return Integer.parseInt(valorModificadorMais);
    }

    public int converterCampoModificadorMenosEmInt() {
        String valorModificadorMenos = campoRolarMenos.getText();
        return Integer.parseInt(valorModificadorMenos);
    }

    public int converterCampoValorPersonalizar() {
        String valorModificadorMais = campoValorCustumizado.getText();
        return Integer.parseInt(valorModificadorMais);
    }

    public void rolarDado() {
        dado = converterCampoValorPersonalizar();
        if(dado == 0){
            
        }else{
            int modificadorMais = converterCampoModificadorMaisEmInt();
        int modificadorMenos = converterCampoModificadorMenosEmInt();
        if (modificadorMais > 0) {
            int numero = rodar();
            int numeroModificado = numero + modificadorMais;
            JogadorDAO.enviarDadoBanco(dado, numeroModificado, numero, modificadorMais, modificadorMenos, 1);
            this.dispose();
        } else if (modificadorMenos > 0) {
            int numero = rodar();
            int numeroModificado = numero - modificadorMenos;
            JogadorDAO.enviarDadoBanco(dado, numeroModificado, numero, modificadorMais, modificadorMenos, 2);
            this.dispose();
        } else {
            int numero = rodar();
            int numeroModificado = 0;
            JogadorDAO.enviarDadoBanco(dado, numeroModificado, numero, modificadorMais, modificadorMenos, 3);
            this.dispose();
        }
        }
        
    }
    private void botaoRolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRolarActionPerformed
        rolarDado();
    }//GEN-LAST:event_botaoRolarActionPerformed

    private void botaoRolarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoRolarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rolarDado();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_botaoRolarKeyPressed

    private void campoRolarMaisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoRolarMaisKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rolarDado();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_campoRolarMaisKeyPressed

    private void campoRolarMenosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoRolarMenosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            rolarDado();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_campoRolarMenosKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRolar;
    private javax.swing.JTextField campoRolarMais;
    private javax.swing.JTextField campoRolarMenos;
    private javax.swing.JTextField campoValorCustumizado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
