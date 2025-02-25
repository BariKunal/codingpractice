/*3) Delete a Specific Element from an Array

Create a Java program that allows the user to input an array and a specific value, then deletes all occurrences of that value while maintaining the order of other elements.*/

import java.util.*;
public class DeleteSpeciIndexArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array size :");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter The Arry Elements :");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter The Index which you want delete :");
		int ind = sc.nextInt();
		
		for(int i=size-1; i<=ind; i++)
		{
			if(i == ind)
			{
				a[i+1]=a[i];
			}
			size=size-1;
		}
		System.out.println("After Deleting the Index..");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}