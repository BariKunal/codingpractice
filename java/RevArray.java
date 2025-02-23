
/*2. Reverse an Array
Implement a program to reverse an array without using any built-in reverse method.
Example: [1, 2, 3, 4, 5] → Reversed: [5, 4, 3, 2, 1]*/

import java.util.*;
public class RevArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter The Arry Elements :");
		int i;
		int mid,end;
		end = a.length-1;
		mid = end/2;
		
		for(i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
			
		for(i=0; i<mid; i++)
		{
	    
		int temp = a[i];
		    a[i] = a[end];
		    a[end] = temp;
   	    end--;
	}
		System.out.println("Reverse Array is :");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}