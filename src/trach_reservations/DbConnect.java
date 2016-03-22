/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trach_reservations;


import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class DbConnect {
    String url = "jdbc:sqlserver://localhost:1433;database=DemoHotel";
    private Connection con;
    private Statement stsm;
    String userName, password;
    public DbConnect(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
   
    public void createConnect(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url, userName, password);
            stsm = con.createStatement();
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
    }
    public void closeConnect() throws SQLException, Exception{
        stsm.close();
        con.close();
    }

    public Connection getCon() {
        return con;
    }

    public Statement getStsm() {
        return stsm;
    }
}
