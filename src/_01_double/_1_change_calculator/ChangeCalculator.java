package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */
//TAKEN FROM PREVIOUS LESSON:
//String answer = JOptionPane.showInputDialog("Guess a number from 1 - 100");
// numbers = Integer.parseInt(answer);

public class ChangeCalculator {

	public static void main(String[] args) {

		int numberOfNickels =0;
		int numberOfDimes =0;
		int numberOfQuaters=0;
		
		//TESTING PUSH
		// Ask the user how many nickels they have
		String answer = JOptionPane.showInputDialog(" how many nickels do you have?"); 
	numberOfNickels = Integer.parseUnsignedInt(answer);
	  
	     // Convert their answer to an int.   Hint: Integer.parseInt()  
    
		// Ask the user how many dimes they have, and convert their answer
	String answer1 = JOptionPane.showInputDialog(" how many dimes do you have?"); 
	numberOfDimes = Integer.parseUnsignedInt(answer1);
	  
		// Ask the user how many quarters they have, and convert their answer
	String answer2 = JOptionPane.showInputDialog(" how many Quaters do you have?"); 
	numberOfQuaters = Integer.parseUnsignedInt(answer2);
	  
		// Calculate how much money the user has.  Hint: Use a double variable 
 double money = numberOfNickels * 0.05 + numberOfDimes * 0.10 + numberOfQuaters * 0.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
     JOptionPane.showMessageDialog(null, "You have this much $ " +money);
	} 
}

