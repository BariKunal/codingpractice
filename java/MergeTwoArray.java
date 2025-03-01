//  Q3. WAP to create class name as Merge with three functions 

//	Void acceptArray(int a[],int b[]): this function can accept two array as parameter
//	Void merge(): this function can merge two array with each other
//	Void display(): this function can display the array after merging 

import java.util.*;
class Merge 
{
    private int i,x[],y[],z[],k=0;
    void acceptArray(int a[],int b[])
    {
	x = a;
	y = b;
    }
    void merge()
    {
	int m[] = new int [10];
	z = m;
	for(i=0; i<x.length; i++)
	{
	    z[k++] = x[i];
	}
	for(i=0; i<y.length; i++)
	{
	    z[k++] = y[i];
	}
	

    }
    void display()
    {
	System.out.println("Merge Array :");
	for(i=0; i<z.length; i++)
	{
	    System.out.print(" "+z[i]);
	}
    }
}
public class MergeTwoArray
{
    public static void main(String x[])
    {
	Scanner sc = new Scanner(System.in);
	int i;
	int a[] = new int [5];
	int b[] = new int [5];
	System.out.println("Enter The First Array Elements :");
	for( i=0; i<a.length; i++)
	{
	    a[i] = sc.nextInt();
	}
	System.out.println("Enter The Second Array Elements :");
	for( i=0; i<a.length; i++)
	{
	    b[i] = sc.nextInt();
	}
	
	Merge mg = new Merge();
	mg.acceptArray(a,b);
	mg.merge();
	mg.display();
    }
}