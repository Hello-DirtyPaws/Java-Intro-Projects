/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 3 #3.1
 */
package teamleaderdemo;

import workdemo.ProductionWorker;

class TeamLeader extends ProductionWorker
{
    private double monthlyBonus;
    private double requiredTrainingHours;
    private double trainingHoursAttended;
    
    public TeamLeader() 
    {
        super();   
        this.monthlyBonus = 0;
        this.requiredTrainingHours = 0;
        this.trainingHoursAttended = 0;
    }

    TeamLeader(String name, String employeeNum, String hireDate, 
               String shift, double payRate, double monthlyBonus,
               double requiredTrainingHours, double trainingHoursAttended) 
    {
        super(name, employeeNum, hireDate, shift, payRate);   
        this.monthlyBonus = monthlyBonus;
        this.requiredTrainingHours = requiredTrainingHours;
        this.trainingHoursAttended = trainingHoursAttended;
    }

    public double getMonthlyBonus() 
    {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) 
    {
        this.monthlyBonus = monthlyBonus;
    }

    public double getRequiredTrainingHours() 
    {
        return requiredTrainingHours;
    }

    public void setRequiredTrainingHours(double requiredTrainingHours) 
    {
        this.requiredTrainingHours = requiredTrainingHours;
    }

    public double getTrainingHoursAttended() 
    {
        return trainingHoursAttended;
    }

    public void setTrainingHoursAttended(double trainingHoursAttended) 
    {
        this.trainingHoursAttended = trainingHoursAttended;
    }

    public String toString()
    {
        String msg =  String.format("%s%s%.2f%s%.1f%s%.1f",
                       super.toString(), 
                      "\nMonthly Bonus = $", monthlyBonus, 
                      "\nRequired Training Hours = ", requiredTrainingHours, 
                      "\nTraining Hours Attended = ", trainingHoursAttended);
        return msg;
    }
    
    
        
}
