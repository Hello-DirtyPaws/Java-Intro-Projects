/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 2 #3.2
 */
package carpetcalculator;

import java.text.DecimalFormat;


public class RoomCarpet 
{
    private double carpetCost;
    private RoomDimension size;

    public RoomCarpet(double carpetCost, RoomDimension size) 
    {
        this.carpetCost = carpetCost;
        this.size = size;
    }
    
    public double getTotalCost() 
    {        
        return carpetCost * size.getArea();
    }

    public String toString() 
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        String msg = "The cost of the carpet for the room size of " + size.getArea() + 
                     " sq. feet is $" + df.format(getTotalCost());
        
        return msg;
    }    
}
