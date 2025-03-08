// 10. Write a java program to count number of digits in a number.

import java.util.Scanner;
public class CountDigitRecursion
{
	static int count=0;
    public static void main(String x[])
    {
	int no;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Number :");
	no = sc.nextInt();
	
	CountNumber(no);
    }
    public static void CountNumber(int x)
    {
	if(x!=0)
	{
	    x = x/10;
	    
	    count++;
	 	
	    CountNumber(x);
	
	}
	else
	{
	    System.out.println("Digit count is :"+count);
	}
    }
}