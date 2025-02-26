import java.util.*;
public class EleFoundOrNot
{
    public static void main(String x[])
    {
	Scanner sc = new Scanner (System.in);
	int skey,i;
	boolean flag = false;
	int a[] = new int [5];
	System.out.println("Enter The Array Elements :");
	for(i=0; i<a.length; i++)
	{
	    a[i] = sc.nextInt();
	} 
	
	System.out.println("Enter The Search Element :");
	skey = sc.nextInt();
	
	for(i=0; i<a.length; i++)
	{
	    if(skey==a[i])
	    {
	    	flag = true;
		break; 
	    }
	}
	
	if(flag)
	{
	    System.out.println("Element Is Found = "+skey);
	}
	else
	{
	    System.out.println("Element Is Not Found = "+skey);
	}
    }
}