package dili;

import java.util.Scanner;
//Scanner method package importing

class arraysort {
	// class declaration
	public void perform(int[] arr) {
		// Method declaration

		// If you need to sort a array we have to create the two "for"
		// loop like same but different index assigning for purpose of comparing two
		// indexed array

		for (int a = 0; a < arr.length; a++) {
			// First loop a
			int temp = 0;
			for (int b = a + 1; b < arr.length; b++) {
				// Second loop b
				if (arr[a] > arr[b]) { //
					//if condition is true Compare and swapping the values 0 t0 arr.length
					temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
				}
			}
			System.out.println("Sorted in Asc "+arr[a]);
		}

	}
	public void perform1(int[] arr) {
		// Method declaration

		// If you need to sort a array we have to create the two "for"
		// loop like same but different index assigning for purpose of comparing two
		// indexed array

		for (int a = 0; a < arr.length; a++) {
			// First loop a
			int temp = 0;
			for (int b = a + 1; b < arr.length; b++) {
				// Second loop b
				if (arr[a] < arr[b]) { //
					//if condition is true Compare and swapping the values 0 t0 arr.length
					temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
				}
			}
			System.out.println("Sorted in Des "+arr[a]);
		}

	}
}

public class ArraySortingAscenDescen {

	public static void main(String[] args) {
		// Main function
		arraysort obj = new arraysort();
		// object creation
		Scanner input = new Scanner(System.in);
		// Scanner method syntax
		System.out.println("enter how many elements do you want in this array:");
		int n = input.nextInt();
		// Getting the Array size value from user
		int[] arr = new int[n];
		// Array declaration
		System.out.println("enter all the elements ");
		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
			// Getting the Array value from user
		}
		obj.perform(arr);
		obj.perform1(arr);
		// Method calling

	}

}
