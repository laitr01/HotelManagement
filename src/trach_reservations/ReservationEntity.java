/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trach_reservations;

import java.sql.Date;

/**
 *
 * @author Administrator
 */
public class ReservationEntity {
    private int ResID;
    private String status;
    private Date checkInDate;
    private Date checkOutDate;
    private int roomID;
    private int cusIS;
    private int total;
    private int paid;
    private int balance;

    public ReservationEntity(int ResID, String status, Date checkInDate, Date checkOutDate, int roomID, int cusIS, int total, int paid, int balance) {
        this.ResID = ResID;
        this.status = status;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomID = roomID;
        this.cusIS = cusIS;
        this.total = total;
        this.paid = paid;
        this.balance = balance;
    }

    public ReservationEntity() {
    }

    public int getResID() {
        return ResID;
    }

    public String getStatus() {
        return status;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public int getRoomID() {
        return roomID;
    }

    public int getCusIS() {
        return cusIS;
    }

    public int getTotal() {
        return total;
    }

    public int getPaid() {
        return paid;
    }

    public int getBalance() {
        return balance;
    }

    public void setResID(int ResID) {
        this.ResID = ResID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public void setCusIS(int cusIS) {
        this.cusIS = cusIS;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
}
