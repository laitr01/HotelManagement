/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vu_guest;

import connection.DbConnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author KeVin
 */
public class CustomerDao {
    CustomerEnity cus;
    DbConnect db;
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    String identifier,fullname,gender,company,address,phone,email,status;
    Date age;
    int cusID;
    
    Vector<CustomerEnity> cuscollection;
    
    public CustomerDao(){
        db=new DbConnect("sa", "");
        db.createConnect();
        st=db.getStsm();
        con=db.getCon();
        cuscollection =new Vector<>();
        
    }
    public Vector<CustomerEnity> getCuscollection(){
        try {
            sql="select * from Customer";
            rs=st.executeQuery(sql);
            while(rs.next()){
                cusID=rs.getInt(1);
                identifier=rs.getString(2);
                age=rs.getDate(3);
                fullname=rs.getString(4);
                gender=rs.getString(5);
                company=rs.getString(6);
                address=rs.getString(7);
                status=rs.getString(8);
                phone=rs.getString(9);
                email=rs.getString(10);
                cus=new CustomerEnity(identifier, fullname, gender, company, address, phone, email, status, age, cusID);
                cuscollection.add(cus);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cuscollection;
    }
    public int insertCustomer(){
        return -1;
    }
}
