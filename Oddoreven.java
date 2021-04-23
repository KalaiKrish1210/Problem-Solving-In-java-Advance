package dili;

import java.util.Scanner;
// Scanner method package importing

public class Oddoreven { 
	public void perform(int n) {
	// Method Declaration
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "\tEven");
			} else {
				System.out.println(i + "\todd");
			}
		}

	}

	public static void main(String[] args) {
	// Main Function
		Oddoreven obj = new Oddoreven();
		// Object Creation for the class declaration 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		// Getting the input value from user
		obj.perform(n);
		// Method calling
	}

}
