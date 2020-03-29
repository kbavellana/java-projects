//package applett;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class PlatosTheory extends Applet implements ActionListener{

	//J's
	JTextField userName,age;
	JRadioButton male, female;
	JButton ok, cancel,clear;
	JLabel lblName, lblAge;
	
	
	//main
	public static void main(String args[])
	{
		
		
	}
	
	//objects
	public void init()
	{
	//Frame characteristics
		JFrame frame = new JFrame();
			frame.setSize(300, 200);
			frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			frame.setTitle("Ideal Partner's Age");
			frame.setLocationRelativeTo(null);
			
			frame.addWindowListener(new Box(){
				public void windowClosing(WindowEvent e)
				{
					cancel.doClick();
				}
			});
			
	//Panels used		
		JPanel Main = new JPanel();
		JPanel Sex = new JPanel();
	
	//Labels
		lblName = new JLabel("Name:");
		lblAge = new JLabel("Age");
	
	//Button Buttons
		ok = new JButton("OK");
			ok.addActionListener(this);
		cancel = new JButton("Cancel");
			cancel.addActionListener(this);
		clear = new JButton("  Clear  ");
			clear.addActionListener(this);
		
		ButtonGroup opts = new ButtonGroup();
		opts.add(ok);
		opts.add(cancel);
		opts.add(clear);
	
	//Radio Buttons
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		
		ButtonGroup sexGrp = new ButtonGroup();
		sexGrp.add(male);
		sexGrp.add(female);
		
		//putting radio button to panel sex
		Sex.add(male);
		Sex.add(female);
		
		//Border to box the radio buttons
		Border sexB = BorderFactory.createTitledBorder("Sex");
		Sex.setBorder(sexB);
	
	//TextFields
		userName = new JTextField(20);
		age = new JTextField(10);
		
	//Adding to panel Main
		Main.add(lblName);
		Main.add(userName);
		Main.add(lblAge);
		Main.add(age);
		Main.add(Sex);
		Main.add(clear);
		Main.add(ok);
		Main.add(cancel);
		
		frame.add(Main);
		frame.setVisible(true);
		
	}
	
	//inner class to use window event
	private class Box extends WindowAdapter
	{
		public void windowClosing(WindowEvent e)
		{
			cancel.doClick();
		}
	}
	
	//actions
	public void actionPerformed(ActionEvent e) {
		int choice,ageInt=0, IdealAge=0;
		
		if(e.getSource() == ok)
		{	int truepa=0;
			String name = userName.getText();
			if(name.length()==0 || name == " ");
			{
				JOptionPane.showMessageDialog(null, "You Must put a Name!");
				truepa++;
			}
			
			if(isInt(age, "age"))
			{
				ageInt = Integer.parseInt(age.getText());
				truepa++;
			}
			
			if(!male.isSelected() && !female.isSelected())
				{
				JOptionPane.showMessageDialog(null, "You must be a male or female.","Sex", JOptionPane.ERROR_MESSAGE); 
				truepa++;}
			else if(male.isSelected())
				IdealAge = (ageInt / 2) + 7;
			else if(female.isSelected())
				IdealAge = (ageInt - 7) * 2;
			
			if (truepa == 0)
				JOptionPane.showMessageDialog(null, name + ", your Ideal Partner's Age is " + IdealAge + " years old");
			
			
			
		}
		
		if(e.getSource() == cancel)
		{
			choice = JOptionPane.showConfirmDialog(null, "Are You Sure?","Exit Program", JOptionPane.YES_NO_OPTION);
			if(choice == 0)
			{
				JOptionPane.showMessageDialog(null, "Have a Nice Day! :)");
				System.exit(0);
				
			}
		}
		
		if(e.getSource() == clear)
		{
			userName.setText("");
			age.setText("");
			male.setSelected(false);
			female.setSelected(false);
			
		}
		
	}

	//to validate the age if a number or not
	private boolean isInt(JTextField tf, String str)	
	{
		try
		{
			Integer.parseInt(tf.getText());
			return true;
		}
		catch (NumberFormatException e)
		{
			JOptionPane.showMessageDialog(tf, "Your " + str + " is Not Valid.","Error",JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
	}
	
}
