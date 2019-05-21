package test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClassA 
{
 public static void main (String []args)throws IOException
 {
        final int NUM_ROWS = 20;
        final int NUM_COLS = 20;
        int right = 0;
        int grade = 0; 
        String [][] table = new String[NUM_ROWS][NUM_COLS];
        File file = new File ("Answers.txt");
        Scanner input = new Scanner(file);
        for (int i = 0; i < NUM_ROWS; i++) 
        {
                for (int j = 0; j < NUM_COLS; j++) 
                {
                    table[i][j] = input.next();
                }
        }
  
        String [] answerKey = new String[20];
        for (int i = 0; i < answerKey.length; i++)
         {
           answerKey[i]=input.next();
         }
          //System.out.println(answerKey[10]); 


 for (int row = 0; row < table.length; row++)
 { 
  for (int col = 0; col< table[row].length; col++)
  {
   if (table [row][col] != answerKey[col]) 
       { 
        right++;
       }

   
   grade = right * 5;
  
   }
  }     
     
 }
}
