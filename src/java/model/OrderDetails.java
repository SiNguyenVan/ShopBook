/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sinan
 */
public class OrderDetails {
    private Order Order;
    private Product Product;
    private int Quantity;

    public OrderDetails(Order Order, Product Product, int Quantity) {
        this.Order = Order;
        this.Product = Product;
        this.Quantity = Quantity;
    }

    public Order getOrder() {
        return Order;
    }

    public void setOrder(Order Order) {
        this.Order = Order;
    }

    public Product getProduct() {
        return Product;
    }

    public void setProduct(Product Product) {
        this.Product = Product;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    
}
