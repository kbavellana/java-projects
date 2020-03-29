import java.util.Scanner;

public class Javex 
{
static Scanner input = new Scanner(System.in);
	public static void main (String args[])
	{ 
		double fnum, snum, answer;
		
		System.out.print("Enter 1st number: ");
		fnum = input.nextDouble();
		System.out.print("Enter second number: ");
		snum = input.nextDouble();
		answer = fnum+snum;
		System.out.println("The answer is: " + answer);
		answer = fnum-snum;
		System.out.println("The answer is: " + answer);
		answer = fnum*snum;
		System.out.println("The answer is: " + answer);
		answer = fnum/snum;
		System.out.println("The answer is: " + answer);
		answer = fnum%snum;
		System.out.println("The answer is: " + answer);
		
		
		
	}
	
}