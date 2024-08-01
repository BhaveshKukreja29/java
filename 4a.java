import java.io.*;

class Employee
{
	String name;
	String ID;
	String org;
	String branch;

	void get_data() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.println("Enter the Employee's name: ");
		name = br.readLine();
		
		System.out.println("Enter the Employee's ID: ");
		ID = br.readLine();
		
		System.out.println("Enter the Employee's Organisation: ");
		org = br.readLine();
		
		System.out.println("Enter the Employee's Branch: ");
		branch = br.readLine();
	}
	
	
	void display_data()
	{
		System.out.println("Name: " + name);
		System.out.println("ID: " + ID);
		System.out.println("Organisation: " + org);
		System.out.println("Branch: " + branch);
	}

	public static void main(String a[]) throws IOException
	{
		Employee e = new Employee();
		
        	System.out.println("Enter the details of the employee below.");
        	System.out.println();

		e.get_data();
        
        	System.out.println();
        	System.out.println();
        	System.out.println("Below are the details of the employee.");
        	System.out.println();
		e.display_data();
	}	
}
