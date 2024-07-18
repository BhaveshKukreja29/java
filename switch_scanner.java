import java.util.*;
class switch_scanner
{
	public static void main(String affsaf[])
	{
        int a,b,c;
        
        System.out.println("Welcome to sasta calculator!");
        System.out.println("Enter 1 for addition.");
        System.out.println("Enter 2 for substraction.");
        System.out.println("Enter 3 for multiplication.");
        System.out.println("Enter 4 for division.");
        System.out.println("Enter 5 to exit.");

        System.out.println("");

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        c = inp.nextInt();

        switch(c)
        {
            case 1: 
                    System.out.println("Enter your operand 1: ");
                    a = inp.nextInt();

                    System.out.println("Enter your operand 2: ");
                    b = inp.nextInt();
                    System.out.println("");
                    System.out.println("Below is your answer!");
                    System.out.println("");


                    System.out.println(a+b);
                    break;
            case 2: 
                    System.out.println("Enter your operand 1: ");
                    a = inp.nextInt();

                    System.out.println("Enter your operand 2: ");
                    b = inp.nextInt();
                    System.out.println("");
                    System.out.println("Below is your answer!");
                    System.out.println("");



                    System.out.println(a-b);
                    break;
            case 3: 
                    System.out.println("Enter your operand 1: ");
                    a = inp.nextInt();

                    System.out.println("Enter your operand 2: ");
                    b = inp.nextInt();
                    System.out.println("");
                    System.out.println("Below is your answer!");
                    System.out.println("");




                    System.out.println(a*b);
                    break;
            case 4: 
                    System.out.println("Enter your operand 1: ");
                    a = inp.nextInt();

                    System.out.println("Enter your operand 2: ");
                    b = inp.nextInt();
                    System.out.println("");
                    System.out.println("Below is your answer!");
                    System.out.println("");


                    System.out.println(a/b);
                    break;
            case 5: 
                    System.out.println("Exit");
                    break;
        }
	}
}
