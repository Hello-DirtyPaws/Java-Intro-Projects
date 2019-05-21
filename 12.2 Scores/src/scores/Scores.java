//Devang Patel
//CSC 161-01
//LAB 12 #2

package scores;

import java.io.*;
import java.util.Scanner;

public class Scores 
{
    static String students[]  = new String[50];
    static int [] marks = new int[50];
    static int size;
    static double average;
    
    public static void main(String[] args) throws IOException 
    {
        fileInput();
        calculateAverage();
        fileOut();
    }
    
    public static void fileInput() throws IOException
    {
        Scanner fileReading = new Scanner(new FileReader("Input.txt"));
        
        String input;

        for (int i = 0; i < 50; i++) 
        {
            input = fileReading.next();

            if (input.compareToIgnoreCase("z") != 0) 
            {
                students[i] = input;
                marks[i] = fileReading.nextInt();
                size = i+1;
            }
            else
                break;
        }
        
        fileReading.close();
    }
    
    public static void calculateAverage()
    {
        
        for(int i = 0; i < size; i++)
        {
            average += marks[i];
        }
        
        average = (average/size);
        
    }
    
    public static void fileOut() throws IOException
    {
        PrintWriter fileOut = new PrintWriter("output.txt");
        
        fileOut.printf("%-25s %-25s","Names",  "Scores");
        
        for(int i = 0; i < size; i++)
        {
            fileOut.printf("\n%-27s %-25d",students[i], marks[i]);
        }
        
        fileOut.println("\n\na. The class average is " + average);
        fileOut.println("\nb. Students with score LOWER "
                    + "than the average score is as follows:");
        for(int i = 0; i < size; i++)
        {
            if(marks[i] < average)
            {
                fileOut.println(students[i] + ", your score is below class average.");
            }
        }
        
        fileOut.println("\nc. The highest score is " + marks[maxIndex()] + ".");
        
        fileOut.println(students[maxIndex()]+" received the highest score.");
        
        fileOut.close();
    }
    
    public static int maxIndex()
    {
        int highest = marks[0], loc = 0;
        
        for(int i = 1; i < size; i++)
        {
            if(highest < marks[i])
            {
                highest = marks[i];
                loc = i;
            }
        }
        return loc;
    }
    
       
}
