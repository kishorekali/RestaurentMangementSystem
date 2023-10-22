/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication30;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class database {

    public static Connection connectDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // CONNECT YOUR DATABASE
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/jdbc","kishore","Kishore123@");
            return connect;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}

