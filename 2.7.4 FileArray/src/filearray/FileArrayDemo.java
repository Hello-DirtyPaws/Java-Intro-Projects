/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 7 #4
 */
package filearray;

import java.io.*;

public class FileArrayDemo 
{
    public static void main(String[] args)
    {
        int [] givenArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int [] newArry = new int [givenArray.length];
        
        FileArray fa = new FileArray(givenArray);
        
        try 
        {
            System.out.print("The given integer array wriiten in the file is \n[");
            
            for (int i = 0; i < givenArray.length - 1; i++) 
            {
                System.out.print(givenArray[i] + ", ");
            }
            System.out.print(givenArray[givenArray.length-1]);
            System.out.println("]\n");
            
            
            
            System.out.print("The array read from the file is \n[");
            
            fa.writeArray("infile.dat", givenArray);
            fa.readArray("infile.dat", newArry);

            for (int i = 0; i < givenArray.length - 1; i++) 
            {
                System.out.print(newArry[i] + ", ");
            }
            System.out.print(newArry[newArry.length-1]);
            System.out.println("]\n");
        } 
        catch (IOException ex) 
        {
            System.out.println("IOException occured..");
        }
    }
    
}
