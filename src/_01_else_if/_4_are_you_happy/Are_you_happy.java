package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {
public static void main(String[] args) {
	String happy=JOptionPane.showInputDialog("Are you happy?");
	if(happy.equals("yes")) {
		JOptionPane.showMessageDialog(null,"Yay!, Keep doing what you are doing!");
	}
	else if(happy.equals("no")) {
		String want= JOptionPane.showInputDialog("Do you want to be happy?");
		if(want.equals("yes")) {
			JOptionPane.showMessageDialog(null,"Change something");
		}
		else {
			JOptionPane.showMessageDialog(null, "Ok, keep doing what you are doing");
		}
		
	}
}
}
