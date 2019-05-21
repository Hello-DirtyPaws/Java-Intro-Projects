/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 6 #1
 */
package testscoresdemo;

public class TestScoresDemo 
{
    public static void main(String[] args) 
    {
        double[] badscores = {97.5, 66.7, 88.0, 101.0, 99.0};
        double[] goodscores = {97.5, 66.7, 88.0, 100.0, 99.0};
        
        TestScores badscoresObj = new TestScores(badscores);
        TestScores goodscoresObj = new TestScores(goodscores);
        
        System.out.println(badscoresObj);
        System.out.println(goodscoresObj); 
        
    }
    
}
