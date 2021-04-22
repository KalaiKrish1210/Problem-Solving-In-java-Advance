package dili;

import java.util.Scanner;
// Scanner method package importing

class check {
// Class declaration
	public void perform(int n) {
	// Method Declaration
		int rem = 0, sum = 0, count = 0;

		// If we find the check sum of the digit Multiply with 2 each number in digit
		// and sum of the multiplied the value and divide by digit's length.
		// If the the final value and the length of digit value is equal to the final
		// value that is check sum

		while (n > 0) {
			rem = n % 10;
			// Digit value is getting split when we do the % operation
			sum = sum + (rem * 2);
			// Multiply with 2 and store in local variable
			n = n / 10;
			// We need get the reminder value upto the length digit
			count++;
			// find the digits's length
		}
		System.out.println(sum);
		System.out.println(count);
		int checksum = sum / count;
		// sum of the multiplied the value and divide by digit's length.
		System.out.println(checksum);

		// Check the Value is Same or not
		if (checksum == count) {
			System.out.println("success");
		} else {
			System.out.println("failure");
		}

	}
}

public class Checksum {

	public static void main(String[] args) {
	// Main Function
		check obj = new check();
		// Object creation for the class
		Scanner input = new Scanner(System.in);
		// Scanner method Syntax
		System.out.println("Enter the Integer to find the check sum");
		int n = input.nextInt();
		// Getting the input value from user

		obj.perform(n);
		// method calling

	}

}
