/*
 * Suraj Upadhyay
 * CSC 162-01
 * LAB 7 #4.1
 */
package filearray;

import java.io.*;

public class FileArray 
{
    private int [] arry;

    public FileArray(int[] arry) 
    {
        this.arry = arry;
    }
    
    public void readArray(String fileName, int [] arry) throws IOException
    {
        DataInputStream file = new DataInputStream(new FileInputStream(fileName));
        for(int i = 0; i < arry.length; i++)
        {
            if(file.available() != 0)
            arry[i] = file.readInt();
        }
        file.close();
    }
    
    public void writeArray(String fileName, int [] arry) throws IOException
    {
        DataOutputStream file = new DataOutputStream(new FileOutputStream(fileName));
        for(int i = 0; i < arry.length; i++)
        {
            file.writeInt(arry[i]);
        }
        file.close();
    }
}
