//SURAJ UPADHYAY
//CSC 161-01
//LAB 10 #3

package reversedigit;

import java.io.*;
import java.util.Scanner;

public class ReverseDigit 
{
   public static void main(String[] args) throws IOException 
   {
       readAndWrite();
   }
   
   public static void readAndWrite() throws IOException
   {
       Scanner read = new Scanner(new FileReader("infile.txt"));
       
       int num = read.nextInt();
       
       PrintWriter write = new PrintWriter("outfile.txt");
       write.println(num + " in reversed format is written as "
                   +reverseDigits(num));
       
       write.close();
       read.close();
   }
   
   public static int reverseDigits(int x)
   {
       String str =  "" + x;
       String reverseStr = "";
       
       for(int i = str.length() - 1; i > -1; i--)
       {
           reverseStr += str.charAt(i);
       }
              
       return Integer.parseInt(reverseStr);
   }
}
