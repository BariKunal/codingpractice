/*9. Find the Largest Element in an Array
Write a program to find the largest element in an array of integers using a for loop.*/

import java.util.*;
public class LargestEleArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size :");
		int size = sc.nextInt();
		int a[] = new int [size];
		
		System.out.println("Enter The array elements..");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int max = a[0];
		
		for(int i=0; i<a.length; i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		System.out.println("Largest Element In Array :"+max);
	}
}