
package com.mycompany.datetest;


public class Date 
{
    private int month;
    private int date;
    private int year;
    
    public Date(int month, int date,int year)
    {
        this.month=month;
        this.date=date;
        this.year=year;
    }
    
    public void setDate(int d)
    {
        date = d;
    }
    
    public int getDate()
    {
        return date;
    }
    public void setMonth(int m)
    {
        month = m;
    }
    
    public int getMonth()
    {
        return month;
    }
    public void setYear(int y)
    {
        year = y;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void displayDate()
    {
        System.out.println(+date+"/"+month+"/"+year);
    }
    
}
