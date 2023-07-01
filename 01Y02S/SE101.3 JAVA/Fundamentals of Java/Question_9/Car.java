package com.mycompany.question_9;

public class Car {

    protected int speed;
    protected double regularPrice;
    protected String color;
    
   
   public Car(int speed, double regularPrice, String color)
   {
       this.speed=speed;
       this.regularPrice=regularPrice;
       this.color=color;
   }
   public void getSalePrice()
   {
       
   }
   
    /*public double getSalePrice()
    {
      double Discount = regularPrice*0.2;
      double salePrice = regularPrice - Discount;
      return salePrice;
        
     }*/

}
