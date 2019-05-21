/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 7 #1.1
 */

package carinstrument;

public class Odometer
{
    private int mileage;

    public Odometer() 
    {
        this.mileage = 0;
    }

    public Odometer(int mileage) 
    {
        this.mileage = mileage;
    }

    public int getMileage() 
    {
        return mileage;
    }

    public void setMileage(int mileage)
    {
        this.mileage = mileage;
    }

    public void increaseMiles(FuelGauge fuel)
    {
        if(this.mileage == 999999)
        {
            this.mileage = 0;
        }
        else
        {
            this.mileage++;
        }
        
        //miles will never be zero.
        //so we wont encounter 0%24 which 0.
        if(this.mileage % 24 == 0)
        {
            fuel.fuelBurn();
        }
    }
    
    @Override
    public String toString() 
    {
        return "Current Mileage: " + mileage + " miles.";
    }
    
    
    
}
