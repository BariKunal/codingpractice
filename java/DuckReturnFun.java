// Q2. WAP to create function name as boolean isDuck(int no) : this function is used for accept number as parameter and check number is duck or not 
//  if number is duck return true otherwise return false

import java.util.*;
public class DuckReturnFun
{
    public static void main(String x[])
    {
	Scanner sc =  new Scanner (System.in);
	int num;
	System.out.println("Enter The Number: ");
	num = sc.nextInt();
	
	boolean res = IsDuck( num);
  	
	System.out.println(res);
    }
    public static Boolean IsDuck(int no)
    {
	int rem;
	boolean flag=false;
	for(int i=1; i<=no; i++)
	{
	    rem = no % 10;
	    no = no / 10;
	    
		if(rem==0)	
		{
		    flag=true;
		    break;
		}
	}
	if(flag)
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }
}