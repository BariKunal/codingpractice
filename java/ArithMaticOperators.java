/*1. Simple Calculator
Description: Create a calculator program that takes two numbers and an operator (+, -, *, /) from the user. Use if-else or switch to perform the operation and display the result.
Concepts Covered: if-else, switch, basic arithmetic operations.*/

import java.util.*;
public class ArithMaticOperators
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Two Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c;
		System.out.println("1: Addition. ");
		System.out.println("2: Subtraction. ");
		System.out.println("3: Multiplication. ");
		System.out.println("4: Division. ");
		
		System.out.println("Enter Your Choice ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
				c = a + b;
				System.out.println("Addition is ="+c);
			break;
			case 2:
				c = a - b;
				System.out.println("Sub is ="+c);
			break;
			case 3:
				c = a * b;
				System.out.println("Mul is ="+c);
			break;
			case 4:
				c = a / b;
				System.out.println("Division is ="+c);
			break;
			default: 
				System.out.println("Invalid Choice...");
		}
	}
}