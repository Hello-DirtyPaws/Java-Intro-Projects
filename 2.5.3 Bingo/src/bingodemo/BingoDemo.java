/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 5 #3
 */

package bingodemo;

import java.util.Scanner;

public class BingoDemo 
{
    public static void main(String[] args) 
    {
        BingoSong song = new BingoSong();
        
        Scanner key = new Scanner(System.in);
        
        System.out.print("Please enter the total "
                         + "number of verses to print(1-6): ");
        
        song.callToPrintSong(key.nextInt());
    }
    
}
