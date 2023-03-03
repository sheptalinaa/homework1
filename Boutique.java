/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.homework1;

public class Boutique extends FlowerShop{
    
    private String cloth;
    private int size;
    
    public Boutique(String cloth, int size, String flowerName,  String condition, String goodsName, int productPrice, int quantityOfGoods, String storeSection) {
        super(flowerName, condition, goodsName, productPrice, quantityOfGoods, storeSection);
        this.cloth = cloth;
        this.size = size;
     }
    
    public void chooseCloth() {
        System.out.println("A person choose the cloth.");
    }
    
    public void tryOn() {
        System.out.println("A person try on the cloth.");
    }
    
    public String getCloth(){
        return cloth;
    }
    
    public void setCloth(String cloth){
        this.cloth = cloth;
    }
    
    public int getSize(){
        return size;
    }
    
    public void setSize(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return ("Product:" + getNameOfGoods() + "Price: " + getProductPrice() + "Quantity: " + 
                getQuantityOfGoods() + "Section: " + getStoreSection() + "Flower name - " + getFlowerName() 
                + "Condition - " + getCondition() + "Size - " + getSize() + "Cloth - " + cloth );

    }
    
}
