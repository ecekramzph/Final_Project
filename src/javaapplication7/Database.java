
package javaapplication7;


import com.sun.jdi.connect.spi.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Database {
    private Connection conn;
    private Statement statement;
    
    public static Connection ConnectDB() {
           String url = "jdbc:mysql://localhost:3306/";
           String dbName="mydatabase";
           String driver="com.mysql.cj.jdbc.Driver";
           String username= "root";
           String password="";
           try {
              Class.forName(driver);
               Connection conn = (Connection) DriverManager.getConnection(url+dbName,"root",password);
               System.out.println("success");
               return conn;
           }
            catch(Exception e)
            {
            JOptionPane.showMessageDialog(null,e);
            return null;
            }
   
}
}
    
    
    
    
