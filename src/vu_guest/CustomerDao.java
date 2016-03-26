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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
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
    Date age;
    int cusID;
    
    Vector<CustomerEnity> cuscollection;
    
    public CustomerDao(){
        db=new DbConnect("sa", "root");
        db.createConnect();
        st=db.getStsm();
        con=db.getCon();
        cuscollection =new Vector<>();
        
    }
    @Override
    public Vector<CustomerEnity> getCollection(){
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



    @Override
    public void insert(Object obj) {
        try {
            CustomerEnity objCus = (CustomerEnity) obj;
            sql = "insert into Customer([Person Identifier],fullname,gender,company,address,phone,email,status,DOB) "
                    + "values('"+ objCus.getIdentifier() +"','" +objCus.getFullname()+"','"+objCus.getGender()+"','"+ objCus.getCompany()
                    +"','"+objCus.getAddress()+"','"+objCus.getPhone()+"','"+objCus.getEmail()+"','"+objCus.getStatus() +"',"+objCus.getAge()+ ")";
            st.execute(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
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
//    public static void main(String[] args) {
//        CustomerDao cusDAO = new CustomerDao();
//        Vector<CustomerEnity> collection = cusDAO.getCollection();
//        for (CustomerEnity customer : collection) {
//            System.out.println(customer.toString());
//        }
//        CustomerEnity objCus = new CustomerEnity("00000000", "Lai Van Trach", "M", "Neilsen", "Ha huy giap -Q12-HCM", "01283477050", "laivantrachg@mail", "New", new Date(152000));
//        cusDAO.insert((Object) objCus);
//        collection = cusDAO.getCollection();
//        for (CustomerEnity customer : collection) {
//            System.out.println(customer.toString());
//        }
//    }
}
