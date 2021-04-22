package dili;

import java.util.Scanner;
//Scanner method package importing

class ar {
//class declaration 
	public void perform(int[] arr) {
	// Method declaration

		// If you need to find the duplicate in array we have to create the two "for"
		// loop like same but different index assigning for purpose of comparing two
		// indexed array

		for (int a = 0; a < arr.length; a++) {
		// First loop a
			int count = 0;
			// initialize the count variable why? beacause, the count will be zero until the
			// (b- for) "if condition" not satifying. If satisfied the "if" condition the
			// proceed further operation
			for (int b = a + 1; b < arr.length; b++) {
			// Second loop b
				if (arr[a] == arr[b]) {
				// Compare the two indexed value in the array
					count++;
					// If satisfied the "if" condition the proceed further operation is count
					// getting increased count greater than and assign the arr[b] = o to avoid the
					// visiting value again.
					arr[b] = 0;
				}
			}
			// Comparing if the count is Greater than zero and arr[a] not equal to 0
			if (count > 0 && arr[a] != 0) {
				System.out.println(arr[a]);
				// Print the duplicate value
			}
		}

	}
}

public class FindArrayDuplicate {

	public static void main(String[] args) {
	// Main function
		ar obj = new ar();
		// object creation
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("enter how many elements do you want in this array:");
		int n = input.nextInt();
		// Getting the Array size value from user 
		int[] arr = new int[n];
		// Array declaration
		System.out.println("enter all the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			// Getting the Array value from user
		}
		obj.perform(arr);
		// Method calling

	}

}
