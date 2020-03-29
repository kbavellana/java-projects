import java.util.*;

public class IPA
{
	static Scanner console = new Scanner(System.in);
	
	public static void main (String args[])
	{
		int age, sex, ia=0;
		
		
		System.out.println("[0]Male or [1]female?");
		sex = console.nextInt();
		System.out.print("Enter your age");
		age = console.nextInt();
		
		
		switch(sex)
		{
			case 0: 
			ia = (age/2) + 7;
			break;
			case 1:
			ia = (age-7)*2;
			break;
			default: 
		}
		
		System.out.println("Your ideals partner age is : "+ ia );
		
	}
	
}