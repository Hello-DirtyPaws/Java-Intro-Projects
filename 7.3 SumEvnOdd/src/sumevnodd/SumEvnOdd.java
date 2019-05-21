//SURAJ UPADHYAY
//CSC 161-01
//LAB 7 #3

package sumevnodd;

import javax.swing.JOptionPane;

public class SumEvnOdd 
{
   public static void main(String[] args) 
   {
       int limit = Integer.parseInt(JOptionPane.showInputDialog("Please enter the limit of "
                                                              + "numbers you want the sum of:"));
       int sumEven = 0;
       int sumOdd = 0;
       String msgEvn = "The sum of";
       String msgOdd = "The sum of";
       
       for (int i = 1; i <= limit; i++) 
       {
           if(i%2 == 0)
           {
               sumEven += i;
               msgEvn += " "+ i;
           }
           else 
           {
               sumOdd += i;
               msgOdd += " "+ i;
           }
           
       }
       
       String msg = msgEvn + " (all evens) is:\n" + sumEven + "\n"+ 
                    msgOdd + " (all odds) is:\n" + sumOdd;
       
       JOptionPane.showMessageDialog(null, msg, "Sum of all evens and all odds", 1);
       
       System.exit(0);
   }
    
}
