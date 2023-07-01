package com.mycompany.question_8;

public class Question_8 {

    public static void main(String[] args)
    {
        SavingsAccount saver1 =new SavingsAccount(2000);
        SavingsAccount saver2 =new SavingsAccount(3000);
        
        SavingsAccount.modifyInterestRate(0.04);
         
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.println("Monthly saver1 balance: "+saver1.getsavingsBalance());
        System.out.println("Monthly saver2 balance: "+saver2.getsavingsBalance());
        
        SavingsAccount.modifyInterestRate(0.05);
         
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.println("Monthly saver1 balance: "+saver1.getsavingsBalance());
        System.out.println("Monthly saver2 balance: "+saver2.getsavingsBalance());
    }
}
