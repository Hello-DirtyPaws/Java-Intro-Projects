//SURAJ UPADHYAY
//CSC 161-01
//LAB 8 #5

package largesmall;

import java.io.*;
import java.util.Scanner;

public class LargeSmall 
{
   public static void main(String[] args) throws IOException 
   {
       Scanner read = new Scanner(new FileReader("infile.txt"));
       PrintWriter write = new PrintWriter("outfile.txt");
       
       int largest = 0;
       int smallest = 0;
       
       int temp = read.nextInt();
       
       while(read.hasNextInt() && temp != -99)
       {
           
           if (temp < smallest) 
           {
               smallest = temp;
           }
           if (temp > largest) 
           {
               largest = temp;
           }
           
           temp = read.nextInt();
           
       }
       
       write.println("Largest: " + largest);
       write.println("Smallest: " + smallest);
       
       read.close();
       write.close();
   }
    
}
