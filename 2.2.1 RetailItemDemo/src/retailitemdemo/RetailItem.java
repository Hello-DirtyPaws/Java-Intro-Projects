/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 2 #1.1
 */

package retailitemdemo;

class RetailItem 
{
    private int unitsOnHand;
    private String description;
    private double price;
    private static int itemNo = 1;

    public RetailItem() 
    {
        unitsOnHand = 0;
        description = "";
        price = 0.00;
    }    

    public RetailItem(int unitsOnHand, String description, double price) 
    {
        this.unitsOnHand = unitsOnHand;
        this.description = description;
        this.price = price;
    }

    public int getUnitsOnHand() 
    {
        return unitsOnHand;
    }

    public void setUnitsOnHand(int unitsOnHand) 
    {
        this.unitsOnHand = unitsOnHand;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public String toString() 
    {
        String s = String.format("%s%d %20s%-20s %10s%d %20s%.2f",
                                 "Item #", itemNo++,"Description = ", description,
                                 "Units On Hand = ", unitsOnHand, "Price = $", price);
        return s;
    }
}
