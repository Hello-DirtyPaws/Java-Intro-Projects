/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 3 #1
 */
package workdemo;

public class WorkDemo 
{
    public static void main(String[] args) 
    {
        ProductionWorker emp1 = new ProductionWorker
        ("John Smith", "123-A", "11-15-2005", "Day Shift", 16.50);
        
        ProductionWorker emp2 = new ProductionWorker
        ("Joan Jones", "222-L", "12-12-2005", "Night Shift", 18.50);
        
        System.out.println(emp1);
        System.out.println("---------------------------");
        System.out.println(emp2);    
    }    
}
