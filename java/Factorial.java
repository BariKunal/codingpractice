/*3. Factorial Calculation
Write a program to calculate the factorial of a given number using a for loop.*/

import java.util.*;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number :");
		int no = sc.nextInt();
		
		int fact = 1; 
		
		for(int i=1; i<=no; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of Number Is = "+fact);
	}
}