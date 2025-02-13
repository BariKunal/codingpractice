/*4. Leap Year Checker
Description: Implement a program that checks if a given year is a leap year. A year is a leap year if it's divisible by 4, but not divisible by 100, unless it's also divisible by 400.
Concepts Covered: if-else, conditional logic, modulus operator.*/

import java.util.*;
public class LeapYear
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Year  :");
		int year = sc.nextInt();
		
		if(year%4==0 && year%100!=0)
			System.out.println("Leap Year...");
		else
			System.out.println("Not Leap Year...");
	}
}