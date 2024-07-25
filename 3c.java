import java.lang.*;

class till
{
    public static void main(String h[])
    {
        System.out.prinln("Bhavesh Kukreja C21");
        System.out.println();

        int sum = 0;
        int i = 0;
        while (true) {
            int num = Integer.parseInt(h[i]);

            if (num == 0) {
                break;
            }

            sum += num;
            i++;
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Count of numbers added is: " + i);
    }
}
