//SURAJ UPADHYAY
//CSC 161-01
//LAB 9 #1

package showchar;

import javax.swing.JOptionPane;

public class ShowChar 
{
    public static void main(String[] args) 
    {
        showChar("New York", 2);
        System.exit(0);
    }
    
    public static void showChar(String s, int pos)
    {
        char ch;
        String msg;
        
        if (pos >= 0 && pos < s.length()) 
        {
            ch = s.charAt(pos);

            msg = "The character at position " + pos + " in " + s + " is " + ch + ".";
        }
        else 
        {
            msg = "Position INVALID.";
        }
        
        JOptionPane.showMessageDialog(null, msg, "", 1);
    }
    
}
