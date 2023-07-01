package com.mycompany.question_5;

import java.util.Scanner;
public class Loop 
{
    Scanner sc = new Scanner(System.in);
    private int[] arry = new int [20];
    private int grade, sum = 0;
    private int count = 0;
    private double average;
            
            public void setvalue()
            {
                System.out.println("Enter up to 20 grades (-1 to stop) ");
                
                while (count < arry.length)
                {
                    grade = sc.nextInt();
                    
                    if(grade == -1)
                    {
                        break;
                    }
                    arry[count] = grade;
                    count++;
                }
            }
            
            public double average()
            {
                if  (count == 0)
                {
                    return 0;
                }
                 
               
                    for(int i=0; i<count; i++)
                    {
                        sum += arry[i];
                        average = sum/count;
                        
                    }
                    return average;
                
            }
    
}
