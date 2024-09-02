import java.lang.*;
import java.io.*;

class OneD
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int num[][] = new int[3][3];
        
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
              System.out.print("Enter the " + (i + 1) + "and" + (j + 1) + " element: ");
          num[i][j] = Integer.parseInt(br.readLine());
          System.out.println();  
            }
        }
        
        System.out.println("Entered matrix");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(num[i][j]);  
            }
            
            System.out.println();
        }
        
        for (int i = 0; i < 3; i++)
        {
            for (int j = i; j < 3; j++)
            {
                int temp = num[i][j];
                num[i][j] = num[j][i];
                num[j][i] = temp;
            }
        }
        
        System.out.println("Transposed matrix");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(num[i][j]);  
            }
            System.out.println();
        }
    }
}
