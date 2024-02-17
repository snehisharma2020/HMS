
package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;  

public class conn{
    Connection c;
    Statement s;
    public conn(){

        try {

            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem", "root", "rootpassword_123");
            s = c.createStatement();
            System.out.println("Hello Connected.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  
}  

