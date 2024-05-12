package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Kavini
 */
public class Tables {
    public static void main(String[] args){
        try{
            String usertable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200), mobile varchar(10), password varchar(200), UNIQUE (email))";
            DbOperations.setDataOrDelete(usertable, "User Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}