package dili;

import java.util.Scanner;
// Scanner method package importing

class digit {
// Class declaration
	public void perform(String str1[]) {
	// Method Declaration
		System.out.println("");
		
		// If you need to find the duplicate in array we have to create the two "for"
		// loop like same but different index assigning for purpose of comparing two
		// indexed array
		
		for (int a = 0; a < str1.length; a++) {
		// First loop a
			int count = 0;
			// initialize the count variable why? beacause, the count will be zero until the
			// (b- for) "if condition" not satifying. If satisfied the "if" condition the
			// proceed further operation
			for (int b = a + 1; b < str1.length; b++) {
			// Second loop b
				if (str1[a].equals(str1[b])) {
				// Compare the two indexed value in the array
					count++;
					// If satisfied the "if" condition the proceed further operation is count
					// getting increased count greater than and assign the arr[b] = @ to avoid the
					// visiting value again.
					str1[b] = "@";
					
				}
			}
			// Comparing if the count is Greater than zero and arr[a] not equal to @
			if (count > 0 && str1[a] != "@") {
				System.out.println(str1[a]);
				// Print the duplicate value
			}
		}
	}

}

public class Duplicatedigits {

	public static void main(String[] args) {
	// Main function
		digit obj = new digit();
		// Object creation fro class
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("Enter the number");
		int n = input.nextInt();
		// Getting the value from user
		String str1[] = Integer.toString(n).split("");
		// Typecast the integer value to String value and split the values 
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]);
			// Print the integer value in Array
		}
		obj.perform(str1);
		// Method calling

	}

}
