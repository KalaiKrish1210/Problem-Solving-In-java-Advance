package dili;

import java.util.Scanner;
// Scanner method package importing

class rev {
// Class Declaration
	static void perform(String a) {
	// Method Declaration in static
	// If we declare the method in static we not need to create a object for a class
	// to call the method to form

		int stringlen = a.length();
		// Finding the length of the string and store it on another variable
		String rev = "";
		// Initialize the rev variable
		for (int i = stringlen - 1; i >= 0; i--) {
			rev = rev + a.charAt(i);
			// Reverse the string
		}
		System.out.println(rev);
	}

	public class Reversestring {

		public void main(String args[]) {
		// Main function
			Scanner input = new Scanner(System.in);
			// Scanner method Syntax
			System.out.println("Enter the String ");
			String a = input.nextLine();
			// Getting the input value from user
			rev.perform(a);
			// Call the method directly without creating a object for the class
			// Because the method will be created in static method
		}

	}
}
