import javax.swing.*;
import java.util.*;

public class HelloWorld
{
	
	static Scanner des = new Scanner(System.in);
	static Scanner fag = new Scanner(System.in);
	
	public static void main (String args[])
	{
		String question;
		System.out.println("Enter a number:");
		int Hell = des.nextInt();
		System.out.println("Hello Wolrd!    " + Hell);
		
		JOptionPane.showMessageDialog(null, "Hello", "Hello Box!", JOptionPane.INFORMATION_MESSAGE);
		question = JOptionPane.showInputDialog( "Enter a number:");
		int numb = Integer.parseInt(question);
		JOptionPane.showMessageDialog(null, numb, "er", JOptionPane.INFORMATION_MESSAGE);
		try 
		{
			int ven = fag.nextInt();
			
		}
		catch()
		{
			
		}
		
	}
	
}