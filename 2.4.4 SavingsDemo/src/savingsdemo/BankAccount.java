/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #4.1
 */
package savingsdemo;

public abstract class BankAccount 
{
    private double balance;
    private int numDeposits;
    private int numWithdrawals;
    private double interestRate;
    private double monthlyServiceCharges;

    public BankAccount(double balance, double interestRate) 
    {
        this.balance = balance;
        this.interestRate = interestRate;
    }
    
    public void deposit(double amount)
    {
        this.balance += amount;
        this.numDeposits++;
    }
    
    public void withdrawal(double amount)
    {
        this.balance -= amount;
        this.numWithdrawals++;
    }
    
    public void calcInterest()
    {
        double interestAmount = (this.interestRate/1200.0) * this.balance;
        this.balance += interestAmount;
    }
    
    public void monthlyProcess()
    {
        this.balance -= monthlyServiceCharges;
        calcInterest();
        setMonthlyServiceCharges(0);
        this.numDeposits = 0;
        this.numWithdrawals = 0;
    }

    public void setMonthlyServiceCharges(double monthlyServiceCharges) 
    {
        this.monthlyServiceCharges = monthlyServiceCharges;
    }

    public double getBalance() 
    {
        return this.balance;
    }

    public int getNumDeposits() 
    {
        return numDeposits;
    }

    public int getNumWithdrawals() 
    {
        return numWithdrawals;
    }

    public double getInterestRate() 
    {
        return interestRate;
    }

    public double getMonthlyServiceCharges() 
    {
        return monthlyServiceCharges;
    }
    
    
}
