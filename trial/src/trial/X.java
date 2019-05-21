package trial;

import java.util.Scanner;

public class X
{
    public static void main(String[] args)
    {   
        
        Scanner yogini = new Scanner(System.in);
        System.out.print("Please enter you score: ");
        double score = yogini.nextDouble();
        
       // System.out.println("The value of score is " + score);
       
       if (score >= 80 && score < 90)
       {
           System.out.println("Your grade is B.");
       }
       else if (score >= 90)
       {
           System.out.println("Your grade is A.");
       }
       else if (score >=70 )
       {
           System.out.println("Your grade is c.");
       }
       else if (score >= 60)
       {
           System.out.println("Your grade is D.");
       }
      else
       {
            System.out.println("Your grade is F.");
       }
          
        
        
        /*
        
        System.out.print("You have car key:");
        Scanner kb = new Scanner(System.in);
        String key = kb.next();
        
        if (key.compareToIgnoreCase("No") == 0)
        {
            System.out.println("You can not travel");
            System.exit(0);
        }
        
        System.out.print("You have car gas:");
        String gas = kb.next();
       
        
        if (key.compareToIgnoreCase("Yes") == 0 && (gas.compareToIgnoreCase("Yes") == 0 ) )
        {
            System.out.println("You are all set");
        }
        
        else
        {
            System.out.println("You can not travel");
        }
            
        
        
        
        
        
        
        
        
        
        
        /*
        System.out.println("public class X\n{\npublic static void main(String[] args)");
        
      
        Scanner keybord = new Scanner(System.in);

        System.out.print("Please enter the len: ");
        
        
        if(keybord.hasNextDouble())
        {
             double len = keybord.nextDouble();
             System.out.println("The length entered is: " + len);
        }
        else
        {
            String lenStr = keybord.next();
            System.out.println("The value entered is invalid!!");
        }
        
        System.out.println("Prog ended.!!!!!!!");
        
        
        String nm = keybord.next();
        System.out.println("Your name is: " + nm);
        System.out.print("Please enter Your Salary: ");
        double payRate = keybord.nextDouble();
       System.out.println("Your Salary is: " + payRate);
       System.out.print("Please enter Your Weekly Hours is ");
       double hours = keybord.nextDouble();
       System.out.println("Your Weekly Hours: " + hours);
       System.out.println("Weekly pay is: " +(payRate*hours));
       System.out.print("How many child you have: ");
       int child = keybord.nextInt();
       System.out.println("You have "+ child +" children.");
       System.out.print("Tell me about yourself: ");
       keybord.nextLine();
       String mySelf = keybord.nextLine();
       System.out.println(mySelf);
  */      
        
        
    }
}