package com.mycompany.question_3;

import java.util.Scanner;

public class InputOutput_II 
{
    Scanner sc = new Scanner(System.in);
    private double fahrenheit,celsius;
    
    public void setvalue()
    {
        System.out.print("Enter the temperature in fahrenheit: ");
        fahrenheit = sc.nextDouble();
    }
    
    public void display()
    {
        celsius = ((fahrenheit - 32)*5/9);
        System.out.println("The temprature is celsius: "+celsius);
    }
}
