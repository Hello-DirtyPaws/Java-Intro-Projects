//SURAJ UPADHYAY
//CSC 161-01
//LAB 9 #3

package tocelsius;

import java.io.*;

public class ToCelsius 
{
    public static void main(String[] args) throws IOException 
    {
        write();
    }
    
    public static String toCelsius(int fahren)
    {
        return String.format("%.3f%cC", 5.0/9.0 * (fahren - 32), (char)176);
    }
    
    public static void write() throws IOException
    {
        PrintWriter write = new PrintWriter("outfile.txt");
        
        write.println("Fahrenheit \t Celsius"
                    + "\n--------------------------");
        
        for (int i = 0; i <= 20; i++) 
        {
            write.println(i + "" + (char)176 + "F\t\t" + toCelsius(i));
        }
        
        write.close();
    }
    
}
