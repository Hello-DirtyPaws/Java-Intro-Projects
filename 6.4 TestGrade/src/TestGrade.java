//SURAJ UPADHYAY
//CSC 161-01
//LAB 6 #4

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TestGrade
{
    public static void main(String[] args) 
    {
        String strTest1 = JOptionPane.showInputDialog(null, "Please enter the marks of test 1 below.");
        String strTest2 = JOptionPane.showInputDialog(null, "Please enter the marks of test 2 below.");
        String strTest3 = JOptionPane.showInputDialog(null, "Please enter the marks of test 3 below.");
        
        double test1 = Integer.parseInt(strTest1);
        double test2 = Integer.parseInt(strTest2);
        double test3 = Integer.parseInt(strTest3);
        
        DecimalFormat df = new DecimalFormat("#0.00");
        
        //Computing avg, specifiying decimals and converting it to a double.
        double avg = Double.parseDouble(df.format((test1+test2+test3)/3.0));
        
        char grade;
        
        if(avg < 60)
        {
            grade = 'F';
        }
        else if (avg > 59 && avg < 70)
        {
            grade = 'D';
        }
        else if (avg > 69 && avg < 80)
        {
            grade = 'C';
        }
        else if (avg > 79 && avg <90)
        {
            grade = 'B';
        }
        else
        {
            grade = 'A';
        }
        
        String msg = "The average of "+test1+", "+test2+", and "+test3+" is " + avg + "."
                   + "\nThe grade received is: "+grade;
        
        JOptionPane.showMessageDialog(null, msg, "Test average and Grade", 1);
        
        System.exit(0);
    }
    
}
