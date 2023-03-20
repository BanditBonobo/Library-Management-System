/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author User
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lmsdatabases","root","");
            return con;
        }
        catch(Exception ex)
        {
            System.out.println(ex);
            return null;
        }
    }
}
