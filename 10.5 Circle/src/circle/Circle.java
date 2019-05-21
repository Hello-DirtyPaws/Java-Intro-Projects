//SURAJ UPADHYAY
//CSC 161-01
//LAB 10 #5

package circle;

import java.util.Scanner;

public class Circle 
{
    public static void main(String[] args) 
    {
        askAndDisplay();
    }
    
    public static void askAndDisplay()
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Please enter the x - coordinate for the center of the circle (x1): "); 
        double x1 = key.nextDouble();
        
        System.out.print("Please enter the y - coordinate for the center of the circle (y1): ");
        double y1 = key.nextDouble();
        
        System.out.print("Please enter the x - coordinate for a point on the circle (x2): ");
        double x2 = key.nextDouble();
        
        System.out.print("Please enter the y - coordinate for a point on the circle (y2): ");
        double y2 = key.nextDouble();
        
        System.out.println("\nThe radius between "
                       + "(" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " 
                       + radius(x1, y1, x2, y2) + " units.");
        
        System.out.println("\nThe diameter for the circle with center at "
                       + "(" + x1 + ", " + y1 + ") and a point on the circumference"
                       + " (" + x2 + ", " + y2 + ") is " 
                       + (2 * radius(x1, y1, x2, y2)) + " untis.");
        
        System.out.println("\nThe circumference for the circle with center at "
                       + "(" + x1 + ", " + y1 + ") and a point on the circumference"
                       + " (" + x2 + ", " + y2 + ") is " 
                       + circumference(x1, y1, x2, y2) + " units.");
        
        System.out.println("\nThe area for the circle with center at "
                       + "(" + x1 + ", " + y1 + ") and a point on the circumference"
                       + " (" + x2 + ", " + y2 + ") is " 
                       + area(x1, y1, x2, y2) + " sq. units.");
    }
    
    public static double distance(double x1, double y1, double x2, double y2) 
    {
        double dist;
        
        dist = Math.pow( (Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2) ), 0.5);
        
        dist = Double.parseDouble(String.format("%.3f",dist));
        
        return dist;
    }
    
    public static double radius(double x1, double y1, double x2, double y2)
    {
        return distance(x1, y1, x2, y2);
    }
    
    public static double circumference(double x1, double y1, double x2, double y2)
    {
        double circum = 2 * 3.1416 * radius(x1, y1, x2, y2);
        
        circum = Double.parseDouble(String.format("%.3f",circum));
        
        return circum;
    }
    
    public static double area(double x1, double y1, double x2, double y2)
    {
        double area = 3.1416 * Math.pow(radius(x1, y1, x2, y2), 2);
        
        area = Double.parseDouble(String.format("%.3f", area));
        
        return area;
    }
    
}
