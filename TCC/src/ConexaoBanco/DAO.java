package ConexaoBanco;

import Objetos.*;
import Telas.*;
import static Telas.TelaJogo.imagemIcone;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class DAO {

    public static String nomeFichaTexto = "";
    public static String nomePersonagem = "";
    public static Jogador player = null;
    public static Sala salaAtual = null;
    public static String nickName = "";
    public static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    public static ArrayList<Sala> salas = new ArrayList<Sala>();
    public static ArrayList<Jogador> jogadoresAtuais = new ArrayList<Jogador>();
    public static Connection c = ConexaoMySql.getConnection();
    public static boolean donoDaSala = false;

    public void uploadNPC(String caminhoDaImagem) {
        FileInputStream fis = null;
        PreparedStatement stmt = null;
        File arquivo = new File(caminhoDaImagem);
        int pkPersonagem = this.pegarPk_personagem(nomePersonagem);
        try {
            fis = new FileInputStream(arquivo);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            String sqlExists = ("SELECT pk_imagemNPC FROM imagemNPC WHERE  fk_personagem = ?");
            PreparedStatement stmtE = c.prepareStatement(sqlExists);
            stmtE.setInt(1, pkPersonagem);
            ResultSet rs = stmtE.executeQuery();
            if (!rs.next()) {
                try {
                    String sqlInsert = ("INSERT INTO imagemNPC(fk_personagem, imagem_npc) VALUES (?,?)");
                    stmt = c.prepareStatement(sqlInsert);
                    stmt.setInt(1, pkPersonagem);
                    stmt.setBinaryStream(2, fis, (int) arquivo.length());
                    stmt.execute();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } else {
                String sqlUpdate = ("UPDATE imagemNPC SET imagem_npc = ? WHERE fk_personagem =?");
                stmt = c.prepareStatement(sqlUpdate);
                stmt.setBinaryStream(1, fis, (int) arquivo.length());
                stmt.setInt(2, pkPersonagem);
                stmt.execute();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Blob downloadImagemNPC() {
        String sql = "SELECT imagem_npc  FROM imagemNPC WHERE fk_personagem  = ?";
        int pkPersonagem = this.pegarPk_personagem(nomePersonagem);
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pkPersonagem);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Blob mapaBlob = rs.getBlob("imagem_npc");
                return mapaBlob;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void uploadMon(String caminhoDaImagem) {
        FileInputStream fis = null;
        PreparedStatement stmt = null;
        File arquivo = new File(caminhoDaImagem);
        int pkPersonagem = this.pegarPk_personagem(nomePersonagem);
        try {
            fis = new FileInputStream(arquivo);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            String sqlExists = ("SELECT pk_imagemMon FROM imagemMon WHERE  fk_personagem = ?");
            PreparedStatement stmtE = c.prepareStatement(sqlExists);
            stmtE.setInt(1, pkPersonagem);
            ResultSet rs = stmtE.executeQuery();
            if (!rs.next()) {
                try {
                    String sqlInsert = ("INSERT INTO imagemMon(fk_personagem, imagem_mon) VALUES (?,?)");
                    stmt = c.prepareStatement(sqlInsert);
                    stmt.setInt(1, pkPersonagem);
                    stmt.setBinaryStream(2, fis, (int) arquivo.length());
                    stmt.execute();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } else {
                String sqlUpdate = ("UPDATE imagemMon SET imagem_mon = ? WHERE fk_personagem =?");
                stmt = c.prepareStatement(sqlUpdate);
                stmt.setBinaryStream(1, fis, (int) arquivo.length());
                stmt.setInt(2, pkPersonagem);
                stmt.execute();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Blob downloadImagemMon() {
        String sql = "SELECT imagem_mon  FROM imagemMon WHERE fk_personagem  = ?";
        int pkPersonagem = this.pegarPk_personagem(nomePersonagem);
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pkPersonagem);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Blob mapaBlob = rs.getBlob("imagem_mon");
                return mapaBlob;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void uploadMapa(String caminhoDaImagem) {
        FileInputStream fis = null;
        PreparedStatement stmt = null;
        File arquivo = new File(caminhoDaImagem);
        try {
            fis = new FileInputStream(arquivo);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            String sqlExists = ("SELECT pk_mapa FROM mapa WHERE fk_sala = ?");
            PreparedStatement stmtE = c.prepareStatement(sqlExists);
            stmtE.setInt(1, salaAtual.getPk_sala());
            ResultSet rs = stmtE.executeQuery();
            if (!rs.next()) {
                try {
                    String sqlInsert = ("INSERT INTO mapa(fk_sala, imagem_mapa) VALUES ( ?, ?)");
                    stmt = c.prepareStatement(sqlInsert);
                    stmt.setInt(1, salaAtual.getPk_sala());
                    stmt.setBinaryStream(2, fis, (int) arquivo.length());
                    stmt.execute();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            } else {
                String sqlUpdate = ("UPDATE mapa SET imagem_mapa = ? WHERE fk_sala = ?");
                stmt = c.prepareStatement(sqlUpdate);
                stmt.setBinaryStream(1, fis, (int) arquivo.length());
                stmt.setInt(2, salaAtual.getPk_sala());
                stmt.execute();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public Blob downloadMapa() {
        String sql = "SELECT imagem_mapa  FROM mapa WHERE fk_sala  = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, salaAtual.getPk_sala());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Blob mapaBlob = rs.getBlob("imagem_mapa");
                return mapaBlob;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String SaltedPassword(String unecryptedPassword) {
        String salt = "(NioU&y%%OguyF=d%6S)(L.~mnHXR6#@3jn0*FX7HD(iSHuvTdkfsC5$¨865709giVFTcf76)VB9";

        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update((unecryptedPassword + salt).getBytes());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String encryptedPassword = (new BigInteger(messageDigest.digest())).toString(16);
        return encryptedPassword;
    }

    public void listarMagias() {
        final String sql = ("SELECT * FROM magia WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaMagias.tabela.getModel();
            while (rs.next()) {
                int id = rs.getInt("pk_magia");
                String nomeIcon = rs.getString("icone_mag");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/MagiaIcons/" + nomeIcon)));
                String nome = rs.getString("nome_mag");
                String efeito = rs.getString("efeito_mag");
                String tipo = rs.getString("tipo_mag");
                String atibutos = rs.getString("atributos_mag");
                String descricao = rs.getString("descricao_mag");
                Object[] magia = {id, icon, nome, efeito, tipo, atibutos, descricao};
                model.addRow(magia);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarArmas() {
        final String sql = ("SELECT * FROM itemWeapon WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaEquipamentos.tabela.getModel();
            while (rs.next()) {
                int id = rs.getInt("pk_itemWeapon");
                String nomeIcon = rs.getString("icone_itWea");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/WeaponIcons/" + nomeIcon)));
                String nome = rs.getString("nome_itWea");
                int dano = rs.getInt("danoBase_itWea");
                String atibutos = rs.getString("atributos_itWea");
                String descricao = rs.getString("descricao_itWea");
                int quantidade = rs.getInt("quantidade_itWea");
                Object[] arma = {id, quantidade, icon, nome, dano, atibutos, descricao};
                model.addRow(arma);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarArmasNPC() {
        final String sql = ("SELECT * FROM itemWeapon WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaNPC.tabela.getModel();
            while (rs.next()) {
                int id = rs.getInt("pk_itemWeapon");
                String nomeIcon = rs.getString("icone_itWea");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/WeaponIcons/" + nomeIcon)));
                String nome = rs.getString("nome_itWea");
                int dano = rs.getInt("danoBase_itWea");
                String atibutos = rs.getString("atributos_itWea");
                String descricao = rs.getString("descricao_itWea");
                int quantidade = rs.getInt("quantidade_itWea");
                Object[] arma = {id, quantidade, icon, nome, dano, atibutos, descricao};
                model.addRow(arma);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarArmasMon() {
        final String sql = ("SELECT * FROM itemWeapon WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaMonstro.tabela.getModel();
            while (rs.next()) {
                int id = rs.getInt("pk_itemWeapon");
                String nomeIcon = rs.getString("icone_itWea");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/WeaponIcons/" + nomeIcon)));
                String nome = rs.getString("nome_itWea");
                int dano = rs.getInt("danoBase_itWea");
                String atibutos = rs.getString("atributos_itWea");
                String descricao = rs.getString("descricao_itWea");
                int quantidade = rs.getInt("quantidade_itWea");
                Object[] arma = {id, quantidade, icon, nome, dano, atibutos, descricao};
                model.addRow(arma);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarArmadurasMon() {
        final String sql = ("SELECT * FROM itemArmor WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaMonstro.tabela.getModel();
            while (rs.next()) {
                int id = rs.getInt("pk_itemArmor");
                String nomeIcon = rs.getString("icone_iArmo");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/ArmaduraIcons/" + nomeIcon)));
                String nome = rs.getString("nome_iArmo");
                int defesa = rs.getInt("defesaBase_iArmo");
                String atibutos = rs.getString("atributos_iArmo");
                String descricao = rs.getString("descricao_iArmo");
                int quantidade = rs.getInt("quantidade_iArmo");
                Object[] armor = {id, quantidade, icon, nome, defesa, atibutos, descricao};
                model.addRow(armor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarArmadurasNPC() {
        final String sql = ("SELECT * FROM itemArmor WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaNPC.tabela.getModel();
            while (rs.next()) {
                int id = rs.getInt("pk_itemArmor");
                String nomeIcon = rs.getString("icone_iArmo");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/ArmaduraIcons/" + nomeIcon)));
                String nome = rs.getString("nome_iArmo");
                int defesa = rs.getInt("defesaBase_iArmo");
                String atibutos = rs.getString("atributos_iArmo");
                String descricao = rs.getString("descricao_iArmo");
                int quantidade = rs.getInt("quantidade_iArmo");
                Object[] armor = {id, quantidade, icon, nome, defesa, atibutos, descricao};
                model.addRow(armor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarArmaduras() {
        final String sql = ("SELECT * FROM itemArmor WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaEquipamentos.tabela.getModel();
            while (rs.next()) {
                int id = rs.getInt("pk_itemArmor");
                String nomeIcon = rs.getString("icone_iArmo");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/ArmaduraIcons/" + nomeIcon)));
                String nome = rs.getString("nome_iArmo");
                int defesa = rs.getInt("defesaBase_iArmo");
                String atibutos = rs.getString("atributos_iArmo");
                String descricao = rs.getString("descricao_iArmo");
                int quantidade = rs.getInt("quantidade_iArmo");
                Object[] armor = {id, quantidade, icon, nome, defesa, atibutos, descricao};
                model.addRow(armor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarItensMon() {
        final String sql = ("SELECT * FROM item WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaMonstro.tabela.getModel();
            while (rs.next()) {
                int id = rs.getInt("pk_item");
                String nomeIcon = rs.getString("icone_ite");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/ItemIcons/" + nomeIcon)));
                String nome = rs.getString("nome_ite");
                String atibutos = rs.getString("atributos_ite");
                String descricao = rs.getString("descricao_ite");
                int quantidade = rs.getInt("quantidade_ite");
                Object[] item = {id, quantidade, icon, nome, null, atibutos, descricao};
                model.addRow(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarItensNPC() {
        final String sql = ("SELECT * FROM item WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaNPC.tabela.getModel();
            while (rs.next()) {
                int id = rs.getInt("pk_item");
                String nomeIcon = rs.getString("icone_ite");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/ItemIcons/" + nomeIcon)));
                String nome = rs.getString("nome_ite");
                String atibutos = rs.getString("atributos_ite");
                String descricao = rs.getString("descricao_ite");
                int quantidade = rs.getInt("quantidade_ite");
                Object[] item = {id, quantidade, icon, nome, null, atibutos, descricao};
                model.addRow(item);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarItens() {
        final String sql = ("SELECT * FROM item WHERE fk_personagem = (?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pegarPk_personagem(nomePersonagem));
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) TelaEquipamentos.tabela.getModel();
            while (rs.next()) {
                int id = rs.getInt("pk_item");
                String nomeIcon = rs.getString("icone_ite");
                ImageIcon icon = (new ImageIcon(getClass().getResource("/ItemIcons/" + nomeIcon)));
                String nome = rs.getString("nome_ite");
                String atibutos = rs.getString("atributos_ite");
                String descricao = rs.getString("descricao_ite");
                int quantidade = rs.getInt("quantidade_ite");
                Object[] item = {id, quantidade, icon, nome, null, atibutos, descricao};
                model.addRow(item);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirItem(int id, int tipo) {
        switch (tipo) {
            case 1: {
                String sqlDelete = ("DELETE FROM itemWeapon WHERE fk_personagem = ? AND pk_itemWeapon = ?");
                try {
                    PreparedStatement stmtDelete = c.prepareStatement(sqlDelete);
                    stmtDelete.setInt(1, pegarPk_personagem(nomePersonagem));
                    stmtDelete.setInt(2, id);
                    stmtDelete.execute();
                    stmtDelete.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                String sqlDelete = ("DELETE FROM itemArmor WHERE fk_personagem = ? AND pk_itemArmor = ?");
                try {
                    PreparedStatement stmtDelete = c.prepareStatement(sqlDelete);
                    stmtDelete.setInt(1, pegarPk_personagem(nomePersonagem));
                    stmtDelete.setInt(2, id);
                    stmtDelete.execute();
                    stmtDelete.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                String sqlDelete = ("DELETE FROM item WHERE fk_personagem = ? AND pk_item = ?");
                try {
                    PreparedStatement stmtDelete = c.prepareStatement(sqlDelete);
                    stmtDelete.setInt(1, pegarPk_personagem(nomePersonagem));
                    stmtDelete.setInt(2, id);
                    stmtDelete.execute();
                    stmtDelete.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }

    public void trocarItem(int id, int tipo, String nomePers) {
        switch (tipo) {
            case 1: {
                final String sql = ("SELECT * FROM itemWeapon WHERE fk_personagem = ? AND pk_itemWeapon = ?");
                try {
                    PreparedStatement stmt = c.prepareStatement(sql);
                    stmt.setInt(1, pegarPk_personagem(nomePersonagem));
                    stmt.setInt(2, id);
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        String sqlInsert = ("INSERT INTO itemWeapon(fk_personagem,nome_itWea,icone_itWea,danoBase_itWea, atributos_itWea,descricao_itWea,quantidade_itWea) VALUES (?,?,?,?,?,?,?)");
                        PreparedStatement stmtInsert = c.prepareStatement(sqlInsert);
                        stmtInsert.setInt(1, pegarPk_personagem(nomePers));
                        stmtInsert.setString(2, rs.getString("nome_itWea"));
                        stmtInsert.setString(3, rs.getString("icone_itWea"));
                        stmtInsert.setInt(4, rs.getInt("danoBase_itWea"));
                        stmtInsert.setString(5, rs.getString("atributos_itWea"));
                        stmtInsert.setString(6, rs.getString("descricao_itWea"));
                        stmtInsert.setInt(7, rs.getInt("quantidade_itWea"));
                        stmtInsert.execute();
                        stmtInsert.close();
                        String sqlDelete = ("DELETE FROM itemWeapon WHERE fk_personagem = ? AND pk_itemWeapon = ?");
                        PreparedStatement stmtDelete = c.prepareStatement(sqlDelete);
                        stmtDelete.setInt(1, pegarPk_personagem(nomePersonagem));
                        stmtDelete.setInt(2, id);
                        stmtDelete.execute();
                        stmtDelete.close();
                    }
                    stmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 2: {
                final String sql = ("SELECT * FROM itemArmor WHERE fk_personagem = ? AND pk_itemArmor = ?");
                try {
                    PreparedStatement stmt = c.prepareStatement(sql);
                    stmt.setInt(1, pegarPk_personagem(nomePersonagem));
                    stmt.setInt(2, id);
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        String sqlInsert = ("INSERT INTO itemArmor(fk_personagem,nome_iArmo,icone_iArmo,defesaBase_iArmo,atributos_iArmo,descricao_iArmo,quantidade_iArmo) VALUES(?,?,?,?,?,?,?)");
                        PreparedStatement stmtInsert = c.prepareStatement(sqlInsert);
                        stmtInsert.setInt(1, pegarPk_personagem(nomePers));
                        stmtInsert.setString(2, rs.getString("nome_iArmo"));
                        stmtInsert.setString(3, rs.getString("icone_iArmo"));
                        stmtInsert.setInt(4, rs.getInt("defesaBase_iArmo"));
                        stmtInsert.setString(5, rs.getString("atributos_iArmo"));
                        stmtInsert.setString(6, rs.getString("descricao_iArmo"));
                        stmtInsert.setInt(7, rs.getInt("quantidade_iArmo"));
                        stmtInsert.execute();
                        stmtInsert.close();
                        String sqlDelete = ("DELETE FROM itemArmor WHERE fk_personagem = ? AND pk_itemArmor = ?");
                        PreparedStatement stmtDelete = c.prepareStatement(sqlDelete);
                        stmtDelete.setInt(1, pegarPk_personagem(nomePersonagem));
                        stmtDelete.setInt(2, id);
                        stmtDelete.execute();
                        stmtDelete.close();
                    }
                    stmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
            case 3: {
                final String sql = ("SELECT * FROM item WHERE fk_personagem = ? AND pk_item = ?");
                try {
                    PreparedStatement stmt = c.prepareStatement(sql);
                    stmt.setInt(1, pegarPk_personagem(nomePersonagem));
                    stmt.setInt(2, id);
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        String sqlInsert = ("INSERT INTO item(fk_personagem,nome_ite,icone_ite,atributos_ite,descricao_ite,quantidade_ite)VALUES (?,?,?,?,?,?)");
                        PreparedStatement stmtInsert = c.prepareStatement(sqlInsert);
                        stmtInsert.setInt(1, pegarPk_personagem(nomePers));
                        stmtInsert.setString(2, rs.getString("nome_ite"));
                        stmtInsert.setString(3, rs.getString("icone_ite"));
                        stmtInsert.setString(4, rs.getString("atributos_ite"));
                        stmtInsert.setString(5, rs.getString("quantidade_ite"));
                        stmtInsert.setInt(6, rs.getInt("quantidade_itWea"));
                        stmtInsert.execute();
                        stmtInsert.close();
                        String sqlDelete = ("DELETE FROM item WHERE fk_personagem = ? AND pk_item = ?");
                        PreparedStatement stmtDelete = c.prepareStatement(sqlDelete);
                        stmtDelete.setInt(1, pegarPk_personagem(nomePersonagem));
                        stmtDelete.setInt(2, id);
                        stmtDelete.execute();
                        stmtDelete.close();
                    }
                    stmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            }
        }
    }

    public void mensagemSairDaSala() {
        final String sql = ("update sala SET chat_sala=concat(chat_sala,(?)) where nome_sala = (?)");
        String mensagem = "[" + pegarTempoServer() + "] [" + DAO.nickName + " Saiu da Sala]\n";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, mensagem);
            stmt.setString(2, TelaConfigurarSala.nomeSala);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mensagemEntrarNaSala() {
        final String sql = ("update sala SET chat_sala=concat(chat_sala,(?)) where nome_sala = (?)");
        String mensagem = "[" + pegarTempoServer() + "] [" + DAO.nickName + " Entrou na Sala]\n";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, mensagem);
            stmt.setString(2, TelaConfigurarSala.nomeSala);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean fichaExiste(String nomeFichaE) {
        String sql = "SELECT nome_ficT FROM fichaTexto WHERE nome_ficT = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeFichaE);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean personagemExiste(String nomePersonagem) {
        String sql = "SELECT nomePersonagem_fic FROM personagem WHERE nomePersonagem_fic = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomePersonagem);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void criarFichaTexto(FichaTexto ft) {
        final String sql = ("INSERT INTO fichaTexto(fk_sala, nome_ficT, texto_fict) VALUES(?,?,?);");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, ft.getFk_sala());
            stmt.setString(2, ft.getNome_fict());
            stmt.setString(3, ft.getTexto_fict());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarPersonagem(FichaPersonagem p) {
        final String sql = ("insert into personagem(fk_sala,outrosAtributos_fic,lore_fic,raca_fic,classe_fic,nomePersonagem_fic,nomeJogador_fic,divindade_fic,nivel_fic,idade_fic,pontosVida_fic,pontosMana_fic,pontosForca_fic,pontosConstituicao_fic,pontosDestreza_fic,pontosInteligencia_fic,pontosSabedoria_fic,pontosCarisma_fic,pontosDefesa_fic,tipo_fic) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, p.getFk_sala());
            stmt.setString(2, p.getOutrosAtributos_fic());
            stmt.setString(3, p.getLore_fic());
            stmt.setString(4, p.getRaca_fic());
            stmt.setString(5, p.getClasse_fic());
            stmt.setString(6, p.getNomePersonagem_fic());
            stmt.setString(7, p.getNomeJogador_fic());
            stmt.setString(8, p.getDivindade_fic());
            stmt.setInt(9, p.getNivel_fic());
            stmt.setInt(10, p.getIdade_fic());
            stmt.setInt(11, p.getPontosVida_fic());
            stmt.setInt(12, p.getPontosMana_fic());
            stmt.setInt(13, p.getPontosForca_fic());
            stmt.setInt(14, p.getPontosConstituicao_fic());
            stmt.setInt(15, p.getPontosDestreza_fic());
            stmt.setInt(16, p.getPontosInteligencia_fic());
            stmt.setInt(17, p.getPontosSabedoria_fic());
            stmt.setInt(18, p.getPontosCarisma_fic());
            stmt.setInt(19, p.getPontosDefesa_fic());
            stmt.setString(20, p.getTipo_fi());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void salvarEdicaoFichaTexto(FichaTexto ft) {
        final String sql = ("UPDATE fichaTexto SET nome_ficT = ? texto_ficT = ? WHERE nome_ficT = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, ft.getNome_fict());
            stmt.setString(2, ft.getTexto_fict());
            stmt.setString(3, DAO.nomeFichaTexto);
            stmt.execute();
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void salvarEdicaoPersonagem(FichaPersonagem p) {
        final String sql = ("UPDATE personagem SET outrosAtributos_fic=?,lore_fic=?,raca_fic=?,classe_fic=?,nomePersonagem_fic=?,nomeJogador_fic=?,divindade_fic=?,nivel_fic=?,idade_fic=?,pontosVida_fic=?,pontosMana_fic=?,pontosForca_fic=?,pontosConstituicao_fic=?,pontosDestreza_fic=?,pontosInteligencia_fic=?,pontosSabedoria_fic=?,pontosCarisma_fic=?,pontosDefesa_fic=? WHERE nomePersonagem_fic = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, p.getOutrosAtributos_fic());
            stmt.setString(2, p.getLore_fic());
            stmt.setString(3, p.getRaca_fic());
            stmt.setString(4, p.getClasse_fic());
            stmt.setString(5, p.getNomePersonagem_fic());
            stmt.setString(6, p.getNomeJogador_fic());
            stmt.setString(7, p.getDivindade_fic());
            stmt.setInt(8, p.getNivel_fic());
            stmt.setInt(9, p.getIdade_fic());
            stmt.setInt(10, p.getPontosVida_fic());
            stmt.setInt(11, p.getPontosMana_fic());
            stmt.setInt(12, p.getPontosForca_fic());
            stmt.setInt(13, p.getPontosConstituicao_fic());
            stmt.setInt(14, p.getPontosDestreza_fic());
            stmt.setInt(15, p.getPontosInteligencia_fic());
            stmt.setInt(16, p.getPontosSabedoria_fic());
            stmt.setInt(17, p.getPontosCarisma_fic());
            stmt.setInt(18, p.getPontosDefesa_fic());
            stmt.setString(19, DAO.nomePersonagem);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pegarDadosFichaTexto(String nomeFichaTexto) {
        DAO.nomeFichaTexto = nomeFichaTexto;
        final String sql = ("SELECT * FROM fichaTexto WHERE nome_fict = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeFichaTexto);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TelaFichaDeTexto telaFichaTexto = new TelaFichaDeTexto(null, true);
                telaFichaTexto.telaTextoFicha.setText(rs.getString("texto_ficT"));
                telaFichaTexto.nomeFichaTexto.setText(rs.getString("nome_ficT"));
                if (verificarDono()) {
                    telaFichaTexto.botaoExcluirFichaTexto.setEnabled(true);
                    telaFichaTexto.botaoSalvar.setEnabled(true);
                    telaFichaTexto.setVisible(true);
                } else {
                    telaFichaTexto.nomeFichaTexto.setEditable(false);
                    telaFichaTexto.telaTextoFicha.setEditable(false);
                    telaFichaTexto.setVisible(true);
                }
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean verificarImagemMonExiste() {
        String sqlExists = ("SELECT pk_imagemMon FROM imagemMon WHERE  fk_personagem = ?");
        int pkPersonagem = this.pegarPk_personagem(nomePersonagem);
        try {
            PreparedStatement stmtE = c.prepareStatement(sqlExists);
            stmtE.setInt(1, pkPersonagem);
            ResultSet rs = stmtE.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean verificarImagemNPCExiste() {
        String sqlExists = ("SELECT pk_imagemNPC FROM imagemNPC WHERE  fk_personagem = ?");
        int pkPersonagem = this.pegarPk_personagem(nomePersonagem);
        try {
            PreparedStatement stmtE = c.prepareStatement(sqlExists);
            stmtE.setInt(1, pkPersonagem);
            ResultSet rs = stmtE.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void pegarDadosMon(String nomeMon) {
        DAO.nomePersonagem = nomeMon;
        final String sql = ("SELECT * FROM personagem WHERE nomePersonagem_fic = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeMon);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TelaMonstro telaMonstro = new TelaMonstro(null, true);
                if (verificarImagemMonExiste()) {
                    try {
                        BufferedImage imagem = ImageIO.read(this.downloadImagemMon().getBinaryStream());
                        imagemIcone = new ImageIcon(imagem);
                        telaMonstro.labelImagem.setIcon(imagemIcone);
                    } catch (SQLException | IOException ex) {
                        ex.printStackTrace();
                    }
                }
                telaMonstro.campoDano.setText(rs.getString("pontosMana_fic"));
                telaMonstro.campoDefesa.setText(rs.getString("pontosDefesa_fic"));
                telaMonstro.campoVida.setText(rs.getString("pontosVida_fic"));
                telaMonstro.campoTipo.setText(rs.getString("classe_fic"));
                telaMonstro.campoNome.setText(rs.getString("nomePersonagem_fic"));
                telaMonstro.campoLore.setText(rs.getString("lore_fic"));
                this.listarItensMon();
                this.listarArmasMon();
                this.listarArmadurasMon();
                if (verificarDono()) {
                    telaMonstro.botaAdicionarImagem.setEnabled(true);
                    telaMonstro.botaoExcluir.setEnabled(true);
                    telaMonstro.botaoSalvar.setVisible(false);
                    telaMonstro.botaoSalvarEdicao.setEnabled(true);
                    telaMonstro.setVisible(true);
                } else {
                    telaMonstro.campoDano.setEditable(false);
                    telaMonstro.campoDefesa.setEditable(false);
                    telaMonstro.campoTipo.setEditable(false);
                    telaMonstro.campoLore.setEditable(false);
                    telaMonstro.campoNome.setEditable(false);
                    telaMonstro.campoVida.setEditable(false);
                    telaMonstro.setVisible(true);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void pegarDadosNPC(String nomeNPC) {
        DAO.nomePersonagem = nomeNPC;
        final String sql = ("SELECT * FROM personagem WHERE nomePersonagem_fic = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeNPC);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TelaNPC telaNPC = new TelaNPC(null, true);
                if (verificarImagemNPCExiste()) {
                    try {
                        BufferedImage imagem = ImageIO.read(this.downloadImagemNPC().getBinaryStream());
                        imagemIcone = new ImageIcon(imagem);
                        telaNPC.labelImagem.setIcon(imagemIcone);
                    } catch (SQLException | IOException ex) {
                        ex.printStackTrace();
                    }
                }
                telaNPC.campoDano.setText(rs.getString("pontosMana_fic"));
                telaNPC.campoDefesa.setText(rs.getString("pontosDefesa_fic"));
                telaNPC.campoVida.setText(rs.getString("pontosVida_fic"));
                telaNPC.campoFuncao.setText(rs.getString("classe_fic"));
                telaNPC.campoNome.setText(rs.getString("nomePersonagem_fic"));
                telaNPC.campoLore.setText(rs.getString("lore_fic"));
                this.listarItensNPC();
                this.listarArmasNPC();
                this.listarArmadurasNPC();
                if (verificarDono()) {
                    telaNPC.botaAdicionarImagem.setEnabled(true);
                    telaNPC.botaoExcluir.setEnabled(true);
                    telaNPC.botaoSalvar.setVisible(false);
                    telaNPC.botaoSalvarEdicao.setEnabled(true);
                    telaNPC.setVisible(true);
                } else {
                    telaNPC.campoDano.setEditable(false);
                    telaNPC.campoDefesa.setEditable(false);
                    telaNPC.campoFuncao.setEditable(false);
                    telaNPC.campoLore.setEditable(false);
                    telaNPC.campoNome.setEditable(false);
                    telaNPC.campoVida.setEditable(false);
                    telaNPC.setVisible(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pegarDadosPersonagem(String nomePersonagem) {
        DAO.nomePersonagem = nomePersonagem;
        final String sql = ("SELECT * FROM personagem WHERE nomePersonagem_fic = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomePersonagem);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TelaPersonagem telaPersonagem = new TelaPersonagem(null, true);
                telaPersonagem.campoOutrosAtributos.setText(rs.getString("outrosAtributos_fic"));
                telaPersonagem.campoLore.setText(rs.getString("lore_fic"));
                telaPersonagem.campoRaca.setText(rs.getString("raca_fic"));
                telaPersonagem.campoClasse.setText(rs.getString("classe_fic"));
                telaPersonagem.campoNomePersonagem.setText(rs.getString("nomePersonagem_fic"));
                telaPersonagem.campoNomeJogador.setText(rs.getString("nomeJogador_fic"));
                telaPersonagem.campoDivindade.setText(rs.getString("divindade_fic"));
                telaPersonagem.campoNivel.setText(rs.getInt("nivel_fic") + "");
                telaPersonagem.campoIdade.setText(rs.getInt("idade_fic") + "");
                telaPersonagem.campoVida.setText(rs.getInt("pontosVida_fic") + "");
                telaPersonagem.campoMana.setText(rs.getInt("pontosMana_fic") + "");
                telaPersonagem.campoForca.setText(rs.getInt("pontosForca_fic") + "");
                telaPersonagem.campoConstituicao.setText(rs.getInt("pontosConstituicao_fic") + "");
                telaPersonagem.campoDestreza.setText(rs.getInt("pontosDestreza_fic") + "");
                telaPersonagem.campoInteligencia.setText(rs.getInt("pontosInteligencia_fic") + "");
                telaPersonagem.campoSabedoria.setText(rs.getInt("pontosSabedoria_fic") + "");
                telaPersonagem.campoCarisma.setText(rs.getInt("pontosCarisma_fic") + "");
                telaPersonagem.campoDefesa.setText(rs.getInt("pontosDefesa_fic") + "");
                if (verificarDono()) {
                    telaPersonagem.botaoExcluirPersonagem.setEnabled(true);
                    telaPersonagem.botaoEquipamentos.setEnabled(true);
                    telaPersonagem.botaoMagias.setEnabled(true);
                    telaPersonagem.botaoSalvarPersonagem.setVisible(false);
                    telaPersonagem.salvarEdicao.setEnabled(true);
                    telaPersonagem.setVisible(true);

                } else {
                    telaPersonagem.botaoEquipamentos.setEnabled(true);
                    telaPersonagem.botaoMagias.setEnabled(true);
                    telaPersonagem.campoCarisma.setEditable(false);
                    telaPersonagem.campoClasse.setEditable(false);
                    telaPersonagem.campoConstituicao.setEditable(false);
                    telaPersonagem.campoDefesa.setEditable(false);
                    telaPersonagem.campoDestreza.setEditable(false);
                    telaPersonagem.campoDivindade.setEditable(false);
                    telaPersonagem.campoForca.setEditable(false);
                    telaPersonagem.campoIdade.setEditable(false);
                    telaPersonagem.campoInteligencia.setEditable(false);
                    telaPersonagem.campoLore.setEditable(false);
                    telaPersonagem.campoMana.setEditable(false);
                    telaPersonagem.campoNivel.setEditable(false);
                    telaPersonagem.campoNomeJogador.setEditable(false);
                    telaPersonagem.campoNomePersonagem.setEditable(false);
                    telaPersonagem.campoOutrosAtributos.setEditable(false);
                    telaPersonagem.campoRaca.setEditable(false);
                    telaPersonagem.campoSabedoria.setEditable(false);
                    telaPersonagem.campoVida.setEditable(false);
                    telaPersonagem.setVisible(true);
                }

            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirFichaTexto() {
        final String sql = ("DELETE FROM fichaTexto WHERE nome_ficT = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, DAO.nomeFichaTexto);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirPersonagem() {
        final String sql = ("DELETE FROM personagem WHERE nomePersonagem_fic = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, DAO.nomePersonagem);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarFichasTexto() {
        final String sql = ("SELECT * FROM fichaTexto fic join sala sala on fic.fk_sala = sala.pk_sala WHERE sala.nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaJogo.caixaFichasTexto.addItem(rs.getString("nome_ficT"));
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int pegarPk_jogador(String nome) {
        final String sql = ("SELECT * FROM jogador WHERE nome_jog = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("pk_jogador");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int pegarPk_personagem(String nomePersonagem) {
        final String sql = ("SELECT * FROM personagem WHERE nomePersonagem_fic = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomePersonagem);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("pk_personagem");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int pegarPk_sala(String nomeSala) {

        final String sql = ("SELECT * FROM sala WHERE nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("pk_sala");
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void criarItemArma(ItemArma ia) {
        final String sql = ("INSERT INTO itemWeapon(fk_personagem,nome_itWea,icone_itWea,danoBase_itWea, atributos_itWea,descricao_itWea,quantidade_itWea) VALUES (?,?,?,?,?,?,?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, ia.getFk_personagem());
            stmt.setString(2, ia.getNome_itWea());
            stmt.setString(3, ia.getIcone_itWea());
            stmt.setInt(4, ia.getDanoBase_itWea());
            stmt.setString(5, ia.getAtributos_itWea());
            stmt.setString(6, ia.getDescricao_itWea());
            stmt.setInt(7, ia.getQuantidade_itWea());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void criarItemArmadura(ItemArmadura ia) {
        final String sql = ("INSERT INTO itemArmor(fk_personagem,nome_iArmo,icone_iArmo,defesaBase_iArmo,atributos_iArmo,descricao_iArmo,quantidade_iArmo) VALUES(?,?,?,?,?,?,?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, ia.getFk_personagem());
            stmt.setString(2, ia.getNome_iArmo());
            stmt.setString(3, ia.getIcone_iArmo());
            stmt.setInt(4, ia.getDefesaBase_iArmo());
            stmt.setString(5, ia.getAtributos_iArmo());
            stmt.setString(6, ia.getDescricao_iArmo());
            stmt.setInt(7, ia.getQuantidade_iArmo());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarMagia(Magia ma) {
        final String sql = ("INSERT INTO magia(fk_personagem,nome_mag,icone_mag,efeito_mag,tipo_mag,descricao_mag,atributos_mag) VALUES (?,?,?,?,?,?,?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, ma.getFk_personagem());
            stmt.setString(2, ma.getNome_mag());
            stmt.setString(3, ma.getIcone_mag());
            stmt.setString(4, ma.getEfeito_mag());
            stmt.setString(5, ma.getTipo_mag());
            stmt.setString(6, ma.getDescricao_mag());
            stmt.setString(7, ma.getAtributos_mag());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void criarItem(Item it) {
        final String sql = ("INSERT INTO item(fk_personagem,nome_ite,icone_ite,atributos_ite,descricao_ite,quantidade_ite)VALUES (?,?,?,?,?,?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, it.getFk_personagem());
            stmt.setString(2, it.getNome_ite());
            stmt.setString(3, it.getIcone_ite());
            stmt.setString(4, it.getAtributos_ite());
            stmt.setString(5, it.getDescricao_ite());
            stmt.setInt(6, it.getQuantidade_ite());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagensMagias() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ? AND per.tipo_fic = 'p'");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaCriarMagia.caixaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagensEnviarObjeto() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                if (!nomePersonagem.equals(rs.getString("nomePersonagem_fic"))) {
                    TelaVisualizarObjeto.caixaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
                }
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagensItens() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaCriarItem.caixaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagensArmaduras() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaCriarArmadura.caixaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagensArmas() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaCriarArma.caixaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarNPC() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ? AND tipo_fic = 'n';");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaJogo.caixaNPC.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarMonstros() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ? AND tipo_fic = 'm';");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaJogo.caixaMonstros.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarPersonagens() {
        final String sql = ("select * from personagem per join sala sala on per.fk_sala = sala.pk_sala where sala.nome_sala = ? AND tipo_fic = 'p';");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaJogo.caixaFichaPersonagem.addItem(rs.getString("nomePersonagem_fic"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void listarSalas() {
        pegarSalasDoBanco();
        pegarJogadoresDoBanco();
        final String sql = ("select * from sala");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaEntrarEmSala.caixaDeSalas.addItem(rs.getString("nome_sala"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarJogador(Jogador jogador, TelaRegistrar tela) {
        pegarSalasDoBanco();
        pegarJogadoresDoBanco();
        final String sql = "insert into jogador(nome_jog, email_jog, senha_jog, dt_registro, dt_ultimoLogin) values(?,?,sha1(md5(?)),now(),now())";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, jogador.getNome_jog());
            stmt.setString(2, jogador.getEmail_jog());
            stmt.setString(3, SaltedPassword(jogador.getSenha_jog()));
            stmt.execute();
            stmt.close();
            tela.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean editarJogador(String email, String senha, String nome) {
        final String sql = ("UPDATE jogador SET nome_jog =(?), email_jog=(?), senha_jog = sha1(md5(?))  WHERE pk_jogador =(?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, SaltedPassword(senha));
            stmt.setInt(4, player.getPk_jogador());
            stmt.execute();
            stmt.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void limparChat() {
        final String sql = ("UPDATE sala SET chat_sala = '' WHERE pk_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, salaAtual.getPk_sala());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void listarJogadores(Jogador jogador) {
        pegarJogadoresDoBanco();
        final String sql = ("select * from jogador;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("pk_jogador"));
                System.out.println("Nome: " + rs.getString("nome_jog"));
                System.out.println("Email: " + rs.getString("email_jog"));
                System.out.println("Senha: " + rs.getString("senha_jog"));
                stmt.execute();
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean salaExiste(String nomeSala) {
        pegarSalasDoBanco();
        String sql = "SELECT nome_sala FROM sala WHERE nome_sala = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean verificarDono() {
        pegarSalasDoBanco();
        pegarJogadoresDoBanco();
        String sql = ("SELECT * FROM sala WHERE fk_jogador =? AND nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, player.getPk_jogador());
            stmt.setString(2, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void alterarIP(String nome_sala) {
        String ip = TelaInicial.ipAddress;
        final String sql = ("UPDATE sala SET ip_dono = ? WHERE nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, ip);
            stmt.setString(2, nome_sala);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int pegarPorta(String nome_sala) {
        final String sql = ("SELECT * FROM sala WHERE nome_sala =(?)");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nome_sala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int porta = rs.getInt(9);
                return porta;
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void alterarPorta(int porta_sala, String nome_sala) {
        final String sql = ("UPDATE sala SET porta_sala = ? WHERE nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, porta_sala);
            stmt.setString(2, nome_sala);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String pegarIPDono(String nome_sala) {
        pegarSalasDoBanco();
        final String sql = ("SELECT ip_dono FROM sala WHERE nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nome_sala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isVOIPAtivado(String nomeSala) {
        pegarSalasDoBanco();
        final String sql = ("SELECT voip_sala FROM sala WHERE nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int voip_sala = rs.getInt(1);
                if (voip_sala == 1) {
                    stmt.close();
                    rs.close();
                    return true;
                } else {
                    stmt.close();
                    rs.close();
                    return false;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void alterarVOIP(int estado) {
        pegarSalasDoBanco();
        final String sql = ("UPDATE sala SET voip_sala = ? WHERE nome_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, estado);
            stmt.setString(2, salaAtual.getNome_sala());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pegarAnotacoesBanco() {
        pegarSalasDoBanco();
        final String sql = ("SELECT anotacoes_sala FROM sala WHERE pk_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, salaAtual.getPk_sala());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TelaJogo.campoAnotacao.setText(rs.getString("anotacoes_sala"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizarAnotacoes(String texto) {
        final String sql = ("UPDATE sala SET anotacoes_sala = ? WHERE pk_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, texto);
            stmt.setInt(2, salaAtual.getPk_sala());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void criarSala(TelaConfigurarSala tela, String nomeSala, String senhaSala) {
        pegarSalasDoBanco();
        pegarJogadoresDoBanco();
        String sql = "insert into sala(fk_jogador, nome_sala, senha_sala, chat_sala, ip_dono, limpar_chat_daily, voip_sala, porta_sala,anotacoes_sala) values(?,?,?,?,?,?,?,?,?)";
        for (Sala sala : salas) {
            if (sala.getNome_sala().equalsIgnoreCase(nomeSala)) {
                salaAtual = sala;
            }
        }
        int pk_dono = player.getPk_jogador();
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, pk_dono);
            stmt.setString(2, nomeSala);
            stmt.setString(3, senhaSala);
            stmt.setString(4, "");
            stmt.setString(5, TelaInicial.ipAddress);
            stmt.setInt(6, 0);
            stmt.setBoolean(7, false);
            stmt.setInt(8, 0);
            stmt.setString(9, "");
            stmt.execute();
            tela.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String pegarTempoServer() {
        final String sql = ("SELECT CURTIME();");

        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String comando(String texto) {
        switch (texto) {
            case "/help": {
                String help = "\n     /ping: retorna o tempo de resposta do servidor \n     /time: retorna o tempo do servidor \n     /owner: retorna o nome do dono da sala \n     /clear: limpa a sua janela de chat \n";
                return "[" + pegarTempoServer() + "] [" + DAO.nickName + "]: " + help + "\n";
            }
            case "/ping": {
                return "[" + pegarTempoServer() + "] [" + DAO.nickName + "]: " + ping() + "\n";
            }
            case "/time": {
                return "[" + pegarTempoServer() + "] [" + DAO.nickName + "]: Server time:" + pegarTempoServer() + "\n \n";
            }
            case "/owner": {
                String aux = dono();
                if (aux.isEmpty()) {
                    break;
                } else {
                    return "[" + pegarTempoServer() + "] [" + DAO.nickName + "]: " + aux + "\n";
                }
            }
            default: {
                return "[" + pegarTempoServer() + "] [" + DAO.nickName + "]: " + texto + "\n";
            }
        }
        return "";
    }

    public String dono() {
        final String sql = ("SELECT * FROM jogador jog JOIN sala sala ON jog.pk_jogador = sala.fk_jogador WHERE nome_sala =?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, salaAtual.getNome_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                return "Owner: " + rs.getString("nome_jog") + "\n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public String ping() {
        final String sql = ("/* ping */ SELECT 1");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return "PING: " + rs.getString(1) + "ms \n";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void enviarDadoBanco(int dado, int numeroModificado, int numero, int modificadorMais, int modificadorMenos, int tipo) {
        final String sql = ("update sala SET chat_sala=concat(chat_sala,(?)) where nome_sala = (?)");
        String mensagem = "";
        switch (tipo) {
            case 1: {
                mensagem = ("[" + pegarTempoServer() + "] [" + DAO.nickName + " rolou um dado D" + dado + "] = " + numeroModificado + " {[" + numero + "+" + modificadorMais + "]}\n");
                break;
            }
            case 2: {
                mensagem = ("[" + pegarTempoServer() + "] [" + DAO.nickName + " rolou um dado D" + dado + "] = " + numeroModificado + " {[" + numero + "-" + modificadorMenos + "]}\n");
                break;
            }
            case 3: {
                mensagem = ("[" + pegarTempoServer() + "] [" + DAO.nickName + " rolou um dado D" + dado + "] = " + numero + "\n");
                break;
            }
        }
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, mensagem);
            stmt.setString(2, TelaConfigurarSala.nomeSala);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enviarChatBanco(String texto) {
        final String sql = ("update sala SET chat_sala=concat(chat_sala,(?)) where nome_sala = (?)");
        String mensagem = comando(texto);
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, mensagem);
            stmt.setString(2, TelaConfigurarSala.nomeSala);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fecharSala(Telas.TelaJogo telaJogo, String nomeSala) {
        String sql = ("delete from sala where nome_sala = ?;");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            stmt.execute();
            telaJogo.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void lerChat() {
        final String sql = ("select chat_sala from sala where nome_sala=?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, TelaConfigurarSala.nomeSala);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaJogo.areaDeChat.setText(rs.getString("chat_sala"));
            }
            stmt.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean entrarEmSala(String nomeSala, String senhaSala) {
        pegarSalasDoBanco();
        pegarJogadoresDoBanco();
        final String sql = ("select * from sala where nome_sala =? and senha_sala =?;");
        for (Sala sala : salas) {
            if (sala.getNome_sala().equalsIgnoreCase(nomeSala)) {
                salaAtual = sala;
            }
        }
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            stmt.setString(2, senhaSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TelaConfigurarSala.nomeSala = nomeSala;
                return true;
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void pegarSalasDoBanco() {
        if (!salas.isEmpty()) {
            salas.clear();
        }
        final String sql = ("select * from sala");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Sala sala = new Sala();
                sala.setPk_sala(rs.getInt("pk_sala"));
                sala.setFk_jogador(rs.getInt("fk_jogador"));
                sala.setNome_sala(rs.getString("nome_sala"));
                sala.setSenha_sala(rs.getString("senha_sala"));
                salas.add(sala);
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pegarJogadoresDoBanco() {
        if (!jogadores.isEmpty()) {
            jogadores.clear();
        }
        final String sql = ("select * from jogador");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Jogador jogador = new Jogador();
                jogador.setPk_jogador(rs.getInt("pk_jogador"));
                jogador.setNome_jog(rs.getString("nome_jog"));
                jogador.setEmail_jog(rs.getString("email_jog"));
                jogador.setSenha_jog(rs.getString("senha_jog"));
                jogador.setDt_registro(rs.getDate("dt_registro"));
                jogador.setDt_ultimoLogin(rs.getDate("dt_ultimoLogin"));
                jogadores.add(jogador);
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void associarJogadorASala() {
        final String SqlExists = ("SELECT pk_jog_sal FROM jog_sal WHERE fk_jogador = ? AND fk_sala = ? ");
        try {
            PreparedStatement stmtE = c.prepareStatement(SqlExists);
            stmtE.setInt(1, player.getPk_jogador());
            stmtE.setInt(2, salaAtual.getPk_sala());
            ResultSet rs = stmtE.executeQuery();
            if (!rs.next()) {
                final String sql = ("INSERT INTO jog_sal(fk_jogador, fk_sala, ban) VALUES (?, ?, ?)");
                try {
                    PreparedStatement stmt = c.prepareStatement(sql);
                    stmt.setInt(1, player.getPk_jogador());
                    stmt.setInt(2, salaAtual.getPk_sala());
                    stmt.setInt(3, 0);
                    stmt.execute();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void pegarJogadoresDaSala() {
        final String sql = ("SELECT * FROM jogador jog JOIN jog_sal  js ON jog.pk_jogador = js.fk_jogador WHERE js.fk_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, salaAtual.getPk_sala());
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Jogador jogador = new Jogador();
                jogador.setPk_jogador(rs.getInt("pk_jogador"));
                jogador.setNome_jog(rs.getString("nome_jog"));
                jogador.setEmail_jog(rs.getString("email_jog"));
                jogador.setSenha_jog(rs.getString("senha_jog"));
                jogador.setDt_registro(rs.getDate("dt_registro"));
                jogador.setDt_ultimoLogin(rs.getDate("dt_ultimoLogin"));
                jogadoresAtuais.add(jogador);
                PainelDeControle.caixaJogadores.addItem(jogador.getNome_jog());
            }
            stmt.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public void logar(String email, String senha, TelaLogin tela) {
        pegarJogadoresDoBanco();
        final String sql = ("select * from jogador where email_jog =? and senha_jog = sha1(md5(?));");
        try {
            pegarJogadoresDoBanco();
            Thread pegarVariaveisLocais = new Thread() {
                public void run() {

                    pegarSalasDoBanco();

                }
            };
            pegarVariaveisLocais.start();
            for (Jogador jog : jogadores) {
                if (jog.getEmail_jog().equals(email)) {
                    player = jog;
                    break;
                }
            }
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, SaltedPassword(senha));
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                nickName = rs.getString("nome_jog");
                Telas.TelaInicial.Start();
                tela.setVisible(false);
            } else {
                System.out.println("Falha ao efetuar login: Credenciais incorretas");
                tela.erroLogin.setVisible(true);
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean verificarEmail(String email) {
        pegarJogadoresDoBanco();
        final String sql = ("select * from jogador");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String emailAux = rs.getString("email_jog");
                if (email.equals(emailAux)) {
                    return true;
                }
            }
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean verificarNomeDeUsuario(String nick) {
        pegarJogadoresDoBanco();
        final String sql = "select * from jogador";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nomeBanco = rs.getString("nome_jog");
                if (nick.equals(nomeBanco)) {
                    stmt.close();
                    return true;
                }
            }
            stmt.close();

        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return false;
    }

    public void modificarUltimoLogin(String login) {
        pegarJogadoresDoBanco();
        final String sql = "UPDATE jogador SET dt_ultimoLogin = now() WHERE email_jog = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.execute();
            stmt.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void modificarChatDaily(String nomeSala, int estado) {
        final String sql = "UPDATE sala SET limpar_chat_daily = ? WHERE nome_sala = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, estado);
            stmt.setString(2, nomeSala);
            stmt.execute();
            stmt.close();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

    public boolean verificarChatDaily(String nomeSala) {
        final String sql = "SELECT limpar_chat_daily FROM sala WHERE nome_sala = ?";
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                if (rs.getInt(1) == 1) {
                    return true;
                } else {
                    return false;
                }
            }
            stmt.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public void alterarEstadoBan(int ban, int fk_jogador, int fk_sala) {
        final String sql = ("UPDATE jog_sal SET BAN = ? WHERE fk_jogador = ? AND fk_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, ban);
            stmt.setInt(2, fk_jogador);
            stmt.setInt(3, fk_sala);
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean isBanido(int fk_jogador, int fk_sala) {
        final String sql = ("SELECT ban FROM jog_sal WHERE fk_jogador = ? AND fk_sala = ?");
        try {
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, fk_jogador);
            stmt.setInt(2, fk_sala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                if (rs.getInt("ban") == 1) {
                    return true;
                } else {
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
