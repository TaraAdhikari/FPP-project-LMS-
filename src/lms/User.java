/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms;


import java.time.LocalDate;


/**
 *
 * @author TaraPrasad
 */
public class User {

    String fname, lname, email, address, password;
    LocalDate dateJoined;
    int type, sex;

    User(String fn, String ln, String add, String ema, String pass, int type, int sex) {
        this.fname = fn;
        this.lname = ln;
        this.email = ema;
        this.password = pass;
        this.address = add;
        this.dateJoined = getDate();
        this.type = type;
        this.sex = sex;
    }

    public int addUser() {
        DBconnection dbcn = new DBconnection();
        String sql = "INSERT into users(staff_type_id, fname, lname, email, password, address, sex, date_added) VALUES('"+this.type+"','"+this.fname+"','"+this.lname+"','"+this.email+"','"+this.password+"','"+this.address+"','"+this.sex+"','"+this.dateJoined+"')";
        int insert_id = dbcn.getInsertID(sql);
        return insert_id;
    }
    
    public static LocalDate getDate(){
        LocalDate today = LocalDate.now();
        return today;
    }
    
//    public static void main(String[] args){
//        User u = new User("aa", "asdf", "sadf", "assfg", "asdfsf", getDate(), 0,0);
//        u.addUser();
//    
//    }
    
    
    

}
