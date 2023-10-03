package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.ConexionBD;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Avion;

public class AvionDao {
    private ConexionBD conexion;

    public ObservableList<Avion> cargarAviones()  {
    	
    	ObservableList<Avion> aviones = FXCollections.observableArrayList();
        try {
            conexion = new ConexionBD();        	
        	String consulta = "select * from aviones where velocidad_maxima=300";
        	PreparedStatement pstmt = conexion.getConexion().prepareStatement(consulta);      
        	ResultSet rs = pstmt.executeQuery();   
				
			 while (rs.next()) {
		            int idAvion = rs.getInt("id");
		            String modelo = rs.getString("modelo");
		            int numeroAsientos = rs.getInt("numero_asientos");
		            int idAeropuerto = rs.getInt("id_Aeropuerto");
		            int activado = rs.getInt("activado");
		            if (activado == 1) {
		                Avion a = new Avion(idAvion, modelo, numeroAsientos, 200, true, idAeropuerto);
		                System.out.println(a.toString());
		                aviones.add(a);
		            } else {
		                Avion a = new Avion(idAvion, modelo, numeroAsientos, 200, false, idAeropuerto);
		                aviones.add(a);
		            }		        
        }             
		rs.close();       
        conexion.CloseConexion();
        
	    } catch (SQLException e) {	    	
	    	e.printStackTrace();
	    }    
        return aviones;    
    }
}
