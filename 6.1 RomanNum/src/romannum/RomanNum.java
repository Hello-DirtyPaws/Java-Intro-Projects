//SURAJ UPADHYAY
//CSC 161-01
//LAB 6 #1
package romannum;

import java.util.Scanner;
import java.io.*;

public class RomanNum 
{

    public static void main(String[] args) throws IOException 
    {
        Scanner read = new Scanner(new FileReader("infile.txt"));
        int num = read.nextInt();
        read.close();

        PrintWriter write = new PrintWriter("outfile.txt");

        String roman = "";
        
        if (num <= 10 && num > 0) 
        {
            switch (num) 
            {
                case 1:
                    roman = "I";
                    break;
                case 2:
                    roman = "II";
                    break;
                case 3:
                    roman = "III";
                    break;
                case 4:
                    roman = "IV";
                    break;
                case 5:
                    roman = "V";
                    break;
                case 6:
                    roman = "VI";
                    break;
                case 7:
                    roman = "VII";
                    break;
                case 8:
                    roman = "VIII";
                    break;
                case 9:
                    roman = "IX";
                    break;
                case 10:
                    roman = "X";
                    break;
            }
            
            write.println("The Roman number for " + num + " is: " + roman);
        }
        else 
        {
            write.println("Please enter a valid number between 1-10.");
        }

        write.close();
    }

}
