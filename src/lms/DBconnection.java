/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author horrorgoogle
 */
public class DBconnection {
    Connection con;
    Statement stat;
    int insert_id;
    
    DBconnection(){
        try {
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS", "root", "");
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
    
    public ResultSet giveMeRs(String sqlstmt){
        ResultSet rs = null;
        try {
            Statement stat = null;
            
            String Sql = sqlstmt;
            stat = con.createStatement();
            rs = stat.executeQuery(Sql);
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
            return rs;
    }
    
    
    
    public int getInsertID(String query){
        Integer numero=0;
        Integer risultato=-1;
        try {
            Statement stmt = con.createStatement();
           numero = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
           //System.out.println(numero);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                risultato=rs.getInt(1);
            }
            rs.close();

            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            risultato=-1;
        }
      return risultato;
    }
    
    
}
