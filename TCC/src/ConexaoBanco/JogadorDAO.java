package ConexaoBanco;

import Objetos.Jogador;
import Objetos.Sala;
import Telas.TelaConfigurarSala;
import Telas.TelaJogo;
import Telas.TelaLogin;
import Telas.TelaRegistrar;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JogadorDAO {

    public static Jogador player = null;
    public static Sala salaAtual = null;
    public static String nickName = "";
    public static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    public static ArrayList<Sala> salas = new ArrayList<Sala>();

    public static String SaltedPassword(String unecryptedPassword) {

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

    public static void criarJogador(Jogador jogador, TelaRegistrar tela) {
        String sql = "insert into jogador(nome_jog, email_jog, senha_jog, dt_registro, dt_ultimoLogin) values(?,?,md5(sha1(md5(sha1(md5(?))))),now(),now())";
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, jogador.getNome_jog());
            stmt.setString(2, jogador.getEmail_jog());
            stmt.setString(3, SaltedPassword(jogador.getSenha_jog()));
            stmt.execute();
            tela.labelRegistrado.setVisible(true);
            tela.dispose();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void listarJogadores(Jogador jogador) {
        final String sql = ("select * from jogador;");
        try {
            Connection c = FabricaDeConexao.getConnection();
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
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static boolean salaExiste(String nomeSala) {
        String sql = "SELECT nome_sala FROM sala WHERE nome_sala = ?";
        try {
            Connection c = FabricaDeConexao.getConnection();
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

    public static boolean verificarDono() {
        String sql = ("SELECT * FROM sala WHERE dono_sala = ?");
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, player.getPk_jogador());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void criarSala(TelaConfigurarSala tela, String nomeSala, String senhaSala) {
        String sql = "insert into sala(nome_sala, senha_sala, dono_sala, chat_sala) values(?,?,?,?)";
        for (Sala sala : salas) {
            if (sala.getNome_sala().equalsIgnoreCase(nomeSala)) {
                salaAtual = sala;
            }
        }
        for (Jogador jogador : jogadores) {
            if (jogador.getNome_jog().equalsIgnoreCase(player.getNome_jog())) {
                int pk_dono = jogador.getPk_jogador();
                try {
                    Connection c = FabricaDeConexao.getConnection();
                    PreparedStatement stmt = c.prepareStatement(sql);
                    stmt.setString(1, nomeSala);
                    stmt.setString(2, senhaSala);
                    stmt.setInt(3, pk_dono);
                    stmt.setString(4, " ");
                    stmt.execute();
                    tela.dispose();
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void enviarChatBanco(String texto) {
        final String sql = ("update sala SET chat_sala=concat(chat_sala,(?)) where nome_sala = (?)");
        String mensagem = ("[" + JogadorDAO.nickName + "]: " + texto + "\n");
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, mensagem);
            stmt.setString(2, TelaConfigurarSala.nomeSala);
            stmt.execute();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fecharSala(Telas.TelaJogo telaJogo, String nomeSala) {
        String sql = ("delete from sala where nome_sala = ?;");
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            stmt.execute();
            telaJogo.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void lerChat() {
        final String sql = ("select chat_sala from sala where nome_sala=?");
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, TelaConfigurarSala.nomeSala);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                TelaJogo.areaDeChat.setText(rs.getString("chat_sala"));
            }
            stmt.close();
            rs.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean entrarEmSala(String nomeSala, String senhaSala) {
        final String sql = ("select * from sala where nome_sala =? and senha_sala =?;");
        for (Sala sala : salas) {
            if (sala.getNome_sala().equalsIgnoreCase(nomeSala)) {
                salaAtual = sala;
            }
        }
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, nomeSala);
            stmt.setString(2, senhaSala);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                TelaConfigurarSala.nomeSala = nomeSala;
                return true;
            }
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private void pegarSalasDoBanco() {
        final String sql = ("select * from sala");
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Sala sala = new Sala();
                sala.setPk_sala(rs.getInt("pk_sala"));
                sala.setNome_sala(rs.getString("nome_sala"));
                sala.setSenha_sala(rs.getString("senha_sala"));
                sala.setDono_sala(rs.getString("dono_sala"));
                salas.add(sala);
            }
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void pegarJogadoresDoBanco() {
        final String sql = ("select * from jogador");
        try {
            Connection c = FabricaDeConexao.getConnection();
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
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logar(String email, String senha, TelaLogin tela) {

        final String sql = ("select * from jogador where email_jog =? and senha_jog = md5(sha1(md5(sha1(md5(?)))));");
        try {
            Connection c = FabricaDeConexao.getConnection();
            pegarJogadoresDoBanco();
            pegarSalasDoBanco();
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
                tela.erroLogin.setVisible(true);
            }
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static boolean verificarEmail(String email) {
        final String sql = ("select * from jogador");
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String emailAux = rs.getString("email_jog");
                if (email.equals(emailAux)) {
                    return true;
                }
            }
            stmt.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean verificarNomeDeUsuario(String nick) {
        final String sql = "select * from jogador";
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nomeBanco = rs.getString("nome_jog");
                if (nick.equals(nomeBanco)) {
                    return true;
                }
            }
            stmt.close();
            c.close();

        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return false;
    }

    public static void modificarUltimoLogin(String login) {
        final String sql = "UPDATE jogador SET dt_ultimoLogin = now() WHERE email_jog = ?";
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, login);
            stmt.execute();
        } catch (Exception erro) {
            erro.printStackTrace();
        }
    }

}
