/*8. Palindrome Checker
Write a program to check if a given string is a palindrome (reads the same backward and forward) using a for loop.*/

import java.util.*;
public class PalindromeNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		int rev=0,rem,temp;
		System.out.println("Enter The Number :");
		int no = sc.nextInt();
		
		temp = no;
		
		while(no!=0)
		{
			rem = no % 10;
			rev = rem + (rev * 10);
			no/=10;
		}
		if(temp == rev)
			System.out.println("Palindrome Number...");
		else
			System.out.println("Not Palindrome Number...");
	}
}