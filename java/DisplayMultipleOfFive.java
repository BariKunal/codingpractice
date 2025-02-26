// Q.4 Write ajava program to take 5 elements and display elements which are multiple of 5.

import java.util.Scanner;
public class DisplayMultipleOfFive
{
    public static void main(String x[])
    {
	Scanner sc = new Scanner (System.in);
	int a[] = new int [5];
	System.out.println("Enter Array Elements :");
	for(int i=0; i<a.length; i++)
	{
	    a[i] = sc.nextInt();
	}
	
	System.out.println("Array Elements Which are multiple of 5 :");
	
	for(int i=0; i<a.length; i++)
	{
	    if(a[i]%5==0)
	    {
		System.out.println(a[i]);
    	    }
	}
    }
}