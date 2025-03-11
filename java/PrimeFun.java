// Q1. WAP to create function name as public static boolean isPrime(int no): this function can accept number and parameter and check number is prime or not 
// if number is prime then return true otherwise return false.

import java.util.*;
public class PrimeFun
{
    public static void main(String x[])
    {
	Scanner sc =  new Scanner (System.in);
	int num;
	System.out.println("Enter The Number: ");
	num = sc.nextInt();
	
	boolean res = IsPrime( num);
  	
	System.out.println(res);
    }

    public static boolean IsPrime(int no)
    {
	int count=0;
	for(int i=1; i<=no; i++)
	{
	    if(no%i==0)
	    {
		count++;
	    }
	}
	if(count==2)
	{  
            return true;
	}
	else
	{
	    return false;
	}
    } 
}