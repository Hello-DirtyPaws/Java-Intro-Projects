/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 6 #4.1
 */
package workerdemo;

public class Employee 
{
    private String name;
    private String employeeNum;
    private String hireDate;

    public Employee()
    {
        this.name = "No Name";
        this.employeeNum = "000-L"; //Default Employee Number
        this.hireDate = "No Date";
    }
    
    public Employee(String name, String employeeNum, String hireDate) throws InvalidEmployeeNumber 
    {
        this.name = name;
        setEmployeeNum(employeeNum);
        this.hireDate = hireDate;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getEmployeeNum()
    {
        return employeeNum;
    }

    private void setEmployeeNum(String employeeNum) throws InvalidEmployeeNumber 
    {
         if(isValidEmpNum(employeeNum))
            {
                this.employeeNum = employeeNum;
            }
            else
            {
                this.employeeNum = employeeNum;
                throw new InvalidEmployeeNumber();
            }
       
      }

    public String getHireDate() 
    {
        return hireDate;
    }

    public void setHireDate(String hireDate)
    {
        this.hireDate = hireDate;
    }
    
    private boolean isValidEmpNum(String empNum)
    {     
        empNum = empNum.toUpperCase();
    
        if(empNum.length() != 5 || empNum.charAt(3) != '-')
        {
            return false;
        }
        
        //Program will reach here when empNum's length is 5 
        //and its 4th character is '-'.
        for (int i = 0; i < 3; i++)
        {
            if(!Character.isDigit(empNum.charAt(i)))
            {
                return false;
            }
        }
        
        return !(empNum.charAt(4) < 64 || empNum.charAt(4) > 77);
    }
    
    public String toString() 
    {
        return "Employee Name = " + name + "."
             + "\nEmployee Number = " + employeeNum + "."
             + "\nHire Date = " + hireDate + ".";
    }
        
    

}
