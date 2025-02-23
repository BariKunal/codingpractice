/*5. Fibonacci Series
Write a program to print the first n numbers of the Fibonacci series, where n is entered by the user. Use a for loop.*/

import java.util.*;
public class FibonacciSeries
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int f1=0,f2=1,fib,limit,i;
		System.out.println("Enter The Number Limit of Series :");
		limit = sc.nextInt();
		
		System.out.println("Fibonacci Series Like : ");
		System.out.print(" "+f1);
		System.out.print(" "+f2);
		i=1;
		while(i<=limit)
		{
			fib = f1 + f2;
			f1 = f2;
			f2 = fib;
			
			System.out.print(" "+fib);
			i++;
		}
	}
}