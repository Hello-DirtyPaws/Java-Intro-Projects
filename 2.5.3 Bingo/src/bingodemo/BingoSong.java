/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 5 #3.1
 */
package bingodemo;

public class BingoSong 
{
    private static String [] bingoWrd = {"B-", "I-", "N-", "G-", "O!"};
    
    private String changeBingo(int verse)
    {
        if(verse >= 0)
        {
            bingoWrd[verse] = "clap-"; 
            if(verse == bingoWrd.length-1)
            {
                bingoWrd[verse] = "clap";
            }
        }
        
        String strBingoWrd = "";
        
        for (String bingoWrd1 : bingoWrd) 
        {
            strBingoWrd += bingoWrd1;
        }
        
        return strBingoWrd;
    }
    
    private void printSong(int limit, int verse)
    {
        String changedWord = changeBingo(verse-2);
        System.out.println("VERSE #" + (verse) + "\n"
                   + "There was a farmer had a dog.\n"
                   + "And bingo was his name-O.\n"
                   + changedWord + "\n"
                   + changedWord + "\n"
                   + changedWord + "\n"
                   + "And bingo was his name-O!.\n");
         
        if(verse < limit && verse < 6)
        {
            printSong(limit, ++verse);
        }
    }
    
    public void callToPrintSong(int limit)
    {
        printSong(limit, 1);
    }
}
