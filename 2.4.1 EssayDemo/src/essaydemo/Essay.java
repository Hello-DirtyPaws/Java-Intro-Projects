/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #1.1
 */
package essaydemo;

import java.util.Scanner;

public class Essay extends GradedActivity
{
    private double grammer, spelling,
            length, content, score; 
    public Scanner key = new Scanner(System.in);

     public Essay() 
    {
        this.grammer = 0;
        this.spelling = 0;
        this.length = 0;
        this.content = 0;
    }
    
    public double getGrammer() 
    {
        return grammer;
    }
   
    private void setGrammer(double grammer) 
    {
        while(grammer > 30 || grammer < 0)
        {
            System.out.print("Please enter valid points for grammer: ");
            grammer = key.nextDouble();
        }
        this.grammer = grammer;
    }

    public double getSpelling() 
    {
        return spelling;
    }

    private void setSpelling(double spelling) 
    {
        while(spelling > 20 || spelling < 0)
        {
            System.out.print("Please enter valid points for grammer: ");
            spelling = key.nextDouble();
        }
        this.spelling = spelling;
    }

    public double getLength() 
    {
        return length;
    }

    private void setLength(double length) 
    {
        while(length > 20 || length < 0)
        {
            System.out.print("Please enter valid points for grammer: ");
            length = key.nextDouble();
        }
        this.length = length;
    }

    public double getContent() 
    {
        return content;
    }

    private void setContent(double content) 
    {
        while(content > 30 || content < 0)
        {
            System.out.print("Please enter valid points for grammer: ");
            content = key.nextDouble();
        }
        this.content = content;
    }

    public double getScore() 
    {
        return this.score;
    }

    public void setScore(double grammer, double spelling, double length, double content) 
    {
        setContent(content); 
        setGrammer(grammer);
        setLength(length); 
        setSpelling(spelling);
        
        this.score = (this.grammer + this.spelling
                    + this.length + this.content);
        
        super.setScore(this.score);
    }

    public String toString() 
    {
        return "The points for the essay are as follows:" + 
               "\nGrammer = " + grammer + "\nSpelling = " + spelling + 
               "\nLength = " + length + "\nContent = " + content + 
               "\nThe Final Score is " + score +
                "\nAnd the Final grade is " + getGrade() + ".";
    }
    
    
        
}
