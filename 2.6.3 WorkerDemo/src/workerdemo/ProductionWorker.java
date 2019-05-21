/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 6 #4.2
 */
package workerdemo;

public class ProductionWorker extends Employee 
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
                            double payRate) throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate 
    {
        super(name, employeeNum, hireDate);
        setShift(shift);
        setPayRate(payRate);
    }

    public String getShift() 
    {
        return shift;
    }

    private void setShift(String shift) throws InvalidShift 
    {
          if( !(shift.equalsIgnoreCase("day shift") || shift.equalsIgnoreCase("night shift")) )
            {
                this.shift = shift;
                throw new InvalidShift();
            }
            else
            {
                this.shift = shift;
            }
        
        
    }

    public double getPayRate()
    {
        return payRate;
    }

    private void setPayRate(double payRate) throws InvalidPayRate 
    {
            if(payRate < 0)
            {
                this.payRate = payRate;
                throw new InvalidPayRate();
            }
            else 
            {
                this.payRate = payRate;
            }
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
