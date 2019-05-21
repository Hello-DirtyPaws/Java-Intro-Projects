/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 7 #1
 */

package carinstrument;

public class CarInstrument 
{
    public static void main(String[] args) 
    {
        FuelGauge fuel = new FuelGauge();
        Odometer carRun = new Odometer();
                
        for (int i = 0; i < 15; i++) 
        {
            fuel.fuelFill();
        }
        
        System.out.println(fuel + "\n" + carRun);
        int i = 0;

        while (fuel.getFuelAmount() != 0) 
        {
            carRun.increaseMiles(fuel);
            
            i++;
            
            if (i == 24) 
            {
                System.out.println("**********************"
                        + "\nCar running..");

                System.out.println(fuel + "\n" + carRun);
                
                i = 0;
            }

        }
    }
    
}
