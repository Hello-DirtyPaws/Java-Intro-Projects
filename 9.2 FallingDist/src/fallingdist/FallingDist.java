//SURAJ UPADHYAY
//CSC 161-01
//LAB 9 #2

package fallingdist;

import java.io.*;

public class FallingDist 
{
   public static void main(String[] args) throws IOException 
   {
       write();
   }
   
   public static String distCalc(int i)
   {
       return String.format("%10.3f",(0.5 * 9.8 * i * i));
   }
   
   public static void write() throws IOException
   {      
       PrintWriter write = new PrintWriter("outfile.txt");
       
       write.println("Time(seconds) \t Distance(meters)"
                   + "\n--------------------------------");
       
       for(int i = 1; i < 11; i++)
       {
           write.println(i + " sec.\t\t" + distCalc(i) + " m.");
       }
       
       write.close();
   }
    
}
