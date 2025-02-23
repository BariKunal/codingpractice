
/*2. Even or Odd Checker
Description: Write a program to check whether a given number is even or odd. Use the modulo operator and if-else statements to determine the result.
Concepts Covered: if-else, modulo operator, basic conditional logic.*/

import java.util.*;
public class EvenOddChecker
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sc.nextInt();
		
		
			if(no%2==0)
				System.out.println("Even number "+no);
			else
				System.out.println("Odd Number "+no);
				
		
	}
}