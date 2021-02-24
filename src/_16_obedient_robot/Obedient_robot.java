package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_robot {
	public static void main(String[] args) {
		Robot john= new Robot();
		john.penDown();
		for(int i=0; i>4; i++) {
			john.move(100);
			john.turn(90);
		
		}
	}
}
