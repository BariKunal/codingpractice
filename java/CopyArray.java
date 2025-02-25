import java.util.*;
public class CopyArray
{
    public static void main(String x[])
    {
	Scanner sc = new Scanner (System.in);
	int a[] = new int [5];
	int b[] = new int [5];
	int i,j;
	System.out.println("Enter The Array Elements :");
	for(i=0 ; i<a.length; i++)
	{
	    a[i] = sc.nextInt();
	}
	System.out.println("First Array Elements :");
	for(i=0 ; i<a.length; i++)
	{
	    b[i]=a[i];
	}
	
	System.out.println("Copy Array Elements");
	for(i=0; i<b.length; i++)
	{
	    System.out.print(" "+b[i]);
	}
    }
}