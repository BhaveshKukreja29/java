import Calculator.Add;
import Calculator.Substract;
import Calculator.Divide;
import Calculator.Multiply;

import java.lang.*;
import java.io.*;

class Hisab
{
	public static void main(String[] args) throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the first number: ");
        int n1 = Integer.parseInt(br.readLine());

        System.out.println();
        System.out.print("Enter the second number: ");
        int n2 = Integer.parseInt(br.readLine());

        System.out.println();
        System.out.print("Enter the 1 to add, 2 to subs, 3 to mult, 4 to divide: ");
        int c = Integer.parseInt(br.readLine());

        switch(c)
        {
            case 1:
                Add a = new Add();
                
                int r = a.addition(n1, n2);

                System.out.println("Sum is: " + r);
                break;

            case 2:
                Substract s = new Substract();
                
                int r1 = s.substraction(n1, n2);

                System.out.println("Subsraction is: " + r1);
                break;

            case 3:
                Multiply m = new Multiply();
                
                int r2 = m.multiplication(n1, n2);

                System.out.println("Multiplication is: " + r2);
                break;

            case 4:
                Divide d = new Divide();
                
                int r3 = d.division(n1, n2);

                System.out.println("Division is: " + r3);
                break;
        }
	}
}
