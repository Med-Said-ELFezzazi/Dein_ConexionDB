package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimeZone;

public class ConexionBD {
    private Connection conexion;
    public ConexionBD() throws SQLException {
        String host = "localhost";
        String baseDatos = "aeropuertos";
        String usuario = "admin";
        String password = "password";
        String cadenaConexion = "jdbc:mysql://" + host + "/" + baseDatos+ "?serverTimezone=" + TimeZone.getDefault().getID();
        conexion = DriverManager.getConnection(cadenaConexion, usuario, password);
        conexion.setAutoCommit(true);

    }
    public Connection getConexion() {
        return conexion;
    }
    
    public void CloseConexion() throws SQLException{
    	this.conexion.close();
    }
}