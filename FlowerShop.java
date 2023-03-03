/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.homework1;

public class FlowerShop extends Store{
    
    private String flowerName, condition;
    
     public FlowerShop(String flowerName, String condition, String goodsName, int productPrice, int quantityOfGoods, String storeSection) {
        super(goodsName, productPrice, quantityOfGoods, storeSection);
        this.flowerName = flowerName;
        this.condition = condition;
     }
 
     public void chooseFlower() {
        System.out.println("A person choose the flower.");
    }
    
    public void sniffingFlower () {
        System.out.println("A person sniffing flower.");
    }
    
    public void sprayWater () {
        System.out.println("A person spray water.");
    }
    
    
    public String getFlowerName(){
        return flowerName;
    }
    
    public void setFlowerName(String flowerName){
        this.flowerName = flowerName;
    }
    
    public String getCondition(){
        return condition;
    }
    
    public void setCondition(String condition){
        this.condition = condition;
    }
    
    @Override
    public String toString() {
        return ("Product: " + getNameOfGoods() + " Price: " + getProductPrice() + " Quantity: " + 
                getQuantityOfGoods() + " Section: " + getStoreSection() + " Flower name - " + getFlowerName() + " Condition - " + getCondition());


    
    }   
}
