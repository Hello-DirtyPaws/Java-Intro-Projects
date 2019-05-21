/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 7 #1.2
 */

package carinstrument;

public class FuelGauge
{
    private int fuelAmount;

    public FuelGauge() 
    {
        this.fuelAmount = 0;
    }    
    
    public FuelGauge(int fuelAmount) 
    {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelAmount() 
    {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) 
    {
        this.fuelAmount = fuelAmount;
    }
    
    public void fuelFill()
    {
        if(this.fuelAmount < 15)
        {
            this.fuelAmount++;
        }
        else
        {
            try 
            {
                throw new Exception("Fuel tank full. No more fuel can be filled!");
            } 
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }

        }
    }
    
    public void fuelBurn()
    {
        if(this.fuelAmount > 0)
        {
            this.fuelAmount--;
        }
        else
        {
            try 
            {
                throw new Exception("Sorry car cannot move further. Insufficient fuel!");
            } 
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    @Override
    public String toString()
    {
        return "Current Fuel Level: " + this.fuelAmount + " gallons.";
    }
    
    
}
