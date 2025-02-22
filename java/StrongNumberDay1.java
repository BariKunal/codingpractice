// Q1. Write a java program to check whether number is strong or not.

import java.util.*;
public class StrongNumberDay1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int no = sc.nextInt();
		
		int temp=no;
		int sum=0;
		while(no!=0)
		{
			int fact = 1;
			int i=1;
			int rem = no % 10;
				while(i<=rem)
				{
					fact = fact * i;
					i++;
				}
			sum = sum + fact;
			no/=10;
		}
		if(sum==temp)
		{
			System.out.println("Number Is Strong...");
		}
		else
		{
			System.out.println("Number Is Not Strong...");
		}
	}
}