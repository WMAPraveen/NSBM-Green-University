package com.mycompany.practical_03;

public class Employee_Constructer 
{
     private String name;
    private int age;
    private float salary;
    
    public Employee_Constructer (String n,int a,float s)
    {
        this.name = n;
        this.age = a;
        this.salary = s;
    }
     public String getname()
    {
        return name;
    }
      public int getage()
    {
        return age;
    }
      public float getsalary()
    {
        return salary;
    }
}
