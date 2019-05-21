//SURAJ UPADHYAY
//CSC 161-01
//LAB 8 #4
package avgrain;

import java.io.*;
import java.util.Scanner;

public class AvgRain {

    public static void main(String[] args) throws IOException 
    {
        Scanner read = new Scanner(new FileReader("infile.txt"));
        PrintWriter write = new PrintWriter("outfile.txt");

        int years = read.nextInt();

        if (years >= 1) 
        {

            int mnths = years * 12;
            int rainfall;
            double totalRain = 0;
            double avgRain;

            for (int i = 1; i <= years; i++) 
            {
                for (int j = 1; j <= 12; j++) 
                {
                    rainfall = read.nextInt();
                    totalRain += rainfall;
                }
            }

            avgRain = totalRain / mnths;

            write.println("The total months = " + mnths);
            write.println("The total rainfall = " + totalRain + " inches.");
            write.println("The average rainfall = " + avgRain + " inches.");
        } 
        else 
        {
            write.println("Please enter a valid number of years.");
        }
        read.close();
        write.close();
    }

}
