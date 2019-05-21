//SURAJ UPADHYAY
//CSC 161-01
//LAB 11 #1

package arrybasics;

public class ArryBasics 
{
   public static void main(String[] args) 
   {
       initiation();
   }
   
   public static void initiation()
   {
       double [] arry = new double [50];
       fillArry(arry);
       printArry(arry);
   }
   
   public static void fillArry(double [] arry)
   {       
       for(double i = 0; i < 25; i++)
       {
           arry [(int)i] = i * i;
       }
       for(int i = 25; i < 50; i++)
       {
           arry [(int)i] = 3 * i;
       }
   }
   
   public static void printArry(double [] arry)
   {
       for(int i = 0; i < arry.length; i++)
       {
           System.out.print(arry[i] + " ");
           
           if(i % 10 == 0 && i != 0)
           {
               System.out.println();
           }
       }
       System.out.println();
   }
    
}
