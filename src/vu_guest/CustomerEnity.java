/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vu_guest;

import java.util.Date;



/**
 *
 * @author KeVin
 */
public class CustomerEnity {
    private String identifier,fullname,gender,company,address,phone,email,status;
    private Date age;
    

    public CustomerEnity(String identifier, String fullname, String gender, String company, String address, String phone, String email, String status, Date age) {
        this.identifier = identifier;
        this.fullname = fullname;
        this.gender = gender;
        this.company = company;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.age = age;
        
    }

    public CustomerEnity() {
    }

    
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    
    
}
