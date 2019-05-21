//SURAJ UPADHYAY
//CSC 161-01
//LAB 12 #1

package mccelection;

import java.io.*;
import java.util.Scanner;

public class MccElection 
{
    static String names[]  = new String[5];
    static int [] noOfVotes = new int[5];
    static double totalVotes;
    
    public static void main(String[] args) throws IOException 
    {
        readArrnge();
        totalVotes();
        write();
    }
    
    public static void readArrnge() throws IOException
    {
        Scanner read = new Scanner(new FileReader("infile.txt"));
        
        int i = 0, j = 0;
        
        while(read.hasNext())
        {
            names[i++] = read.next();
            noOfVotes[j++] = read.nextInt();
        }
        
        read.close();
    }
    
    public static void totalVotes()
    {
        totalVotes = 0.0;
        
        for(int i = 0; i < 5; i++)
        {
            totalVotes += noOfVotes[i];
        }
    }
    
    public static int winnerIndex()
    {
        int maxIndex = 0;
        
        for(int j = 1; j < 5; j++)
        {
            if(noOfVotes[j] > noOfVotes[j-1])
            {
                maxIndex = j;
            }
                
        }
        
        return maxIndex;
    }
    
    public static void write() throws IOException
    {
        PrintWriter write = new PrintWriter("outfile.txt");
        
        write.printf("%s %20s %20s", "Candidate", "Votes Received", "% of Total Votes\n");
        
        for(int i = 0; i < 5; i++)
        {
            write.printf("%-20s %-20s %-20.2f %s", names[i], noOfVotes[i], (noOfVotes[i]/totalVotes)*100, "\n");
        }
        
        write.printf("%-20s %-20s", "Total", (int)totalVotes);
        
        write.println("\nThe Winner of the MCC Election is " + names[winnerIndex()] + ".");
        
        write.close();
    }
}
