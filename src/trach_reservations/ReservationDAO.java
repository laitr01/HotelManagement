/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trach_reservations;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;


/**
 *
 * @author Administrator
 */
public class ReservationDAO {
    ReservationEntity res;
    DbConnect db;
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    int ResID; String status; Date checkInDate; 
    Date checkOutDate; int roomID; int cusIS; 
    int total; int paid; int balance;
    
    Vector<ReservationEntity> resCollection;
    
    public ReservationDAO() {
        db = new DbConnect("sa", "root");
        db.createConnect();
        st = db.getStsm();
        con = db.getCon();
        resCollection = new Vector<>();
            }
    public Vector<ReservationEntity> getResCollection(){
        try {
            sql = "select * from Reservation";
            rs = st.executeQuery(sql);
            while(rs.next()){
                ResID = rs.getInt(1);
                status = rs.getString(2);
                checkInDate = rs.getDate(3);
                checkOutDate = rs.getDate(4);
                total = rs.getInt(5);
                paid = rs.getInt(6);
                balance = rs.getInt(7);
                res = new ReservationEntity(ResID, status, checkInDate, checkOutDate, 
                        roomID, cusIS, total, paid, balance);
                resCollection.add(res);
            }
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, ex.getMessage());
            ex.printStackTrace();
        }
        return resCollection;
    }
    public int insertResevation(){
        
        return -1;
    }
}
