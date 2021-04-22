package dili;

import java.util.Scanner;

class revarray{
	public void perform(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
}
public class ReverseArray {

	public static void main(String[] args) {
		revarray obj = new revarray();
		// Object creation for the class
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
