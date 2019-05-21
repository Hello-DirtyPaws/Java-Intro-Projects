/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 6 #3
 */
package retailitemdemo;

import java.util.Scanner;

public class RetailItemDemo 
{
    public static void main(String[] args) 
    {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Item description: ");
        String description1 = key.nextLine();
        
        System.out.print("Units on hand: ");
        int unitsOnHand = key.nextInt();
        
        try
        {
            if(unitsOnHand < 0)
            {
                throw new NegativeUnitsException("Error: Negative number given "
                                               + "for the units: " + unitsOnHand);
            }
        }
        catch(NegativeUnitsException nue)
        {
            System.out.println(nue.getMessage());
            System.out.print("Units on hand: ");
            unitsOnHand = key.nextInt();       
        }
        
        System.out.print("Item price: ");
        double price1 = key.nextDouble();
        
        try
        {
            if(price1 < 0)
            {
                throw new NegativePriceException("Error: Negative number given "
                                               + "for the price: " + price1);
            }
        }
        catch(NegativePriceException npe)
        {
            System.out.println(npe.getMessage());
            System.out.print("Item price: ");
            price1 = key.nextDouble();       
        }

        
        RetailItem item1 = new RetailItem(unitsOnHand, description1, price1);
        System.out.println("\n" + item1);
    }
    
}
