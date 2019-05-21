/*
 * Suraj Upadhyay
 * CSC 236-02
 * LAB 2 #4.5
 */
package workerdemo;

public class InvalidEmployeeNumber extends Exception
{
    public InvalidEmployeeNumber()
    {
        super("Entered invalid employee number: ");
    }
    
}
