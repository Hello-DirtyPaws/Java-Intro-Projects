//SURAJ UPADHYAY
//CSC 161-01
//LAB 11 #2

package showsmallest;

public class ShowSmallest 
{

    public static void main(String[] args) 
    {
        printOut(fillIn(), fillIn().length);
    }
    
    public static int [] fillIn()
    {
        int [] arry = {56, 34, 67, 54, 23, 87, 66, 92, 15, 32, 55, 54, 88, 22, 30};
        return arry;
    }
    
    public static void printOut(int [] arry, int size)
    {
        System.out.println("From the following list of numbers below; ");
        
        for(int i = 0; i < arry.length; i++)
        {
            System.out.print(arry[i] + " ");            
        }
        
        System.out.print("\nThe smallest element is " + arry[smallestIndex(arry, size)]);
        System.out.println(" and its index is " + smallestIndex(arry, size));
    }
        
    public static int smallestIndex(int [] arry, int size)
    {
        int index = 0;
        
        int smallest = arry[0];
        
        for(int i = 1; i < arry.length; i++)
        {
            if(smallest > arry[i])
            {
                smallest = arry[i];
                index = i;
            }
        }
        
        return index;
    }
    
}
