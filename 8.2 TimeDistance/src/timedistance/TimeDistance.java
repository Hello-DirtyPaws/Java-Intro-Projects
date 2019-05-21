//SURAJ UPADHYAY
//CSC 161-01
//LAB 8 #2

package timedistance;

import java.util.Scanner;

public class TimeDistance 
{
   public static void main(String[] args) 
   {
       Scanner key = new Scanner(System.in);
       
       System.out.print("Please enter the time period of the travel: ");
       double hrs = key.nextDouble();
       
       while(hrs < 1)
       {
           System.out.print("Please enter a valid travelled time: ");
           hrs = key.nextDouble();
       }
       
       System.out.print("Please enter the speed of the train: ");
       double speed = key.nextDouble();  
       
       while(speed < 0)
       {
           System.out.print("Please enter a valid train speed: ");
           speed = key.nextDouble();
       }
       
       int i = 1;
       
       System.out.println("\nHr \tDistance\n"
                        + "--------------------------");
       while(i <= hrs)
       {
           String dist = String.format("%7.3f", i*speed);
           System.out.println(i + "\t" + dist + " miles.");
           i++;
       }
   }
    
}
