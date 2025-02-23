/*3. Sum of All Elements in an Array
Write a program that calculates the sum of all the elements in an array.
Example: [10, 20, 30] → Sum: 60*/

import java.util.*;
public class SumOfArrayEle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array size :");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter The Array Elements:");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<size; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum : "+sum);
	}
}