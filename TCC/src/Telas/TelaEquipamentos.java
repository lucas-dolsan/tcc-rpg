package Telas;

import ConexaoBanco.DAO;
import javax.swing.table.DefaultTableModel;

public class TelaEquipamentos extends javax.swing.JDialog {

    DAO dao = new DAO();

    public TelaEquipamentos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        dao.listarArmas();
        dao.listarArmaduras();
        dao.listarItens();
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

        jScrollPane2.setMaximumSize(new java.awt.Dimension(702, 402));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(702, 402));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(702, 402));

        tabela.setModel(new DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Id","Quant.","Icone", "Nome", "Dano/Defesa", "Atributos","Descrição"
            }
        ));
        tabela.setCellSelectionEnabled(true);
        tabela.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabela.setEnabled(false);
        tabela.setRowHeight(52);
        jScrollPane2.setViewportView(tabela);
        tabela.getColumnModel().getColumn(0).setMaxWidth(50);
        tabela.getColumnModel().getColumn(0).setMinWidth(50);
        tabela.getColumnModel().getColumn(1).setMinWidth(50);
        tabela.getColumnModel().getColumn(1).setMinWidth(50);
        tabela.getColumnModel().getColumn(2).setMaxWidth(52);
        tabela.getColumnModel().getColumn(2).setMinWidth(52);
        tabela.getColumnModel().getColumn(3).setMaxWidth(150);
        tabela.getColumnModel().getColumn(3).setMinWidth(150);
        tabela.getColumnModel().getColumn(4).setMaxWidth(100);
        tabela.getColumnModel().getColumn(4).setMinWidth(100);
        tabela.getColumnModel().getColumn(5).setMaxWidth(150);
        tabela.getColumnModel().getColumn(5).setMinWidth(150);
        tabela.getColumnModel().getColumn(6).setMaxWidth(150);
        tabela.getColumnModel().getColumn(6).setMinWidth(150);
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
                        TelaEquipamentos.this.dispose();
                    }
                    if(url.contains("armadura")){
                        String aux = tabela.getValueAt(row, 0).toString();
                        int id = Integer.parseInt(aux);
                        TelaVisualizarObjeto telaVisualizarObjeto = new TelaVisualizarObjeto(null, true,tabela.getValueAt(row, 3).toString(),tabela.getValueAt(row,2).toString(),2,id);
                        telaVisualizarObjeto.setVisible(true);
                        TelaEquipamentos.this.dispose();
                    }
                    if(url.contains("item")){
                        String aux = tabela.getValueAt(row, 0).toString();
                        int id = Integer.parseInt(aux);
                        TelaVisualizarObjeto telaVisualizarObjeto = new TelaVisualizarObjeto(null, true,tabela.getValueAt(row, 3).toString(),tabela.getValueAt(row,2).toString(),3,id);
                        telaVisualizarObjeto.setVisible(true);
                        TelaEquipamentos.this.dispose();
                    }

                }
            }
        });

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
