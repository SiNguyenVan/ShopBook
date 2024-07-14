/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sinan
 */
public class Shipper {

    private int ShipID;
    private String ShipName;

    public Shipper(int ShipID, String ShipName) {
        this.ShipID = ShipID;
        this.ShipName = ShipName;
    }

    public int getShipID() {
        return ShipID;
    }

    public void setShipID(int ShipID) {
        this.ShipID = ShipID;
    }

    public String getShipName() {
        return ShipName;
    }

    public void setShipName(String ShipName) {
        this.ShipName = ShipName;
    }
    
    
    
}
