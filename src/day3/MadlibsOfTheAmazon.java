package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// 
JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it..." );
		// Get the user to enter an adjective
String adjective = JOptionPane.showInputDialog("Enter An Adjective");
		// Get the user to enter a type of liquid
String liquid = JOptionPane.showInputDialog("Enter A Liquid");
		// Get the user to enter a body part
String body = JOptionPane.showInputDialog("Enter A Body Part");
		// Get the user to enter a verb
String verb = JOptionPane.showInputDialog("Enter A Verb");
		// Get the user to enter a place
String place = JOptionPane.showInputDialog("Enter A Place");
JOptionPane.showMessageDialog(null, "Piranhas are more "+adjective+" during the day, so cross the river at \n" + 
				"night. Piranhas are attracted to fresh "+liquid+" and will most \n" + 
				"likely take a bite out of your "+body+" if you "+verb+ ". Whatever \n" + 
				"you do, if you have an open wound, try to find another way to get \n" + 
				"back to "+place+ ". Good luck!");		
        
        // Fit the user's words into this sentence, and save it in a String:
		// 		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

