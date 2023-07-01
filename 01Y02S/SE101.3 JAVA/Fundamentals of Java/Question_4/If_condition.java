package com.mycompany.question_4;

import java.util.Scanner;
public class If_condition 
{
    Scanner sc = new Scanner(System.in);
     
    private int no1,no2,no3;
    private int smallest,largest,sum,product;
    private float average;
    
    public void setvalues()
    {
        System.out.print("Enter first number: ");
        no1 = sc.nextInt();
        System.out.print("Enter second number: ");
        no2 = sc.nextInt();
        System.out.print("Enter third number: ");
        no3 = sc.nextInt();
    }
    public void sum()
    {
        sum = no1+ no2 + no3  ;
        System.out.println("The sum is: "+sum);
    }
    public void average()
    {
        average = sum/3;
        System.out.println("The average is: "+average);
    }
    public void product()
    {
        product = no1*no2*no3;
        System.out.println("The product is: "+product);
    }
    public void smallest()
    {
        smallest = no1;
        
        if(no2<smallest)
        {
            smallest = no2;
         }
         if(no3<smallest)
        {
            smallest = no3;
         }
         
         System.out.println("The smallest number is: "+smallest);
    }
    public void largest()
    {
        largest = no1;
        
        if(no2>largest)
        {
            largest = no2;
        }
        
         if(no3>largest)
        {
            largest = no3;
         }
         
         System.out.println("The largest number is: "+largest);
    }
}
