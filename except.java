import java.lang.*;
import java.util.*;

class Except
{
    public static void main(String[] args)
    {
        int x,y = 2;
        int arr[] = new int [5];
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Enter index: ");
            y = sc.nextInt();
            x = arr[y];
            //y = x/0;
            //System.out.println("Enter a number: ");
            //x = sc.nextInt();
            System.out.println("Success.");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Please input an integer.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Error. Please try something else.");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of bounds.");
        }
    }
}