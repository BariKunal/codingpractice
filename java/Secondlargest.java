import java.util.*;
public class Secondlargest
{
    public static void main(String x[])
    {
	int a[] = {10,65,809,99,67,19};
	int i,max=a[0];
	int secmax=a[0];
	for(i=0; i<a.length;i++)
	{
	    System.out.print(" "+a[i]);
	}
	for(i=0; i<a.length; i++)
	{
	    if(a[i]>max)
	    {
		max = a[i];	
	    }
	}
	for(i=0; i<a.length; i++)
	{
	    if(secmax < a[i] && a[i]!=max)
	    {
		secmax = a[i];	
	    }
	}

	System.out.println("\nSecond Largest Element Is :"+secmax);
    }
}