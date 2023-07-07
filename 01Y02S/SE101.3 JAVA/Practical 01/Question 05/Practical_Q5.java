package com.mycompany.practical_q5;

// 5. Write a class and insert the following code block into the appropriate place. Execute the code and get the result.

public class Practical_Q5 {

    public static void main(String[] args) 
    {
        char grade ='A';
switch(grade)
{
case 'A' :
 System.out.println("Excellent!"); 
break;
case 'D' :
System.out.println("You passed");
case 'F' :
System.out.println("Better try again");
break;
default :
System.out.println("Invalid grade");
}
System.out.println("Your grade is " + grade);

   

/*Result Excellent
              Your grade is A*/

  // Repeat the same removing “break” command at line number 6. Write down the output.
  
  
switch(grade)
{
case 'A' :
 System.out.println("Excellent!"); 
case 'D' :
System.out.println("You passed");
case 'F' :
System.out.println("Better try again");
break;
default :
System.out.println("Invalid grade");
}
System.out.println("Your grade is " + grade);

/*Result    Excellent!
                   You passed
                   Better try again
                   Your grade is A */

// Repeat the same scenario by using if-else-if statement instead of switch case.

if(grade=='A')
 {System.out.println("Excellent!");}
 else if (grade=='D')
 {System.out.println("You passed");}
 else if (grade=='F')
 {System.out.println("Better try again");}
 else
 {System.out.println("Invalid grade");}
 System.out.println("Your grade is " + grade);

    }
}