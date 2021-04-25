package dili;

import java.util.Scanner;

public class ReverseSumofNnaturalNumbers {
// Main class
	static void perform(int n) {
	// Method Declaration in static
	// If we declare the method in static we not need to create a object for a class
	// to call the method to form
		
		// Reverse the number series
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
	// Main function
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		// Getting the input value from the user
	    perform(n);
	    // Call the method directly without creating a object for the class
		// Because the method will be created in static method
		// And the method is created in outer class so we need to call the method
		// class name ,dot,method name. but not needed this type because method is 
	    // inside of the main class.
	}

}
