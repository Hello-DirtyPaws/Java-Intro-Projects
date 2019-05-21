//SURAJ UPADHYAY
//CSC 161-01
//LAB 7 #5

package numgame;

import java.util.Scanner;

public class NumGame 
{
   public static void main(String[] args) 
   {
       Scanner key = new Scanner(System.in);
       
       //PART A.
       System.out.println("PART A.\n"
                        + "Please enter two numbers below"
                        + "(First number lesser than the Second number).");
       
       System.out.print("First number: ");
       int firstNum = key.nextInt();
       
       System.out.print("Second number: ");
       int secondNum = key.nextInt();
       
       //PART B.
       int tempNum = firstNum;  //Odd numbers inclusive of 1st and 2nd num.
       
       System.out.println("\nPART B.\n"
                        + "All the odd numbers in between "+firstNum+" and "+secondNum+" (inclusive) are:");
       while(tempNum <= secondNum)
       {
           if(tempNum % 2 != 0)
           {
               System.out.print(tempNum + " ");
           }
           
           tempNum++;
       }
       
       System.out.println("\n\nPART C.");
       
       //PART C.
       int sum = 0;
       tempNum = firstNum;
       while(tempNum <= secondNum)
       {
           if(tempNum % 2 == 0)
           {
               sum += tempNum;
           }
           
           tempNum++;
       }
       System.out.println("The sum of all even numbers in between "
                        + firstNum + " and " + secondNum + " (inclusive) is " + sum);
       
       //PART D.
       System.out.println("\nPART D.");
       
       tempNum = 1;
       
       System.out.println("Number --> Square");
       
       while(tempNum <= 10)
       {
           System.out.println(tempNum + "      -->      " + tempNum*tempNum);
           tempNum++;
       }
       
       //PART E.
       System.out.println("\nPART E.");
       
       tempNum = firstNum;
       sum = 0;
       
       while (tempNum <= secondNum) 
       {
           if (tempNum % 2 != 0)
           {
               sum += tempNum*tempNum;
           }

           tempNum++;
       }
       System.out.println("The sum of the squares of all the odd numbers in between "
                         + firstNum + " and " + secondNum + " (inclusive) is " + sum);
       
       
       //PART F.
       System.out.println("\nPART F.");
       tempNum = 'A';
       
       System.out.println("All uppercase letters are as follows:");
       
       while(tempNum <= 'Z')
       {
           System.out.print((char)tempNum + " ");
           tempNum++;
       }
   }
    
}
