/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 6 #2.1
 */
package testscoresdemo;

public class TestScores 
{
    private double [] scores;

    public TestScores(double[] scores) 
    {
        this.scores = scores;
    }
    
    private double avg()
    {
        double avg = 0.0;
        
        for(int i = 0; i < this.scores.length; i++)
        {
            avg += this.scores[i];
        }
        
        return (avg/(double)this.scores.length);
    }
    
    private boolean checkScores()
    {
        for(int i = 0; i < this.scores.length; i++)
        {
            if(this.scores[i] > 100 || this.scores[i] < 0)
            {
                try 
                {
                    throw new InvalidTestScore("Invalid score found!");
                } 
                catch (InvalidTestScore ex)
                {
                    String msg = "The given scores: [";
                    if (this.scores.length > 0) 
                    {
                        for (int j = 0; j < this.scores.length - 1; j++) 
                        {
                            msg += this.scores[j] + ", ";
                        }
                    }
                    msg += this.scores[this.scores.length - 1];
                    msg += "]\n";

                    System.out.println(msg + ex.getMessage() + " At location " + i +
                                       ". And the invalid score is " + this.scores[i]);
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public String toString()
    {
        String msg = "";
        
        if(checkScores())
        {
            msg = "The average of the scores: [";
            if (this.scores.length > 0) 
            {
                for (int i = 0; i < this.scores.length - 1; i++) 
                {
                    msg += this.scores[i] + ", ";
                }
            }
            msg += this.scores[this.scores.length - 1];
            
                        msg += String.format("%s%.2f", "] is ", avg()) ; 
        }
        
        return msg;
    }
    
}
