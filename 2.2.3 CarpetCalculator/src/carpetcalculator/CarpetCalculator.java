/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 2 #3
 */
package carpetcalculator;

import java.util.Scanner;

public class CarpetCalculator 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter the length: ");
        double length = key.nextDouble();
        
        System.out.print("Please enter the width: ");
        double width = key.nextDouble();
        
        RoomDimension dimension = new RoomDimension(length, width);
        RoomCarpet cost = new RoomCarpet(8, dimension);
        System.out.println(dimension + "\n" + cost);
    }
    
}
