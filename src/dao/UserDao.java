/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.User;
/**
 *
 * @author Kavini
 */
public class UserDao {
    public static void save(User user){
        String query = "insert into user(name,email,mobile,password) values('"+user.getName()+"')";
        
    }
}