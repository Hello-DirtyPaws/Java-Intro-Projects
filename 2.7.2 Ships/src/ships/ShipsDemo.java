/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 7 #1
 */

package ships;

public class ShipsDemo 
{
    public static void main(String[] args) 
    {
        Ships [] ships = new Ships[3];
        
        ships[0] = new Ships("Lolipop" , "1960");
        ships[1] = new CruiseShip("DisneyMagic", "1988", 2400);
        ships[2] = new CargoShip("Black Pearl", "1800", 50000);
        
        for (Ships ship : ships) 
        {
            System.out.println(ship);
            System.out.println("------------------------");
        }
    }
    
}
