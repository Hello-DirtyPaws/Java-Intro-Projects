//SURAJ UPADHYAY
//CSC 161-01
//LAB 5 #4

package callcharge;

import java.io.*;
import java.util.Scanner;

public class CallCharge 
{
    
    public static void main(String[] args) throws IOException
    {
        //Initialising Scanner and linking it to the input file.
        Scanner read = new Scanner(new FileReader("infile.txt"));
        
        //Reading and storing the value of number of minutes from the input file.
        int min = read.nextInt();
        
        //Closing the input file.
        read.close();
        
        //Initialising PrintWriter and liking it to the output file.
        PrintWriter write = new PrintWriter("outfile.txt");
        
        if(min == 0)
        {
            write.println("The call charge is: $0.00");
        }
        else if(min < 4)
        {
            write.println("The call charge is: $"+(1.99 + 2.00));
        }
        else
        {
            write.printf("%s %.2f","The call charge is: $",
                        (1.99 + 2.00 + (min-3.0) * 0.45));
        }
        
        //Closing the output file.
        write.close();
    }
    
}
