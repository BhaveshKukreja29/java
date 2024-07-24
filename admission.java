import java.io.*;

class InputBuff { 
    public static void main(String args[])throws IOException
    { 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Bhavesh Kukreja C21");
        System.out.println();
        
        System.out.println("Enter your marks in Math: ");
        int math = Integer.parseInt(br.readLine());
        
        System.out.println("Enter your marks in Physics: ");
        int phy = Integer.parseInt(br.readLine());
        
        System.out.println("Enter your marks in Chemistry: ");
        int chem = Integer.parseInt(br.readLine());
        
        if (math < 60)
        {
            System.out.println("Not Eligible for admission");
        }
        
        else if (phy < 50)
        {
            System.out.println("Not Eligible for admission");
        }
        
        else if (chem < 40)
        {
            System.out.println("Not Eligible for admission");
        }
        
        else if ((math + phy + chem) < 200)
        {
            System.out.println("Not Eligible for admission");
        }
        
        else
        {
            System.out.println("Elligible for admission");
        }
        
        br.close();
    } 
} 
