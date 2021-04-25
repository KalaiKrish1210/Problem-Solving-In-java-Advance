package dili;

import java.util.Scanner;
// Scanner method package importing 

class Swap{
// Class declaration
	public void Perform(int a,int b) {
	// Method declaration 
		System.out.println("before swap a is"+a+" before Swap b is "+b);
		//int temp=a;
		//a=b;
		//b=temp;
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("After swap a is"+a+" After Swap b is "+b);
		
	}
}
public class swaptwonumbers {

	public static void main(String[] args) {
	// Main Function
		Swap obj = new Swap();
		// Object creation for the class
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first value ");
		int a=input.nextInt();
		System.out.println("Enter the second value ");
		int b= input.nextInt();
		obj.Perform(a, b);
		// Method calling
	}

}
