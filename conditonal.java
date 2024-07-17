import java.lang.*;
class hello
{
    public static void main(String affsaf[])
    {
            int marks = 90;
        
            System.out.println("Welcome to grade calculator!");
            System.out.println("Below is your grade!");
            System.out.println("");

            if (marks < 35)
            {
                System.out.println("Failed");
            }
        
            else if (marks >= 90)
            {
                System.out.println("Distinction");
            }
            
            else if (marks >= 75)
            {
                System.out.println("Excellent");
            }
            
            else if (marks >= 60)
            {
                System.out.println("Average");
            }
            
            else if (marks >= 50)
            {
                System.out.println("Below average");
            }
            
            else if (marks >= 35)
            {
                System.out.println("Very poor");
            }
    }
}
