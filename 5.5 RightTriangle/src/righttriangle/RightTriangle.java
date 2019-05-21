//SURAJ UPADHYAY
//CSC 161-01
//LAB 5 #5

package righttriangle;

import javax.swing.JOptionPane;

public class RightTriangle 
{
    public static void main(String[] args) 
    {
        //Asking the user the 3 sides of a triangle and storing those values.
        double side1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter side 1: "));
        double side2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter side 2: "));
        double side3 = Double.parseDouble(JOptionPane.showInputDialog("Please enter side 3: "));
        
        //Creating an out put msg string.
        String msg = "The sides "+side1+", "+side2+", and "+side3+"\n";
        
        //Checking the pythagorus equation for right angle triangle.
        if(Math.sqrt(side3) == Math.sqrt(side1 + Math.sqrt(side2)))
            JOptionPane.showMessageDialog(null, msg+"Make a right angle tringle", 
                                         "Right Triangle Dtermination", 1);
        
        else if(Math.sqrt(side2) == Math.sqrt(side3 + Math.sqrt(side1)))
            JOptionPane.showMessageDialog(null, msg+"Make a right angle tringle", 
                                         "Right Triangle Dtermination", 1);

        else if(Math.sqrt(side1) == Math.sqrt(side2 + Math.sqrt(side3)))
            JOptionPane.showMessageDialog(null, msg+"Make a right angle tringle", 
                                         "Right Triangle Dtermination", 1);

        //The condition of right angle triangle did not match.
        else
            JOptionPane.showMessageDialog(null, msg+"do NOT make a right angle triangle.", 
                                         "Right Triangle Dtermination", 1);
        
        System.exit(0);
    }
    
}
