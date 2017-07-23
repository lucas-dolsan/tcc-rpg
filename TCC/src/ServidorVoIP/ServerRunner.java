package ServidorVoIP;

import Telas.PainelDeControle;
import Telas.TelaJogo;
import java.io.IOException;
import java.net.BindException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerRunner extends javax.swing.JFrame {

    public static Server server = null;

    public ServerRunner(int port) {
        initComponents();
        runServer(port);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static void runServer(int port) {
        new Thread() {
            @Override
            public void run() {
                while (TelaJogo.painel.estadoVoip) {
                    if (server == null) {
                        try {
                            server = new Server(port);
                        } catch (Throwable ex) {
                            Logger.getLogger(PainelDeControle.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        try {
                            server.filaDeTransmissao.clear();
                            server.clientes.clear();
                            server.conexoesMortas.clear();
                            server.s.close();
                            server = null;
                        } catch (IOException ex) {
                            Logger.getLogger(ServerRunner.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }
        }.start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
