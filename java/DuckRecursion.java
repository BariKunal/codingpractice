// to input number and check number is duck or not using recursion 

import java.util.Scanner;
public class DuckRecursion
{
	static Boolean flag=false;
    public static void main(String x[])
    {
	int no;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Number :");
	no = sc.nextInt();
	
	Duck(no);
    }
    public static void Duck(int x)
    {
	int rem;
	if(x!=0)
	{
	    rem=x%10;
	    x/=10;
	    if(rem==0)
	    {
	        flag=true;
		//break;
	    }
	    Duck(x);
	}else
	if(flag)
	{
	    System.out.println("Duck Number..");
	}
	else
	{
	    System.out.println("Not Duck Number..");
	}
    }
}