import java.io.*;
import java.lang.*;

class constructor
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

        Overload rect = new Overload(l,b);
        Overload square = new Overload(s);
        Overload circle = new Overload(r);
        
        System.out.println();
        System.out.println("Lenght, breadth of rectangle is: " + rect.x + ", " + rect.y);
        System.out.println();
        System.out.println("Side of square is: " + square.x);
        System.out.println();
        System.out.println("Radius of circle is: " + circle.r);
    }
}

class Overload
{
    int x;
    int y;
    float r;

    Overload(int a, int b)
    {
        this.x = a;
        this.y = b;
    }
    
    Overload(int a)
    {
        this.x = a;
    }
    Overload(float r)
    {
        this.r = r;
    }
}
