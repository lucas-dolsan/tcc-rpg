package ServidorVoIP;

import Dependencias.Message;
import Dependencias.Utils;
import Telas.TelaJogo;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {

    public ArrayList<Message> filaDeTransmissao = new ArrayList<Message>();
    public ArrayList<ClientConnection> clientes = new ArrayList<ClientConnection>();
    public ArrayList<ClientConnection> conexoesMortas = new ArrayList<ClientConnection>();

    private int port = 0;

    public void addTofilaDeTransmissao(Message m) {
        try {
            filaDeTransmissao.add(m);
        } catch (Throwable t) {
            Utils.sleep(1);
            addTofilaDeTransmissao(m);
        }
    }
    public ServerSocket s;

    public Server(int port) throws Exception {

        this.port = port;

        try {
            System.out.println("Iniciando servidor de voIP...");
            s = new ServerSocket();
            s.setReuseAddress(true);
            s.bind(new InetSocketAddress(port));
            System.out.println("Servidor inciado com sucesso. Porta: " + port);
        } catch (IOException ex) {
            System.out.println("Erro no servidor" + ex + "(porta " + port + ")");
            throw new Exception("ERRO: " + ex);
        }
        new BroadcastThread().start();
        for (;;) {
            try {
                Socket c = s.accept();
                ClientConnection cc = new ClientConnection(this, c);
                cc.start();
                addToClientes(cc);
                System.out.println("Novo cliente " + c.getInetAddress() + ":" + c.getPort() + " conectado na porta: " + port);
            } catch (IOException ex) {
            }
        }
    }

    private void addToClientes(ClientConnection cc) {
        try {
            clientes.add(cc);
        } catch (Throwable t) {

            Utils.sleep(1);
            addToClientes(cc);
        }
    }

    private class BroadcastThread extends Thread {

        public BroadcastThread() {
        }

        @Override
        public void run() {

            do {
                if (s != null && TelaJogo.painel.estadoVoip == false) {

                    try {
                        s.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    for (ClientConnection cc : clientes) {
                        if (!cc.isAlive()) {
                            System.out.println("conexão morta fechada: " + cc.getInetAddress() + ":" + cc.getPort() + " on port " + port);
                            conexoesMortas.add(cc);
                        }
                    }
                    clientes.removeAll(conexoesMortas);
                    if (filaDeTransmissao.isEmpty()) {
                        Utils.sleep(10);
                        continue;
                    } else {
                        Message m = filaDeTransmissao.get(0);
                        for (ClientConnection cc : clientes) {
                            if (cc.getChId() != m.getChId()) {
                                cc.addToQueue(m);
                            }
                        }
                        filaDeTransmissao.remove(m);
                    }
                } catch (Throwable t) {
                }

            } while (TelaJogo.painel.estadoVoip);
            try {
                s.close();
                filaDeTransmissao.clear();
                clientes.clear();
                conexoesMortas.clear();
                sleep(15);
                System.out.println("Servidor parado com sucesso.");
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
