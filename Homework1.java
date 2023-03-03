/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.homework1;
import java.util.Scanner;

public class Homework1{

   public static void main (String [] args) {
       Scanner scan = new Scanner (System.in);
        
       System.out.println("Шепталина Алена Андреевна, РИБО-02-21, 5 Вариант");
       System.out.println("Choose what you need. Enter 1 to enter in store."
               + "Enter 2 to enter in FlowerShop. Enter 3 to enter in Boutique.");
       
       int option = scan.nextInt();
       
       if (option == 1){
           
           System.out.println("Print name of goods: ");
            String goodsName = scan.next();
            System.out.println("Print product price: ");
            int productPrice = scan.nextInt();
            System.out.println("Print quantity of goods: ");
            int quantityOfGoods = scan.nextInt();
            System.out.println("Print store section: ");
            String storeSection = scan.next();
            
           Store str = new Store(goodsName, productPrice, quantityOfGoods, storeSection);
            System.out.println(str.toString());
       }
       
       
       
       if (option == 2){
           System.out.println("Print name of goods: ");
            String goodsName = scan.next();
            System.out.println("Print product price: ");
            int productPrice = scan.nextInt();
            System.out.println("Print quantity of goods: ");
            int quantityOfGoods = scan.nextInt();
            System.out.println("Print store section: ");
            String storeSection = scan.next();
            
            System.out.println("Print the name of cloth: ");
            String flowerName = scan.next();
            System.out.println("Print the size: ");
            String condition = scan.next();
            
            
            FlowerShop fwl = new FlowerShop(flowerName, condition, goodsName, productPrice, quantityOfGoods, storeSection);
            System.out.println(fwl.toString());
   } 
       
       
       if (option == 3){
           System.out.println("Print name of goods: ");
            String goodsName = scan.next();
            System.out.println("Print product price: ");
            int productPrice = scan.nextInt();
            System.out.println("Print quantity of goods: ");
            int quantityOfGoods = scan.nextInt();
            System.out.println("Print store section: ");
            String storeSection = scan.next();
            
            System.out.println("Print the name of cloth: ");
            String flowerName = scan.next();
            System.out.println("Print the size: ");
            String condition = scan.next();
            
            System.out.println("Print the name of cloth: ");
            String cloth = scan.next();
            System.out.println("Print the size: ");
            int size = scan.nextInt();
            
            Boutique btq = new Boutique(cloth, size, flowerName, condition, goodsName, productPrice, quantityOfGoods, storeSection);
            System.out.println(btq.toString());
       }
    }
}
