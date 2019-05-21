/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 3 #1.1
 */
package workdemo;

public class ProductionWorker //extends Employee 
{
    private String shift;
    private double payRate;

    public ProductionWorker() 
    {
        super();
        this.shift = "Day Shift";
        this.payRate = 0;
    }
    
    public ProductionWorker(String name, String employeeNum, 
                            String hireDate, String shift, 
                            double payRate) 
    {
        //super(name, employeeNum, hireDate);
        this.shift = shift;
        this.payRate = payRate;
    }

    public String getShift() 
    {
        return shift;
    }

    public void setShift(String shift) 
    {
        this.shift = shift;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public void setPayRate(double payRate) 
    {
        this.payRate = payRate;
    }

    public String toString() 
    {
        String msg = String.format("%s%s%s%s%s%.2f",
                     super.toString(), 
                    "\nShift = ", this.shift, ".",
                    "\nPay rate = $", payRate);
        
        return msg;
    }
    
    
    
}
