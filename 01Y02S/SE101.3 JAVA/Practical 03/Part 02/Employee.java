
package com.mycompany.practical_03_q2;

public class Employee 
{
    private String EmpName;
    private double Bsalary, Bonus;
    
    public Employee(String name,double salary,double bonus)
    {
        this.EmpName = name;
        this.Bsalary = salary;
        this.Bonus = bonus;
    }
    
    public String getname()
    {
        return EmpName;
    }
    
    public double getsalary()
    {
        return Bsalary;
    }
    
    public double getbonus()
    {
        return Bonus;
    }
    
    public double getbonusamount()
    {
        return Bsalary+Bonus;
    }
}
