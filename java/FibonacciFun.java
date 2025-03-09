// Q5. WAP to create function name as Fibonacii void fibo(int limit): accept the limit and print the fibonacii series  as per limit


import java.util.*;
public class FibonacciFun
{
    public static void main(String x[])
    {
	Scanner sc =  new Scanner (System.in);
	int num;
	System.out.println("Enter The Limit: ");
	num = sc.nextInt();
	
	 Fibo( num);
  	
    }

    public static void Fibo(int limit)
    {
	int f1=0,f2=1,fib;
	System.out.println(f1);
	System.out.println(f2);
	for(int i=1; i<=limit; i++)
	{
	    fib = f1 + f2;
	    f1 = f2;
	    f2 = fib;
	System.out.println(fib);
	}
	
    }
}