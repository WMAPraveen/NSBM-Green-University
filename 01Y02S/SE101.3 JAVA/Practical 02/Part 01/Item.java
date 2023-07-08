package com.mycompany.mainitem;

// Question 1
public class Item 
{
    private int location;
    private String description;
    
//Question 2
    public Item(int location, String description)
    {
        // Question 3
        this.location = location;
        this.description = description;
    }
    
    // Question 4
    public void setLocation(int location)
    {
        this.location = location;
    }
    
    public int getLocation()
    {
        return location;
    }
    
    public void setDescription(String description)
    {
       this.description = description;
    }
    
    public String getDescription()
    {
        return description;
    }
}
