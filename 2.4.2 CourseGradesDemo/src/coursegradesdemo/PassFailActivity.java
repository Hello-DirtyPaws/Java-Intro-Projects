/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #2.3
 */
package coursegradesdemo;

import essaydemo.GradedActivity;

public class PassFailActivity extends GradedActivity
{
    private int minPassingScore;

    public PassFailActivity(int minPassingScore) 
    {
        this.minPassingScore = minPassingScore;
    }
    
    public char getGrade()
    {
        if(super.getScore() >= minPassingScore)
            return 'P';
        else
            return 'F';
    }
}
