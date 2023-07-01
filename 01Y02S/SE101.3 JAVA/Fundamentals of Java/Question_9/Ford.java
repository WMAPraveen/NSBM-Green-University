package com.mycompany.question_9;


public class Ford extends Car
{
    int year;
    int manufacturerDiscount;
  public Ford(int speed, double regularPrice, String color, int year,int manufacturerDiscount)
  {
      super(speed, regularPrice, color);
      this.manufacturerDiscount= manufacturerDiscount;
      this.year= year;
  }
  @Override
  public void getSalePrice()
  {
      double Discount = regularPrice*0.2;
      double salePrice = regularPrice - Discount - manufacturerDiscount;
       System.out.println("Sale Price: "+salePrice);
  }
  
    /*@Override
  public double getSalePrice()
  {
      double salePrice =super.getSalePrice();
      double price = salePrice  - manufacturerDiscount;
     return price;
  }*/
  
          
}
