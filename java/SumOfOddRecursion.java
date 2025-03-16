// 8. Write a java program to find sum of all Odd numbers between 1 to n.

import java.util.Scanner;
public class SumOfOddRecursion
{
	static int i=1,sum=0;
    public static void main(String x[])
    {
	int no;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Number :");
	no = sc.nextInt();
	
	OddNumber(no);
    }
    public static void OddNumber(int x)
    {
	if(i<=x)
	{
	    if(i%2!=0)
	    {
	        sum=sum+i;
	        
	    }
	    i++;
	OddNumber(x);
	}
	else{
	    System.out.println("Sum Of Odd Numbers "+sum);
	}
    }
}