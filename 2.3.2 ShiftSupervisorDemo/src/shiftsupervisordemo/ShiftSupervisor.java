/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 3 #2.1
 */

package shiftsupervisordemo;

import workdemo.Employee;

public class ShiftSupervisor extends Employee 
{
    private double salary;
    private double bonus;

    public ShiftSupervisor() 
    {
        super();
        this.salary = 0;
        this.bonus = 0;
    }

    public ShiftSupervisor(String name, String employeeNum, 
                           String hireDate, double salary, 
                           double bonus) 
    {
        super(name, employeeNum, hireDate);
        this.bonus = bonus;
        this.salary = salary;
    }
        
    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }

    public double getBonus() 
    {
        return bonus;
    }

    public void setBonus(double bonus) 
    {
        this.bonus = bonus;
    }

    public String toString() 
    {
        String msg = super.toString() + "\n" + 
               String.format("%s%,.2f%s%,.2f", 
               "Salary = $", salary,
               "\nBonus = $", bonus);
        
        return msg;
    }
    
    
}
