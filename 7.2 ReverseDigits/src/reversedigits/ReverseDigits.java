//SURAJ UPADHYAY
//CSC 161-01
//LAB 7 #2

package reversedigits;

import java.io.*;
import java.util.Scanner;

public class ReverseDigits 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner read = new Scanner(new FileReader("infile.txt"));
        
        int num = read.nextInt();
        read.close();
        
        PrintWriter write = new PrintWriter("outfile.txt");
        
        write.print("The " + num + " in reversed order is written as: ");
String digits = "";
        
        while(Math.abs(num) > 0)
        {
            digits += " " + num%10;
            num = num/10;
        }
        
        write.println(digits);       
        
        write.close();
    }
    
}
