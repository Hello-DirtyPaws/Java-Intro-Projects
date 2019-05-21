/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 6 #4
 */
package workerdemo;

public class WorkerDemo 
{
    public static void main(String[] args) 
    {
        createWorker("Jhon Smith", "123-A", "11-15-2009", "Day Shift", 16.50);
        createWorker("Jhon Smith", "10001", "11-15-2009", "Day Shift", 16.50);
        createWorker("Jhon Smith", "123-A", "11-15-2009", "66", 16.50);
        createWorker("Jhon Smith", "123-A", "11-15-2009", "Day Shift", -99.00);
    }
    
    public static void createWorker(String name, String employeeNum, 
                                    String hireDate, String shift, 
                                    double payRate)
    {
        try
        {
            ProductionWorker pw = new ProductionWorker(name, employeeNum, hireDate, shift, payRate);
            System.out.println(printInfo(name, employeeNum, hireDate, shift, payRate));
        } 
        catch (InvalidEmployeeNumber ex) 
        {
            System.out.println(ex.getMessage() + employeeNum);
            System.out.println("---------------------------------------");
            System.out.println(printInfo(name, "Invalid Employee Number.", hireDate, shift, payRate));
        } 
        catch (InvalidPayRate ex) 
        {
            System.out.println(ex.getMessage() + payRate);
            System.out.println("---------------------------------------");
            System.out.println(printInfo(name, employeeNum, hireDate, shift, 0.00));
        } 
        catch (InvalidShift ex) 
        {
            System.out.println(ex.getMessage() + shift);
            System.out.println("---------------------------------------");
            System.out.println(printInfo(name, employeeNum, hireDate, "Invalid Shift.", payRate));
        }
     
        System.out.println("***************************************\n");
    }
    
    public static String printInfo(String name, String employeeNum, 
                                    String hireDate, String shift, 
                                    double payRate)
    {
        String msg = String.format("%s%s%s%s%s%.2f",
                     "Employee Name = " + name + "."
             + "\nEmployee Number = " + employeeNum + "."
             + "\nHire Date = " + hireDate + ".", 
                    "\nShift = ", shift, ".",
                    "\nPay rate = $", payRate);
        return msg;
    }
}
