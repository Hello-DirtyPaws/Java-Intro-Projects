package carpetcalculator;

/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 2 #3.1
 */

import java.text.DecimalFormat;

public class RoomDimension 
{
    private double length;
    private double width;

    public RoomDimension(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    public double getLength() 
    {
        return length;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setLength(double length) 
    {
        this.length = length;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }
        
    public double getArea()
    {
        DecimalFormat df = new DecimalFormat("#.000");
        
        return Double.parseDouble(df.format(length*width));
    }

    public String toString() 
    {
        String msg = "The area of the room with length " + 
                     length + " feet and width " + width + " feet is " + this.getArea() + " sq. feet.";
        
        return msg;
    }
    
    
}
