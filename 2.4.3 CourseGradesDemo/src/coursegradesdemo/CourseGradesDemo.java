/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #3
 */
package coursegradesdemo;

import essaydemo.*;

public class CourseGradesDemo 
{
    public static void main(String[] args) 
    {
        GradedActivity lab = new GradedActivity();
        lab.setScore(85);
        
        PassFailExam passFail = new PassFailExam(20, 3, 70);
        
        Essay essay = new Essay();
        essay.setScore(25, 18, 17, 20);
        
        FinalExam finalExam = new FinalExam(50, 10);
        
        CourseGrades grades = new CourseGrades();
        
        grades.setLab(lab);
        grades.setPassFailExam(passFail);
        grades.setEssay(essay);
        grades.setFinalExam(finalExam);
        
        System.out.println(grades);
    }

    
}
