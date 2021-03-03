package _16_obedient_robot;

import java.lang.reflect.Method;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {
	public static void main(String[] args) {
		String shape = JOptionPane
				.showInputDialog("What shape do you want the robot to draw? \n circle,square or triangle?");
		if (shape.equalsIgnoreCase("circle")) {
			drawCircle();
		} else if (shape.equalsIgnoreCase("square")) {
			drawSquare();
		} else if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}
	}

	static void drawSquare() {
		Robot john = new Robot();
		john.penDown();
		john.hide();
		String colors = JOptionPane
				.showInputDialog("What color would you want your shape to be? \n red, blue or green?");
		if (colors.equalsIgnoreCase("red")) {
			john.setPenColor(255, 0, 0);
		} else if (colors.equalsIgnoreCase("blue")) {
			john.setPenColor(0, 0, 255);
		} else if (colors.equalsIgnoreCase("green")) {
			john.setPenColor(0, 255, 0);
		}
		for (int i = 0; i < 4; i++) {
			john.move(100);
			john.turn(90);
		}

	}

	static void drawTriangle() {

		Robot john = new Robot();
		john.penDown();
		john.hide();
		john.setSpeed(100);
		String colors = JOptionPane
				.showInputDialog("What color would you want your shape to be? \n red, blue or green?");
		if (colors.equalsIgnoreCase("red")) {
			john.setPenColor(255, 0, 0);
		} else if (colors.equalsIgnoreCase("blue")) {
			john.setPenColor(0, 0, 255);
		} else if (colors.equalsIgnoreCase("green")) {
			john.setPenColor(0, 255, 0);
		}
		for (int i = 0; i < 3; i++) {
			john.turn(120);
			john.move(100);

		}

	}

	static void drawCircle() {
		Robot john = new Robot();
		john.penDown();
		john.hide();
		String colors = JOptionPane
				.showInputDialog("What color would you want your shape to be? \n red, blue or green?");
		if (colors.equalsIgnoreCase("red")) {
			john.setPenColor(255, 0, 0);
		} else if (colors.equalsIgnoreCase("blue")) {
			john.setPenColor(0, 0, 255);
		} else if (colors.equalsIgnoreCase("green")) {
			john.setPenColor(0, 255, 0);
		}
		for (int i = 0; i < 360; i++) {
			john.move(1);
			john.turn(1);

		}
	}
}