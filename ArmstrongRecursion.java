// WAP to input number and check number is Armstrong or not using recursion .

import java.util.Scanner;
public class ArmstrongRecursion
{
	static int sum=0;
    public static void main(String x[])
    {
	int no;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Number :");
	no = sc.nextInt();
	
	Armstrong(no, 0,no);
    }
    public static void Armstrong(int x, int rem, int temp)
    {
        
	if(x!=0)
	{
	    rem = x % 10;
	    sum = sum + (rem*rem*rem);
	    x/=10;
	    Armstrong(x,rem,temp);
	}
	
	else
	{
     //  System.out.println(sum+"\t"+temp);
	    if(sum==temp)
	    {
	      System.out.println("Armstrong Number..");
	    }
	    else
	    {
	      System.out.println("Not Armstrong Number..");
	    }
	}
    }
}