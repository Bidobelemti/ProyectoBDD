/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author mauri
 */
public class Conexion {

    private Connection conn = null;
    private String url, user, pass;

    public Conexion(String user, String pass) {
        this.url = "jdbc:oracle:thin:@localhost:1521:orcl";
        this.user = user;
        this.pass = pass;
    }

    public Connection getConn() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(this.url, this.user, this.pass);
            conn.setAutoCommit(false);
            if (conn != null) {
                System.out.println("Conexion");
                JOptionPane.showMessageDialog(null, "La conexión a la base de datos se realizó de manera satisfactoria",
                        "Conexión exitosa", 1);
            } else {
                JOptionPane.showMessageDialog(null, "La conexión a la base de datos se falló",
                        "Conexión fallida", 2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La conexión a la base de datos falló\n" + e,
                    "Conexión fallida", 2);
        }
        return conn;
    }
    
        public Connection getConnSin() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            conn = DriverManager.getConnection(this.url, this.user, this.pass);
            conn.setAutoCommit(true);
            if (conn != null) {
                System.out.println("Conexion");

            } else {
                System.out.println("error");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return conn;
    }

    public void desconectar() {
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("error");
        }
    }

    public static void pruebacon(Connection con, String sql) {
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
            }
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String connec(Connection con, String sql) {
        String dato = "";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre"));
                dato = rs.getString("nombre");
            }
            pst.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dato;
    }

}
