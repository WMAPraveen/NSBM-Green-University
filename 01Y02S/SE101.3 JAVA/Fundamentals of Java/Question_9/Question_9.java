

package com.mycompany.question_9;


public class Question_9 {

    public static void main(String[] args) {
        Truck T1 = new Truck(200,500000,"red",5000);
        T1.getSalePrice();
        T1.display();
        
        Ford F1 = new Ford(200,5000000,"Red",2020,50000);
         F1.getSalePrice();
         
         Sedan S1 = new Sedan(300,6000000,"Gold",30);
         S1.getSalePrice();
        
        /*Ford F1 = new Ford(200,5000000,"Red",2020,50000);
         F1.getSalePrice();
         System.out.println("Sale Price"+F1.getSalePrice());*/
    }
}
