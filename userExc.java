import java.util.*;
class NumberException extends Exception
{
    NumberException(String str)
    {
        super(str);
    }
}
class Handle
{
    public static void main(String a[])
    {
        int s=0;
        boolean continueInput=true;
        do
        {
            try
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number: ");
                s = sc.nextInt();
                if(s == 5 || s == 6 || s == 7)
                {
                    System.out.println("Valid input");
                }
                else
                {
                    NumberException e = new NumberException("Incorrect Input. Please try again.");
                    throw e;
                }
                continueInput = false;
            }
            catch(NumberException e)
            {
                System.out.println("Exception is : " + e);
            }
        }
        while(continueInput);
    }
}