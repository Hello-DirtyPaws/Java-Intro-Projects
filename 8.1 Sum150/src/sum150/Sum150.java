//SURAJ UPADHYAY
//CSC 161-01
//LAB 8 #1

package sum150;

import javax.swing.JOptionPane;

public class Sum150 
{
    public static void main(String[] args) 
    {
        int i = 1;
        
        int sum = 0;
        
        int limit = Integer.parseInt(JOptionPane.showInputDialog("Please enter an integer"));
        while(i <= limit)
        {
            sum += i;
            i++;
        }
        
        String msg = String.format("%s %d %s %,d", "Sum from 1 through ", limit, " = ", sum);
        
        JOptionPane.showMessageDialog(null, msg, "Sum of Numbers", 1);

        System.exit(0);
    }
    
}
