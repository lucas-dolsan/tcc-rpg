package Telas;

import ConexaoBanco.DAO;
import javax.swing.table.DefaultTableModel;

public class TelaEquipamentos extends javax.swing.JDialog {

    DAO dao = new DAO();

    public TelaEquipamentos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dao.listarArmas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 450));
        setMinimumSize(new java.awt.Dimension(620, 450));

        tabela.setModel(new DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Icone", "Nome", "Dano/Defesa", "Atributos","Descrição"
            }
        ));
        tabela.setCellSelectionEnabled(true);
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabela.setRowHeight(52);
        jScrollPane2.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}