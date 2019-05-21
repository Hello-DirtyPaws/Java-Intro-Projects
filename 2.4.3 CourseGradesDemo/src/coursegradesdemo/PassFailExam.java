/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #3.4
 */
package coursegradesdemo;

public class PassFailExam extends PassFailActivity
{
    private int totalQuest;
    private int missedQuest;
    private double score;

    public PassFailExam(int totalQuest, int missedQuest, int minPassingScore) 
    {
        super(minPassingScore);
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