/*5.WAP program create the class name as Sum with a following methods  
class Sum 
{ void calSum(int ...x) //method with var-args 
{//here we need to calculate the sum of all elements 
} 
} 
public class SumApplication 
{  public static void main(String x[]) 
{//here we need to create the object of Sum class and call the calSum() method and pass  
//parameter in it  
} 
}*/

import java.util.*;
class Sum
{
	int sum=0;
	void calSum(int ...x)
	{
		for(int i=0; i<x.length; i++)
		{
			sum = sum + x[i];
		}
		System.out.println("Sum of all elements :"+sum);
	}
}
public class CalSumVarArg
{
	public static void main(String x[])
	{
		Sum s = new Sum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Array Size :");
		int n = sc.nextInt();
		
		int size[] = new int[n];
		System.out.println("Enter The Array Elements :");
		for(int i=0; i<size.length; i++)
		{
			size[i] = sc.nextInt();
		}
		s.calSum(size);
		
	}
}