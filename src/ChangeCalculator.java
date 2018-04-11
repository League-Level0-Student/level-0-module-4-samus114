//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String cash = JOptionPane.showInputDialog("how much nickels do you have do you have?");
		// Convert their answer to an int using Integer.parseInt()
		int nickles = Integer.parseInt(cash);
		// Ask the user how many dimes they have, and convert their answer
		String cish = JOptionPane.showInputDialog("how much dimes do you have?");
		int dimes = Integer.parseInt(cish);
		// Ask the user how many quarters they have, and convert their answer
		String cach = JOptionPane.showInputDialog("how much quarters do you have?");
		// Calculate how much money the user has and save it in a double variable
		int quarters = Integer.parseInt(cach);
		double xa = 0.05 * nickles;
		double hota = 0.1 * dimes;
		double x = 0.25 * quarters;
		double a =xa+hota+x;
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, "you have $"+a+" money");
	}
}
