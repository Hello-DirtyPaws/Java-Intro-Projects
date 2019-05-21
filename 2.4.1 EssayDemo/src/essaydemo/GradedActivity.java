/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #1.2
 */
package essaydemo;

public class GradedActivity 
{

    private double score; // Numeric score

    public void setScore(double s) 
    {
        score = s;
    }

    public double getScore() 
    {
        return score;
    }

    /**
     * The getGrade method returns a letter grade determined from the score
     * field.
     *
     * @return The letter grade.
     */
    
    public char getGrade() 
    {
        char letterGrade;
        if (score >= 90)
        {
            letterGrade = 'A';
        } else if (score >= 80) 
        {
            letterGrade = 'B';
        } else if (score >= 70)
        {
            letterGrade = 'C';
        } else if (score >= 60)
        {
            letterGrade = 'D';
        } else 
        {
            letterGrade = 'F';
        }
        return letterGrade;
    }
}
