
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "September 9th";
		String dadsBirthday = "September 19th";
		String myBirthday = "April 9th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String input=JOptionPane.showInputDialog("what birthday do you want?");
		// 3. Print out what the user typed
		if(input.equalsIgnoreCase("mom")) {
		System.out.println(momsBirthday);
		}else if(input.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}else if(input.equalsIgnoreCase("your birthday")) {
			System.out.println(myBirthday);
			
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	}else {
		System.out.println("Sorry I dont remember that person's birthday!");
	}
}
}
