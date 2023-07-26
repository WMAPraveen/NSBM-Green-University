package com.mycompany.practical_03;

public class Practical_03 
{

    public static void main(String[] args) 
    {
        Employee E1 = new Employee();
        
        E1.setname("Avishka");
        E1.setage(23);
        E1.setsalary(25000.00f);
        
        System.out.println("Employee name:"+E1.getname());
        System.out.println("Age:"+E1.getage());
        System.out.println("Salary:"+E1.getsalary());

    
    Employee_Constructer E2 = new Employee_Constructer("Praveen",22,60000.00f);
    
        System.out.println("Employee name:"+E2.getname());
        System.out.println("Age:"+E2.getage());
        System.out.println("Salary:"+E2.getsalary());
}
}