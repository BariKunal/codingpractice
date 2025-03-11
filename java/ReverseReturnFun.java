// Q3. WAP to create function name as int getRev(int no): this function can accept number as parameter and reverse it and return it.

import java.util.*;
public class ReverseReturnFun
{
    public static void main(String x[])
    {
	Scanner sc =  new Scanner (System.in);
	int num;
	System.out.println("Enter The Number: ");
	num = sc.nextInt();
	
	int result = IsRev( num);
  	System.out.println(result);
    }

    public static int IsRev(int no)
    {
	int rev=0,rem;

	while(no!=0)
	{
	    rem = no % 10;
	    rev = rem + (rev*10);
	    no  = no / 10;
	}
	int result=rev;
	return result;
    } 
}
