/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jorge
 */
public class CConexion {
    
Connection conectar = null;
    
    String usuario="root";
    String contrasenia="Isaac2014";
    String bd="bdusuarios";
    String ip="localhost";
    String puerto="3306";
    
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contrasenia);
            
           // JOptionPane.showMessageDialog(null, "Se conectó a la BD correctamente");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "NO se conectó a la BD correctamente");
            JOptionPane.showMessageDialog(null, "Conexion Realizada");
        }
    
        return  conectar;
    
    }
    
    public void cerrarConexion(){
   
        try {
            if (conectar!= null && !conectar.isClosed()) {
                
                conectar.close();
               // JOptionPane.showMessageDialog(null, "Conexion Cerrada");
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexion");
        }
   
        
        
    }

    
    
}

