package com.mycompany.question_2;

import java.util.Scanner;
public class InputOutput_I
{
    Scanner sc = new Scanner(System.in);
    private int no1,no2,no3,product;
    
    public void setvalues()
    {
        System.out.print("Enter first number: ");
        no1 = sc.nextInt();
        System.out.print("Enter second number: ");
        no2 = sc.nextInt();
        System.out.print("Enter third number: ");
        no3 = sc.nextInt();
      }
    
    public void display()
    {
        product = no1*no2*no3;
        System.out.println("The product is: "+product);
    }
}
