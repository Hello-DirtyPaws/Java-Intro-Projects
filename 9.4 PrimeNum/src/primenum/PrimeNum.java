//SURAJ UPADHYAY
//CSC 161-01
//LAB 9 #4

package primenum;

import javax.swing.JOptionPane;

public class PrimeNum 
{
    public static void main(String[] args) 
    {
        display();
        System.exit(0);
    }
    
    public static boolean isPrime(int num)
    {
        boolean isPrime;
        
        if(num == 2)
        {
            isPrime = true;
        }
        else if(num % 2 == 0)
        {
            isPrime = false;
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
                isPrime = true;
            }
            else
            {
                isPrime = false;
            }
        }
     
        return isPrime;
    }
    
    public static void display()
    {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a positive integer."));
        
        String msg = "Is " + num + " prime? \n" + isPrime(num);
        
        JOptionPane.showMessageDialog(null, msg, "Prime number checking.", 1);
    }
    
}
