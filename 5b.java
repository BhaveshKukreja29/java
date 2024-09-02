import java.lang.*;
import java.io.*;

class OneD
{
    public static void main(String args[]) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        int num[] = new int[3];
        
        for (int i = 0; i < 3; i++)
        {
          System.out.print("Enter the marks of " + (i + 1) + " subject: ");
          num[i] = Integer.parseInt(br.readLine());
          System.out.println();
        }
        
        int total = 0;
        int highest = 0;
        
        for (int i = 0; i < 3; i++)
        {
          if (num[i] > highest)
          {
            highest = num[i];
          }
          
          total = total + num[i];
        }
        
        System.out.println("Total marks is: " + total);
        System.out.println("Highest is: " + highest);
    }
}
