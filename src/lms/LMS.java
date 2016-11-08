/*
 *
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TaraPrasad
 */
public class LMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Initial startScreen = new Initial();
        startScreen.setVisible(true);
        
//        DBconnection dbcn = new DBconnection();
//        try {
//            ResultSet rs = dbcn.giveMeRs("Select * from users");
//
//            while(rs.next()){
//                System.out.println(rs.getString("fname"));
//            }    
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        }
        
        
        
    }
    
}
