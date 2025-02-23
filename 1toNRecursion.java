
// Write a java program to print all natural numbers from 1 to n.


import java.util.Scanner;
public class OnetoNRecursion
{
	static int i=1;
    public static void main(String x[])
    {
	int no;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the Number :");
	no = sc.nextInt();
	
	NthNumber(no);
    }
    public static void NthNumber(int x)
    {
	if(i<=x)
	{
	    System.out.println(i);
	    i++;
	 
	    NthNumber(x);
	
	}
    }
}