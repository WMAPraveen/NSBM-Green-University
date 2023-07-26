package com.mycompany.practical_03_q2;

public class Practical_03_Q2
{

    public static void main(String[] args) 
    {
        Employee E1 = new Employee("Avishka",8000.00,2000.00);
        
        System.out.println("Employee Name:"+E1.getname());
        System.out.println("Salary:"+E1.getsalary());
        System.out.println("Bonus:"+E1.getbonus());
        System.out.println("Bonus Amount:"+E1.getbonusamount());
    }
}
