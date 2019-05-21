/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #2
 */
package savingsdemo;

public class SavingsAccount extends BankAccount
{
    private boolean status;
    
    public SavingsAccount(double balance, double interestRate, double monthlyServiceCharges)
    {
        super(balance, interestRate);
        super.setMonthlyServiceCharges(monthlyServiceCharges);
    }
    
    public boolean isActive()
    {
        status = super.getBalance() > 25;
        return status;
    }
    
    public void withdraw(double amount)
    {
        if(isActive())
        {
            super.withdrawal(amount);
        }
    }
    
    @Override
    public void deposit(double amount)
    {
        super.deposit(amount);
        if(super.getBalance() > 25)
        {
            status = true;
        }
    }
    
    @Override
    public void monthlyProcess()
    {
        if(super.getNumWithdrawals() > 4)
        {
            super.setMonthlyServiceCharges(super.getMonthlyServiceCharges() + 
                                           super.getNumWithdrawals() - 4);
        }
        
        super.monthlyProcess();
        
        if(super.getBalance() <= 25)
        {
            status = false;
        }
        
    }
    
    public String toString()
    {
        String msg = String.format("%-50s$%,.2f%-52s%d%-52s%d%s", 
                     "The Balance available now: ", super.getBalance(), 
                     "\nThe total number of Deposits(monthly): ", super.getNumDeposits(),
                     "\nThe total number of Withdrawals(monthly): ", super.getNumWithdrawals(),
                     "\n--------------------------------------------------------\n");
        return msg;
    }
}
