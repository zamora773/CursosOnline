package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static String login = "postgres";
    private static String pass = "1234";
    private final String url = "jdbc:postgresql://localhost:5432/Cursos";

    public Connection getConeccion(Connection conn) throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, login, pass);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Conexion no realizada");
        }

        return conn;
    }
}
