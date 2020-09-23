//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot john = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 10; i++) {

			String input = JOptionPane.showInputDialog(null, "What is your favourite color?");
			// 5. Use an if/else statement to set the pen color that the user requested
			if (input.equalsIgnoreCase("blue")) {
				john.setPenColor(Color.BLUE);
			} else if (input.equalsIgnoreCase("red")) {
				john.setPenColor(Color.RED);
			} else if (input.equalsIgnoreCase("green")) {
				john.setPenColor(Color.GREEN);
			} else if (input.equalsIgnoreCase("yellow")) {
				john.setPenColor(Color.YELLOW);
			} else {
				john.setRandomPenColor();
			}

			// 6. If the user doesn’t enter anything, choose a random color

			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them
			// 4. Set the pen width to 10
			john.setPenWidth(10);
			// 2. Make the robot draw a shape (this will take more than one line of code)
			john.penDown();
			for (int j = 0; i < 4; j++) {
				john.move(100);
				john.turn(90);
			}
		}
	}
}
