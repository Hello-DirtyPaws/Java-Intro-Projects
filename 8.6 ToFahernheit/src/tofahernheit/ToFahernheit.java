//SURAJ UPADHYAY
//CSC 161-01
//LAB 8 #6

package tofahernheit;

import javax.swing.JOptionPane;

public class ToFahernheit 
{
   public static void main(String[] args) 
   {
       String msg = "Centigrade    Fahrenheit\n"
                  + "-----------------";
       
       for (double i = 0; i <= 20; i++) 
       {
           String tempInFahren = String.format("%.3f",(i * 9.0/5.0 + 32));
           String tempInCentig = String.format("%6.3f", i);
           msg += "\n" + tempInCentig + (char)176 + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + tempInFahren + (char)176;
       }
              
       JOptionPane.showMessageDialog(null, msg, "Centigrade to Fahrenheit", 1);
       
       System.exit(0);
   }
    
}
