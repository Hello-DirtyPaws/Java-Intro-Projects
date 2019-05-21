//SURAJ UPADHYAY
//CSC 161-01
//LAB 7 #1

package sumdigits;

import java.io.*;
import java.util.Scanner;

public class SumDigits 
{

    public static void main(String[] args) throws IOException 
    {
        //Attaching the infile to the scanner.
        Scanner read = new Scanner(new FileReader("infile.txt"));
        
        //Reading the number as a String.
        int num = read.nextInt();
        read.close();

        int sum = 0;
        
        //Attaching the outfile to the PrintWriter.
        PrintWriter write = new PrintWriter("outfile.txt");
        
        write.println("The individual digits of " + num + " are as follows:");
        
        String digits = "";
        
        while(Math.abs(num) > 0)
        {
            digits = num%10+" "+digits;
            sum += num%10;
            num = num/10;
        }
        
        write.println(digits);
        
        write.println("And the sum of the digits is " + sum);

        write.close();
    }

}
