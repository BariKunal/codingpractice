/*2. Sum of First N Natural Numbers
Write a program to calculate the sum of the first n natural numbers, where n is entered by the user. Use a while loop.*/

import java.util.*;
public class SumOfNatural
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Number :");
		int no = sc.nextInt();
		
		int sum = 0; int i=1;
		
		while(i<=no)
		{
			sum = sum + i;
			i++;
		}
		System.out.println("Sum Of First Natural Numbers = "+sum);
	}
}