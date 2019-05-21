//SURAJ UPADHYAY
//CSC 161-01
//LAB 6 #6

package sectomin;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class SecToMin 
{
    public static void main(String[] args) 
    {
        String min = "0 minutes.";
        String hrs = "0 hours.";
        String days = "0 days.";
        int sec;
        
        String strSec = JOptionPane.showInputDialog("Please enter the number of seconds below.");
        
        sec = Integer.parseInt(strSec);
        
        DecimalFormat df = new DecimalFormat("#0.000");
        
        if (sec >= 60) 
        {
            min = df.format(sec / 60.0) + " minutes.";
        }
        if (sec >= 3600)
        {
            hrs = df.format(sec / 3600.0) + " hours.";
        }
        if (sec >= 86400)
        {
            days = df.format(sec / 86400.0) + " days.";
        }
        
        String msg = "In " + sec + " sec., there are\n"
                    + min + "\n" + hrs + "\n" + days;
        
        JOptionPane.showMessageDialog(null, msg, "Sec. to Min., Hrs., and Days", 1);
              
        System.exit(0);
         
    }
    
}
