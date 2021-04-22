package dili;

import java.util.Scanner;
//Scanner method package importing

public class ArmstrongNumber {
	// main class
	int rem = 0, sum = 0;

	public void Perform(int n) {
		// method declaration
		int temp = n;
		// assigning a instance variable for variable for the purpose comparison

		// if we need to calculate the Armstrong number "ex = 153 , this number digit is
		// 3 so in the digit we have to calculate the muliply with the each number with
		// digit value and then add the multiplied value it the value is equal to the
		// entered number is Armstrong orelse Not"

		while (n > 0) {
			// If "n" is greater than 0 than zero the while loop getting executing

			rem = n % 10;
			// Getting the reminder value of the entered digit
			sum = sum + (rem * rem * rem);
			// Multiply the each value with digit's length simultaneously and store it on
			// sum variable
			n = n / 10;
			//We need get the reminder value upto the length digit

		}
		
		// CHeck the value is ArmStrong or Not
		if (sum == temp) {
			System.out.println(sum + " Armstrong");
		} else {
			System.out.println(sum + " Not armstrong");
		}

	}

	public static void main(String[] args) {
		//Main FUnction
		ArmstrongNumber obj = new ArmstrongNumber();
		//Object creation for the class
		Scanner input = new Scanner(System.in);
		//Scanner method syntax
		System.out.println("Enter the Number Do you want find Armstrong or Not");
		int n = input.nextInt();
		//Getting a input value from user

		obj.Perform(n);
		//Method calling

	}

}
