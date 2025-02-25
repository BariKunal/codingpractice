// Q.1 Write a java program to take 5 elements in a Array and display it.


import java.util.Scanner;
public  class DisplayArray
{
 
    public static void main(String x[])
    {
	Scanner sc = new Scanner(System.in);
    	int a[] = new int[5];
    	
    	System.out.println("Enter The Values in Array :");
    	for(int i=0; i<a.length; i++)
	{
	    a[i] = sc.nextInt();
	}
	
	System.out.println("Display Array :");
	
	for(int i=0; i<a.length; i++)
	{
	    System.out.println(a[i]);
	}
    }
}