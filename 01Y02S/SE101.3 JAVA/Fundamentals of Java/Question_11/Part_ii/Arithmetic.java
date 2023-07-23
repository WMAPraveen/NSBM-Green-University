package com.mycompany.question_11_i;

public class Arithmetic implements Test
{ 
    private int a;
    @Override
    public void square(int num)
    {
      a =   num;
     }
    public int getresult()
    {
        return a*a;
    }
}
