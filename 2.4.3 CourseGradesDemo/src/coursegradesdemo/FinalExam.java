/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #3.2
 */
package coursegradesdemo;

import essaydemo.GradedActivity;

public class FinalExam extends GradedActivity
{
    private int totalQuest;
    private int missedQuest;
    private double score;
    
    public FinalExam(int totalQuest, int missedQuest)
    {
        this.totalQuest = totalQuest;
        this.missedQuest = missedQuest;
        this.score = (this.totalQuest - getNumMissed()) * getPointsEach();
        
        super.setScore(this.score);
    }
    
    private double getPointsEach()
    {
        return 100.0/this.totalQuest;
    }
    
    private int getNumMissed()
    {
        return this.missedQuest;
    }
}
