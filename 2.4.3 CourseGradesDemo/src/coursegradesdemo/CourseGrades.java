/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #3.1
 */
package coursegradesdemo;

import essaydemo.*;

public class CourseGrades implements Analyzable 
{
    private int grades;
    private GradedActivity [] gradesArry;
    
    public CourseGrades()
    {
        this.grades = 4;
        this.gradesArry = new GradedActivity[grades];
    }
    
    public void setLab(GradedActivity labGrade)
    {
        this.gradesArry[0] = labGrade;
    }
    
    public void setPassFailExam(PassFailExam passFailGrade)
    {
        this.gradesArry[1] = passFailGrade;
    }
    
    public void setEssay(Essay essayGrade)
    {
        this.gradesArry[2] = essayGrade;
    }
    
    public void setFinalExam(FinalExam finalExamGrade)
    {
        this.gradesArry[3] = finalExamGrade;
    }
    
    @Override
    public double getAverage() 
    {
        double avg = gradesArry[0].getScore();
        
        for(int i = 1; i < grades; i++)
        {
            avg += gradesArry[i].getScore();
        }
        
        return avg/grades;
    }

    @Override
    public GradedActivity getHighest() 
    {
        int highestIndex = 0;
        
        for(int i = 1; i < grades; i++)
        {
            if(gradesArry[highestIndex].getScore() < gradesArry[i].getScore())
            {
                highestIndex = i;
            }
        }
        
        return gradesArry[highestIndex];
    }

    @Override
    public GradedActivity getLowest() 
    {
        int lowestIndex = 0;
        
        for(int i = 1; i < grades; i++)
        {
            if(gradesArry[lowestIndex].getScore() > gradesArry[i].getScore())
            {
                lowestIndex = i;
            }
        }
        return gradesArry[lowestIndex];
    }
    
    @Override
    public String toString()
    {
        String msg0 = String.format("%-20s%-18s%s", "Exam Name", "Scores", "Grades\n"
                                  + "---------------------------------------------------\n");
        String msg1 = String.format("%-20s%-20.3f%s%s", "Lab", this.gradesArry[0].getScore(),
                                   this.gradesArry[0].getGrade(), "\n");
        String msg2 = String.format("%-20s%-20.3f%s%s", "Pass/Fail Exam", this.gradesArry[1].getScore(),
                                   this.gradesArry[1].getGrade(), "\n");
        String msg3 = String.format("%-20s%-20.3f%s%s", "Essay", this.gradesArry[2].getScore(),
                                   this.gradesArry[2].getGrade(), "\n");
        String msg4 = String.format("%-20s%-20.3f%s%s", "Final Exam", this.gradesArry[3].getScore(),
                                   this.gradesArry[3].getGrade(), "\n");
        String msg5 = String.format("%s\n%s%,.3f\n","................................................."
                                 , "The average of all the scores is ", getAverage());
        String msg6 = String.format("%s%,.3f\n","The highest score of all the scores is ", 
                                    getHighest().getScore());
        String msg7 = String.format("%s%,.3f\n","The lowest score of all the scores is ", 
                                    getLowest().getScore());
        
        return (msg0+ msg1 + msg2 + msg3 + msg4 + msg5 + msg6 + msg7);
    }

}
