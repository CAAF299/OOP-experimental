package com.github.CAAF299.ListTest1.classes;


public class EntryObject {
    
    private String productName;
    private String brand;
    private double price;
    private int id;
    
    
    public EntryObject(){}
    
    public EntryObject(String productName, String brand, double price, int id){
    
    this.productName = productName;
    this.brand = brand;
    this.price = price;
    this.id = id;
   
        
    }
    
    
    public String getProductName(){
    
    return productName;
    }
 
    public String getBrand(){
    
    return brand;
    
    }
    
    
    public double getPrice(){
        
    return price;
    
    }
    
    public int getId(){
    
    return id;
   
    }
    
    
}
