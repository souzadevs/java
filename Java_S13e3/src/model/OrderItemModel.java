/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bruno Araujo
 */
public class OrderItemModel
{
    private int quantity;
    private double price;
    
    private ProductModel product;
    
    public double subTotal()
    {
        return this.quantity * this.price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public ProductModel getProduct()
    {
        return product;
    }

    public void setProduct(ProductModel product)
    {
        this.product = product;
    }
    
    
}
