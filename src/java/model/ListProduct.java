/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import static dal.DAO.Instance;
import java.util.*;

/**
 *
 * @author sinan
 */
public class ListProduct {
    private static List<Product> pList = new ArrayList<>();
   
    
    private static ListProduct proInstance= new ListProduct();
    public static ListProduct getInstance() {
        return proInstance;
    }
   
    public List<Product> getproductList() {
        return pList;   
    }
    public double getSumPrice() {
       
        
        double tong=0;
        for (Product product : pList) {
            tong+=product.getPrice();
        }
        return tong;
    }
    public List<String> getAllProductName() {
        return pList.stream().map(i->i.getProductName()+"("+i.getQuantity()+  ")").toList();
    }
    public String donhang() {
        String k ="";
        for (String i :getAllProductName()) {
            k+= i+"; ";
        }
        return k;
    }
    public void removeAllProduct() {
        for (int i = 0; i < pList.size(); i++) {
            pList.remove(i);
        }
    }
     public String tachChuoi(String a) {
        String [] arr= a.split("!");
        return arr[0];
    }
     public static void main(String[] args) {
         for (Product pList : getInstance().getproductList()) {
             
         }
    }
     public boolean removeProduct(String pID) {
         for (int i = 0; i < pList.size(); i++) {
             if(pList.get(i).getProductID().equals(pID)){
                 pList.remove(i);
                 return true;
             }
         }
         return false;
     }
     public String tachChuoi2(String a) {
        String [] arr= a.split("!");
        return arr[1];
    }
}
