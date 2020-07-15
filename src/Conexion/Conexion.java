package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static String login = "root";
    private static String pass = "1234";
    private final String url = "jdbc:mysql://localhost/cursos?relaxAutoCommit=true";

    public Connection getConeccion(Connection conn) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, pass);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Conexion no realizada");
        }

        return conn;
    }
}
