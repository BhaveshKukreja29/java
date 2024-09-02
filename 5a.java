import java.lang.*;
import java.io.*;

class OneD
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int num[] = new int[5];
        
        for (int i = 0; i < 5; i++)
        {
          System.out.print("Enter the " + (i + 1) + " element: ");
          num[i] = Integer.parseInt(br.readLine());
          System.out.println();
        }
        
        int even = 0;
        int odd = 0;
        
        for (int i = 0; i < 5; i++)
        {
          if (num[i] % 2 == 0)
          {
            even++;
          }
          
          else
          {
            odd++;
          }
        }
        
        System.out.println("Even places are: " + even);
        System.out.println("Odd places are: " + odd);
    }
}
