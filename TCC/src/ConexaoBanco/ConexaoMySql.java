package ConexaoBanco;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.*;

public final class ConexaoMySql {

    public static Connection c;
    private Statement statement;
    public static ConexaoMySql connection;
    private String dbPath = null;

    private ConexaoMySql() {
//
//        String OS = System.getProperty("os.name");
//        if (OS.equalsIgnoreCase("Linux")) {
//            dbPath = "/home/dolsan/Documentos/TCC-RPG-DB/TCC-RPG/TCC-RPG-DB.txt";
//        } else {
//            dbPath = "C:\\TCC-RPG\\TCC-RPG-DB.txt";
//        }
//        String[] linhas = new String[4];
//        try {
//
//            FileReader reader = new FileReader(dbPath);
//            BufferedReader bf = new BufferedReader(reader);
//            String line;
//            int i = 0;
//            while ((line = bf.readLine()) != null) {
//
//                linhas[i] = line;
//                i++;
//
//            }
//            reader.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String usuario = "schork_dolsan";
        String senha ="dh4_fT2kl@d";
        String driver ="com.mysql.jdbc.Driver";
        String enderecoBanco = "schork_dolsan.mysql.dbaas.com.br:3306/schork_dolsan";

        try {
            Class.forName(driver).newInstance();
            ConexaoMySql.c = (Connection) DriverManager.getConnection("jdbc:mysql://" + enderecoBanco, usuario, senha);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex) {
        }
    }

    public static synchronized Connection getConnection() {
        if (connection == null) {
            connection = new ConexaoMySql();
        }
        return c;

    }

}
