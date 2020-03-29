package program;

import java.util.*;

public class ColorGame {

	public static void main(String args[]) {
		
		String color;
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		System.out.println("Choose a color(red/green/blue/orange/white): ");
		color=sc.nextLine();
		
		int answer = rn.nextInt(4);
		
		if(answer == 0) {
			System.out.println("The result is red.");
			
		}
		else if(answer == 1) {
			System.out.println("The result is green");
			
		} 
		else if(answer == 2) {
			System.out.println("The result is blue");
			
		}
		else if(answer == 3) {
			System.out.println("The result is orange");
			
		}
		else if(answer == 4) {
			System.out.println("The result is white");		
			
		}
		}
}
