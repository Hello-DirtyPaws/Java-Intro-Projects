//Suraj Upadhyay
//CSC 161-01
//LAB 13 #1

package temparry;

import java.io.*;
import java.util.Scanner;

public class TempArry 
{
    
    public static void main(String[] args) throws IOException 
    {
        int [][] temp = new int [12][2];
        getData(temp);
        printData(temp);
    }
    
    public static void getData(int [][] temp) throws IOException
    {
       Scanner read = new Scanner(new FileReader("infile.txt"));
        
       for(int row = 0; row < 12; row++)
       {
           for(int col = 0; col < 2; col++)
           {
               if(read.hasNextInt())
               {
                   temp[row][col] = read.nextInt();
               }
           }
       }
        
        read.close();
    }
    
    public static double averageHigh(int [][] temp)
    {
        double avgHigh = 0;
                
        for(int row = 0; row < 12; row++)
        {
            avgHigh += temp[row][0];
        }
        return (avgHigh/12.0);
    }
    
    public static double averageLow(int [][] temp)
    {
        double avgLow = 0;
        
        for(int row = 0; row < 12; row++)
        {
            avgLow += temp[row][1];
        }
        
        return (avgLow/12.0);
    }
    
    public static int indexHighTemp(int [][] temp)
    {
        int index = 0;
        
        double max = temp[0][0];
        
        for(int row = 1; row < 12; row++)
        {
            if(max < temp[row][0])
            {
                max = temp[row][0];
                index = row;
            }
        }

        return index;
    }
    
    public static int indexLowTemp(int [][] temp)
    {
        int index = 0;
        
        double min = temp[0][1];
        
        for(int row = 1; row < 12; row++)
        {
            if(min > temp[row][1])
            {
                min = temp[row][1];
                index = row;
            }
        }

        return index;
    }

    public static void printData(int [][] temp) 
    {
        System.out.println("The average high of the 12 months is " + averageHigh(temp) + 
                           (char)176 + "F.");
        
        System.out.println("The average low of the 12 months is " + averageLow(temp) +
                           (char)176 + "F.");
        
        System.out.println("The highest temperature, " + temp[indexHighTemp(temp)][0] +
                          (char)176 + "F was recorded in the month number " +
                           (indexHighTemp(temp)+1) + ".");
        
        System.out.println("The lowest temperature, " + temp[indexLowTemp(temp)][1] +
                          (char)176 + "F was recorded in the month number " +
                           (indexLowTemp(temp)+1) + ".");

    }
}
