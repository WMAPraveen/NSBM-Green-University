
package com.mycompany.question_9;


public class Sedan extends Car
{
    int length;
    
    public Sedan(int speed, double regularPrice, String color, int length)
    {
        super(speed, regularPrice, color);
        this.length=length;
     }
    @Override
    public void getSalePrice()
    {
        if(length>20)
        {
            double Discount = regularPrice*0.05;
            double salePrice = regularPrice - Discount;
             System.out.println("Sale Price"+salePrice);
        }
        else
        {
            double Discount = regularPrice*0.1;
            double salePrice = regularPrice - Discount;
             System.out.println("Sale Price"+salePrice);
        }
    }
}
