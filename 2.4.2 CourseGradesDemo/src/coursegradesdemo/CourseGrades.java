/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #2.1
 */
package coursegradesdemo;

import essaydemo.*;

public class CourseGrades
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
    public String toString()
    {
        String msg0 = String.format("%-19s%-19s%s", "Exam Name", "Scores", "Grades\n"
                                  + "---------------------------------------------------\n");
        String msg1 = String.format("%-20s%-20s%s%s", "Lab", this.gradesArry[0].getScore(),
                                   this.gradesArry[0].getGrade(), "\n");
        String msg2 = String.format("%-20s%-20s%s%s", "Pass/Fail Exam", this.gradesArry[1].getScore(),
                                   this.gradesArry[1].getGrade(), "\n");
        String msg3 = String.format("%-20s%-20s%s%s", "Essay", this.gradesArry[2].getScore(),
                                   this.gradesArry[2].getGrade(), "\n");
        String msg4 = String.format("%-20s%-20s%s%s", "Final Exam", this.gradesArry[3].getScore(),
                                   this.gradesArry[3].getGrade(), "\n");
        
        return msg0+ msg1 + msg2 + msg3 + msg4;
    }
}
