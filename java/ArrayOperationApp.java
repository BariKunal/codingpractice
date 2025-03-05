/* Write a java program to Create a class name as ArrayOperation with a 
parameterised constructor with function name as calSum() & one more function int[] 
getSumArray().  
 
ArrayOperation(int [ ]) {  
// this constructor can accept the array.  
}  
void calSum() {  
// implement the logic.  
}  

Int[] getSumArray() 
 {  
// this function can return result array.  
}  
Input :- 5732 8659 2534 9625 7354. 
 ( Store the each digit sum at that index )  
Output : - 17  28  14  22  19*/

import java.util.*;
class ArrayOperation
{
	
	private int arr[];
	ArrayOperation(int arr[])
	{
		this.arr=arr;
	}
	void calSum()
	{
		for(int i=0; i<arr.length; i++)
		{
			int sum=0;
			while(arr[i]!=0)
			{	
				sum= sum+arr[i]%10;
				arr[i]= arr[i]/10;
			}
			arr[i]=sum;
		}
		System.out.println("Sum of its Digits :");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
public class ArrayOperationApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		int arr[] = new int [5];/*{5732,8659,2534,9625,7354};*/
		System.out.println("Enter The Five Numbers :");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		ArrayOperation AO = new ArrayOperation(arr);
		AO.calSum();
	}
}