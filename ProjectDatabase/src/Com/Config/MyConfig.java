/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Com.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author REZQIA NURQALBI
 */
public class MyConfig {
    private Connection Con;
    
    public Connection getConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            
        }
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dt_produk","root","");
            if(Con != null){
                JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
        return Con;
    }
}
