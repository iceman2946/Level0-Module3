
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			// 5. if the guess is correct
			for(int x=0;x<11;x++) {
				String guess=JOptionPane.showInputDialog("Can you guess a number from 1 to 100? ");
				int guessAsInt=Integer.parseInt(guess);
				if(guessAsInt==random) {
					JOptionPane.showMessageDialog(null,"You win!");
					System.exit(0);
				}
			
		
				else if(guessAsInt>random) {
					JOptionPane.showMessageDialog(null, "Your guess is too high");
				}
				
		
				else if(guessAsInt<random) {
					JOptionPane.showMessageDialog(null,"You guess is too low");
				}
			}	

		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null,"You lose.");
		System.exit(0);
	}

}


