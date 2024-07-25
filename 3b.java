import java.lang.*;

class info
{
    public static void main(String h[])
    {
        System.out.println("Bhavesh Kukreja C21");
        System.out.prinln();
      
        int num1 = Integer.parseInt(h[0]);
        int num2 = Integer.parseInt(h[1]);
        int num3 = Integer.parseInt(h[2]);

        if (num1 > num2 && num1 > num3)
        {
            System.out.println("Amongst " + num1 + " " + num2 + " " + num3 + ", " + num1 + " is the greatest.");
            System.out.println((num3 > num2) ? "While " + num2 + " being the smallest." : "While " + num3 + " being the smallest.");
        }

        else if (num2 > num1 && num2 > num3)
        {
            System.out.println("Amongst " + num1 + " " + num2 + " " + num3 + ", " + num2 + " is the greatest.");
            System.out.println((num1 > num3) ? "While " + num3 + " being the smallest." : "While " + num1 + " being the smallest.");
        }

        else
        {
            System.out.println("Amongst " + num1 + " " + num2 + " " + num3 + ", " + num3 + " is the greatest.");
            System.out.println((num1 > num2) ? "While " + num2 + " being the smallest." : "While " + num1 + " being the smallest.");
        }
    }
}
