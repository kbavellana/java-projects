import java.util.*;

public class Lyn
{
	static Scanner console = new Scanner(System.in);
	
	public static void main (String args[])
	{
		String fname,  lname;
		int age;
		double weight;
		
		System.out.print("Enter first name:");
		fname = console.next();
		lname = console.nextLine();
		System.out.print("Enter your age and weight:");
		age = console.nextInt();
		weight = console.nextDouble();
		System.out.println("Your name is:" + fname + " " + lname);
		System.out.println("your age is: " + age + " and your weight is: " + weight);
		
	}
	
}