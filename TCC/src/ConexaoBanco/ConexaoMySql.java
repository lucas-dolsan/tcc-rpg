
package ConexaoBanco;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.*;

public final class ConexaoMySql {

    public static Connection c;
    private Statement statement;
    public static ConexaoMySql connection;

    private ConexaoMySql() {
        String usuario = "schork_dolsan";
        String senha = "dh4_fT2kl@d";
        String driver = "com.mysql.jdbc.Driver";
        String enderecoBanco = "schork_dolsan.mysql.dbaas.com.br:3306/schork_dolsan";
        try {
            Class.forName(driver).newInstance();
            this.c = (Connection) DriverManager.getConnection("jdbc:mysql://" + enderecoBanco, usuario, senha);
        } catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    public static synchronized Connection getConnection() {
        if (connection == null) {
            connection = new ConexaoMySql();
        }
        return c;

    }

}
