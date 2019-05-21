//SURAJ UPADHYAY
//CSC 161-01
//LAB 5 #6

package rootfinder;

import java.util.Scanner;

public class RootFinder 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Please enter the value of a(the coefficeint of x^2): ");
        double a = key.nextDouble();
        
        System.out.print("Please enter the value of b(the coefficient of x)  : ");
        double b = key.nextDouble();
        
        System.out.print("Please enter the value of c(the constant term)     : ");
        double c = key.nextDouble();
        
        //Calculating the disciminant value.
        double discriminant = (b*b - 4*a*c);
        
        //Display the type of roots.
        if(discriminant == 0)
        {
            System.out.println("The equation has a single (repeated) roots.");
        }
        else if(discriminant < 0)
        {
            System.out.println("The equation has 2 complex roots.");
        }
        else
        {
            System.out.println("The equation has 2 real roots.");
            
            //Calculte the two real roots of the equation.
            double r1 = (-b + Math.sqrt(discriminant))/2*a;
            double r2 = (-b - Math.sqrt(discriminant))/2*a;
            
            //Printing out the roots.
            System.out.printf("ROOT 1: %.3f\n", r1);
            System.out.printf("ROOT 2: %.3f\n", r2);
        }
    }
    
}
