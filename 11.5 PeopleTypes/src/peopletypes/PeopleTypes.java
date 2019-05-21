//SURAJ UPADHYAY
//CSC 161-01
//LAB 11 #5

package peopletypes;

import java.io.*;
import java.util.Scanner;

public class PeopleTypes 
{
    static int [] peopleTypes =  new int [50];
    static int noOfInfants, 
               noOfTeens, 
               noOfAdults, 
               noOfChild;
    
    public static void main(String[] args) throws IOException 
    {
        readNArrnge();
        write();
    }
        
    public static void readNArrnge() throws IOException
    {
        Scanner read = new Scanner(new FileReader("infile.txt"));
        
        int index = 0;
        
        while(read.hasNext() && index != -1)
        {
             int data = Integer.parseInt(read.next());
             
             //Stores the flag variable for "inserted", 
             //"not inserted" or "End of File".
             int inserted = insertNSum(data, index);
             
             if(inserted == 1)
             {
                 index++;
             }
             else if(inserted == -1)
             {
                 index = -1;
             }
        }
        
        read.close();
    }
        
    public static int insertNSum(int data, int index)
    {   
        // 0 == false..data invalid..not inserted..
        // 1 == true...data inserted.
        //-1 == End of File...indication to stop reading the file.
        
        if (data < 5 && data > -2 && data != 0) 
        {
            if (data < 0) 
            {
                return -1;
            } 
            else if (data == 1) 
            {
                peopleTypes[index] = data;
                noOfInfants++;
                return 1;
            }
            else if (data == 2) 
            {
                peopleTypes[index] = data;
                noOfChild++;
                return 1;
            } 
            else if (data == 3) 
            {
                peopleTypes[index] = data;
                noOfTeens++;
                return 1;
            }
            else 
            {
                peopleTypes[index] = data;
                noOfAdults++;
                return 1;
            }
        }
        return 0;
    }

    public static void write() throws IOException
    {
        PrintWriter write = new PrintWriter("outfile.txt");
        
        write.println("The total number of infants "
                    + "present in the fair: " + noOfInfants);
        
        write.println("The total number of children "
                    + "present in the fair: " + noOfChild);
        
        write.println("The total number of teenagers "
                    + "present in the fair: " + noOfTeens);
        
        write.println("The total number of adults "
                    + "present in the fair: " + noOfAdults);

        write.close();
    }
}
