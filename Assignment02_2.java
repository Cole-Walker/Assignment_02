package com.mycompany.assignment02_2;

public class Assignment02_2 
{
    public static void main(String[] args)
    {
        int[] array0 = {1, 77, -5, 2, 65, 30};
        int[] array1 = {-10, 50, 15, 2, 77};
        
        System.out.println("Result: " + iterate0(array0) + " " + iterate1(array1));
    }
    
    public static boolean iterate0(int[] array0)
    {
    for (int i = 0; i < array0.length; i++)
        {
            for (int j = 0; j < array0.length; j++)
            {
                if (array0[i] == 65 && array0[j] == 77)
                {
                    return true;
                }
            }      
        }
        return false;
    }
    
    public static boolean iterate1(int[] array1)
    {
    for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array1.length; j++)
            {
                if (array1[i] == 65 && array1[j] == 77)
                {
                    return true;
                }
            }      
        }
        return false;
    }
}
