//SURAJ UPADHYAY
//CSC 161-01
//LAB 7 #4

package primenum;

import javax.swing.JOptionPane;

public class PrimeNum 
{
    public static void main(String[] args) 
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive number"));
        String msg;
        
        if(num == 2)
        {
            msg = num + " is prime.";
        }
        else if(num % 2 == 0)
        {
            msg = num + " is not a prime.";
        }
        else
        {
            int divide = (int)Math.sqrt(num);
            
            if(divide % 2 == 0)
            {
                divide--;
            }
            
            while(num % divide != 0 && divide > 2)
            {
                divide = divide - 2;
            }
            
            if(divide == 1)
            {
                msg = num + " is prime.";
            }
            else
            {
                msg = num + " is not a prime.";
            }
        }
        
        JOptionPane.showMessageDialog(null, msg, "Prime Number Indentifier", 1);
        
        System.exit(0);
    }
    
}
