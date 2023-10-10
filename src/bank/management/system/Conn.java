package bank.management.system;

import java.sql.*;

/**
 *
 * @author Hridoy
 */
public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","1234");
            s = c.createStatement();
            
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
    
}
