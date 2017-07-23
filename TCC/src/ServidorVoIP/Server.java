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

    public ArrayList<Message> broadCastQueue = new ArrayList<Message>();
    public ArrayList<ClientConnection> clients = new ArrayList<ClientConnection>();
    public ArrayList<ClientConnection> toRemove = new ArrayList<ClientConnection>(); //list of dead connections

    private int port = 0;

    public void addToBroadcastQueue(Message m) { //add a message to the broadcast queue. this method is used by all ClientConnection instances
        try {
            broadCastQueue.add(m);
        } catch (Throwable t) {
            //mutex error, try again
            Utils.sleep(1);
            addToBroadcastQueue(m);
        }
    }
    public ServerSocket s;

    public Server(int port) throws Exception {

        this.port = port;

        try {

            s = new ServerSocket();
            s.setReuseAddress(true);
            s.bind(new InetSocketAddress(port));
            s.setSoTimeout(10);
            System.out.println("Port " + port + ": server started");
        } catch (IOException ex) {
            System.out.println("Server error " + ex + "(port " + port + ")");
            throw new Exception("Error " + ex);
        }
        new BroadcastThread().start(); //create a BroadcastThread and start it
        for (;;) { //accept all incoming connection
            try {
                Socket c = s.accept();
                ClientConnection cc = new ClientConnection(this, c); //create a ClientConnection thread
                cc.start();
                addToClients(cc);
                System.out.println("new client " + c.getInetAddress() + ":" + c.getPort() + " on port " + port);
            } catch (IOException ex) {
            }
        }
    }

    private void addToClients(ClientConnection cc) {
        try {
            clients.add(cc); //add the new connection to the list of connections
        } catch (Throwable t) {
            //mutex error, try again
            Utils.sleep(1);
            addToClients(cc);
        }
    }

    /**
     * broadcasts messages to each ClientConnection, and removes dead ones
     */
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
                    for (ClientConnection cc : clients) {
                        if (!cc.isAlive()) { //connection is dead, need to be removed
                            System.out.println("dead connection closed: " + cc.getInetAddress() + ":" + cc.getPort() + " on port " + port);
                            toRemove.add(cc);
                        }
                    }
                    clients.removeAll(toRemove); //delete all dead connections
                    if (broadCastQueue.isEmpty()) { //nothing to send
                        Utils.sleep(10); //avoid busy wait
                        continue;
                    } else { //we got something to broadcast
                        Message m = broadCastQueue.get(0);
                        for (ClientConnection cc : clients) { //broadcast the message
                            if (cc.getChId() != m.getChId()) {
                                cc.addToQueue(m);
                            }
                        }
                        broadCastQueue.remove(m); //remove it from the broadcast queue
                    }
                } catch (Throwable t) {
                    //mutex error, try again
                }

            } while (TelaJogo.painel.estadoVoip);
        }
    }

}
