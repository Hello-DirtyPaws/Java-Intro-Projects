/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 7 #1.1
 */
package ships;

public class Ships 
{
    private String shipName;
    private String year;

    public Ships(String shipName, String year) 
    {
        this.shipName = shipName;
        this.year = year;
    }

    public String getShipName() 
    {
        return shipName;
    }

    public void setShipName(String shipName) 
    {
        this.shipName = shipName;
    }

    public String getYear()
    {
        return year;
    }

    public void setYear(String year) 
    {
        this.year = year;
    }

    @Override
    public String toString() 
    {
        return "Ship Name = " + shipName + "\nYear = " + year;
    }
    
    
}
