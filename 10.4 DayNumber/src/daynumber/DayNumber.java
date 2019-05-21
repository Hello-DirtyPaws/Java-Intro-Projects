//SURAJ UPADHYAY
//CSC 161-01
//LAB 10 #4

package daynumber;

import java.io.*;
import javax.swing.*;

public class DayNumber 
{
   public static void main(String[] args) throws IOException 
   {
       display();
       System.exit(0);
   }
   
   public static void display() throws IOException
   {
       String date = JOptionPane.showInputDialog("Please enter the date in format mm dd yy");
       String mnth = date.substring(0, 2);
       String day = date.substring(3, 5);
       String year = date.substring(6, 8);
       
       String msg = "The number of days for the date \'" + 
                    mnth + " " + day + " " + year + "\' is " +
                    numberOfDays(Integer.parseInt(mnth), Integer.parseInt(day), Integer.parseInt(year)) + " days.";
       
       JOptionPane.showMessageDialog(null, msg, "Number of Days", 1);
   }
   
   public static boolean isLeapYear(int year)
   {
       if(year % 4 == 0)
       {
           if(year % 100 != 0 || year % 400 == 0)
           {
               return true;
           }
       }
       return false;
   }
   
   public static int daysInMonth(int mnth, int year)
   {
       int daysInMnth = 0;
       switch(mnth)
       {
           case 12:
               daysInMnth = 31;
               break;
           case 11:
               daysInMnth = 30;
               break;
           case 10: 
               daysInMnth = 31;
               break;
           case 9: 
               daysInMnth = 30;
               break;
           case 8:
               daysInMnth = 31;
               break;
           case 7: 
               daysInMnth = 31;
               break;
           case 6:
               daysInMnth = 30;
               break;
           case 5:
               daysInMnth = 31;
               break;
           case 4:
               daysInMnth = 30;
               break;
           case 3:
               daysInMnth = 31;
               break;
           case 2:
               if(isLeapYear(year))
               {
                   daysInMnth = 29;
                   break;
               }
               else
               {
                   daysInMnth = 28;
                   break;
               }
           case 1:
               daysInMnth = 31;
               break;
       }
       
       return daysInMnth;
   }
   
   public static int numberOfDays(int mnth, int day, int year)
   {
       int totalDays = 0;
       int count = 1;
       
       while(count < mnth)
       {
           totalDays += daysInMonth(count, year);
           count++;
       }
       totalDays += day;
       
       return totalDays;
   }
   
}
