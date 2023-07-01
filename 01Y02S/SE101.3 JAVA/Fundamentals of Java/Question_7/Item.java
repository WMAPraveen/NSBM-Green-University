package com.mycompany.question_7;

public class Item 
{
    protected int location;
    protected String description;
    
    public Item (int location, String description)
    {
        this.location=location;
        this.description=description;
    }
    
    public void setlocation(int location)
    {
        this.location=location;
    }
    public int getlocation()
    {
        return location;
    }
    public void setdescription(String description)
    {
        this.description=description;
    }
    public String getdescription()
    {
        return description;
    }
}
