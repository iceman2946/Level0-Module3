
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob=new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
	
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
		
		while(true) {
			String color=JOptionPane.showInputDialog("What color would you want the robot to draw with?");	
			if(color.equals("red")) {
				rob.setPenColor(255,0,0);
				rob.penDown();
			}
			else if(color.equals("yellow")) {
				rob.setPenColor(255,255,0);
				rob.penDown();
			}
			else if(color.equals("blue")) {
				rob.setPenColor(0,0,255);
				rob.penDown();
			}
			else if(color.equals("purple")) {
				rob.setPenColor(128,0,128);
				rob.penDown();
			}
			else if(color.equals("pink")) {
				rob.setPenColor(255,192,203);
				rob.penDown();
			}
			else if(color.equals("turquoise")) {
				rob.setPenColor(48,213,200);
				rob.penDown();
			}
			else {
				rob.setRandomPenColor();
				rob.penDown();
			}
			
			int count=0;
			while(count<7) {
				rob.move(50);
				rob.turn(360/7);
				count+=1;
			}
			
		}	
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
