//Suraj Upadhyay
//CSC 161-01
//LAB 13 #2

package numcount;

import java.io.*;
import java.util.Scanner;

public class NumCount 
{
    static int length;
    public static void main(String[] args) throws IOException 
    {
        int [] rawData = new int [100];
        
        getData(rawData);
        
        int [] arrangedArry = arrangeAscending(rawData);
        int [] freqArry = frequency(arrangedArry);
        
        print(arrangedArry, freqArry);
    }
    
    public static void getData(int [] rawData) throws IOException
    {
        Scanner read = new Scanner(new FileReader("infile.txt"));
        
        length = 0;
        int data = read.nextInt();
        while(length < 100 && data != -999)
        {
            length++;
            rawData[length - 1] = data;
            data = read.nextInt();
        }
        
        read.close();
    }
    
    public static int []  arrangeAscending(int [] rawData)
    {
        int [] arrangedArry = new int[length];
        
        int minData = rawData[0], minIndex = 0, maxData = rawData[0];
        
        for(int i = 0; i < length; i++)
        {
            for(int j = 0; j < length; j++)
            {
                //Finds the max data in the raw arry.
                //Max data needed to reset the min data to the max data, 
                //after finding the minimum value from the raw arry,
                //for comparing it with the other available datas in the raw arry.
                
                if(i == 0)
                //This will executes only the first time.
                {
                    if(maxData < rawData[j])
                    {
                        maxData = rawData[j];
                    }
                }
                
                if(minData > rawData[j] && rawData[j] != -999)
                {
                    minData = rawData[j];
                    minIndex = j;
                }
            }
            arrangedArry[i] = minData;
            rawData[minIndex] = -999; //using the sentinal value. Thus not coinsiding with the data.
            minData = maxData;
        }
        
        return arrangedArry;
    }
    
    public static int [] frequency(int [] arry)
    {
        int [] freqArry = new int[length];
        int dataToCompare, freq = 0;
        
        for(int i = 0; i < length; i++)
        {
            dataToCompare = arry[i];
            
            for(int j = 0; j < length; j++)
            {
                if(dataToCompare == arry[j])
                {
                    freqArry[i] = ++freq;
                }
            }
            freq = 0;
        }
        return freqArry;
    }

    public static void print(int[] arrangedArry, int[] freqArry) 
    {
        System.out.println("The list, in ascending order, "
                         + "along with the frequecy is displayed below:");
        System.out.printf("%5s %20s", "The list", "Frequency\n");
        
        for(int i = 0; i < length; i++)
        {
            System.out.printf("%5d %17d\n", arrangedArry[i], freqArry[i]);
        }
    }
}
