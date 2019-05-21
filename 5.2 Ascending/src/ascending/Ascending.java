//SURAJ UPADHYAY
//CSC 161-01
//LAB 5 #2

package ascending;

import java.io.*;
import java.util.Scanner;

public class Ascending 
{
    public static void main(String[] args) throws IOException
    {
        //Initialising Scanner and linking it to the input file.
        Scanner read = new Scanner(new FileReader("infile.txt"));
        
        //Reading and storing the 3 numbers from the input file.
        double n1 = read.nextDouble();
        double n2 = read.nextDouble();
        double n3 = read.nextDouble();
        
        //Closing the input file.
        read.close();
        
        //Initialising the PrintWriter and linking it to the output file.
        PrintWriter write = new PrintWriter("outfile.txt");
        
        
        if(n1<n2)
        {
            if(n1<n3)
            {
                write.println(n1);
                if(n2<n3)
                {
                    //n1<n2 and n1<n3 and n2<n3.
                    write.println(n2+"\n"+n3);
                }
                else
                {
                    //n1<n2 and n1<n3 and n3<n2.
                    write.println(n3+"\n"+n2);
                }
            }
            else
            {
                //n1<n2 and n3<n1 thus, n3<n1<n2.
                write.println(n3+"\n"+n1+"\n"+n2);
            }
        }
        
        else if(n2<n3)
        {
            //n2<n1 and n2<n3 thus n2 is the lowest.
            write.println(n2);
            if(n1<n3)
            {
                //n2 is the lowest and n1<n3.
                write.println(n1+"\n"+n3);
            }
            else
            {
                //n2 is the lowest and n3<n1.
                write.println(n3+"\n"+n1);
            }
        }
        else
        {
            //n2<n1 and n3<n2 thus, n3<n2<n1.
            write.println(n3+"\n"+n2+"]n"+n1);
        }
        
        //Closing the output file.
        write.close();        
    }
    
}
