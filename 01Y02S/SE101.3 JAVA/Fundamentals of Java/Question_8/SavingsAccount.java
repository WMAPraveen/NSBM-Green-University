package com.mycompany.question_8;

public class SavingsAccount 
{
    private static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }
    
    public void calculateMonthlyInterest()
    {
       double  monthlyInterest = (annualInterestRate*savingsBalance)/12;
       savingsBalance += monthlyInterest;
    }
    
    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate = newInterestRate;
    }
    
    public double getsavingsBalance()
    {
        return  savingsBalance;
    }
}
