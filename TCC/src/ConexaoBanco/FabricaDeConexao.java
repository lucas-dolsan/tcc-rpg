package ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaDeConexao {

    final static String usuario = "schork_dolsan";
    final static String senha = "dh4_fT2kl@d";
    final static String enderecoBanco = "schork_dolsan.mysql.dbaas.com.br:3306/schork_dolsan";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://" + enderecoBanco, usuario, senha);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String args[]) {
        FabricaDeConexao.getConnection();
    }
}
