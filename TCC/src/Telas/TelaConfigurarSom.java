package Telas;

import ClienteVoIP.Client;
import ClienteVoIP.MicThread;
import ConexaoBanco.DAO;
import Dependencias.SoundPacket;
import Dependencias.Utils;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;

public class TelaConfigurarSom extends javax.swing.JFrame {

    DAO dao = new DAO();
    private MicTester micTester;

    private class MicTester extends Thread {

        private TargetDataLine mic = null;

        public MicTester() {

        }

        @Override
        public void run() {

            try {
                AudioFormat af = SoundPacket.defaultFormat;
                DataLine.Info info = new DataLine.Info(TargetDataLine.class, null);
                mic = (TargetDataLine) (AudioSystem.getLine(info));
                mic.open(af);
                mic.start();
            } catch (Exception e) {
                System.out.println("Microfone não detectado.");
                JOptionPane.showMessageDialog(rootPane, "Microfone não detectado.", "AVISO: ", JOptionPane.INFORMATION_MESSAGE);
            }
            for (;;) {
                Utils.sleep(10);
                if (mic.available() > 0) {
                    byte[] buff = new byte[SoundPacket.defaultDataLenght];
                    mic.read(buff, 0, buff.length);
                    long tot = 0;
                    for (int i = 0; i < buff.length; i++) {
                        tot += MicThread.amplification * Math.abs(buff[i]);
                    }
                    tot *= 2.5;
                    tot /= buff.length;
                    micLev.setValue((int) tot);
                }
            }
        }

        private void close() {
            if (mic != null) {
                mic.close();
            }
            stop();
        }
    }

    public TelaConfigurarSom() {
        initComponents();
        this.setLocationRelativeTo(null);
        micTester = new MicTester();
        micTester.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        micLev = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        micVol = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        start.setText("Pronto");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        jLabel3.setText("Volume do microfone");

        micLev.setToolTipText("DICA: Se o volume não aparecer, provavelmente a sensibilidade do microfone está muito baixa, ou não existe nenhum microfone conectado.");

        jLabel4.setText("Sensibilidade do microfone");

        micVol.setMaximum(300);
        micVol.setMinimum(50);
        micVol.setValue(100);
        micVol.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                micVolStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(micLev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(micVol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(micLev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(micVol, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(start)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        try {
            System.out.println(TelaJogo.painel.port);
            new Client(dao.pegarIPDono(DAO.salaAtual.getNome_sala()), TelaJogo.painel.port).start();
        } catch (Exception ex) {
            System.out.println("ERRO:" + ex);
            JOptionPane.showMessageDialog(rootPane, ex, "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        this.setVisible(false);
    }//GEN-LAST:event_startActionPerformed

    private void micVolStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_micVolStateChanged
        MicThread.amplification = ((double) (micVol.getValue())) / 100.0;
    }//GEN-LAST:event_micVolStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new TelaConfigurarSom().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JProgressBar micLev;
    private javax.swing.JSlider micVol;
    private javax.swing.JButton start;
    // End of variables declaration//GEN-END:variables
}
