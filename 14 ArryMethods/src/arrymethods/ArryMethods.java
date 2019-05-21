//Suraj Upadhyay
//CSC 161-01
//LAB 14

package arrymethods;

import java.util.Scanner;

public class ArryMethods 
{
    public static void main(String[] args) 
    {
        int[][] B = new int[4][4];
        int [] A = createArithmeticSeq();
        
        System.out.println("\nThe 1 D array of the sequence is as follows:");
        
        for(int i = 0; i < A.length; i++)
        {
            System.out.print(A[i] + " ");
        }
        
        matricize(A, B);
        
        B = reverseDiagonal(B);
        
        System.out.println("\n\n" + magicCheck(A, A.length, B, 4, 4));
        
        System.out.println("");
        
        printMatrix(B);
        
    }
    
    public static int [] createArithmeticSeq()
    {
        int [] A = new int[16];
        Scanner key = new Scanner(System.in);
        
        System.out.print("Please enter the first number of the seq: ");
        int firstNum = key.nextInt();
        
        System.out.print("Please enter the difference: ");
        int diff = key.nextInt();
        
        for(int i = 0; i < 16; i++)
        {
            A[i] = firstNum + (i * diff); 
        }
        return A;
    }
    
    public static int [][] matricize(int [] A, int [][] B)
    {
        int indexA = 0;
        
        for(int i = 0; i < B.length; i++)
        {
            for(int j = 0; j < B[0].length; j++)
            {
                B[i][j] = A[indexA++];
            }
        }
        return B;
    }
    
    public static int [][] reverseDiagonal(int [][] B)
    {
        int temp;
        for(int i = 0; i < B.length/2; i++)
        {
            for(int j = 0; j < B[0].length/2; j++)
            {
                if(j + i == B.length)
                {
                    temp = B[i][j];
                    B[i][j] = B[j][i];
                    B[j][i] = temp;
                }
                if (i == j)
                {
                    temp = B[i][j];
                    B[i][j] = B[B.length-1-i][B.length-1-j];
                    B[B.length-1-i][B.length-1-j] = temp;
                }
            }
        }
        return B;
    }
    
    public static String magicCheck(int [] A, int sizeA, int [][] B, int rowB, int colB)
    {
        double magicNumber = 0;
        String result = "It is a magic square.";
        
        for(int i = 0; i < sizeA; i++)
        {
            magicNumber += A[i];
        }
        magicNumber = magicNumber/4.0;
        
        int rowSum, colSum, diagonalSum = 0;
        
        for(int i = 0; i < rowB; i++)
        {
            rowSum = 0;
            colSum = 0;
            for(int j = 0; j < colB; j++)
            {
                rowSum += B[i][j];
                colSum += B[j][i];
            }
            
            //compare the sum with magic number.
            if(rowSum != magicNumber && colSum != magicNumber)
            {
                return "It is not a magic square.";
            }
            
        }
        
        return result;
    }
    
    public static void printMatrix(int [][] B)
    {
        for(int i = 0; i < B.length; i++)
        {
            for(int j = 0; j < B[0].length; j++)
            {
                System.out.print(B[i][j]+ "  ");
            }
            System.out.println("");
        }
    }
    
}
