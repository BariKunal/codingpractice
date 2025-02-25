// Q.2 Write a java program to take 5 elements and display only even  number from array.

import java.util.Scanner;
public class DisplayEven
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
	
	System.out.println("Display Only Even Numbers");
	
	for(int i=0; i<a.length; i++)
	{
	    if(a[i]%2==0)
	    {
		System.out.println(a[i]);
    	    }
	}
    }
}