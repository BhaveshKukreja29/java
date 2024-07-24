import java.lang.*;

class buffer2
{
    public static void main(String a[])
    {
        System.out.println("Bhavesh Kukreja C21");
        System.out.println();
        
        System.out.println("The following is the count of number divisible by 7 which are greater than 100 and less than 200.");
        System.out.println("");
        int count = 0;
        int sum = 0;

        for (int i = 100; i < 201; i++)
        {
            if (i % 7 == 0)
            {
                sum += i;
                count++;
            }
        }

        System.out.println("Count is " + count);
        System.out.println("Sum is " + sum);
    }
}
