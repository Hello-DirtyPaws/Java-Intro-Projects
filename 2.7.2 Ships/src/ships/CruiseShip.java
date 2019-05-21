/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 7 #1.2
 */
package ships;

public class CruiseShip extends Ships
{
    private int maxPassenger;

    public CruiseShip(String shipName, String year, int capacity) 
    {
        super(shipName, year);
        this.maxPassenger = capacity;
    }

    public int getCapacity() 
    {
        return maxPassenger;
    }

    public void setCapacity(int capacity) 
    {
        this.maxPassenger = capacity;
    }

    @Override
    public String toString() 
    {
        return String.format("%s%,d","Ship Name = " + super.getShipName() + 
               "\nMax Passengers = ", maxPassenger);
    }
    
}
