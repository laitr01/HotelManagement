/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vu_guest;

import connection.DbConnect;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import projectinterface.DAOConnection;

/**
 *
 * @author KeVin
 */
public class CustomerDao implements DAOConnection{
    CustomerEnity cus;
    DbConnect db;
    Connection con;
    Statement st;
    ResultSet rs;
    String sql;
    String identifier,fullname,gender,company,address,phone,email,status;
    Date age=new Date();
    java.sql.Date dob=new java.sql.Date(age.getTime());
    
    
    
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
                identifier=rs.getString(2);
                age=rs.getDate(3);
                fullname=rs.getString(4);
                gender=rs.getString(5);
                company=rs.getString(6);
                address=rs.getString(7);
                status=rs.getString(8);
                phone=rs.getString(9);
                email=rs.getString(10);
                cus=new CustomerEnity(identifier, fullname, gender, company, address, phone, email, status, age);
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

    @Override
    public ResultSet getData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void insert() {
        
        try {
             sql="select * from Customer";
             rs=st.executeQuery(sql);
             rs.moveToInsertRow();
             rs.updateString(2, identifier);
             rs.updateDate(3, dob);
             rs.updateString(4, fullname);
             rs.updateString(5, gender);
             rs.updateString(6, company);
             rs.updateString(7, address);
             rs.updateString(8, status);
             rs.updateString(9, phone);
             rs.updateString(10, email);
             rs.insertRow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
  
    

    

    
}
