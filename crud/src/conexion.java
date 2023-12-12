/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Juana
 */
public class conexion {

   Connection cn;
   
   public Connection conexion(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           cn = DriverManager.getConnection("jdbc:mysql://localhost/computadoras", "root" , "");
           System.out.println("Conectado");
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       
       return cn;
   }
    
}
