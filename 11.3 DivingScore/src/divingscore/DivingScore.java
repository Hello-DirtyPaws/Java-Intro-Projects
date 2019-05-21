//SURAJ UPADHYAY
//CSC 161-01
//LAB 11 #3

package divingscore;

import java.text.DecimalFormat;

public class DivingScore 
{
   public static void main(String[] args) 
   {
       display(fillIn());
   }
   
   public static double [] fillIn()
   {
       double [] arry = {9.2, 9.3, 9.0, 9.9, 9.5, 9.5, 9.6, 9.8};
       return arry;
   }
   
   public static void display(double [] arry)
   {
       DecimalFormat df = new DecimalFormat("0.00");
       System.out.println("The scores for diving from 8 judges are as follows: ");
       for(int i = 0; i < arry.length - 1; i++)
       {
           System.out.print(df.format(arry[i]) + ", ");
       }
       System.out.println(df.format(arry[arry.length - 1]) + ". ");
       
       System.out.println("The sum of all the scores dropping the highest score; " +
                          df.format(arry[maxIndex(arry)]) + 
                          ", and the lowest score; " + df.format(arry[minIndex(arry)]) +
                          ", is " + df.format(sum(arry)));
   }
   
   public static double sum(double [] arry)
   {
       double sum = 0;
       
       for(int i = 0; i < arry.length; i++)
       {
           if(i != minIndex(arry) && i != maxIndex(arry))
           {
               sum += arry[i]; 
           }
       }
       
       return sum;
   }
   
   public static int minIndex(double [] arry)
   {
       double smallest = arry[0];
       int index = 0;
       
       for(int i = 1; i < arry.length; i++)
       {
           if(smallest > arry [i])
           {
               smallest = arry[i];
               index = i;
           }
       }
       return index;
   }
   
   public static int maxIndex(double [] arry)
   {
       double largest = arry[0];
       int index = 0;
       
       for(int i = 1; i < arry.length; i++)
       {
           if(largest < arry [i])
           {
               largest = arry[i];
               index = i;
           }
       }
       return index;
   }
    
}
