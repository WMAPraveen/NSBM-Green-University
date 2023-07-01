package com.mycompany.question_9;

public class Truck extends Car {

    private int weight;
   

    public Truck(int speed, double regularPrice, String color,int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
        
    }

    @Override
    public void getSalePrice() 
    {
        if (weight > 2000) {
            double discount = regularPrice * 0.1;
            double salePrice =regularPrice - discount;
            System.out.println("Sale Price"+salePrice);
     } 
        else {
                     double discount = regularPrice* 0.2;
                    double salePrice = regularPrice - discount;
                     System.out.println("Sale Price"+salePrice);
                 }
    }
    public void display()
    {
        System.out.println("Speed "+speed+"\nRegular Price "+regularPrice+"\nColor "+color);
    }
    
}
