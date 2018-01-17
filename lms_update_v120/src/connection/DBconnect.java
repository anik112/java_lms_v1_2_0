/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anik
 */
public class DBconnect {
    
    private final static String BasedUrl="jdbc:mysql://";
    private final static String host="localhost";
    private final static String port="3306";
    private final static String dbName="lms_update_v120";
    private final static String url=BasedUrl+host+":"+port+"/"+dbName;
    private static Connection connection=null;
    
    
    public static Connection getConnection(){
        
        try {
            
           // Class.forName("com.mysql.jdbc.Connection");
            connection=DriverManager.getConnection(url, "root", "12345");
            System.out.println("::Connected::");
            return connection;
        } catch (SQLException /*| ClassNotFoundException */ e) {
            Logger.getLogger(DBconnect.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
}
