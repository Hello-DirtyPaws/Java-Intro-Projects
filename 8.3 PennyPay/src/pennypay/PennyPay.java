//SURAJ UPADHYAY
//CSC 161-01
//LAB 8 #3

package pennypay;

import java.io.*;
import java.util.Scanner;

public class PennyPay 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner read = new Scanner(new FileReader("infile.txt"));
        int days = read.nextInt();
        read.close();
        
        PrintWriter write = new PrintWriter("outfile.txt");
        
        if(days < 1)
        {
            write.println("Please enter valid number of days, no less than 1"
                        + " and re-run the program.");
            write.close();
            System.exit(0);
        }
        
        write.println("Day \tPennies Earned\n"
                         + "------------------------------");
        
        int i = 0;
        double sum = 0.0;
        
        while(i < days)
        {
            write.print((i+1) + " \t" + (int)Math.pow(2, i) + "\n");
            sum +=  Math.pow(2, i);
            i++;
        }
        
        write.printf("\nThe total pay is $%,.2f", sum/100);
        
        write.close();
    }
    
}
