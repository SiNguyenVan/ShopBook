/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author sinan
 */
public class Order {
  private int  OrderID;
private User_Info  UserID;
private String OrderDate;
private Shipper ShipID;
private String ship_address;
private double total;
private Status status;

    public Order(int OrderID, User_Info UserID, String OrderDate, Shipper ShipID, String ship_address, double total, Status status) {
        this.OrderID = OrderID;
        this.UserID = UserID;
        this.OrderDate = OrderDate;
        this.ShipID = ShipID;
        this.ship_address = ship_address;
        this.total = total;
        this.status = status;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public User_Info getUserID() {
        return UserID;
    }

    public void setUserID(User_Info UserID) {
        this.UserID = UserID;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Shipper getShipID() {
        return ShipID;
    }

    public void setShipID(Shipper ShipID) {
        this.ShipID = ShipID;
    }

    public String getShip_address() {
        return ship_address;
    }

    public void setShip_address(String ship_address) {
        this.ship_address = ship_address;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    



}
