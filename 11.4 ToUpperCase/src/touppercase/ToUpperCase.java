//SURAJ UPADHYAY
//CSC 161-01
//LAB 11 #4

package touppercase;

import java.util.Scanner;

public class ToUpperCase 
{
    public static void main(String[] args) 
    {
        display(input());
    }
    
    public static String input()
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a string to convert it to uppercase --> ");
        String str = key.nextLine();
        
        return str;
    }
    
    public static void display(String str)
    {
        System.out.print("The string \"" + str + "\" in uppercase is written as ");
        for(int i = 0; i < str.length(); i++)
        {
            System.out.print(toUppercase(str)[i]);
        }
        System.out.println(".");
    }
    
    public static char [] toUppercase(String str)
    {
        str = str.toUpperCase();
        char [] charArry = new char[str.length()];
        
        for(int i = 0; i < str.length(); i++)
        {
            charArry [i] = str.charAt(i);
        }
        
        return charArry;
    }
    
}
