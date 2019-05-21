//SURAJ UPADHYAY
//CSC 161-01
//LAB 5 #3

package numtochar;

import java.util.Scanner;

public class NumToChar 
{
    public static void main(String[] args) 
    {
        //Initialising Scanner.
        Scanner key = new Scanner(System.in);
        
        //Asking the user to enter a number.
        System.out.print("Please enter a number between 0 - 35: ");
        int num = key.nextInt();
        
        //Checking if number is less than 9 or not.
        if(num <= 9)
        {
            System.out.println("The output is: "+num);
        }
        else
        {
            System.out.println("The output is: "+(char)(num+55));
        }
    }
    
}
