package Telas;

import ServidorVoIP.Log;
import java.awt.event.KeyEvent;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    public static String ipAddress = null;
    
    private static void pegarIPLocal(){

                Enumeration<NetworkInterface> net = null;
                try {
                    net = NetworkInterface.getNetworkInterfaces();
                } catch (SocketException e) {
                    Log.add("NÃO ESTÁ CONECTADO EM NENHUMA REDE");
                    try {
                        throw new Exception("ERRO DE REDE");
                    } catch (Exception ex) {
                        Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                while (net.hasMoreElements()) {
                    NetworkInterface element = net.nextElement();
                    Enumeration<InetAddress> addresses = element.getInetAddresses();
                    while (addresses.hasMoreElements()) {
                        InetAddress ip = addresses.nextElement();
                        if (ip instanceof Inet4Address) {
                            if (ip.isSiteLocalAddress()) {
                                ipAddress = ip.getHostAddress();
                                break;
                            }
                        }
                    }
                    if (ipAddress != null) {
                        break;
                    }
                }

        
    }
    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoConfigurarConta = new javax.swing.JButton();
        botaoCriarSala = new javax.swing.JButton();
        botaoEntrarEmSala = new javax.swing.JButton();
        botaoDeslogar = new javax.swing.JButton();
        planoFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Double Damage");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        botaoConfigurarConta.setBackground(new java.awt.Color(255, 255, 255));
        botaoConfigurarConta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        botaoConfigurarConta.setText("Configurar Conta");
        botaoConfigurarConta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoConfigurarContaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoConfigurarConta);
        botaoConfigurarConta.setBounds(430, 540, 450, 60);

        botaoCriarSala.setBackground(new java.awt.Color(255, 255, 255));
        botaoCriarSala.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        botaoCriarSala.setText("Criar nova Sala");
        botaoCriarSala.setName(""); // NOI18N
        botaoCriarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarSalaActionPerformed(evt);
            }
        });
        botaoCriarSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoCriarSalaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoCriarSala);
        botaoCriarSala.setBounds(430, 400, 450, 60);

        botaoEntrarEmSala.setBackground(new java.awt.Color(255, 255, 255));
        botaoEntrarEmSala.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        botaoEntrarEmSala.setText("Entrar em uma Sala");
        botaoEntrarEmSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarEmSalaActionPerformed(evt);
            }
        });
        botaoEntrarEmSala.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoEntrarEmSalaKeyPressed(evt);
            }
        });
        getContentPane().add(botaoEntrarEmSala);
        botaoEntrarEmSala.setBounds(430, 470, 450, 60);

        botaoDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/botaoLogout.png"))); // NOI18N
        botaoDeslogar.setToolTipText("Desconectar.");
        botaoDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeslogarActionPerformed(evt);
            }
        });
        botaoDeslogar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botaoDeslogarKeyPressed(evt);
            }
        });
        getContentPane().add(botaoDeslogar);
        botaoDeslogar.setBounds(1192, 650, 80, 40);

        planoFundo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        planoFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/logo.png"))); // NOI18N
        getContentPane().add(planoFundo);
        planoFundo.setBounds(210, 0, 800, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private void deslogar() {
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Desconectar.", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(1);
        }
    }
    private void botaoDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeslogarActionPerformed
        deslogar();
    }//GEN-LAST:event_botaoDeslogarActionPerformed

    private void botaoCriarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarSalaActionPerformed
        JDialog tela = new TelaConfigurarSala(this, true, this);
        tela.setVisible(true);
    }//GEN-LAST:event_botaoCriarSalaActionPerformed

    private void botaoCriarSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoCriarSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JDialog tela = new TelaConfigurarSala(this, true, this);
            tela.setVisible(true);
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            deslogar();
        }
    }//GEN-LAST:event_botaoCriarSalaKeyPressed
    private void botaoEntrarEmSalaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoEntrarEmSalaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            deslogar();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            JDialog tela = new TelaEntrarEmSala(this, true, this);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_botaoEntrarEmSalaKeyPressed

    private void botaoDeslogarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoDeslogarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            deslogar();
        }
    }//GEN-LAST:event_botaoDeslogarKeyPressed

    private void botaoEntrarEmSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarEmSalaActionPerformed
        JDialog tela = new TelaEntrarEmSala(this, true, this);
        tela.setVisible(true);
    }//GEN-LAST:event_botaoEntrarEmSalaActionPerformed

    private void botaoConfigurarContaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botaoConfigurarContaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            deslogar();
        }
    }//GEN-LAST:event_botaoConfigurarContaKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            deslogar();
        }
    }//GEN-LAST:event_formKeyPressed

    public static void Start() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                pegarIPLocal();
                new TelaInicial().setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfigurarConta;
    private javax.swing.JButton botaoCriarSala;
    private javax.swing.JButton botaoDeslogar;
    private javax.swing.JButton botaoEntrarEmSala;
    private javax.swing.JLabel planoFundo;
    // End of variables declaration//GEN-END:variables
}
