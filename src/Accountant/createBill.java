/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accountant;

/**
 *
 * @author USER
 */
public class createBill {
    private String productName,buyerId;
    private float unitPrice; 
    private int quantity; 

    public createBill(String productName, String buyerId, float unitPrice, int quantity) {
        this.productName = productName;
        this.buyerId = buyerId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    } 
    
    public float getTotalAmount(){
        float totalAmount = (unitPrice*quantity);
        return totalAmount;
    
    }

    @Override
    public String toString() {
        return ", buyerId=" + buyerId + "productName=" + productName + ", unitPrice=" + unitPrice +"BDT ,"+" quantity=" + quantity + ",Total Amount="+getTotalAmount()+"BDT";
    }
    
} 
