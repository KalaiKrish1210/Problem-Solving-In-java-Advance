package dili;

import java.util.Scanner;
// Scanner method package importing  

class palin {
// Class Declaration
	static void Perform(String n) {
		// Method declaration in static method
		// If we create the method in static we not need to create a object for the
		// class

		int strlen = n.length();
		// Calculate the length of the String
		String rev = "";
		// Initialize the variable to store the value in it.

		// Reverse the string and store it on rev variable
		for (int i = strlen - 1; i >= 0; i--) {
			rev = rev + n.charAt(i);
		}
		// compare value is equal or not
		if (rev.equals(n)) {
			System.out.println(n + rev + "Palindrome");
		} else {
			System.out.println(n + rev + "Not palindrome");
		}
	}

}

public class Palindrome {

	public static void main(String[] args) {
		// Main Function
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		// Getting input value from user
		palin.Perform(n);
		// Call the method directly without create the object. why? because method
		// declaration is in static method .

	}

}
