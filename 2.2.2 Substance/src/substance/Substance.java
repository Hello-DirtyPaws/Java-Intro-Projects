/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 2 #2
 */
package substance;

import java.util.Scanner;

public class Substance 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the temperature: ");
        double temp = key.nextDouble();
        
        FreezeBoil fb = new FreezeBoil(temp);
        
        System.out.print(fb);
    }
    
}
