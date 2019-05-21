//Suraj Upadhyay
//CSC 162-01
//LAB 1 #1

package ballslots;

import java.util.Scanner;

public class BallSlots 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of balls to drop: ");
        int ttlBalls = in.nextInt();
        
        System.out.print("Enter the number of slots in the bean machine: ");
        int ttlSlots = in.nextInt();
        
        System.out.println(display(fillSlots(ttlSlots, ttlBalls)));
    }
    
    public static String generatePath(int limit)
    {
        String s = "";
                
        for(int i = 0; i < limit; i++)
        {
            if((int)(Math.random()*10) % 2 ==  0)
            {
                s += "R";
            }
            else 
            {
                s += "L";
            }
        }
        
        System.out.println(s);
        
        return s;
    }
    
    public static int [] fillSlots(int ttlSlots, int ttlBalls)
    {
        int [] slot = new int [ttlSlots];
        
        String path;
        
        for(int i = 0; i < ttlBalls; i++)
        {
            int slotNum = 0;
            path = generatePath(ttlSlots - 1);
            
            //loop to fill balls in slot.
            for(int j = 0; j < path.length(); j++)
            {
                if(path.charAt(j) == 'R')
                {
                    slotNum++;
                }
            }
            slot[slotNum]++;                
        }
        return slot;
    }
    
    public static String display(int [] slot)
    {
        String msg = "";
        String finalMsg = "";
        
        //Getting a string for dispay as upside-down.
        int sentinal = 1;
        while(sentinal != 0)
        {
            sentinal = 0;
            for(int i = 0; i < slot.length; i++)
            {
                if (slot[i] != 0)
                {
                    sentinal = 1;
                }
                
                if (slot[i] > 0)
                {
                    slot[i]--;
                    msg += "0";
                }
                else 
                {
                    msg += " ";
                }
            }
        }
        
        //Flipping the string for the correct display.
        int j = 1;
        int i = msg.length() - slot.length * j;
        
        while(i >= 0)
        {
            j++;
            for(int k = 0; k < slot.length; k++)
            {
                finalMsg += msg.charAt(i++);
            }
            finalMsg += "\n";
            i = msg.length() - slot.length * j;
        }
        return finalMsg;
    }
    
}
