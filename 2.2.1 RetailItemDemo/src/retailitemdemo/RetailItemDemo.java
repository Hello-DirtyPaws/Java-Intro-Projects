//Suraj Upadhyay
//CSC 162-01
//LAB 2 #1

package retailitemdemo;

public class RetailItemDemo 
{
    public static void main(String[] args) 
    {
        RetailItem obj1 = new RetailItem();
        
        obj1.setUnitsOnHand(12);
        obj1.setDescription("Jackets");
        obj1.setPrice(59.95);
        
        RetailItem obj2 = new RetailItem(40, "Jeans", 34.95);
        
        RetailItem obj3 = new RetailItem();
        
        obj3.setUnitsOnHand(20);
        obj3.setDescription("Shirts");
        obj3.setPrice(24.95);
        
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
    
}
