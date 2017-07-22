package ServidorVoIP;

import Dependencias.Message;
import Dependencias.Utils;
import static Telas.PainelDeControle.estadoVoip;
import Telas.TelaInicial;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import org.teleal.cling.UpnpService;
import org.teleal.cling.UpnpServiceImpl;
import org.teleal.cling.support.igd.PortMappingListener;
import org.teleal.cling.support.model.PortMapping;

public class Server {

    private ArrayList<Message> broadCastQueue = new ArrayList<Message>();
    private ArrayList<ClientConnection> clients = new ArrayList<ClientConnection>();
    private int port;
    public static String ipAddress = null;
    private UpnpService u; //when upnp is enabled, this points to the upnp service

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

    public Server(int port, boolean upnp) throws Exception, Throwable {
        this.port = port;
        if (upnp) {
            Log.add("Setting up NAT Port Forwarding...");
            //first we need the address of this machine on the local network

            ipAddress = TelaInicial.ipAddress;
            u = new UpnpServiceImpl(new PortMappingListener(new PortMapping(port, ipAddress, PortMapping.Protocol.TCP)));
            u.getControlPoint().search();
        }
        try {
            s = new ServerSocket(port); //listen on specified port
            Log.add("Port " + port + ": server started");
            if (!estadoVoip) {
                s.close();
            }
        } catch (IOException ex) {
            Log.add("Server error " + ex + "(port " + port + ")");
            throw new Exception("Error " + ex);
        }
        new BroadcastThread().start(); //create a BroadcastThread and start it
        while (estadoVoip) { //accept all incoming connection
            try {
                Socket c = s.accept();
                ClientConnection cc = new ClientConnection(this, c); //create a ClientConnection thread
                cc.start();
                addToClients(cc);
                Log.add("new client " + c.getInetAddress() + ":" + c.getPort() + " on port " + port);

                if (!estadoVoip) {
                    c.close();
                    this.finalize();
                    broadCastQueue.clear();
                    u.shutdown();
                    clients.clear();

                }
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
            while (estadoVoip) {
                try {
                    ArrayList<ClientConnection> toRemove = new ArrayList<ClientConnection>(); //create a list of dead connections
                    for (ClientConnection cc : clients) {
                        if (!cc.isAlive()) { //connection is dead, need to be removed
                            Log.add("dead connection closed: " + cc.getInetAddress() + ":" + cc.getPort() + " on port " + port);
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
                        if (!estadoVoip) {
                            this.finalize();
                            broadCastQueue.clear();
                            u.shutdown();
                            clients.clear();
                        }
                    }
                } catch (Throwable t) {
                    //mutex error, try again
                }

            }
        }
    }
}
