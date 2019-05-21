//SURAJ UPADHYAY
//CSC 161-01
//LAB 6 #2

package datemagic;

import java.io.*;
import java.util.Scanner;

public class DateMagic 
{
    public static void main(String[] args) throws IOException
    {
        Scanner read = new Scanner(new FileReader("infile.txt"));
        int mnth = read.nextInt();
        int day = read.nextInt();
        int year = read.nextInt();
        read.close();
        
        PrintWriter write = new PrintWriter("outfile.txt");
        
        if(mnth*day == year)
        {
            write.println("It is a magic date, as "+mnth+" * "+day+" = "+ year);
        }
        else
        {
            write.println("It is not a magic date, as "+mnth+" * "+day+" != "+ year);
        }
        
        write.close();
    }
    
}
