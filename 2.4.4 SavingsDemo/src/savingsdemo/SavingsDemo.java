/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #4
 */
package savingsdemo;

public class SavingsDemo 
{
    public static void main(String[] args) 
    {        
        SavingsAccount accnt1 = new SavingsAccount(100, 3, 2.50);
        
        System.out.println(accnt1);
        
        accnt1.deposit(25);
        accnt1.deposit(10);
        accnt1.deposit(35);
        
        System.out.println(accnt1);
        
        accnt1.withdraw(100);
        accnt1.withdraw(50);
        accnt1.withdraw(10);
        accnt1.withdraw(1);
        accnt1.withdraw(1);
        
        System.out.println(accnt1);
        
        accnt1.monthlyProcess();
        
        System.out.println(accnt1);
    }
}
