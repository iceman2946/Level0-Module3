package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Own_adventure {
public static void main(String[] args) {
	String story1=JOptionPane.showInputDialog("One day my * and ** went on a hike in Yosemite. What will you use to fill in the blank "
			+ "(Type in letter) a. siblings and I b.my family and friends c. my mom and dad ");
	if(story1.equals("a")) {
		String story2a=JOptionPane.showInputDialog("In Yosemite, it was too snowy to hike in the mountains so we decided to  *. "
				+ "What will you use to fill in the blank a. hike in the valley b. hike in the steep snow c. go back home");
		if(story2a.equals("a")) {
			//
		}
	}
	else if(story1.equals("1b")) {
		String story2b=JOptionPane.showInputDialog("It was so snowy that us kids decided to go * and hike tommorrow"
				+"What will you do to fill in the blank a. go sledding b. watch tv c. chill out on a train to LA ");
	}
	else {
		JOptionPane.showMessageDialog(null,"Your parents hike and come back with nothing uneventful and you enjoy your stay.");
		System.exit(0); 		
	}
}
}