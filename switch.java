import java.lang.*;
class hello
{
	public static void main(String affsaf[])
	{
        int a = 12, b = 20;
        int ch = 2;
        
        System.out.println("Welcome to sasta calculator");
        System.out.println("Below is your answer!");
        System.out.println("");

        switch(ch)
        {
            case 1: System.out.println(a+b);
                    break;
            case 2: System.out.println(a-b);
                    break;
            case 3: System.out.println(a*b);
                    break;
            case 4: System.out.println(a/b);
                    break;
            case 5: System.out.println("Exit");
                    break;
        }
	}
}
