package Telas;

import java.io.IOException;
import java.net.URISyntaxException;

public class TelaManuais extends javax.swing.JDialog {

    public TelaManuais(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(655, 780));
        setMinimumSize(new java.awt.Dimension(655, 780));
        setPreferredSize(new java.awt.Dimension(655, 780));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("VISUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 30, 200, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("D&D 3,5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 10, 210, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("VISUALIZAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 270, 200, 23);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("VISUALIZAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(220, 30, 200, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeManuais/3.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(430, 53, 200, 200);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeManuais/6.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(430, 293, 200, 200);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeManuais/2.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(220, 53, 200, 200);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("D&D 4");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 253, 200, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeManuais/1.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 53, 200, 200);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeManuais/9.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(430, 533, 200, 200);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeManuais/5.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(220, 293, 200, 200);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("VISUALIZAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(10, 30, 200, 23);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("VISUALIZAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(430, 510, 200, 23);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("VISUALIZAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(220, 270, 200, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("D&D 5");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 493, 200, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeManuais/4.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 293, 200, 200);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeManuais/7.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 533, 200, 200);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconeManuais/8.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(220, 533, 200, 200);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("VISUALIZAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(10, 270, 200, 23);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("VISUALIZAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(10, 510, 200, 23);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton9.setText("VISUALIZAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(220, 510, 200, 23);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://drive.google.com/open?id=0BwZ3W078iF8CTXR1OE8wel83dUE"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://drive.google.com/open?id=0BwZ3W078iF8CM1drQWt3LVE4UHc"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://drive.google.com/open?id=0BwZ3W078iF8CeVlGNHVXUFo4Q2s"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://drive.google.com/open?id=0BwZ3W078iF8CYmhmMHhFZG9vaWM"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://drive.google.com/open?id=0BwZ3W078iF8CRGxaSm94OTBBUUU"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://drive.google.com/open?id=0BwZ3W078iF8CclY0bnAtRnZpSkE"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://drive.google.com/open?id=0BwZ3W078iF8CSjE4ckZyRWM1WGs"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://drive.google.com/open?id=0BwZ3W078iF8CWHRCa3ExQ0ExUWc"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://drive.google.com/open?id=0BwZ3W078iF8CX2drblNLN0dFUkE"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
