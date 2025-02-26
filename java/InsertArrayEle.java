//  WAP to insert the element on specified position in array ?

import java.util.*;
public class InsertArrayEle
{
    public static void main(String x[])
    {
	Scanner sc = new Scanner (System.in);
	int i,ins;
	int a[] = new int [6];
	System.out.println("Enter The Array Elements :");
	for(i=0; i<5; i++)
	{
	    a[i] = sc.nextInt();
	}
	
	System.out.println("Display Array Elements :");
	for(i=0; i<5; i++)
	{
	    System.out.println(" "+a[i]);
	}

	System.out.println("Enter the index on which value want to be insert  :");
	int ind = sc.nextInt();
	
	System.out.println("Enter the value which want to store on index :");
	ins = sc.nextInt();
	
	for(i=(a.length-2); i>=ind; i--)
	{
	    a[i+1]= a[i];
	}
           a[ind]=ins;
	System.out.println("Display Array Elements :");
	for(i=0; i<a.length; i++)
	{
	    System.out.println(" "+a[i]);
	}
  
	
	
    }
}