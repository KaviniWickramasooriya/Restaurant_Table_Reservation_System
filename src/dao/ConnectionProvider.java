package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Kavini
 */
public class ConnectionProvider {
    public static Connection getCon (){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant", "root", "1234");
            return con;
        }
        catch (Exception e){
            e.printStackTrace(); // Print the stack trace for debugging
            return null;
        }
    }
}