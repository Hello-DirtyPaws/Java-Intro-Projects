/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 6 #2.3
 */
package testscoresdemo;

public class InvalidTestScore extends Exception 
{

    public InvalidTestScore() 
    {
        super("Invalid Score Found!");
    }

    public InvalidTestScore(String message) 
    {
        super(message);
    }
    
}
