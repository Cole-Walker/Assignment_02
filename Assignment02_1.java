package com.mycompany.assignment02_1;

public class Assignment02_1 
{
    public static void main(String[] args)
    {
        int[] array0 = {1, 5, -5, 2, 12, 30};
        int[] array1 = {-10, 50, 15, 2};
        
        for (int i = 0; i < array0.length; i++)
        {
            for (int j = 0; j < array1.length; j++)
            {
                if(array0[i] == (array1[j]))
                {
                 System.out.println("Common element(s): "+(array1[i]));
                }
            }
        }
    }
}
