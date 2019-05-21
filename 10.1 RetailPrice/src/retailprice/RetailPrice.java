//SURAJ UPADHYAY
//CSC 161-01
//LAB 10 #1

package retailprice;

import javax.swing.*;

public class RetailPrice 
{
   public static void main(String[] args) 
   {
       display();
       System.exit(0);
   }
   
   public static void display()
   {
       double wholesaleCost = Double.parseDouble(JOptionPane.showInputDialog(""
               + "Please enter the wholesale cost of the product below."));
       
       double markupPercent = Double.parseDouble(JOptionPane.showInputDialog(""
               + "Please enter the markup percent on the product below."));
       
       String msg = String.format("%s%.2f%s%.3f%s%.2f", "The retail price for $", wholesaleCost,
                                  " wholesale cost and ", markupPercent, "% markup is $", 
                                  calculateRetail(wholesaleCost, markupPercent));
       
       JOptionPane.showMessageDialog(null, msg, "Retail Price Calculator", 1);
       
       
   }
   
   public static double calculateRetail(double wholesaleCost, double markupPercent)
   {
       double retailPrice = wholesaleCost + wholesaleCost * markupPercent /100;
       return retailPrice;
   }
    
}
