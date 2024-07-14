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
public class User_Info {
 private int UserID;
private String Username;
private String Password,
FirstName,
LastName,
Phone;
 private String DateOfBirth;
private String CCCD;
private String Address;
private Role RoleID  ;

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Role getRoleID() {
        return RoleID;
    }

    public void setRoleID(Role RoleID) {
        this.RoleID = RoleID;
    }

    public User_Info(int UserID, String Username, String Password, String FirstName, String LastName, String Phone, String DateOfBirth, String CCCD, String Address, Role RoleID) {
        this.UserID = UserID;
        this.Username = Username;
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.DateOfBirth = DateOfBirth;
        this.CCCD = CCCD;
        this.Address = Address;
        this.RoleID = RoleID;
    }


}
