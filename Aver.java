import java.util.Scanner;

public class Aver
{
	static Scanner input = new Scanner(System.in);
	
	public static void main( String args[])
	{
		Timee spider = new Timee();
		System.out.println(spider.militaryTime());
		
		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();
		spider.oras(i, j, k);
		System.out.println(spider.militaryTime());
		
		
		
		
		
	}
}