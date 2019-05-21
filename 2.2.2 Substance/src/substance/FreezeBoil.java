/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 2 #2.1
 */

package substance;

public class FreezeBoil 
{
    private double temperature;

    public FreezeBoil(double temperature) 
    {
        this.temperature = temperature;
    }

    public double getTemperature()
    {
        return temperature;
    }

    public void setTemperature(int temperature)
    {
        this.temperature = temperature;
    }
    
    public boolean isEthylFreezing()
    {
        return (temperature <= -173);
    }
    
    public boolean isEthylBoiling()
    {
        return (temperature >= 172);
    }
    
    public boolean isOxygenFreezing()
    {
        return (temperature <= -362);
    }
    
    public boolean isOxygenBoiling()
    {
        return (temperature >= -306);
    }
    public boolean isWaterFreezing()
    {
        return (temperature <= 32);
    }
    public boolean isWaterBoiling()
    {
        return (temperature >= 212);
    }

    public String toString() 
    {
        String s = "";
        
        if(isEthylFreezing())
        {
            s += "Ethyl will freeze at " + temperature + (char) (176) + "K.\n";
        }
        if(isEthylBoiling())
        {
            s += "Ethyl will boil at " + temperature + (char) (176) + "K.\n";
        }
        if(isOxygenFreezing())
        {
            s += "Oxygen will freeze at " + temperature + (char) (176) + "K.\n";
        }
        if(isOxygenBoiling())
        {
            s += "Oxygen will boil at " + temperature + (char) (176) + "K.\n";
        }
        
        if(isWaterFreezing())
        {
            s += "Water will freeze at " + temperature + (char) (176) + "K.\n";
        }
        if(isWaterBoiling())
        {
            s += "Water will boil at " + temperature + (char) (176) + "K.\n";
        }

        return s;
    }
    
}
