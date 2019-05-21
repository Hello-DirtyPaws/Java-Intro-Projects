//SURAJ UPADHYAY
//CSC 161-01
//LAB 6 #5

package massweight;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MassWeight 
{
    public static void main(String[] args) 
    {
        String strMass = JOptionPane.showInputDialog("Please enter the object's mass below.");
        double mass = Double.parseDouble(strMass);
        
        DecimalFormat df = new DecimalFormat("#0.000");
        
        //Computing weight, formatting decimal points and converting it back to double.
        double weight = Double.parseDouble(df.format(9.8 * mass));
        
        String msg = "The "+mass+" kg object's weight is: "+weight+" Newtons.";
        
        if(weight < 10)
        {
            msg += "\nThe object is too light."; 
        }
        else if(weight > 1000)
        {
            msg += "\nThe object is too heavy.";
        }
        
        JOptionPane.showMessageDialog(null, msg, "Mass and Weight", 1);
        
        System.exit(0);
    }
    
}
