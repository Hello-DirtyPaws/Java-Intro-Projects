/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 3 #2
 */
package shiftsupervisordemo;

public class ShiftSupervisorDemo 
{
    public static void main(String[] args) 
    {
        ShiftSupervisor supervisor1 = new ShiftSupervisor
        ("John Smith", "123-A", "11-15-2005", 48000.00, 6500.00);
        
        ShiftSupervisor supervisor2 = new ShiftSupervisor
        ("Joan Jones", "222-L", "12-12-2005", 55000.00, 8000.00);
        
        System.out.println(supervisor1);
        System.out.println("----------------------");
        System.out.println(supervisor2);
    }   
}
