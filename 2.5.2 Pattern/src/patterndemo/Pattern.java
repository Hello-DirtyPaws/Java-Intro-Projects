/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 5 #2.1
 */
package patterndemo;

public class Pattern 
{    
    private int maxLevel;
    private int currLevel;

    public Pattern(int maxLevel) 
    {
        this.maxLevel = maxLevel+1;
        this.currLevel = 1;
    }
    
    private String baseCase()
    {
        return "*\n" +
               "* *\n" +
               "  *";
    }
    
    private String makePattern(int maxLevel, int currLevel, String pattern)
    {
        if(currLevel == maxLevel)
        {
            return pattern;
        }
        else 
        {
            String pattern2 = "", pattern3 = "";

            for (int i = 0; i < pattern.length(); i++) 
            {
                if (pattern.charAt(i) == '\n' || i == 0) 
                {
                    if(pattern.charAt(i) == '\n')
                    {
                        pattern2 += pattern.charAt(i);
                    }
                    for (int j = 1; j <= 2 * currLevel; j++) 
                    {
                        pattern2 += "  ";
                    }
                    if (i == 0) 
                    {
                        pattern2 += pattern.charAt(i);
                    }
                } else {
                    pattern2 += pattern.charAt(i);
                }
            }

            for (int i = 1; i <= 4 * currLevel; i++) 
            {
                pattern3 += "* ";
            }

            String finalPattern = pattern + "\n" + pattern3 + "\n" + pattern2;

            return makePattern(maxLevel, ++currLevel, finalPattern);
        }
    }
    
    public void printPattern()
    {
        System.out.println(makePattern(maxLevel, currLevel, baseCase()));
    }
    
}
