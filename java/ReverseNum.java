/*4. Reverse a Number
Write a program to reverse a given number (e.g., input 12345 should return 54321) using a while loop.*/

import java.util.*;
public class ReverseNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number To Reverse :");
		int no = sc.nextInt();
		
		int rem,rev=0;
		while(no!=0)
		{
			rem = no % 10;
			rev = rem + (rev*10);
			no/=10;
		}
		System.out.println("Reverse Number Is = "+rev);
	}
}