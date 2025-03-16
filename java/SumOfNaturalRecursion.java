// 6. Write a java program to find sum of all natural numbers between 1 to n.

import java.util.Scanner;
public class SumOfNaturalRecursion
{
	static int i=1,sum=0;
    public static void main(String x[])
    {
	int no;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Number :");
	no = sc.nextInt();
	
	NatNumber(no);
    }
    public static void NatNumber(int x)
    {
	if(i<=x)
	{
	    sum=sum+i;
	    i++;
	 
	    NatNumber(x);
	
	}
	else{
	    System.out.println("Sum Of natural Number "+sum);
	}
    }
}