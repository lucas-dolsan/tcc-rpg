package Telas;

public class TelaCriarObjetos extends javax.swing.JDialog {

    public TelaCriarObjetos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoCriarArma = new javax.swing.JButton();
        botaoCriarArmadura = new javax.swing.JButton();
        botaoCriarMagia = new javax.swing.JButton();
        botaoCriarMisc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Double Damage - Criar Objetos");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(445, 230));
        setMinimumSize(new java.awt.Dimension(445, 230));
        setPreferredSize(new java.awt.Dimension(445, 230));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        botaoCriarArma.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCriarArma.setText("Armas");
        botaoCriarArma.setPreferredSize(new java.awt.Dimension(180, 70));
        botaoCriarArma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarArmaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriarArma);
        botaoCriarArma.setBounds(12, 12, 190, 70);

        botaoCriarArmadura.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCriarArmadura.setText("Armadura");
        botaoCriarArmadura.setPreferredSize(new java.awt.Dimension(180, 70));
        botaoCriarArmadura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarArmaduraActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriarArmadura);
        botaoCriarArmadura.setBounds(233, 12, 190, 70);

        botaoCriarMagia.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCriarMagia.setText("Magias");
        botaoCriarMagia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarMagiaActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriarMagia);
        botaoCriarMagia.setBounds(12, 119, 190, 70);

        botaoCriarMisc.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botaoCriarMisc.setText("Miscelânea");
        botaoCriarMisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarMiscActionPerformed(evt);
            }
        });
        getContentPane().add(botaoCriarMisc);
        botaoCriarMisc.setBounds(233, 119, 190, 70);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        PainelDeControle.botaoCriarObjetos.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void botaoCriarArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarArmaActionPerformed
        TelaCriarArma telaCriarArma = new TelaCriarArma(null, true);
        telaCriarArma.setVisible(true);
    }//GEN-LAST:event_botaoCriarArmaActionPerformed

    private void botaoCriarMagiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarMagiaActionPerformed
        TelaCriarMagia telaCriarMagia = new TelaCriarMagia(null, true);
        telaCriarMagia.setVisible(true);
    }//GEN-LAST:event_botaoCriarMagiaActionPerformed

    private void botaoCriarArmaduraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarArmaduraActionPerformed
        TelaCriarArmadura telaCriarArmadura = new TelaCriarArmadura(null, true);
        telaCriarArmadura.setVisible(true);
    }//GEN-LAST:event_botaoCriarArmaduraActionPerformed

    private void botaoCriarMiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarMiscActionPerformed
        TelaCriarItem telaCriarItem = new TelaCriarItem(null, true);
        telaCriarItem.setVisible(true);
    }//GEN-LAST:event_botaoCriarMiscActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriarArma;
    private javax.swing.JButton botaoCriarArmadura;
    private javax.swing.JButton botaoCriarMagia;
    private javax.swing.JButton botaoCriarMisc;
    // End of variables declaration//GEN-END:variables
}
