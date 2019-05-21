/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 5 #1
 */
package pathfinderdemo;

import java.util.Scanner;

public class PathFinderDemo 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("x - cordinate of point A: ");
        int aX = key.nextInt();
        
        System.out.print("y - cordinate of point A: ");
        int aY = key.nextInt();
        
        System.out.print("x - cordinate of point B: ");
        int bX = key.nextInt();
        
        System.out.print("y - cordinate of point B: ");
        int bY = key.nextInt();
        
        PathFinder p = new PathFinder(aX, aY, bX, bY);
        System.out.println(p);
    }
    
}
