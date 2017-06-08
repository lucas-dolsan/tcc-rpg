package Telas;

import javax.swing.table.DefaultTableModel;

public class TelaComSalas extends javax.swing.JDialog {

    public static DefaultTableModel model = new DefaultTableModel();

    public TelaComSalas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSalas =  new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(420, 600));
        setMinimumSize(new java.awt.Dimension(420, 600));
        setPreferredSize(new java.awt.Dimension(420, 600));
        getContentPane().setLayout(null);

        model.addColumn("Senha");
        model.addColumn("Nome da Sala");
        model.addColumn("Jogadores");
        tabelaSalas.setModel(model);
        jScrollPane1.setViewportView(tabelaSalas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 380, 402);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/telaLogin.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(420, 600));
        jLabel1.setMinimumSize(new java.awt.Dimension(420, 600));
        jLabel1.setPreferredSize(new java.awt.Dimension(420, 600));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 420, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabelaSalas;
    // End of variables declaration//GEN-END:variables
}
