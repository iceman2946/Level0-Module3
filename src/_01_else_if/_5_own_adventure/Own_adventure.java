package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Own_adventure {
public static void main(String[] args) {
	String story1=JOptionPane.showInputDialog("One day my * and ** went on a trip in Yosemite. What will you use to fill in the blank "
			+ "(Type in letter) a. siblings and I b.my family and friends c. my mom and dad ");
	if(story1.equals("a")) {
		String story2a=JOptionPane.showInputDialog("In Yosemite, it was too snowy to hike in the mountains so we decided to  *. "
				+ "What will you use to fill in the blank a. hike in the valley b. go sledding c. go back home");
		if(story2a.equals("a")) {
			String story3a=JOptionPane.showInputDialog("You hike up in the valley and someone suddenly falls down so we *. "
					+ "a. took him to the hospital b. leave him stranded c. keep hiking");
			JOptionPane.showMessageDialog(null, "You chose" +story3a+ "but the story ends with the most dissapointing trip");
		}
	}
	else if(story1.equals("b")) {
		String story2b=JOptionPane.showInputDialog("It was so snowy that us kids decided to go * and hike tommorrow"
				+"What will you do to fill in the blank a. do some hockey b. watch tv c. chill out on a train to LA ");
		JOptionPane.showMessageDialog(null, "You chose"+story2b+"but the story ends here with the most restful trip.");
	}
	else {
		JOptionPane.showMessageDialog(null,"Your parents hike and come back with nothing uneventful and you enjoy your stay.");
		System.exit(0); 		
	}
}
}