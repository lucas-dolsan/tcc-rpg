package ConexaoBanco;

import Telas.TelaLogin;
import Telas.TelaRegistrar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JogadorDAO {

    public static String nickName = "";

    public static void criarJogador(Jogador jogador, TelaRegistrar tela) {
        String sql = "insert into jogador(nome_jog, email_jog, senha_jog, dt_registro, dt_ultimoLogin) values(?,?,md5(?),now(),now())";
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, jogador.getNome_jog());
            stmt.setString(2, jogador.getEmail_jog());
            stmt.setString(3, jogador.getSenha_jog());
            stmt.execute();
            tela.labelRegistrado.setVisible(true);
            tela.dispose();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public static void listarJogadores(Jogador jogador) {
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement("select * from jogador");
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
            System.out.println(e);
            e.printStackTrace();
        }

    }

    public void logar(String email, String senha, TelaLogin tela) {
        tela.labelLogando.setVisible(true);
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement("select * from jogador where email_jog =? and senha_jog = md5(?)");
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                tela.labelLogando.setVisible(false);
                nickName = rs.getString("nome_jog");
                Telas.TelaInicial.Start();
                tela.setVisible(false);
            } else {
                tela.labelLogando.setVisible(false);
                tela.erroLogin.setVisible(true);
            }
            stmt.close();
            c.close();
        } catch (Exception e) {
            tela.labelLogando.setVisible(false);
            tela.labelFalha.setVisible(true);
            System.out.println(e);
            e.printStackTrace();
        }

    }

    public static boolean verificarEmail(String email) {
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement("select * from jogador");
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
            System.out.println(e);
            e.printStackTrace();
        }
        return false;
    }

    public static boolean verificarNomeDeUsuario(String nome) {
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement("select * from jogador");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String nomeAux = rs.getString("nome_jog");
                if (nome.equals(nomeAux)) {
                    return true;
                }
            }
            stmt.close();
            c.close();

        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        return false;
    }

    public static void modificarUltimoLogin(String login) {
        String sql = "UPDATE jogador SET dt_ultimoLogin = now() WHERE email_jog = ?";
        String email = login;
        try {
            Connection c = FabricaDeConexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.execute();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
