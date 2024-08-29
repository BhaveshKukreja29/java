import java.io.*;
import java.lang.*;

class Main
{
    public static void main(String a[])throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter the length of rectangle: ");
        int l = Integer.parseInt(br.readLine());

        System.out.println();
        System.out.print("Enter the breadth of rectangle: ");
        int b = Integer.parseInt(br.readLine());

        System.out.println();
        System.out.print("Enter the side of square: ");
        int s = Integer.parseInt(br.readLine());    
        

        System.out.println();
        System.out.print("Enter the radius: ");
        float r = Float.parseFloat(br.readLine()); 

        Overload o = new Overload();
        
        System.out.println();
        System.out.println("Area of rectangle is: " + o.area(l, b));
        System.out.println();
        System.out.println("Area of square is: " + o.area(s));
        System.out.println();
        System.out.println("Area of square is: " + o.area(r));

    }
}

class Overload
{
    int area(int a, int b)
    {
        return a*b;
    }
    
    int area(int a)
    {
        return a*a;
    }
    double area(float r)
    {
        double area = 3.14*r*r;
        return area;
    }
}
