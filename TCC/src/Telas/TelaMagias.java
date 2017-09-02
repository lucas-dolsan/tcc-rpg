package Telas;

import ConexaoBanco.DAO;
import javax.swing.table.DefaultTableModel;

public class TelaMagias extends javax.swing.JDialog {

    DAO dao = new DAO();

    public TelaMagias(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dao.listarMagias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 402));
        setMinimumSize(new java.awt.Dimension(800, 402));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(852, 402));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(852, 402));
        jScrollPane2.setName(""); // NOI18N
        jScrollPane2.setPreferredSize(new java.awt.Dimension(852, 402));

        tabela.setModel(new DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Id","Icone", "Nome", "Efeito","Tipo" ,"Atributos","Descrição"
            }
        ));
        tabela.setCellSelectionEnabled(true);
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabela.setEnabled(false);
        tabela.setRowHeight(52);
        jScrollPane2.setViewportView(tabela);
        tabela.getColumnModel().getColumn(0).setMaxWidth(50);
        tabela.getColumnModel().getColumn(0).setMinWidth(50);
        tabela.getColumnModel().getColumn(1).setMinWidth(52);
        tabela.getColumnModel().getColumn(1).setMinWidth(52);
        tabela.getColumnModel().getColumn(2).setMaxWidth(150);
        tabela.getColumnModel().getColumn(2).setMinWidth(150);
        tabela.getColumnModel().getColumn(3).setMaxWidth(125);
        tabela.getColumnModel().getColumn(3).setMinWidth(125);
        tabela.getColumnModel().getColumn(4).setMaxWidth(125);
        tabela.getColumnModel().getColumn(4).setMinWidth(125);
        tabela.getColumnModel().getColumn(5).setMaxWidth(125);
        tabela.getColumnModel().getColumn(5).setMinWidth(125);
        tabela.getColumnModel().getColumn(6).setMaxWidth(125);
        tabela.getColumnModel().getColumn(6).setMinWidth(125);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
