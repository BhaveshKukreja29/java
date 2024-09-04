import java.lang.*;
import java.io.*;

class OneD
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int num[][] = new int[10][10];
        
        System.out.println("Enter row: ");
        
        int row = Integer.parseInt(br.readLine());
        
        System.out.println("Enter row: ");
        
        int col = Integer.parseInt(br.readLine());
        if (row == col)
        {
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    System.out.print("Enter the " + (i + 1) + "and" + (j + 1) + " element: ");
                    num[i][j] = Integer.parseInt(br.readLine());
                    System.out.println();  
                }
            }
        
            System.out.println("Entered matrix");
            for (int i = 0; i < row; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    System.out.print(num[i][j]);  
                }
                
                System.out.println();
            }
        
            System.out.println();
            System.out.println();
            
            int sum = 0;
            
            for (int i = 0; i < col; i++)
            {
                for (int j = 0; j < col; j++)
                {
                    if (i == j)
                    {
                        sum += num[i][j];
                    }
                }
            }
            System.out.println();

        
            System.out.println("Sum of diagonal elements: " + sum);
        }
        
        else
        {
            System.out.println("Not a square matrix.");
        }
    }
}
