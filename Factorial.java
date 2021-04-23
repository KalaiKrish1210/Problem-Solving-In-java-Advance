package dili;

import java.util.Scanner;
// Scanner method package importing

class fact {
// Class Declaration

	public void perform(int a) {
	//Method Declaration
		int f = 1;
		// Initialize f variable 
		for (int i = 1; i <= a; i++) {
			f = f * i;
			System.out.println(f);
		}

	}
}

public class Factorial {

	public static void main(String[] args) {
	// Main Function
		fact obj = new fact();
		// Object creation for the class
		Scanner input = new Scanner(System.in);
		// Scanner method Syntax
		System.out.println("enter the number");
		int a = input.nextInt();
		// Getting Input from user
		obj.perform(a);
		// Method calling

	}

}
