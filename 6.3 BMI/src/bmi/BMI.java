//SURAJ UPADHYAY
//CSC 161-01
//LAB 6 #3

package bmi;

import java.io.*;
import java.util.Scanner;

public class BMI 
{
    public static void main(String[] args) throws IOException
    {
        Scanner read = new Scanner(new FileReader("infile.txt"));
        double weight = read.nextDouble();
        double height = read.nextDouble();
        read.close();
        
        PrintWriter write = new PrintWriter("outfile.txt");
        
        double bmi = (172*703/Math.pow(height, 2));
        
        write.printf("The BMI of the person with "+weight+" lbs. and "+height+" inches of height "
                   + "is %.3f lbs./in"+(char)(178)+".\n",bmi);
        
        String bodyType = "The person's bodytype is ";
        if(bmi < 18.5)
        {
            bodyType += "UNDERWEIGHT.";
        }
        else if(bmi > 25)
        {
            bodyType += "OVERWEIGHT.";
        }
        else
        {
            bodyType += "OPTIMAL.";
        }
        write.println(bodyType);
        write.close();
    }
}
