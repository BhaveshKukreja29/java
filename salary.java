//WAP to create an exception ‘PayOutOfBounds’ when the basic pay paid to
//the Superintendent it is less than 25,000 and greater than 50,000.

import java.util.*;
class PayOutOfBounds extends Exception
{
    PayOutOfBounds(String str)
    {
        super(str);
    }
}
class Salary
{
    public static void main(String a[]) throws PayOutOfBounds
    {
        int s = 0;
        boolean continueInput = true;
        do
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the salary of Superintendent: ");
                s = sc.nextInt();
                if(s >= 25000 && s <= 50000)
                {
                    System.out.println("Superintendent is paid well.");
                }
                else 
                {
                    PayOutOfBounds e = new PayOutOfBounds("Payment Out of Bounds");
                    throw e;
                }
                continueInput = false;
            }
            catch(PayOutOfBounds e)
            {
                System.out.println(e);
            }
        }
        while(continueInput);
    }
}