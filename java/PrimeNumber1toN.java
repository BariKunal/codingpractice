/* Prime Numbers in a Range
Write a program that prints all prime numbers between 1 and n, where n is entered by the user. Use a for loop.*/

import java.util.*;
public class PrimeNumber1toN
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int no = sc.nextInt();
		
		int i,j,count;
		
		System.out.println("Prime Number between 1 to "+no);
		for(i=2; i<=no; i++)
		{
			
			count=0;
			
			for(j=2; j<i; j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			
			if(count==0)
			{
				System.out.print(" "+i);
			}
		}
	}
}