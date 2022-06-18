package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConsultasServicios extends Conexion{
    
    public boolean Agregar(Servicio sv){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO tbl_servicio (Descripcion, Precio, Tiempo) VALUES (?,?,?)";
        
        try
        {
            ps = con.prepareStatement(sql);
            ps.setString(1, sv.getDescripcion());
            ps.setInt(2, sv.getPrecio());
            ps.setString(3, sv.getTiempo());
            ps.execute();
            return true;
            
        } catch (SQLException e){
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();                //Cerrar la conexion
            } catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
}
