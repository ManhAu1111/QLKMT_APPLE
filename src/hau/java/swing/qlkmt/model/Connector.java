/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hau.java.swing.qlkmt.model;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class Connector {
    public static Connection getConnection() {
        Connection connect = null;
        try {
            // Begin connect database
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/qlkmt_apple", 
                "root", 
                ""
            );
            System.out.println("Connect database success!");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}