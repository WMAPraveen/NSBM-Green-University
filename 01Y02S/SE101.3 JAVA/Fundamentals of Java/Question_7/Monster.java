package com.mycompany.question_7;

public class Monster extends Item
{  private int number;
    private String add;
    
    public Monster(int location, String description, int number, String add)
    {
         super(location,description);
        this.number = number;
         this.add = add;
         
    }
    public void display()
    {
        System.out.println("Location "+location+"\n Description"+description+"\n Number "+number+"\n Address"+add);
    }
    
}
