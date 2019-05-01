
package bulletin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
   
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/bulletin";
    private String user = "root";
    private String pass = "godpro";

    public Connection getConnection() throws SQLException {
        connection = DriverManager.getConnection(url,user,pass);
       /* System.out.println("Database connected!");*/
        return connection;
    }
}
    
