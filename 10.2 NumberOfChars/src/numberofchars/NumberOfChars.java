//SURAJ UPADHYAY
//CSC 161-01
//LAB 10 #2

package numberofchars;

import java.io.*;
import java.util.Scanner;

public class NumberOfChars 
{
    public static void main(String[] args) throws IOException 
    {
        read();
    }
    
    public static void read() throws IOException
    {
        Scanner read = new Scanner(new FileReader("infile.txt"));
        String line = read.nextLine(); 
        
        read.close();
        
        checkAndWrite(line);
    }
    
    public static boolean isVowel(char ch)
    {
        return (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || 
                ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U');
    }

    public static void checkAndWrite(String line) throws IOException 
    {
        PrintWriter write = new PrintWriter("outfile.txt");
        
        int count = 0;
        String vowels = "";
        
        for(int i = 0; i < line.length(); i++)
        {
            if(isVowel(line.charAt(i)))
            {
                vowels += line.charAt(i) + " ";
                count++;
            }
        }
        
        write.println("In the sequence of characters below,");
        write.println(line);
        write.println("There are " + count + " vowels; " + vowels);
        
        write.close();
    }
    
}