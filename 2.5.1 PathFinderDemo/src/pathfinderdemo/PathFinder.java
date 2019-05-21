/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 5 #1.1
 */
package pathfinderdemo;

public class PathFinder 
{    
    private int aX, aY, bX, bY, tracker2, totalPaths;
    private String dir, allDirections;

    public PathFinder(int aX, int aY, int bX, int bY) 
    {
        this.aX = aX;
        this.aY = aY;
        this.bX = bX;
        this.bY = bY;
        this.dir = "";
        this.allDirections = "";
        this.tracker2 = 0;
        this.totalPaths = 0;
    }

    public PathFinder(int bX, int bY) 
    {
        this.bX = bX;
        this.bY = bY;
        this.aX = 0;
        this.aY = 0;
        this.dir = "";
        this.allDirections = "";
        this.tracker2 = 0;
        this.totalPaths = 0;
    }
    
    private void move1(int aX, int aY, int bX, int bY)
    {
        int i = 0;
        if(aX != bX)
        {
            i++;
            dir += "E";
            move1(aX + 1, aY, bX, bY);
            
            //removing the last element or direction as going in reverse
            //or coming back from a point where
            //the above recursion was started.
            
            dir = dir.substring(0, dir.length()-1);
        }
        else if(aY != bY)
        {
            i++;
            dir += "N";
            move1(aX, aY + 1, bX, bY);
            
            //removing the last element or direction as going in reverse
            //or coming back from a point where
            //the above recursion was started.
            
            dir = dir.substring(0, dir.length()-1);
        }
        
        //only executes when aX == bX && aY == bY.
        if(i == 0)
        {
            this.totalPaths++;
            this.allDirections += dir + "\n";
        }
    }
    
    private void move2(int aX, int aY, int bX, int bY)
    {
        if(aY != bY)
        {
            dir += "N";
            aY++;
            move1(aX, aY, bX, bY);
            
            //removing the last element or direction as going in reverse.
            dir = dir.substring(0, dir.length()-1);
            aY--;
            
            if(aX != bX)
            { 
                tracker2++;
                dir += "E";
                move2(aX + 1, aY, bX, bY);
                
                //Keeping a track of the recursions so only the first one 
                //could go further while rest recursions simply goes back 
                //to the point where they were called without affecting the code.
                
                tracker2--;
                
                //removing the last element or direction as going in reverse
                //or coming back from a point where
                //the above recursion was started.
                
                dir = dir.substring(0, dir.length()-1);
            }
            if(tracker2 == 0)
            {
                if(aY != bY)
                {
                    dir = "N";
                    move2(aX, aY + 1, bX, bY);
                }
            }
        }
    }
    
    @Override
    public String toString()
    {
        move2(this.aX, this.aY, this.bX, this.bY);
        String msg = this.allDirections + 
                     "The total number of paths taken are " +
                     this.totalPaths;
        return msg;
    }
}
