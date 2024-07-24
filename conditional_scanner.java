import java.util.*;
class hello
{
    public static void main(String affsaf[])
    {
        System.out.println("Bhavesh Kukreja C21");
        System.out.println();
        
        int marks;
    
        System.out.println("Welcome to grade calculator!");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your overall percentage: ");
        System.out.println("");
        marks = input.nextInt();

        System.out.println("Below is your grade!");
        System.out.println("");

        if (marks < 60)
        {
            System.out.println("F");
        }
    
        else if (marks > 90)
        {
            System.out.println("A");
        }
        
        else if (marks > 80)
        {
            System.out.println("B");
        }
        
        else if (marks > 70)
        {
            System.out.println("C");
        }
        
        else if (marks > 60)
        {
            System.out.println("D");
        }
    }
}
