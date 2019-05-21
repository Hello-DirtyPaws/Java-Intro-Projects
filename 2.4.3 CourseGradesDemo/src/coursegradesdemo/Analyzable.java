/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 4 #3.5
 */
package coursegradesdemo;

import essaydemo.GradedActivity;

public interface Analyzable 
{
    double getAverage();
    GradedActivity getHighest(); 
    GradedActivity getLowest();
}
