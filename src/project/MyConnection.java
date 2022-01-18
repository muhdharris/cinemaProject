/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

//import com.sun.jdi.connect.spi.Connection;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author U S E R
 */
public class MyConnection {
    
    private static String servername = "localhost";
    private static String email = "root";
    private static String dbname = "myproject";
    private static int portnumber = 3306;
    private static String password = "";
    public static Connection getConnection(){
    
        Connection con = null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(email);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            con = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection ->"+MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
        
        }
            
}
    


