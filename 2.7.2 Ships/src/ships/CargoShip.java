/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 7 #1
 */
package ships;

public class CargoShip extends Ships
{
    private int capacity;

    public CargoShip(String shipName, String year, int capacity) 
    {
        super(shipName, year);
        this.capacity = capacity;
    }

    public int getCapacity() 
    {
        return capacity;
    }

    public void setCapacity(int capacity) 
    {
        this.capacity = capacity;
    }

    @Override
    public String toString() 
    {
        return String.format("%s%,d%s", "Ship Name = " + super.getShipName() +
               "\nCapacity = ", capacity, " tons.");
    }
    
}
