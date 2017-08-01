package ConexaoBanco;

import com.mysql.jdbc.Connection;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.*;

public final class ConexaoMySql {

    public static Connection c;
    private Statement statement;
    public static ConexaoMySql connection;
    private String dbPath = null;

    private ConexaoMySql() {

        String OS = System.getProperty("os.name");
        if (OS.equalsIgnoreCase("Linux")) {
            dbPath = "/home/dolsan/Documentos/TCC-RPG-DB/TCC-RPG/TCC-RPG-DB.txt";
        } else {
            dbPath = "C:\\TCC-RPG\\TCC-RPG-DB.txt";
        }
        String[] linhas = new String[4];
        try {

            FileReader reader = new FileReader(dbPath);
            BufferedReader bf = new BufferedReader(reader);
            String line;
            int i = 0;
            while ((line = bf.readLine()) != null) {

                linhas[i] = line;
                i++;

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        String usuario = linhas[0];
        String senha = linhas[1];
        String driver = linhas[2];
        String enderecoBanco = linhas[3];

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
