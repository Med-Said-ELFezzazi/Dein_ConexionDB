package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class ConexionBD {
    private Connection conexion;
    public void ConexionBD() throws SQLException {
        String host = "localhost";
        String baseDatos = "aeropuertos";
        String usuario = "admin";
        String password = "mipassword";
        String cadenaConexion = "jdbc:mysql://" + host + "/" + baseDatos+ "?serverTimezone=" + TimeZone.getDefault().getID();
        conexion = DriverManager.getConnection(cadenaConexion, usuario, password);
        conexion.setAutoCommit(true);
    }
    public Connection getConexion() {
        return conexion;
    }
}