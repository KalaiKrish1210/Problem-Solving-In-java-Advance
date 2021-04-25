package dili;

import java.util.Scanner;
//Scanner method package importing

class prime {
// Class Declaration
	public void Perform(int n) {
	// Method Declaration
		System.out.println("0 \t wholenumber \n1 \t composite number");

		// If you need to find a Prime or Not we have to create the two "for"
		// loop like same but different index assigning for purpose of comparing two
		// indexed numbers

		for (int i = 2; i <= n; i++) {
		// First loop i
			int count = 0;

			// initialize the count variable why? beacause, the count will be zero until the
			// (j- for) "if condition" not satifying. If satisfied the "if" condition the
			// proceed further operation

			for (int j = 2; j < i; j++) {
			// Second loop j
				if (i % j == 0) {
					// If the count value is getting increased it is not Prime Number
					// Why ? because the "if" condition is i modulo of j 
					System.out.println(i + "\tnot prime");
					count++;
					break;
				}
			}
			// If the count value become zero it is prime number.
			if (count == 0) {
				System.out.println(i + "\t Prime");
			}
		}

	}
}

public class PrimeorNot {

	public static void main(String[] args) {
	// Main function
		prime obj = new prime();
		// Object creation for the class
		Scanner input = new Scanner(System.in);
		//Scanner method Syntax
		System.out.println("Enter Your Number:");
		int n = input.nextInt();
		// Getting the input value from user
		obj.Perform(n);
		//Method calling
	}

}
