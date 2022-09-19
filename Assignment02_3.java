package com.mycompany.assignment02_3;

public class Assignment02_3 
{
    public static void main(String[] args) 
    {
        char[] array0 = {'s', 'a', 'b', 'a'};
        for (int k = 0; k < array0.length; k++)
        { 
             System.out.print(array0[k] + " "); 
        }
    System.out.println();
    rev_Char(array0, array0.length);
    }
    
    public static void rev_Char(char array0[], int num)
    {
        char[] test_Array = new char[num]; 
        int j = num; 
        for (int i = 0; i < num; i++) 
        { 
            test_Array[j - 1] = array0[i];
            j = j - 1; 
        } 
 
        System.out.println("Reversed array: "); 
        for (int k = 0; k < num; k++) 
        { 
           System.out.print(test_Array[k] + " "); 
        }
    }
}
