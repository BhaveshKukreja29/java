import java.io.*;

class Max
{
	int a;
	int b;
	int c;
	
	void get_data() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the three numbers below.\n\n");
		
		System.out.print("Enter a: ");
		a = Integer.parseInt(br.readLine());
		System.out.println();
		
		System.out.print("Enter b: ");
		b = Integer.parseInt(br.readLine());
		System.out.println();
		
		System.out.print("Enter c: ");
		c = Integer.parseInt(br.readLine());
		System.out.println();
		System.out.println();
		
		getmax(a,b,c);
	}
	
	void getmax(int a, int b, int c)
	{
		if (a > b && a > c)
		{
		    System.out.println("Amongst " + a + " " + b + " " + c + ", " + a + " is the greatest.");
		    System.out.println((c > b) ? "While " + b + " being the smallest." : "While " + c + " being the smallest.");
		}

		else if (b > a && b > c)
		{
		    System.out.println("Amongst " + a + " " + b + " " + c + ", " + b + " is the greatest.");
		    System.out.println((a > c) ? "While " + c + " being the smallest." : "While " + a + " being the smallest.");
		}

		else
		{
		    System.out.println("Amongst " + a + " " + b + " " + c + ", " + c + " is the greatest.");
		    System.out.println((a > b) ? "While " + b + " being the smallest." : "While " + a + " being the smallest.");
		}
	}
	
}

class Main
{	
	public static void main(String a[]) throws IOException
	{
		Max m = new Max();
		
		m.get_data();
	}
}
