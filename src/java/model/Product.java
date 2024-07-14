/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sinan
 */
public class Product {
    private String ProductID,ProductName;
    private double Price;
    private String Image;
    private int Quantity;
    private Category Category;
    private String Author;
     public Product() {
         
     }
    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Category getCategory() {
        return Category;
    }

    public void setCategory(Category Category) {
        this.Category = Category;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public Product(String ProductID, String ProductName, double Price, String Image, int Quantity, Category Category, String Author) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.Price = Price;
        this.Image = Image;
        this.Quantity = Quantity;
        this.Category = Category;
        this.Author = Author;
    }

   
}
