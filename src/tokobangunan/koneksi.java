/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobangunan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ivan
 */
public class koneksi {
     private Connection koneksi;
    public Connection Koneksi(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); //nama library yg telah dibuat 
        System.out.println("Berhasil Koneksi"); //berhasil konek ke myql
    }   catch (ClassNotFoundException ex) {
            System.out.println("Gagal koneksi"+ex); //tidak berhasil konek ke myql
        }
    String url="jdbc:mysql://localhost/bangunan?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    //letak databse
    try {
        koneksi = DriverManager.getConnection(url,"root","");//koneksi ke database
        System.out.println("berhasil Koneksi Database");
    }   catch (SQLException ex) {
            System.out.println("Gagal Koneksi Database"+ex);
        }
    return koneksi;
        }
}
