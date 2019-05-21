/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 6 #3.1
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
        setUnitsOnHand(unitsOnHand);
        this.description = description;
        setPrice(price);
    }

    public int getUnitsOnHand() 
    {
        return unitsOnHand;
    }

    private void setUnitsOnHand(int unitsOnHand) 
    {
        try
        {
            if(unitsOnHand < 0)
            {
                throw new NegativeUnitsException("Error: Negative number given "
                                               + "for the units on hand: " + unitsOnHand);
            }
            else
            {
                this.unitsOnHand = unitsOnHand;
            }
        }
        catch(NegativeUnitsException nue)
        {
            System.out.println(nue.getMessage());
        }
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

    private void setPrice(double price) 
    {
        try
        {
            if(price < 0)
            {
                throw new NegativePriceException("Error: Negative number given "
                                               + "for the price: " + price);
            }
            else
            {
                this.price = price;
            }
        }
        catch(NegativePriceException npe)
        {
            System.out.println(npe.getMessage());
        }
    }

    public String toString() 
    {
        String s = String.format("%s%d %20s%-20s %10s%d %20s%.2f",
                                 "Item #", itemNo++,"Description = ", description,
                                 "Units On Hand = ", unitsOnHand, "Price = $", price);
        return s;
    }
}
