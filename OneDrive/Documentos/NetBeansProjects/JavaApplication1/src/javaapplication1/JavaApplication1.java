/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import BD.Conexion;

/**
 *
 * @author mauri
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello world");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "bmorales";
        String pass = "bmorales";
        try{
            
            Conexion conn = new Conexion( user, pass);
            String pruebaSQL = "SELECT * FROM prueba@pruebaconexion";
            BD.Conexion.pruebacon(conn.getConn(), pruebaSQL);
            //pst = conn.prepareStatement(pruebaSQL);
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
}
